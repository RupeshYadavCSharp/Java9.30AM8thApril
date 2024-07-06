package pack_GuiApp;

import javax.swing.*;
import java.awt.*;

public class Gui1
{
    JFrame objjframe;
    JLabel jLabelname;
    JLabel jlablelastname;
    JButton jButtonok;
    JTextField jTextFieldname;
    JTextField jtextLast;
    Font font;

    public Gui1()
    {
        objjframe = new JFrame();
        objjframe.setBounds(50,50,300,300);

        font = new Font("consolas",Font.BOLD,18);
        objjframe.setTitle("Welcome to Binary Brains");
        objjframe.getContentPane().setBackground(Color.white);
        objjframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

        jLabelname = new JLabel();
        jLabelname.setText("Enter Name ");
        jLabelname.setFont(font);
        jLabelname.setBounds(20,30,150,30);

        jlablelastname=new JLabel();
        jlablelastname.setText("Enter last name");
        jlablelastname.setFont(font);
        jlablelastname.setBounds(600 ,20, 160, 60);

        jTextFieldname = new JTextField();
        jTextFieldname.setFont(font);
        jTextFieldname.setBounds(800,35,150,30);

        jtextLast=new JTextField();
        jtextLast.setFont(font);
        jtextLast.setBounds(210,30,150,30);


        jButtonok = new JButton();
        jButtonok.setText("Ok");
        jButtonok.setFont(font);
        jButtonok.setBounds(430,90,100,30);


        objjframe.add(jLabelname);
        objjframe.add(jlablelastname);
        objjframe.add(jTextFieldname);
        objjframe.add(jButtonok);
        objjframe.add(jtextLast);

        objjframe.setLayout(null);
        objjframe.setVisible(true);

    }
}