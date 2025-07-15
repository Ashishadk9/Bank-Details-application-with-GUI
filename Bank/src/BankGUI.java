import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BankGUI {
    private JFrame frame;
    private JTextField nameField,mobileField,emailField,balanceField,citizenshipField;
    private JRadioButton savingButton,currentButton;
    private JComboBox<String>provinceComboBox;
    private ArrayList<BankDetail>bankDetailsList;
    public BankGUI() {
        bankDetailsList = new ArrayList<>();
        frame = new JFrame("Bank Details Application");
        frame.setLayout(new FlowLayout());

        // Create text fields
        nameField = new JTextField(15);
        mobileField = new JTextField(10);
        emailField = new JTextField(15);
        balanceField = new JTextField(10);
        citizenshipField = new JTextField(15);
        // Create radio buttons for account type
        savingButton = new JRadioButton("Saving");
        currentButton = new JRadioButton("Current");
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingButton);
        accountTypeGroup.add(currentButton);
        // Create combo box for provinces
        String[] provinces = {"Province1", "Province2", "Province3", "Province4", "Province5", "Province6", "Province7"};
        provinceComboBox = new JComboBox<>(provinces);
        // Create buttons
        JButton saveButton = new JButton("Save");
        JButton displayButton = new JButton("Display");
        JButton clearButton = new JButton("Clear");
        // Add action listeners
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveDetails();
            }
        });
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayDetails();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        // Add components to frame
        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Mobile:"));
        frame.add(mobileField);
        frame.add(new JLabel("Email:"));
        frame.add(emailField);
        frame.add(new JLabel("Balance:"));
        frame.add(balanceField);
        frame.add(new JLabel("Citizenship:"));
        frame.add(citizenshipField);
        frame.add(savingButton);
        frame.add(currentButton);
        frame.add(new JLabel("Province:"));
        frame.add(provinceComboBox);
        frame.add(saveButton);
        frame.add(displayButton);
        frame.add(clearButton);

        // Frame settings
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void saveDetails() {
        // Validate fields and save details
        // Show dialog if invalid
        // If valid, create BankDetail object and add to list
    }
    private void displayDetails() {
        // Display all bank details in a dialog or console
        for (BankDetail detail : bankDetailsList) {
            System.out.println(detail);
        }
    }

    private void clearFields() {
        // Clear all text fields and reset selections
        nameField.setText("");
        mobileField.setText("");
        emailField.setText("");
        balanceField.setText("");
        citizenshipField.setText("");
        savingButton.setSelected(false);
        currentButton.setSelected(false);
        provinceComboBox.setSelectedIndex(0);
        bankDetailsList.clear(); // Clear the list
    }
    public static void main(String[] args) {
        new BankGUI();
    }
}


