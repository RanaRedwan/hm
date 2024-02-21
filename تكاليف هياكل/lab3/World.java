import javax.swing.*;
import java.awt.*;

public class World {
    public static void main(String[] args) {
        //creat a java ul form with these comp0nents
        // 1 label to show "hello world"
        // 1 button with text "click me"
        JPanel panel=new JPanel();
        JFrame frame=new JFrame();
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        frame.setVisible(true);
        JLabel thelabel=new JLabel("Hello World");
        thelabel.setBounds(130,50,80,25);
        panel.add(thelabel);

        JButton but=new JButton("click me");
        but.setBounds(130,100,80,30);
        panel.add(but);
    }
}
