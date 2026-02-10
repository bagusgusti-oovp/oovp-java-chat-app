import javax.swing.*;
import java.awt.*;

public class InputRow extends JPanel {

    private JTextField field;

    public InputRow(int index) {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Input " + index + ": ");
        field = new JTextField();
        JButton btn = new JButton("Save");

        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                "Saved: " + field.getText());
        });

        add(label, BorderLayout.WEST);
        add(field, BorderLayout.CENTER);
        add(btn, BorderLayout.EAST);
    }
}