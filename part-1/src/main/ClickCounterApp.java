import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterApp extends JFrame implements ActionListener {
    private int count = 0;          // Stores the current count
    private JLabel counterLabel;
    private JButton clickButton;

    public ClickCounterApp() {
        setTitle("Click Counter");
        // Displays the click count
        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        // Button to register clicks
       clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClickCounterApp().setVisible(true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        counterLabel.setText("Clicks: " + count);
    }
}
