public class MessageModel {
    private Message m;
    private Message dm;
    private boolean angry;
    private boolean sms;
    private boolean binary;
    private boolean encrypted;

    public static final int ANGRY = 1;
    public static final int BINARY = 2;
    public static final int SMS = 3;
    public static final int ENCRYPTED = 4;

    public MessageModel() {
        m = new Message("");
        angry = false;
        sms = false;
        binary = false;
        encrypted = false;

    }

    public String getMessage() {
        dm = new Message(m.getTheMsg());
        decorate();
        return m.getTheMsg();
    }

    public void setM(String s) {
        m = new Message(s);
        //decorate();
    }

    private void decorate(){
        if (angry){
            m = new AngryMessageDecorator(m);
        }
        if (sms){
            m = new SMSDecorator(m);
        }
        if (encrypted){
            m = new EncryptedMessage(m,5);
        }
        if (binary){
            m = new BinaryMessage(m);
        }
    }

    public void toggle(int t){
        switch (t){
            case ANGRY:
                angry = !angry;
                break;
            case SMS:
                sms = !sms;
                break;
            case BINARY:
                binary = !binary;
                break;
            case ENCRYPTED:
                encrypted = !encrypted;
                break;
        }
    }


}
