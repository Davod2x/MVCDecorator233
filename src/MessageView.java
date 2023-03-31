import javax.swing.*;
import java.awt.*;

public class MessageView extends JPanel {



    public MessageView() {
        setPreferredSize(new Dimension(350,550));
        BoxLayout bl = new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(bl);

        JLabel yes = new JLabel("Original Message");
        JLabel no = new JLabel("Decoded Message");

        yes.setAlignmentX(CENTER_ALIGNMENT);
        no.setAlignmentX(CENTER_ALIGNMENT);

        JPanel messageArea = new JPanel();
        JPanel boxArea = new JPanel();
        JPanel deMessageArea = new JPanel();


        JTextArea ogMessage = new JTextArea(50,30);
        JTextArea deMessage = new JTextArea(50,30);
        JCheckBox angry = new JCheckBox("Angry");
        JCheckBox sms = new JCheckBox("SMS");
        JCheckBox encrypted = new JCheckBox("Encrypted");
        JCheckBox binary = new JCheckBox("Binary");

        messageArea.add(ogMessage);
        boxArea.add(angry);
        boxArea.add(sms);
        boxArea.add(encrypted);
        boxArea.add(binary);
        deMessageArea.add(deMessage);


        add(yes);
        add(messageArea);
        add(boxArea);
        add(no);
        add(deMessageArea);












    }
}

