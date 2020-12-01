package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JTextField firstNameInput;
    private static JTextField lastNameInput;
    private static JTextArea addressInput;
    private static JTextField ageInput;
    private static JCheckBox married;
    private static JRadioButton male;
    private static JRadioButton female;
    private static JButton saveDataButton;

    public static void main(String[] args) {
        JPanel jPanel = buildPanel();
        addActionToButon(jPanel);
    }

    private static void addActionToButon(JPanel panel) {
        saveDataButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String firstNameValue=firstNameInput.getText();
                        String lastNameValue=lastNameInput.getText();
                        Integer ageValue=Integer.parseInt(ageInput.getText());
                        String genderValue;
                        String marriedValue;
                        String addressValue=addressInput.getText();

                        if (married.getSelectedObjects()!=null)
                            marriedValue="Yes";
                        else
                            marriedValue="No";

                        if (male.isSelected()) {
                            genderValue = "Male";
                        }
                        else if (female.isSelected()) {
                            genderValue = "Female";
                        }
                        else {
                            genderValue = "NO Button selected";
                        }

                        Person person = new Person(firstNameValue,lastNameValue,ageValue,genderValue,marriedValue,addressValue);
                        panel.removeAll();
                        JLabel dataLabel = new JLabel(person.toString());
                        dataLabel.setBounds(10, 20, 520, 230);
                        panel.add(dataLabel);
                        panel.updateUI();
                    }
                }
        );
    }

    private static JPanel buildPanel() {
        JFrame frame = new JFrame("Insert data");
        frame.setSize(560, 310);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

        return panel;
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel firstNameLabel = new JLabel("First name: ");
        firstNameLabel.setBounds(10, 20, 80, 25);
        panel.add(firstNameLabel);

        firstNameInput = new JTextField(20);
        firstNameInput.setBounds(100, 20, 165, 25);
        panel.add(firstNameInput);

        JLabel lastNameLabel = new JLabel("Last name: ");
        lastNameLabel.setBounds(10, 50, 80, 25);
        panel.add(lastNameLabel);

        lastNameInput = new JTextField(20);
        lastNameInput.setBounds(100, 50, 165, 25);
        panel.add(lastNameInput);

        JLabel ageLabel = new JLabel("Age: ");
        ageLabel.setBounds(10, 80, 80, 25);
        panel.add(ageLabel);

        ageInput = new JTextField(20);
        ageInput.setBounds(100, 80, 165, 25);
        panel.add(ageInput);

        JLabel genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(10, 110, 80, 25);
        panel.add(genderLabel);

        male = new JRadioButton();
        male.setText("Male");
        male.setBounds(100, 110, 80, 25);
        panel.add(male);

        female = new JRadioButton();
        female.setText("Female");
        female.setBounds(190, 110, 80, 25);
        panel.add(female);

        married = new JCheckBox("  Married?");
        married.setBounds(10, 140, 100, 25);
        panel.add(married);

        JLabel addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(10, 170, 80, 25);
        panel.add(addressLabel);

        addressInput = new JTextArea(3,40);
        addressInput.setBounds(100, 170, 330, 50);
        panel.add(addressInput);

        saveDataButton = new JButton("Save");
        saveDataButton.setBounds(10, 225, 80, 25);
        panel.add(saveDataButton);
    }
}
