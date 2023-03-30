import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame {

    public  StudentForm(){
        setTitle("Student Form");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        JLabel messageLabel = new JLabel("");
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel phoneLabel = new JLabel("Phone:");

        JTextField nameField = new JTextField(10);
        JTextField ageField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField phoneField = new JTextField(10);

        JButton submitButton = new JButton("Submit");
        JButton showAll = new JButton("Show All");


        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(layout);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(messageLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(ageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(addressLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(phoneLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(submitButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(showAll, gbc);

        showAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShowAllForm();
            }
        });


    }
}
