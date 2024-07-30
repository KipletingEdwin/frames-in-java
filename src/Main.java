import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setSize(500,500); //sets the x-dimension, and y-dimension of frame
        frame.setResizable(false); //prevent frame from being resized
        frame.setVisible(true); //make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application

    }
}