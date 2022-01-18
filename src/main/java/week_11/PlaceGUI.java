package week_11;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PlaceGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField placeNameText;
    private JTextField elevationText;
    private JList<Place> placeList;
    private JButton deleteButton;
    private JButton addButton;
    private JTextArea searchText;
    private JButton searchButton;
    private JTextArea newPlaceText;
    private JTextArea newElevationText;
    private JButton changeElevationButton;

    private DefaultListModel<Place> allPlacesListModel;

    private Controller controller;

    PlaceGUI(Controller controller) {
        this.controller = controller;

        allPlacesListModel = new DefaultListModel<>();
        placeList.setModel(allPlacesListModel);
        placeList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        getRootPane().setDefaultButton(addButton);
        
        eventHandlers();

        setTitle("Place Elevation GUI");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(350, 400));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        List<Place> allPlaces = controller.getAllData();
        setListData(allPlaces);
    }

    private void setListData(List<Place> places) {
        allPlacesListModel.clear();

        if (places != null) {
            allPlacesListModel.addAll(places);
        }
    }

    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void eventHandlers() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // validate input - place entered, and elevation is a number
                // ask controller to add place
                // if success, refresh JList
                String name = placeNameText.getText();
                if (name.isBlank()) {
                    showErrorDialog("Enter a place name");
                    return; // Stop processing event
                }
                double elevation;

                try {
                    elevation = Double.parseDouble(elevationText.getText());
                } catch (NumberFormatException exception) {
                    showErrorDialog("Enter a number for the elevation");
                    return; // stop processing event.
                }
                Place placeRecord = new Place(name, elevation);
                boolean added = controller.addPlaceToDatabase(placeRecord);

                if (added) {
                    placeNameText.setText("");
                    elevationText.setText("");

                    List<Place> allDate = controller.getAllData();
                    setListData(allDate);
                } else {
                    showErrorDialog("Error adding place - Did you add this place already?");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Place> placesToDelete = placeList.getSelectedValuesList();
                if(placesToDelete == null || placesToDelete.isEmpty()) {
                    showErrorDialog("Select at least one place to delete");
                    return;
                } else {
                    for(Place place: placesToDelete) {
                        controller.deletePlace(place);
                    }

                    List<Place> places = controller.getAllData();
                    setListData(places);
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String search = searchText.getText();
                if (search.isBlank()) {
                    showErrorDialog("Enter a place name to search for");
                    placeList.clearSelection();
                } else {
                    Double elevation = controller.getElevationForPlace(search);
                    if (elevation == null) {
                        showErrorDialog("Place not found");
                        placeList.clearSelection();
                    } else {
                        JOptionPane.showMessageDialog(PlaceGUI.this, "The elevation of" + search +
                                " is " + elevation + " meters");

                        for(int x = 0; x <allPlacesListModel.size(); x++) {
                            Place place = allPlacesListModel.get(x);
                            if (place.getName().equalsIgnoreCase(search)) {
                                placeList.setSelectedIndex(x);
                                break;
                            }
                        }
                    }
                }
            }
        });

        changeElevationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = newPlaceText.getText();
                if(name.isBlank()){
                    showErrorDialog("Enter a place name to change elevation for");
                    return;
                }

                Double newElevation;
                try {
                    newElevation = Double.parseDouble(newElevationText.getText());
                } catch (NumberFormatException numberFormatException) {
                    showErrorDialog("Enter number for elevation");
                    return; // stops the event
                }

                Place updatedPlace = new Place(name, newElevation);
                boolean success = controller.updatePlace(updatedPlace);
                if(success) {
                    List<Place> places = controller.getAllData();
                    setListData(places);
                    // select the updated in the list.
                    for(int x = 0; x <allPlacesListModel.size(); x++) {
                        Place place = allPlacesListModel.get(x);
                        if (place.getName().equalsIgnoreCase(name)) {
                            placeList.setSelectedIndex(x);
                            break;
                        }
                    }
                } else {
                    showErrorDialog("Can't update place, check the place name is correct.");
                    placeList.clearSelection();
                }
            }
        });
    }
}
