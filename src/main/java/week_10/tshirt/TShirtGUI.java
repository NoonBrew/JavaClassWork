package week_10.tshirt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TShirtGUI extends JFrame{
    private JPanel mainPanel;
    private JComboBox sizeComboBox;
    private JLabel selectedSizeLabel;
    private JComboBox<String> colorComboBox;
    private JLabel selectedColorLabel;

    TShirtGUI(){
        setTitle("T-Shirt Order Form");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300, 150));
        pack();
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");

        sizeComboBox.setSelectedIndex(-1);


        configureEventHandler();
    }

    private void configureEventHandler() {
        sizeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay();
            }
        });

        String[] colors = { "Red", "Purple", "Black", "Blue", "Green"};
        // new combobox model with array of colors.
        DefaultComboBoxModel<String> colorModel = new DefaultComboBoxModel<>(colors);
        colorComboBox.setModel(colorModel);
        // combobox model guarantees object type. it is a safer method then a basic combo box.
        colorModel.addElement("Cyan");
        colorModel.insertElementAt("Beige", 0);
        colorComboBox.setSelectedIndex(-1); // initiate after inserts


        colorComboBox.addActionListener(e -> {
            String colorSelected = (String) colorComboBox.getSelectedItem();
            selectedColorLabel.setText("Thanks, you chose " + colorSelected);
        });
    }

    private void updateDisplay() {
        // TODO Handles updateing labels when actions happen.
        String sizeSelected = (String) sizeComboBox.getSelectedItem();
        selectedSizeLabel.setText("Thanks, you chose " + sizeSelected);
    }
}
