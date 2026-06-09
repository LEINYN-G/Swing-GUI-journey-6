import javax.swing.*;
import java.awt.*;

/*Moving ahead with that knowledge, let's write some code and add a JLabel complement to our GUI
application to show the name of our app.*/

public class OurGUI {
 public static void main(Sring[] args) {
 JFrame frame = new JFrame("Feedback Application");
 JLabel label = new JLabel("Java X: Learn Java Programming");
 label.setBounds(50, 10, 300, 30);
 label.setFont(new Font("serif", Font.BOLD, 18));
 label.setForeground(Color.BLUE);

 frame.setLayout(null);
 frame.add(label);

 frame.setSize(400, 400);
 }
}

/*With all the theories covered in the README.md file, it should be quite easy to understand. kAs ou can see,
we have customized the label by changing its font using the setFont() method which takes the instance of the 
Font class as the parameter nd the font color, that is the foreground color using teh setForegrund() method.*/
