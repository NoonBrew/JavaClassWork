package week_10.vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VehicleGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField makeTextField;
    private JLabel nameLabel;
    private JLabel makeLabel;
    private JTextField modelTextField;
    private JCheckBox electricCheckBox;
    private JButton addVehicleButton;
    private JList<Vehicle> vehicleList;
    private JButton deleteButton;

    private DefaultListModel<Vehicle> vehicleListModel;

    VehicleGUI() {
        setTitle("Vehicle List");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(600,600));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        vehicleListModel = new DefaultListModel<>();
        vehicleList.setModel(vehicleListModel);

        vehicleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        eventHandlers();
    }

    private void eventHandlers() {

        addVehicleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String make = makeTextField.getText();
                String model = modelTextField.getText();

                if (name.isBlank() || make.isBlank() || model.isBlank()) {
                    //Parent component, message.
                    JOptionPane.showMessageDialog(VehicleGUI.this, "Fill in all fields.");
                    // returns so no vehicle is created.
                    return;
                }

                boolean isElectric = electricCheckBox.isSelected();

                Vehicle vehicle = new Vehicle(name, make, model, isElectric);
                vehicleListModel.addElement(vehicle);

                nameTextField.setText("");
                makeTextField.setText("");
                modelTextField.setText("");
                electricCheckBox.setSelected(false);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // null if nothing is selected.
                Vehicle selectedVehicle = vehicleList.getSelectedValue();
                // - 1 if nothing is selected.
                int selectedVehicleIndex = vehicleList.getSelectedIndex();

                if (selectedVehicle != null) {
                    if(JOptionPane.showConfirmDialog(VehicleGUI.this, "Delete " +
                            selectedVehicle.getName() + "?", "Delete Vehicle", JOptionPane.OK_CANCEL_OPTION)
                    == JOptionPane.OK_OPTION) {
                        vehicleListModel.removeElement(selectedVehicle);
                    }
                }
            }
        });
    }
}
