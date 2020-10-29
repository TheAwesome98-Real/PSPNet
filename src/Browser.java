import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.5.36
// 

public class Browser extends MIDlet
{
    private boolean I;
    private static boolean Z;
    static boolean Code;
    static Browser Code;
    static Display Code;
    
    static void Code() {
        d.m();
        Browser.Code.destroyApp(false);
        Browser.Code.notifyDestroyed();
    }
    
    protected void pauseApp() {
        this.I = true;
    }
    
    protected void startApp() {
        Browser.Code = this;
        Browser.Code = Display.getDisplay((MIDlet)this);
        if (this.I) {
            this.I = false;
            return;
        }
        if (Browser.Z) {
            return;
        }
        Browser.Z = true;
        final String s = "OM-Campaign";
        final String s2 = "debug";
        final String appProperty;
        if ((appProperty = this.getAppProperty(s)) != null && appProperty.toLowerCase().indexOf(s2.toLowerCase()) != -1) {
            d.B = true;
        }
        new Code().Code();
    }
    
    protected void destroyApp(final boolean b) {
        Browser.Code = true;
        if (Code.Code != null) {
            d.J(true);
            d.Code("h1", Code.I);
            if (!d.af) {
                Code.Code.Code.cancel();
            }
        }
        Browser.Z = false;
    }
}
