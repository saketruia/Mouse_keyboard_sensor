import javax.swing.*;
import java.awt.event.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

class MouseKeyboardEvents extends JFrame {
    public MouseKeyboardEvents() {
        // Create a label to display events
        JLabel label = new JLabel("Perform Mouse or Keyboard Events", JLabel.CENTER);
        add(label);

        // Add mouse listener
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add key listener
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        // Frame settings
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setFocusable(true); // To capture keyboard events
    }

    public static void main(String[] args) {
        new MouseKeyboardEvents();
    }
}
