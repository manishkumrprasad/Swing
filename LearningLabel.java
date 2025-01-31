import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LearningLabel {

    public static void main(String[] args) {
        //JLabel = A GUI Display Area For A String Of Text, An Image, Or Both

        JLabel label = new JLabel(); //Create A

        Border border = BorderFactory.createLineBorder(Color.black , 6);

        JFrame frame = new JFrame(); //Create A Frame
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setTitle("Learning Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,400);
        frame.add(label);

        label.setText("Hello World From Coders");// Set Text Of Label
        ImageIcon image = new ImageIcon("Hero.jpg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//Set Text LEFT, CENTER, RIGHT Of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);//Set Text TOP, CENTER, BOTTOM Of ImageIcon
        label.setForeground(Color.black);//Change Text Color
        label.setFont(new Font("MV Boli" , Font.PLAIN,20));//Change Font Style
        label.setIconTextGap(0);//Set Gap Of Text To Image

        label.setBackground(Color.white);//Set Background Color
        label.setOpaque(true);//Display Background Color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//Set vertical Position Of Icon+Text Within Label
        label.setHorizontalAlignment(JLabel.CENTER);//Set Horizontal Position Of Icon+Text Within Label


        //label.setBounds(0, 0 , 400 , 400); //Set x,y Position Within Frame As Well As Dimensions
        //frame.setLayout(null);

        frame.pack();

    }
}
