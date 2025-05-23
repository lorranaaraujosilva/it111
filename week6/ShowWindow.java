import javax.swing.*;

public class ShowWindow {

    public static void main(String[] args) {

        // declare our variables
        // we are going to make them constants

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // Create a window

        JFrame window = new JFrame();
        window.setTitle("My simple window");

        // setting the size of our window

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Close window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window (boolean) -  if we do not display the window it will not display
        window.setVisible(true);







    }
}
