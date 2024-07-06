package pack_GuiApp;


import javax.swing.*;
import java.awt.*;

public class Gui
{
    JFrame objjframe;


    public Gui()
    {
        objjframe = new JFrame();
        objjframe.setBounds(50,50,300,300);
        objjframe.setTitle("Welcome to Binary Brains");
        objjframe.getContentPane().setBackground(Color.blue);
        objjframe.setExtendedState(JFrame.MAXIMIZED_BOTH);


        objjframe.setVisible(true);

    }

}

