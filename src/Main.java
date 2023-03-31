import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Message m = new Message("Hello World.  this is fun!");
        System.out.println(m.getTheMsg());
        m = new AngryMessageDecorator(m);
        System.out.println(m.getTheMsg());
        m = new SMSDecorator(m);
        System.out.println(m.getTheMsg());
        m = new EncryptedMessage(m,1);
        System.out.print(m.getTheMsg());
        m = new BinaryMessage(m);
        System.out.print(m.getTheMsg());


        JFrame frame = new JFrame("Message Decorator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel p = new MessageView();
        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);
    }
}