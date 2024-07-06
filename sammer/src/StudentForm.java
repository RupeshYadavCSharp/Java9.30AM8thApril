import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentForm extends JFrame {
    private JTextField rnoField, nameField, courseField, feesField;
    private JButton firstBtn, prevBtn, nextBtn, lastBtn, newBtn, insertBtn, updateBtn, deleteBtn;

    public StudentForm() {
        // Set up the frame
        setTitle("Student Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the input fields
        rnoField = new JTextField(15);
        nameField = new JTextField(15);
        courseField = new JTextField(15);
        feesField = new JTextField(15);

        // Create the buttons
        firstBtn = new JButton("First");
        prevBtn = new JButton("Prev");
        nextBtn = new JButton("Next");
        lastBtn = new JButton("Last");
        newBtn = new JButton("New");
        insertBtn = new JButton("Insert");
        updateBtn = new JButton("Update");
        deleteBtn = new JButton("Delete");

        // Set up the layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Rno"), gbc);
        gbc.gridx = 1;
        add(rnoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Name"), gbc);
        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Course"), gbc);
        gbc.gridx = 1;
        add(courseField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Fees"), gbc);
        gbc.gridx = 1;
        add(feesField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(createButtonPanel(), gbc);

        // Display the frame
        setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 4, 5, 5));

        panel.add(firstBtn);
        panel.add(prevBtn);
        panel.add(nextBtn);
        panel.add(lastBtn);
        panel.add(newBtn);
        panel.add(insertBtn);
        panel.add(updateBtn);
        panel.add(deleteBtn);

        // Add action listeners (currently empty)
        firstBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for first button
            }
        });
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for previous button
            }
        });
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for next button
            }
        });
        lastBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for last button
            }
        });
        newBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for new button
            }
        });
        insertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for insert button
            }
        });
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for update button
            }
        });
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code for delete button
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentForm();
                try {
                    //laod the driver class
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    //connecting to DB
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdata12?useTimezone=true&serverTimezone=UTC",
                            "root", "sa123");

                    //Executing query
                    Statement stms = con.createStatement();


                    ResultSet rs = stms.executeQuery("select * from student");

                    while (rs.next() == true) {
                        System.out.println("rno is " + rs.getString(1));
                        System.out.println("Name is " + rs.getString(2));
                        System.out.println("Course is " + rs.getString(3));
                        System.out.println("Fees is " + rs.getString(4));
                        System.out.println("\n");
                    }

                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
    }
}