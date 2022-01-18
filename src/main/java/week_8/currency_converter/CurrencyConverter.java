package week_8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;


    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";
    private final String YEN = "Yen";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75, YEN, 113.95);

    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400,300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);
        currencyComboBox.addItem(YEN);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // what was typed in JTextField dollarsTextField
                String dollarString = dollarsTextField.getText();
                try {
                    // need to convert a number to euro
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);

                    //convert to target currency
                    double convertedValue = dollars * exchangeRate;
                    // and then display result.
//                    double euro = dollars * dollarsToEuroExchangeRate;
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s",
                            dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter" +
                            " a number without any $ or other characters.");
                }
            }
        });
    }


}
