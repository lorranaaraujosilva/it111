import javax.swing.*;

public class SimpleWindow extends JFrame {


    // im not going to have a main method in this file
    // constructor - special method that displays our attributes

    public SimpleWindow() {

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DONT FORGET TO DISPLAY IT
        setVisible(true);

    }
}
