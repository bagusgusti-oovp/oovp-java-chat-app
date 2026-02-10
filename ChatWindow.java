import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {

    private JPanel chatArea;
    private JTextField inputField;

    public ChatWindow() {
        setTitle("OO Chat App");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        chatArea = new JPanel();
        chatArea.setLayout(new BoxLayout(chatArea, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        add(createBottomBar(), BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createBottomBar() {
        JPanel panel = new JPanel(new BorderLayout());

        inputField = new JTextField();
        JButton sendBtn = new JButton("Send");

        sendBtn.addActionListener(e -> sendMessage());

        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendBtn, BorderLayout.EAST);

        return panel;
    }

    private void sendMessage() {
        String text = inputField.getText().trim();
        if (!text.isEmpty()) {
            chatArea.add(new MessageBlock(text));
            chatArea.revalidate();
            inputField.setText("");
        }
    }
}