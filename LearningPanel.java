import javax.swing.*;
import java.awt.*;

public class LearningPanel {
    public static void main(String[] args) {

      //JPanel = A GUI component that functions as a container to hold other components
        ImageIcon image = new ImageIcon("Coca.png");
        JLabel label = new JLabel();
        label.setText("THUMPS UPP");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);

        //label.setBounds(0 , 0 , width , height) we can adjust the position by giving values
        //before using setBounds We Have To Set The setLayout To Null
        //also no need of setvertical and sethorizontal alignment when working on setBounds


       JPanel redPanel = new JPanel();
       redPanel.setBackground(Color.red);
       redPanel.setBounds(0 , 0 , 200 , 400);
       redPanel.setLayout(new BorderLayout());

       JPanel bluePanel = new JPanel();
       bluePanel.setBackground(Color.blue);
       bluePanel.setBounds(200 , 0 , 200 , 300);

       JPanel greenPanel = new JPanel();
       greenPanel.setBackground(Color.green);
       greenPanel.setBounds(400 , 0 , 200 , 200);


       JFrame frame = new JFrame();
       frame.setSize(600,600);
       frame.setTitle("Learning Panel");
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.setLayout(null);

       redPanel.add(label);

       frame.add(redPanel);
       frame.add(bluePanel);
       frame.add(greenPanel);

    }
}
