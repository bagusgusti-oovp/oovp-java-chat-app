import javax.swing.*;
import java.awt.*;

public class MessageBlock extends JPanel {

    public MessageBlock(String message) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setBackground(Color.WHITE);

        JLabel label = new JLabel("User: " + message);
        add(label);

        add(Box.createRigidArea(new Dimension(0, 10)));

        for (int i = 1; i <= 3; i++) {
            add(new InputRow(i));
        }
    }
}
