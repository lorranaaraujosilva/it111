import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;
    JLabel messagelabel;
    JTextField KiloTextField;


    JButton calculatebutton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    // ALWAYS BE AWARE OF THE COLORS THE PROGRAM IS USING

    // CREATE A CONSTRUCTOR WHICH IS A SPECIAL METHOD TO INITIALIZE

    public KiloConverter() {



        setTitle("Our Kilometer converter");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);

        setVisible(true);
    }

    public void buildPanel() {

        messagelabel = new JLabel("Enter a distance in kilometer units");

        // text, button information and panel

        KiloTextField = new JTextField(10);
        calculatebutton = new JButton("Calculate");
        panel = new JPanel();

        // we now have to add the above three components onto the JPanel

        panel.add(messagelabel);
        panel.add(KiloTextField);
        panel.add(calculatebutton);





    }

    // we have to add our main method

    public static void main(String[] args) {

        new KiloConverter();


    }

}
