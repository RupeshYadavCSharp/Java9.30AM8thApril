package pack_GuiApp;

import javax.swing.*;
import java.awt.*;
//class decleartion
public class BoxGui {

   JFrame objjframe;
   JTextField jTextFieldname;
    JTextField jTextFieldname1;
    JTextField jTextFieldname2;
    JButton jcheckButton;
    JButton jcheckButton1;
    JButton jcheckButton2;
    JButton jcheckButton3;
    JButton jcheckButton4;






   //constructor calling
   public BoxGui(){

       objjframe=new JFrame();
       objjframe.setBounds(70,70,400,400);
       objjframe.setTitle("Welcome to Binary Brains");

       //lable Making
       jTextFieldname=new JTextField();
       jTextFieldname.setBounds(10,20,50,50);

       jTextFieldname1=new JTextField();
       jTextFieldname1.setBounds(150,20,50,50);

       jTextFieldname2=new JTextField();
       jTextFieldname2.setBounds(290,20,50,50);


       //Making the button
       jcheckButton=new JButton();
       jcheckButton.setText("+");
       jcheckButton.setBounds(10,100,50,50);

       jcheckButton1=new JButton();
       jcheckButton.setText("-");
       jTextFieldname1.setBounds(150,20,50,50);





//Visible the frame of layout
       objjframe.add(jTextFieldname);
       objjframe.add(jTextFieldname1);
       objjframe.add(jTextFieldname2);
       objjframe.add(jcheckButton);
       objjframe.add(jcheckButton1);
       objjframe.setLayout(null);
       objjframe.setVisible(true);



   }




}
