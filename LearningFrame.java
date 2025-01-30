import javax.swing.JFrame ;
import javax.swing.ImageIcon ;
import java.awt.*;

public class LearningFrame {

    public static void main(String[] args) {
        // JFrame = A GUI Window To Add Components To

        JFrame frame = new JFrame(); //Creates A Frame

        frame.setVisible(true); //Makes The Frame Visible To The Programmer/Users
        frame.setSize(400, 400); //Set Up The Frame Size
        frame.setTitle("Learning Swing"); //Sets The Title Of The Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit Out Of The Application
        frame.setResizable(false); //Prevent Frame From Being Resizable

        ImageIcon image = new ImageIcon("Logo.png"); //Create An Image Icon
        frame.setIconImage(image.getImage()); //Change Icon Of Frame
        frame.getContentPane().setBackground(new Color(60 , 150 , 222)); //Change Background Color
    }


}
