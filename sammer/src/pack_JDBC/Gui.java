package pack_JDBC;

import java.awt.event.ActionListener;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Gui implements ActionListener
{

    //region variables
    JFrame jFrame = null;
    JLabel jLabelsid = null;
    JLabel jLabelname = null;
    JLabel jLabelcourse = null;
    JLabel jLabelfees = null;
    JLabel jLabelsearchdata=null;
    JTextField jTextFieldsid = null;
    JTextField jTextFieldname = null;
    JTextField jTextFieldcourse = null;
    JTextField jTextFieldfees = null;
    JTextField jTextFieldWriteNo=null;


    //button section
    JButton jButtonfirst = null;
    JButton jButtonnext = null;
    JButton jButtonprevious = null;
    JButton jButtonlast = null;
    JButton jButtonnew;
    JButton jButtoninsert;
    JButton jButtonupdate;
    JButton jButtondelete;
    JButton jButtonSearch;//new
    Font font;
    Connection con;
    Statement stmt;
    ResultSet rs;


    //endregion

    public Gui(){

        //region design
        jFrame = new JFrame();
        jFrame.setBounds(100, 200, 650, 400);
        font = new Font("Consolas",Font.BOLD,22);

        jLabelsid = new JLabel();
        jLabelsid.setText("S_ID");
        jLabelsid.setBounds(40,40,120,30);
        jLabelsid.setFont(font);

        jLabelname = new JLabel();
        jLabelname.setText("Name");
        jLabelname.setBounds(40,80,120,30);
        jLabelname.setFont(font);

        jLabelcourse = new JLabel();
        jLabelcourse.setText("Course");
        jLabelcourse.setBounds(40,120,120,30);
        jLabelcourse.setFont(font);

        jLabelfees = new JLabel();
        jLabelfees.setText("Fees");
        jLabelfees.setBounds(40,160,120,30);
        jLabelfees.setFont(font);

        jLabelsearchdata=new JLabel();
        jLabelsearchdata.setText("Search");
        jLabelsearchdata.setBounds(40,180,120,30);
        jLabelsearchdata.setFont(font);



        jTextFieldsid = new JTextField();
        jTextFieldsid.setBounds(160,40,200,30);
        jTextFieldsid.setFont(font);
        //jTextFieldsid.setEditable(false);

        jTextFieldname = new JTextField();
        jTextFieldname.setBounds(160,80,200,30);
        jTextFieldname.setFont(font);

        jTextFieldcourse = new JTextField();
        jTextFieldcourse.setBounds(160,120,200,30);
        jTextFieldcourse.setFont(font);

        jTextFieldfees = new JTextField();
        jTextFieldfees.setBounds(160,160,200,30);
        jTextFieldfees.setFont(font);

        jTextFieldWriteNo=new JTextField();
        jTextFieldWriteNo.setBounds(160,180,200,30);
        jTextFieldWriteNo.setFont(font);



        //button section

        jButtonfirst = new JButton();
        jButtonfirst.setText("First");
        jButtonfirst.setBounds(40,220,120,30);
        jButtonfirst.setFont(font);
        //

        jButtonnext = new JButton();
        jButtonnext.setText("Next");
        jButtonnext.setBounds(170,220,130,30);
        jButtonnext.setFont(font);

        jButtonprevious = new JButton();
        jButtonprevious.setText("Previous");
        jButtonprevious.setBounds(310,220,130,30);
        jButtonprevious.setFont(font);

        jButtonlast = new JButton();
        jButtonlast.setText("Last");
        jButtonlast.setBounds(450,220,130,30);
        jButtonlast.setFont(font);

        jButtonnew = new JButton();
        jButtonnew.setText("New");
        jButtonnew.setBounds(40, 260,120,30);
        jButtonnew.setFont(font);

        jButtoninsert = new JButton();
        jButtoninsert.setText("Insert");
        jButtoninsert.setBounds(170,260,130,30);
        jButtoninsert.setFont(font);

        jButtonupdate = new JButton();
        jButtonupdate.setText("Update");
        jButtonupdate.setBounds(310,260,130,30);
        jButtonupdate.setFont(font);

        jButtondelete = new JButton();
        jButtondelete.setText("Delete");
        jButtondelete.setBounds(450,260,130,30);
        jButtondelete.setFont(font);

        jButtonSearch=new JButton();
        jButtonSearch.setText("Search");
        jButtonSearch.setBounds(550,260,130,30);
        jButtonSearch.setFont(font);



        jFrame.add(jLabelsid);
        jFrame.add(jLabelname);
        jFrame.add(jLabelcourse);
        jFrame.add(jLabelfees);
        jFrame.add(jLabelsearchdata);
        jFrame.add(jTextFieldsid);
        jFrame.add(jTextFieldname);
        jFrame.add(jTextFieldcourse);
        jFrame.add(jTextFieldfees);
        jFrame.add(jButtonfirst);
        jFrame.add(jButtonnext);
        jFrame.add(jButtonprevious);
        jFrame.add(jButtonlast);
        jFrame.add(jButtonnew);
        jFrame.add(jButtoninsert);
        jFrame.add(jButtonupdate);
        jFrame.add(jButtondelete);
        jFrame.add(jButtonSearch);
        jFrame.add(jTextFieldWriteNo);

        //endregion

        jButtonnext.addActionListener(this);
        jButtonprevious.addActionListener(this);
        jButtonlast.addActionListener(this);
        jButtonfirst.addActionListener(this);
        jButtonnew.addActionListener(this);
        jButtoninsert.addActionListener(this);
        jButtonSearch.addActionListener(this);


        jFrame.setLayout(null);
        jFrame.setVisible(true);

        connectTODB();

    }

    public void connectTODB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establish Connection
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/Studentdata12?useTimezone=true&serverTimezone=UTC",
                            "root","sa123");

            getData();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void getData()
    {
        try
        {
            //Creating SQL Query
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //executing query
            rs = stmt.executeQuery("Select * from student ");
            if(rs.next() == true)
            {
                showData();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void showData()
    {
        try
        {
            jTextFieldsid.setText(rs.getString(1));
            jTextFieldname.setText(rs.getString(2));
            jTextFieldcourse.setText(rs.getString(3));
            jTextFieldfees.setText(rs.getString(4));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try
        {
            if(e.getSource() == jButtonnext)
            {
                if(rs.next() == true)
                {
                    showData();
                }
                else
                {
                    JOptionPane.showMessageDialog(jFrame,"Last record ");
                }
            }
            else if(e.getSource() == jButtonprevious)
            {
                if(rs.previous() == true)
                {
                    showData();
                }
            }
            else if(e.getSource() == jButtonfirst)
            {
                if(rs.first() == true)
                {
                    showData();
                }
            }
            else if(e.getSource() == jButtonlast)
            {
                if(rs.last() == true)
                {
                    showData();
                }
            }

            else if(e.getSource() == jButtonSearch)
            {
                if(rs.first() == false)
                {
                    showData();
                }
            }

        }


        catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }
}
