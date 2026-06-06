import javax.swing.*;
import java.awt.*;

//let's write some code and add a JLabel complement to our GUI appliction to show the name of our app.
public class OurGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Feedback Application");
        JLabel label = new JLabel("Java X: Learn Java Programming");
        label.setBounds(50, 10, 300, 30);  //set the custom position of the component in the JFrame.
        label.setFont(new Font("Serif", Font.BOLD, 18));
        label.setForeground(Color.BLUE);

       /*As we're manually setting the position of the 
         component in the JFrame and not using ny layout managers, layout of the frame is 'null'*/
        frame.setLayout(null);
        frame.add(label);
        
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
