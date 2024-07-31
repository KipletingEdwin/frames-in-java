import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setSize(500,500); //sets the x-dimension, and y-dimension of frame
        this.setResizable(false); //prevent frame from being resized
        this.setVisible(true); //make frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application

        ImageIcon image = new ImageIcon("2021harrier.jpg");  //create an image Icon
        this.setIconImage(image.getImage()); //change icon frame
        this.getContentPane().setBackground(new Color(123,50,250));  //change color of background
    }
}
