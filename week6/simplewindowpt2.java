import javax.swing.*;
import java.awt.*;

public class simplewindowpt2 {
    public static void main(String[] args) {
        JFrame window = new JFrame("A Simple Window");

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window
        window.setLocationRelativeTo(null);

        // Set background color
        window.getContentPane().setBackground(Color.RED);

        // Set layout to null for manual positioning
        window.setLayout(null);

        // Create labels
        JLabel myLabel = new JLabel("My First Big Label!!!");
        myLabel.setBounds(100, 30, 300, 30);
        myLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));

        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setBounds(100, 100, 300, 30);
        myLabel2.setFont(new Font("SansSerif", Font.BOLD, 16));

        // Create text fields
        JTextField textField1 = new JTextField();
        textField1.setBounds(100, 60, 200, 25);

        JTextField textField2 = new JTextField();
        textField2.setBounds(100, 130, 200, 25);

        // Add components to the frame
        window.add(myLabel);
        window.add(textField1);
        window.add(myLabel2);
        window.add(textField2);

        // Display the window
        window.setVisible(true);
    }
}