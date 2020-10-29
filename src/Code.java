import javax.microedition.lcdui.game.Layer;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.List;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.Displayable;
import java.util.Calendar;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.Graphics;
import java.util.TimerTask;
import java.util.Timer;
import javax.microedition.lcdui.Command;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

final class Code extends Canvas implements Runnable, CommandListener
{
    private static boolean e;
    private int j;
    static byte[] Code;
    static C Code;
    private Image q;
    static Image h;
    private int r;
    static int c;
    private int q;
    static int d;
    static int e;
    static byte[] J;
    static Vector Code;
    private Image r;
    static Code Code;
    private boolean d;
    private int k;
    public static boolean Z;
    static byte[] I;
    static byte[] Z;
    static Image Z;
    static boolean Code;
    private String a;
    private static Vector Z;
    static Vector I;
    static boolean I;
    private Image l;
    static String Code;
    static String I;
    static int B;
    public static String Z;
    public static int Code;
    public static String J;
    public static String B;
    public static int I;
    public static int Z;
    public static boolean J;
    public static boolean B;
    public static boolean C;
    public static boolean a;
    public static g Code;
    private int u;
    public static int J;
    static boolean b;
    static String C;
    private static g I;
    static final Command[] Code;
    static int C;
    static int a;
    private boolean f;
    private static int l;
    private static int m;
    private long Code;
    private static int n;
    private boolean g;
    private static final int[] Z;
    private int o;
    Image I;
    private int p;
    private int[] a;
    private g Z;
    static int[] Code;
    private g J;
    Object Code;
    private static long I;
    private static boolean h;
    public static int f;
    int b;
    static int h;
    static Image i;
    private boolean i;
    private boolean j;
    public static int g;
    static int i;
    private Image m;
    private Image n;
    private Image[] Code;
    private int[] J;
    private Image[] Z;
    private int[] B;
    private Image[] I;
    private int[] C;
    private Image o;
    Image Code;
    private Image p;
    private Image s;
    Timer Code;
    private int s;
    int[] I;
    private int[] b;
    private Image t;
    static Image J;
    static Image B;
    static Image C;
    static Image a;
    static Image b;
    static Image c;
    static Image d;
    static Image e;
    static Image f;
    static Image g;
    static Image j;
    static Image k;
    private TimerTask Code;
    private static long Z;
    private static boolean k;
    private static boolean l;
    private static int t;
    private static Image u;
    private static Graphics Code;
    private static Graphics I;
    private static TextBox I;
    private static Sprite Code;
    static boolean c;
    private static g B;
    private TextBox Code;
    private static int v;
    private TimerTask I;
    
    static String Code(int value, final boolean b, final Calendar calendar) {
        final Calendar calendar2 = (calendar != null) ? calendar : d.Code(false, b);
        if (value < 0 || value > 23) {
            value = calendar2.get(11);
        }
        final int value2 = calendar2.get(12);
        if (d.at) {
            return ((value < 10) ? "0" : "") + value + ":" + ((value2 < 10) ? "0" : "") + value2;
        }
        boolean b2 = true;
        if (value >= 12) {
            b2 = false;
            value -= 12;
        }
        return ((value == 0) ? 12 : value) + ":" + ((value2 < 10) ? "0" : "") + value2 + (b2 ? " AM" : " PM");
    }
    
    final void Z(String trim) {
        if (!(trim = trim.trim()).equals("www.") && trim.length() > 0) {
            if (!d.aA) {
                if (Code.Code.contains(trim)) {
                    Code.Code.removeElement(trim);
                }
                if (Code.Code.size() > 30) {
                    Code.Code.removeElement(Code.Code.firstElement());
                }
                Code.Code.addElement(trim);
            }
            if ("debug:".equals(trim)) {
                Code.e = true;
            }
            if (Code.e && "opera:routing".equals(trim)) {
                if (!d.B) {
                    d.B = true;
                }
                else {
                    d.B = false;
                }
            }
            this.I("ext:" + trim);
        }
    }
    
    private void k() {
        final d code;
        if ((code = Code(1)) != null && code.Code != null) {
            if (code.Code.Z) {
                if (code.Code.J() != Code.f) {
                    code.J = true;
                    code.Z();
                }
            }
            else if (code.Code.J() > Code.f && d.al) {
                this.I("overlay:" + d.I(126));
            }
        }
    }
    
    static boolean Code(final int n, final boolean b) {
        final d code;
        if ((code = Code(d.I(n))) != null && (b || code.I == null)) {
            code.J = true;
            code.Z();
            return true;
        }
        return false;
    }
    
    final void Code(final String s, final String s2, final int n, final d d) {
        final d obj = new d(n, d);
        Code.Z.addElement(obj);
        obj.Code(s, (String)null, s2);
        obj.I();
        if (d.Q) {
            g.Code();
        }
        else {
            this.repaint();
        }
        g.J();
    }
    
    final boolean Code(final d d) {
        d d2;
        while ((d2 = Code.Z.elementAt(Code.Z.size() - 1)) != d && d2.Code(2)) {
            this.I(d2);
        }
        return d2 == d;
    }
    
    final boolean I(final d obj) {
        boolean b = false;
        if (obj.Code(16)) {
            obj.Code.c();
        }
        if (Code.Z.size() > 1) {
            obj.Code = true;
            Code.Z.removeElement(obj);
            this.b();
            b = true;
        }
        this.repaint();
        g.J();
        return b;
    }
    
    static void Z(final boolean b) {
        if (Code.I == null) {
            return;
        }
        if (b && Code.v > Code.I.getMaxSize()) {
            Code.Code.I("overlay:" + d.I(144));
            return;
        }
        Browser.Code.setCurrent((Displayable)Code.I);
        if (!d.K) {
            d.K = true;
            d.J(false);
        }
    }
    
    static void Code(final Integer n, final boolean b) {
        if (n != 0) {
            final byte[] z = new byte[Code.Z.length + 4];
            Code.Z[0] = (byte)((z.length - 1) / 4);
            System.arraycopy(Code.Z, 0, z, 0, Code.Z.length);
            d.I(n, z, z.length - 4);
            Code.Z = z;
            Code.Code = true;
            if (b) {
                d.J(false);
            }
        }
    }
    
    static boolean Code(final B b) {
        return Code().Code == b;
    }
    
    static boolean Code() {
        for (int i = 0; i < Code.Z.size(); ++i) {
            if (((d)Code.Z.elementAt(i)).I != null) {
                return true;
            }
        }
        return false;
    }
    
    final void Code(final boolean l) {
        Label_0029: {
            if (l == d.L) {
                break Label_0029;
            }
            d.L = l;
            final Code code = Code.Code;
            try {
                code.I();
                Code.Code.sizeChanged(-1, -1);
                this.k();
                if (((l && (!d.n || d.O)) ^ (d.N && Code.h > 300)) || (d.P && Code.h > Code.i)) {
                    d.M = true;
                    return;
                }
                d.M = false;
            }
            finally {
                d.M = (((l && (!d.n || d.O)) ^ (d.N && Code.h > 300)) || (d.P && Code.h > Code.i));
            }
        }
    }
    
    public final void run() {
        ((Displayable)this).setCommandListener((CommandListener)this);
        d.v();
        Code.f = (Code.h = ((Displayable)this).getWidth());
        Code.g = (Code.i = ((Displayable)this).getHeight());
        if (d.L) {
            Code.f = Code.i;
            Code.g = Code.h;
        }
        this.Code(d.L);
        if (d.as) {
            if (this.I == null) {
                this.I = new g(2);
                this.Code.scheduleAtFixedRate(this.I, (61 - Calendar.getInstance().get(13)) * 1000, 60000L);
                this.i();
            }
        }
        else if (this.I != null) {
            this.I.cancel();
            this.I = null;
            this.c();
        }
        ++this.j;
        if (d.g < 0) {
            this.l = Image.createImage(80, 80);
            if (d.ah) {
                d.g = 3;
            }
            else {
                do {
                    this.l = d.Code(this.l, 0, 80 - (d.g << 1), true);
                    ++d.g;
                } while (System.currentTimeMillis() < System.currentTimeMillis() + 1000L && d.g < 10);
            }
            if (d.g < d.h) {
                d.ag = true;
                d.ao = false;
            }
        }
        if (d.i < 0) {
            this.l = Image.createImage(Code.h, Code.i);
            final Graphics graphics = Image.createImage(Code.h, Code.i).getGraphics();
            do {
                ++d.i;
                graphics.drawImage(this.l, 0, 0, 20);
            } while (System.currentTimeMillis() < System.currentTimeMillis() + 500L);
            int n = 10;
            if (d.C == 0) {
                n = 87;
            }
            if (d.i < n) {
                d.ao = false;
            }
        }
        this.repaint();
        this.serviceRepaints();
        int n2 = 4;
        int n3 = 3;
        int n4 = 2;
        int n5 = 6;
        int n6 = 8;
        switch (d.C) {
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
        }
        if (d.ae) {
            n5 = (n3 = (n4 = (n6 = 1)));
            n2 = 8;
        }
        if (d.U) {
            n3 = 8;
        }
        Code.Code[0] = new Command(d.Code(28), 1, 1);
        Code.Code[1] = new Command(d.Code(43), 1, 1);
        Code.Code[2] = new Command(d.Code(70), 1, 1);
        Code.Code[10] = new Command(d.Code(1), n3, 10);
        Code.Code[3] = new Command(d.Code(3), n5, 20);
        Code.Code[15] = new Command(d.Code(6), 8, 20);
        Code.Code[18] = new Command(d.Code(106), 8, 20);
        Code.Code[11] = new Command(d.Code(19), n6, 20);
        Code.Code[17] = new Command(d.Code(5), 1, 20);
        Code.Code[12] = new Command(d.Code(4), n4, 10);
        Code.Code[14] = new Command(d.Code(10), 7, 10);
        Code.Code[4] = new Command(d.Code(4), n4, 10);
        Code.Code[5] = new Command(d.Code(11), n2, 1);
        Code.Code[6] = new Command(d.Code(12), n3, 10);
        Code.Code[8] = new Command(d.Code(62), 1, 1);
        Code.Code[9] = new Command(d.Code(0), n2, 1);
        Code.Code[7] = new Command(d.Code(17), 1, 1);
        Code.Code[16] = new Command(d.Code(66), 1, 10);
        Code.Code[13] = new Command(d.Code(104), 1, 1);
        Code.Code[19] = new Command(d.Code(108), 8, 20);
        Code.Code[20] = new Command(d.Code(21), 1, 1);
        Code.Code[21] = new Command(d.Code(109), 1, 1);
        Code.Code[22] = new Command(d.Code(135), 1, 1);
        Code.Code[37] = new Command(d.Code(35), 1, 1);
        Code.Code[38] = new Command(d.Code(3), n4, 1);
        Code.Code[39] = new Command(d.o, n2, 1);
        Code.Code[40] = new Command(d.p, n3, 1);
        Code.Code[27] = new Command(d.Code(174), 1, 1);
        Code.Code[28] = new Command("", 1, 1);
        Code.Code[29] = new Command(d.Code(15), n2, 1);
        Code.Code[24] = new Command(d.Code(142), 1, 1);
        Code.Code[25] = new Command(d.Code(28), 1, 1);
        Code.Code[26] = new Command(d.Code(14), n3, 10);
        Code.Code[36] = new Command(d.Code(160), n2, 1);
        if (Code.Code[23] == null) {
            Code.Code[23] = new Command("", 2, 1);
        }
        Code.B = 23;
        Code.C = 23;
        this.Code = Code();
        this.I();
        d.d();
        Code.Z.addElement(new d(1, null));
        if ((Code.I = d.Code(true, "h1", 0)) == null) {
            Code.I = new Vector(30);
        }
        d.o();
        d.i();
        if (d.Z > 200000L) {
            d.i = true;
        }
        if (d.Z < (((Displayable)this).getWidth() * ((Displayable)this).getHeight() << 2) + 50000) {
            d.ai = true;
        }
        ++this.j;
        this.repaint();
        this.serviceRepaints();
        boolean b = false;
        if (!d.aE) {
            b = true;
            d.ax = false;
            this.j();
            while (Code.b) {
                d.Code(this, 0);
            }
            if (!d.aE) {
                this.d = true;
                this.repaint();
                return;
            }
        }
        d.h();
        this.Z();
        ++this.j;
        this.repaint();
        this.serviceRepaints();
        if (!b) {
            this.j();
        }
        this.d = true;
        this.repaint();
        this.serviceRepaints();
        d.J(false);
    }
    
    private void j() {
        if (C()) {
            d.Code();
            this.I(d.C);
            return;
        }
        if (!"".equals(d.q)) {
            this.I("overlay:" + d.I(145));
            return;
        }
        this.I(d.I(65));
    }
    
    private static void Code(final Screen screen) {
        if (screen != null && d.t) {
            ((Displayable)screen).addCommand(Code.Code[14]);
        }
    }
    
    static d Code() {
        if (Code.Z.isEmpty()) {
            return null;
        }
        return Code.Z.lastElement();
    }
    
    static B Code() {
        return Code().Code;
    }
    
    private static String Code(final Command command) {
        if (command == Code.Code[0]) {
            return "menu:" + d.I(66);
        }
        if (command == Code.Code[11]) {
            return "dialog:" + d.I(32);
        }
        if (command == Code.Code[2]) {
            return "menu:" + d.I(68);
        }
        if (command == Code.Code[4]) {
            return d.I(81);
        }
        if (command == Code.Code[3]) {
            return d.I(110);
        }
        if (command == Code.Code[9] || command == Code.Code[36]) {
            return d.I(113);
        }
        if (command == Code.Code[10]) {
            return d.I(114);
        }
        if (command == Code.Code[1] || command == Code.Code[29]) {
            return d.I(115);
        }
        if (command == Code.Code[7]) {
            return d.I(116);
        }
        if (command == Code.Code[5]) {
            return d.I(121);
        }
        if (command == Code.Code[6]) {
            return d.I(122);
        }
        if (command == Code.Code[12] || command == Code.Code[38]) {
            return d.I(117);
        }
        if (command == Code.Code[13]) {
            if (Code().equals("myopera:terms")) {
                return "myopera:signup";
            }
            return d.B;
        }
        else {
            if (command == Code.Code[20]) {
                return d.I(92);
            }
            if (command == Code.Code[22]) {
                return d.I(96);
            }
            if (command == Code.Code[8]) {
                return d.I(93);
            }
            if (command == Code.Code[21]) {
                return d.I(94);
            }
            if (command == Code.Code[17]) {
                return d.I(83);
            }
            if (command == Code.Code[37]) {
                return "openno:" + Code.C;
            }
            if (command == Code.Code[27]) {
                return d.I(59);
            }
            if (command == Code.Code[24]) {
                return d.I(51);
            }
            if (command == Code.Code[25]) {
                return "menu:" + d.I(128);
            }
            if (command == Code.Code[26]) {
                return d.I(132);
            }
            if (command == Code.Code[39]) {
                return d.I(146);
            }
            if (command == Code.Code[40]) {
                return d.I(147);
            }
            return null;
        }
    }
    
    static void C() {
        if (!Code.Code) {
            Code.Z = new byte[] { 0 };
        }
    }
    
    static int Code(final int n, final int n2, final int n3, final int n4) {
        return Code(n, n2, n3, n4, 160);
    }
    
    private static void m() {
        for (int i = 0; i < Code.Z.size(); ++i) {
            ((d)Code.Z.elementAt(i)).I();
        }
    }
    
    static boolean B() {
        return Code.k;
    }
    
    private static boolean a() {
        final d code;
        return (code = Code()) != null && code.Code(16);
    }
    
    final Image Code(final int n) {
        if (this.I == null) {
            (this.I = new Image[4])[0] = d.Code(87);
            this.I[1] = d.Code(85);
            this.I[2] = d.Code(84);
            this.I[3] = d.Code(86);
        }
        return this.I[n];
    }
    
    Code() {
        this.j = 0;
        this.k = (int)System.currentTimeMillis();
        this.f = false;
        this.q = -1;
        this.r = 0;
        this.Code = null;
        this.a = "";
        this.Code = new Timer();
    }
    
    final void I(final String s, String code) {
        if (s.startsWith("http://")) {
            code = d.Code(code, true);
        }
        this.I("ext:" + d.Code(s, "%s", code));
    }
    
    static void Code(final String s, final String s2) {
        final StringBuffer sb;
        d.Code((sb = new StringBuffer()).append("a="), s);
        if (s2 != null) {
            d.Code(sb.append("&b="), s2);
        }
        Code().Code("overlay:" + d.I(70), (String)null, sb.toString());
    }
    
    public final void Code() {
        Code.Code = this;
        d.j();
        d.g();
        d.k();
        d.f();
        J();
        if (!d.aw) {
            d.Z("eurls");
            d.Z("b");
            d.Z("se");
        }
        if (d.q != -1 && d.Code(d.q, "b") == null) {
            d.q = -1;
        }
        d.u();
        d.r();
        if (d.X) {
            try {
                Code.Code = new C((byte)0);
            }
            finally {
                d.X = false;
            }
        }
        d.l();
        Code.Code = d.Code + " hifi" + ((d.I.length() > 0) ? " " : "") + d.I + ((d.Z.length() > 0) ? " " : "") + d.Z + " v. 4.5.33867, 20130625";
        Code.I = "Opera Mini/4.5.33867/hifi/" + d.I + "/" + d.Z;
        this.j = d.n;
        final int n = (d.m ^ true) ? 1 : 0;
        (d.Code = new Font[6])[0] = Font.getFont(64, 0, 8);
        d.Code[1] = Font.getFont(64, n, 8);
        d.Code[2] = Font.getFont(64, 0, 0);
        d.Code[3] = Font.getFont(64, n, 0);
        d.Code[4] = Font.getFont(64, 0, 16);
        d.Code[5] = Font.getFont(64, n, 16);
        if (!d.F && !d.ae) {
            this.setFullScreenMode(true);
        }
        Browser.Code.setCurrent((Displayable)this);
        new Thread(this).start();
    }
    
    private static boolean C() {
        return !d.ax && d.C.length() > 0;
    }
    
    final synchronized void Code(final String s, final String s2, final String s3) {
        if (s != null) {
            final String i;
            if ((i = d.I(s)).equals(d.I(66))) {
                Code.c = false;
            }
            else if (i.startsWith("rtsp://") || s.startsWith("rtsp://")) {
                d.I(s.startsWith("rtsp://") ? s : i);
                return;
            }
            if (!d.ax && (s.equals(d.I(65)) || s.equals(d.B))) {
                d.ax = true;
                d.J(false);
            }
            Code().Code(s, s2, s3);
        }
    }
    
    final void i() {
        this.a = Code(-1, true, null);
    }
    
    final void I() {
        d.s();
        Code.c = Math.max(d.Z(0), d.Z(1)) + 3;
        Code.d = Math.max(10, d.J(1)) + 3;
        if (d.n) {
            final int j = d.J(0);
            B.c = ((B.c = Math.max(18, (j + 6) * 140 / 100) - j) & 0xFFFFFFFE);
            Code.c += B.c - 2;
        }
        Code.c = Math.max(Code.c, (Code.c < 16) ? 14 : 18);
        Code.Code = new int[72];
        this.I = new int[Code.d];
        this.b = new int[Code.c];
        Image o = null;
        if (!d.az || d.aA) {
            final byte[] code;
            if ((code = d.Code(d.aA ? d.q : d.o, "b")) != null) {
                o = Image.createImage(code, 0, code.length);
            }
            if (o == null || o.getWidth() < 135) {
                o = null;
                d.az = true;
            }
        }
        if (o == null) {
            o = d.Code(68);
        }
        if (o != null) {
            o.getRGB(Code.Code, 0, Code.Code.length, 0, 21, Code.Code.length, 1);
            if (B.I == null) {
                (B.I = new Image[2])[0] = d.Code(o, 124, 0, 11, 10, 0);
                B.I[1] = d.Code(o, 124, 10, 11, 10, 0);
                if (d.r) {
                    Code.Z = d.Code(o, 103, 0, 10, 10, 0);
                    Code.J = d.Code(o, 113, 0, 1, 10, 0);
                    Code.B = d.Code(o, 114, 0, 10, 10, 0);
                    Code.C = d.Code(o, 103, 10, 6, 1, 0);
                    Code.a = d.Code(o, 118, 10, 6, 1, 0);
                    Code.d = d.Code(o, 103, 11, 10, 10, 0);
                    Code.c = d.Code(o, 113, 11, 1, 10, 0);
                    Code.b = d.Code(o, 114, 11, 10, 10, 0);
                }
            }
            this.p = d.Code(Image.createImage(o, 62, 0, 20, 22, 0), 1, Code.d, false);
            this.q = d.Code(Image.createImage(o, 82, 0, 20, 22, 0), 1, Code.d, false);
            this.Code = d.Code(Image.createImage(o, 42, 0, 20, 20, 0), 0, Code.c - 1, false);
            final Image code2 = d.Code(Image.createImage(o, 102, 0, 1, 22, 0), 1, Code.c, false);
            Image.createImage(o = d.Code(Image.createImage(o, 0, 0, 42, 22, 0), 1, Code.d, false), 0, 0, 1, Code.d, 0).getRGB(this.I, 0, 1, 0, 0, 1, Code.d);
            Image.createImage(code2, 0, 0, 1, Code.c, 0).getRGB(this.b, 0, 1, 0, 0, 1, Code.c);
        }
        this.o = o;
        d.Code = Code.Code;
        Code.e = Math.min(16, Code.d - 4);
        d.t();
        m();
    }
    
    final void Z() {
        final byte[] code = d.Code(8);
        final Object[] array = new Object[3];
        d.Code(code, 0, code.length, 256, array);
        array[0] = d.Code((int[])array[0], Code.Code[71]);
        if (Code.c < 18) {
            array[0] = d.Code((int[])array[0], (int)array[1], (int)array[2], 12, true);
            array[1] = new Integer(((int[])array[0]).length / 12);
            array[2] = new Integer(12);
        }
        this.r = Image.createRGBImage((int[])array[0], (int)array[1], (int)array[2], true);
        this.s = (Code.c - this.r.getHeight()) / 2 - 1;
        this.s = d.Code(array, this.b, -this.s);
        final Image code2;
        if (Code.e == null && d.r && (code2 = d.Code(2)) != null) {
            Code.e = d.Code(code2, 4, 0, 4, 4, 0);
            Code.f = d.Code(code2, 4, 4, 4, 1, 0);
            Code.g = d.Code(code2, 4, 5, 4, 4, 0);
            Code.h = d.Code(code2, 4, 4, 4, 1, 6);
            Code.i = d.Code(code2, 0, 5, 4, 4, 0);
            Code.j = d.Code(code2, 0, 4, 4, 1, 0);
            Code.k = d.Code(code2, 0, 0, 4, 4, 0);
        }
        if (B.Code == null) {
            B.Code = new Image[6];
            if (d.s) {
                int n = 0;
                while (true) {
                    final int n2 = n;
                    if (d.x || d.t) {
                        if (n2 >= 5) {
                            break;
                        }
                    }
                    else if (n2 >= 6) {
                        break;
                    }
                    B.Code[n] = d.Code(n + 71);
                    ++n;
                }
            }
            else {
                for (int i = 0; i < 5; ++i) {
                    B.Code[i] = d.Code(i + 77);
                }
            }
        }
        if (Code.J == null) {
            Code.J = d.Code(3);
        }
    }
    
    private void l() {
        if (Code.b) {
            return;
        }
        if (d.ae) {
            for (int i = 0; i < Code.Code.length; ++i) {
                if (Code.Code[i] != null && i != 23 && i != 28) {
                    ((Displayable)this).removeCommand(Code.Code[i]);
                    if (Code.B == i || Code.C == i || Code.a == i) {
                        if (i == 1) {
                            if (i != Code.a) {
                                ((Displayable)this).addCommand(Code.Code[i]);
                            }
                        }
                        else if (i != Code.a) {
                            ((Displayable)this).addCommand(Code.Code[i]);
                        }
                    }
                }
            }
            Code.l = Code.B;
            Code.m = Code.C;
            Code.n = Code.a;
        }
    }
    
    static {
        Code.Z = new byte[] { 0 };
        Code.I = true;
        Code.Z = "";
        Code.J = "";
        Code.B = "0";
        Code.Code = 1;
        Code.J = 3;
        Code = new Command[41];
        Z = new int[] { 1, 6, 2, 5, 50, 52, 54, 56 };
        final int[] array = { 54, 54, 55, 55, 52, 55, 50, 55, 50, 52, 51 };
        Code.I = -1L;
        Code.Z = new Vector();
        Code.c = 0;
        Code.d = 0;
        Code.e = 0;
        Code.b = true;
        Code.c = false;
        Code.Code = new Vector();
    }
    
    static void J() {
        final int n = 5 + ((d.aD ^ true) ? 1 : 0) + ((d.aB ^ true) ? 1 : 0);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream2;
        final DataOutputStream dataOutputStream = dataOutputStream2 = new DataOutputStream(out);
        final int v = n;
        try {
            dataOutputStream.writeByte(v);
            dataOutputStream2.writeByte(4);
            dataOutputStream2.writeInt(d.r);
            dataOutputStream2.writeByte(17);
            dataOutputStream2.writeInt(d.B);
            dataOutputStream2.writeByte(0);
            dataOutputStream2.writeInt(d.s);
            if (!d.aD) {
                dataOutputStream2.writeByte(15);
                dataOutputStream2.writeInt(d.x);
            }
            dataOutputStream2.writeByte(3);
            dataOutputStream2.writeInt(d.t);
            dataOutputStream2.writeByte(31);
            dataOutputStream2.writeInt(d.w);
            if (!d.aB) {
                dataOutputStream2.writeByte(35);
                dataOutputStream2.writeInt(d.v);
            }
        }
        catch (IOException ex) {}
        Code.Code = out.toByteArray();
    }
    
    static void B() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        final Vector a = d.a;
        int n;
        int i = n = 0;
        Vector vector = a;
        try {
            while (i < vector.size()) {
                final Object[] code2;
                final int code;
                final int n2 = (code = d.Code(code2 = d.Code(a, n), 9)) & 0x2;
                final int n3 = (n2 | -n2) >>> 31 << 6;
                final int n4 = code & 0x4;
                final int n5 = n3 | ((n4 | -n4) >>> 31) * 224 | (code & 0x1) << 7;
                dataOutputStream.writeByte((byte)(n + 1 | n5));
                if ((n5 & 0x40) != 0x0) {
                    dataOutputStream.writeInt(d.Code(code2, 10));
                }
                i = ++n;
                vector = a;
            }
        }
        catch (IOException ex) {}
        Code.I = out.toByteArray();
        Code.I = false;
    }
    
    public final synchronized void commandAction(final Command command, final Displayable displayable) {
        if (this.f) {
            this.f = false;
            return;
        }
        if (command == Code.Code[3] && Code().C) {
            Code().Code.h();
            return;
        }
        if (d.T && command == Code.Code[4] && this.o == -11) {
            this.f = true;
        }
        if (command == Code.Code[14]) {
            Browser.Code();
            return;
        }
        if (this.b()) {
            return;
        }
        if (displayable == this) {
            this.I(Code(command));
            return;
        }
        Object current = this;
        if (command == Code.Code[4] || command == Code.Code[10]) {
            if (displayable instanceof List) {
                current = this.Code;
            }
        }
        else if (command == Code.Code[9] || command == List.SELECT_COMMAND || command == Code.Code[19]) {
            if (displayable instanceof List) {
                final List list;
                final int selectedIndex;
                if ((selectedIndex = (list = (List)displayable).getSelectedIndex()) >= 0) {
                    this.Code.setString(list.getString(selectedIndex));
                }
                current = this.Code;
            }
            else if (displayable instanceof TextBox) {
                String s = ((TextBox)displayable).getString();
                if ((Code().Code != null && Code().Code.b != 97 && s.indexOf(10) != -1) || s.indexOf(8232) != -1 || s.indexOf(8233) != -1) {
                    final StringBuffer sb;
                    d.Code(sb = new StringBuffer(s), '\u2029', '\n');
                    d.Code(sb, '\u2028', '\n');
                    if (Code().Code.b != 97) {
                        d.Code(sb, '\n', (displayable == this.Code) ? '\0' : ' ');
                    }
                    s = sb.toString();
                }
                if (command == Code.Code[19]) {
                    this.I(d.I(47));
                }
                else if (Code().Code(16)) {
                    Code().Code(s);
                }
                else if (d.Code(Code().Code.Code) == 109) {
                    this.I((String)d.Code(d.c, d.n)[0], s);
                }
                else if (Code().J == 127) {
                    try {
                        final B code = Code().Code;
                        final d code2 = Code();
                        if (code.Code(s) == 0) {
                            code2.Code("overlay:" + d.I(46), (String)null, (String)null);
                        }
                        else {
                            code.g();
                            code2.C = true;
                            code.Z = code.Code;
                            code.J = code.I;
                            code.Code = 24;
                            code.I = 3;
                        }
                    }
                    finally {}
                }
                else if (d.Code(Code().Code.Code) == 60) {
                    if (s.length() > 0) {
                        final g g;
                        (g = new g(35)).I = s;
                        g.Code = Code();
                        d.Code(g);
                    }
                }
                else if (!Code().Code.Code(s, false)) {
                    this.Z(s);
                }
                if (d.A) {
                    final Alert alert;
                    (alert = new Alert(d.Code, d.Code(22), (Image)null, AlertType.INFO)).setTimeout(50);
                    Browser.Code.setCurrent(alert, (Displayable)this);
                    current = null;
                }
            }
        }
        else {
            current = null;
            if (command == Code.Code[15]) {
                this.n();
            }
            else if (command == Code.Code[18]) {
                final int n = 1;
                try {
                    final d code3;
                    if (d.Code((code3 = Code(n)).Code.Code) == -1) {
                        this.Code.setString(code3.Code.Code);
                    }
                }
                finally {
                    this.Code.setString("www.");
                }
            }
            else if (command == Code.Code[11] && this.Code != null && Browser.Code.getCurrent() == this.Code) {
                this.Code.setString("www.");
            }
        }
        if (d.z && current == this) {
            this.setFullScreenMode(true);
        }
        if (current != null) {
            Browser.Code.setCurrent((Displayable)current);
        }
    }
    
    private int Code(final int n) {
        final boolean a;
        if ((a = a()) && d.Code(n, -1, false) != -1) {
            return n;
        }
        int n2 = -7;
        if (d.L) {
            n2 = -6;
        }
        final int n3 = n2;
        if (Code.B == 2 || a) {
            n2 = -8;
        }
        String keyName = null;
        try {
            keyName = this.getKeyName(n);
        }
        finally {}
        final int index;
        if (d.i != null && (index = d.i.indexOf((char)n)) >= 0) {
            return d.j.charAt(index);
        }
        if (d.C == 3) {
            if (n == -14) {
                return -6;
            }
            if (n == -13) {
                return -7;
            }
            if (n == -20 || n == -22) {
                return 0;
            }
            if (n == -11) {
                if (Code().Code != null && Code().Code.Code.equals(d.I(60))) {
                    return n;
                }
                return n3;
            }
        }
        if (keyName != null) {
            final String lowerCase;
            if ((lowerCase = keyName.toLowerCase()).equals("sk2(left)")) {
                return -6;
            }
            if (lowerCase.equals("sk1(right)")) {
                return -7;
            }
            if (d.V && n == -7) {
                return -6;
            }
            if (d.V && n == -6) {
                return -7;
            }
            if (n == 105) {
                return -6;
            }
            if (d.ak && n == 42 && lowerCase.equals("start")) {
                return 42;
            }
            if (n == -20 && lowerCase.equals("symbol")) {
                return -11;
            }
            if (lowerCase.indexOf("soft") >= 0) {
                if (lowerCase.charAt(lowerCase.length() - 1) == '1' || lowerCase.startsWith("left")) {
                    return -6;
                }
                if (lowerCase.charAt(lowerCase.length() - 1) == '2' || lowerCase.charAt(lowerCase.length() - 1) == '4' || lowerCase.startsWith("right")) {
                    return -7;
                }
            }
            if (lowerCase.equals("clear") || lowerCase.equals("backspace") || lowerCase.equals("back")) {
                return n2;
            }
            if (lowerCase.equals("select") || lowerCase.equals("ok") || lowerCase.equals("send") || lowerCase.equals("fire") || lowerCase.equals("navi-center") || lowerCase.equals("start") || lowerCase.equals("enter")) {
                return -5;
            }
            if (lowerCase.equals("up") || lowerCase.equals("navi-up") || lowerCase.equals("up arrow")) {
                return 1;
            }
            if (lowerCase.equals("down") || lowerCase.equals("navi-down") || lowerCase.equals("down arrow")) {
                return 6;
            }
            if (lowerCase.equals("left") || lowerCase.equals("navi-left") || lowerCase.equals("left arrow")) {
                return 2;
            }
            if (lowerCase.equals("right") || lowerCase.equals("navi-right") || lowerCase.equals("right arrow")) {
                return 5;
            }
            if (lowerCase.equals("sidedown") || lowerCase.equals("vol. down")) {
                return -10;
            }
            if (lowerCase.equals("sideup") || lowerCase.equals("vol. up")) {
                return -9;
            }
            if (lowerCase.equals("q") || lowerCase.equals("w")) {
                return -6;
            }
            if (lowerCase.equals("o") || lowerCase.equals("p")) {
                return -7;
            }
        }
        if (n == -11 && d.C == 0) {
            return 0;
        }
        if (n == -22 && d.C == 2) {
            return 0;
        }
        if (n == -6 || n == -21 || n == 21 || n == 65 || n == 66 || n == -202 || n == 113 || n == 57345) {
            return -6;
        }
        if (n == -7 || n == -22 || n == 22 || n == 67 || n == 68 || n == 106 || n == -203 || n == 112 || n == 57346) {
            return -7;
        }
        if (n == -5 || n == -10 || n == -20 || n == 20 || n == 23 || n == -14 || n == -26 || n == -200 || n == 13) {
            return -5;
        }
        if (n == -8 || n == -11 || n == -16 || n == -19 || n == -204) {
            return n2;
        }
        switch (n) {
            case 35:
            case 42:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57: {
                return n;
            }
            default: {
                try {
                    final int gameAction;
                    if ((gameAction = this.getGameAction(n)) != 0 && gameAction == 8) {
                        return -5;
                    }
                }
                finally {
                    return n;
                }
                break;
            }
        }
    }
    
    protected final synchronized void keyRepeated(final int n) {
        if (d.aF) {
            return;
        }
        if (this.Code != null) {
            return;
        }
        if (d.R && Code(this.I(this.Code(n)))) {
            this.g = true;
            f();
        }
    }
    
    final void I(final String anObject) {
        if ((d.C.equals(anObject) || d.Code(anObject) == 65) && d.q < 0) {
            this.Code("sk:///s/private?version=3", anObject, null);
            return;
        }
        this.Code(anObject, null, null);
    }
    
    private boolean b() {
        boolean b = false;
        this.r = 0;
        if (this.J != null) {
            this.J.cancel();
            this.J = null;
        }
        if (Code().Code(8) && Code().Code.Code.equals(d.I(76))) {
            this.I(Code());
            b = true;
        }
        this.c();
        return b;
    }
    
    final synchronized void a() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.q >= 0 && currentTimeMillis >= this.Code) {
            this.Code = currentTimeMillis + 40L;
            this.g = true;
            f();
            return;
        }
        if (currentTimeMillis >= this.Code + 20000L) {
            this.Z.cancel();
            this.Z = null;
        }
    }
    
    private int I(final int n) {
        if (a() && d.Code(n, -1, false) != -1) {
            return n;
        }
        if (d.P && Code.h > Code.i) {
            if (n == -6) {
                return -7;
            }
            if (n == -7) {
                return -6;
            }
            if (this.J == null) {
                switch (n) {
                    case 50: {
                        return 52;
                    }
                    case 56: {
                        return 54;
                    }
                    case 52: {
                        return 56;
                    }
                    case 54: {
                        return 50;
                    }
                }
            }
        }
        else if (d.L) {
            switch (n) {
                case 1: {
                    return 2;
                }
                case 6: {
                    return 5;
                }
                case 2: {
                    return 6;
                }
                case 5: {
                    return 1;
                }
                default: {
                    if (this.J == null) {
                        switch (n) {
                            case 50: {
                                return 52;
                            }
                            case 56: {
                                return 54;
                            }
                            case 52: {
                                return 56;
                            }
                            case 54: {
                                return 50;
                            }
                        }
                    }
                    if (d.N && Code.h > 300) {
                        break;
                    }
                    if (n == -6) {
                        return -7;
                    }
                    if (n == -7) {
                        return -6;
                    }
                    break;
                }
            }
        }
        return n;
    }
    
    private static int I(final int n, final int n2) {
        if (d.L) {
            return Code.h - n;
        }
        return n2;
    }
    
    final int Code() {
        return this.r;
    }
    
    private void Code(final int r, final int n) {
        if (!this.d || Code.b) {
            return;
        }
        this.Code((Graphics)null);
        this.j = false;
        if (Code.B != null) {
            Code.B.cancel();
            Code.B = null;
        }
        if (d.C == 3 && r == -11) {
            this.commandAction(Code.Code[4], (Displayable)this);
            return;
        }
        final d code;
        if ((code = Code()) == null) {
            return;
        }
        code.J = -1;
        if (code.Code(1) || (code.Code(8) && r != 1 && r != 6 && r != 2 && r != 5)) {
            final int r2;
            if ((r2 = this.r) != 0) {
                if (d.ax && !Code.b) {
                    final String code2 = d.Code(r2, r, false);
                    this.b();
                    this.I(code2);
                }
                return;
            }
            if (r == 35 || r == 42) {
                if (d.ax && !Code.b && !this.Code((Graphics)null) && code.Code(1) && d.Code(Code()) != 73 && !Code().startsWith("sk:")) {
                    this.r = r;
                    this.c();
                    this.J = new g(4);
                    this.Code.schedule(this.J, 1500L);
                }
                return;
            }
        }
        if (r == -6) {
            if (d.ae) {
                return;
            }
            this.commandAction(Code.Code[Code.B], (Displayable)this);
        }
        else if (r == -7) {
            if (d.ae) {
                return;
            }
            this.commandAction(Code.Code[Code.C], (Displayable)this);
        }
        else if (r == -8 && code.Code != null && code.B() != -1) {
            final int code3 = d.Code(code.Code.Code);
            int n2 = -1;
            switch (code3) {
                case 90: {
                    n2 = 99;
                    break;
                }
                case 91: {
                    n2 = 50;
                    break;
                }
                case 109: {
                    if (code.B() > 0) {
                        n2 = 43;
                        break;
                    }
                    n2 = -1;
                    break;
                }
                case 136: {
                    n2 = 139;
                    break;
                }
            }
            if (n2 != -1) {
                this.I("dialog:" + d.I(n2));
            }
        }
        else if (r == -5 && Code.a > 0 && Code.a != 23 && Code.a != 29) {
            if (Code.a == 28 && Code.B >= 0) {
                this.commandAction(Code.Code[Code.B], (Displayable)this);
                return;
            }
            this.commandAction(Code.Code[Code.a], (Displayable)this);
            return;
        }
        code.Code(r, n);
        if (d.Q) {
            g.Code();
            return;
        }
        this.repaint();
    }
    
    private static boolean Code(final int n) {
        if (a()) {
            return n != -5 && n != -6 && (n != -7 || Code.C == 26);
        }
        return d.Code(Code.Z, n);
    }
    
    protected final synchronized void showNotify() {
        this.q = -1;
        this.repaint();
    }
    
    protected final synchronized void hideNotify() {
        this.q = -1;
    }
    
    final void I(final boolean j) {
        this.j = j;
    }
    
    final boolean Z() {
        return !d.H || (d.M && this.J());
    }
    
    private static int Code(final int n, final int n2) {
        if (d.L) {
            return n2;
        }
        return n;
    }
    
    protected final synchronized void keyPressed(int i) {
        try {
            d.v();
            d.J(i);
            if (d.aF && !Code(this.Code(i))) {
                return;
            }
            if (this.Code != null) {
                return;
            }
            if (d.W && i == -6 && Code.I + 100L > System.currentTimeMillis()) {
                Code.h = true;
                return;
            }
            if (d.C == -1 && i == this.o + 100) {
                this.getKeyName(i);
            }
            if (d.af && i == 59440) {
                return;
            }
            if ((this.o = i) == -11 && d.C == 3) {
                d.S = true;
            }
            i = this.I(this.Code(i));
            this.q = -1;
            if (!d.S || Code(i)) {
                this.Code(i, 0);
                if (Code(i)) {
                    this.p = i;
                    this.q = 0;
                    this.Code = System.currentTimeMillis() + d.b;
                    if (!d.R && this.Z == null) {
                        this.Z = new g(0);
                        this.Code.schedule(this.Z, 40L, 40L);
                    }
                }
            }
        }
        finally {
            I(2, 1);
        }
    }
    
    protected final synchronized void keyReleased(int i) {
        d.v();
        d.J(i);
        d.Z(8);
        if (d.aF && !Code(this.Code(i))) {
            return;
        }
        if (this.Code != null) {
            return;
        }
        if (d.W) {
            Code.I = -1L;
            if (i == -6) {
                if (Code.h) {
                    Code.h = false;
                    return;
                }
                Code.I = System.currentTimeMillis();
            }
            Code.h = false;
        }
        if (i != this.o) {
            return;
        }
        this.o = Integer.MAX_VALUE;
        this.q = -1;
        i = this.I(this.Code(i));
        if (d.S && !Code(i)) {
            this.Code(i, 0);
            if (i == -11 && d.C == 3) {
                d.S = false;
            }
        }
    }
    
    protected final synchronized void pointerDragged(int code, int i) {
        d.v();
        d.J(code);
        d.J(i);
        d.Z(1);
        if (d.aF) {
            return;
        }
        final int n = code;
        code = Code(code, i);
        i = I(n, i);
        final d code2;
        boolean b2;
        final boolean b = b2 = ((code2 = (d)this.Code) instanceof d);
        boolean b6;
        boolean b5;
        boolean b4;
        boolean b3;
        if (b && b && (b3 = (b4 = (b5 = (b6 = (b2 = code2.h)))))) {
            if (code2.g) {
                b4 = (b3 = (b5 = (b6 = (b2 = false))));
            }
            if (b3 && b4) {
                if (code2.f) {
                    b6 = (b5 = (b2 = false));
                }
                if (b5) {
                    if (code2.e) {
                        b2 = (b6 = false);
                    }
                    if (b6 && (b2 = code2.d)) {
                        b2 = code2.c;
                    }
                }
            }
        }
        if (b2) {
            final d code3;
            boolean b8;
            final boolean b7 = b8 = ((code3 = (d)this.Code(code, i)) instanceof d);
            boolean b12;
            boolean b11;
            boolean b10;
            boolean b9;
            if (b7 && b7 && (b9 = (b10 = (b11 = (b12 = (b8 = code3.h)))))) {
                if (code3.g) {
                    b10 = (b9 = (b11 = (b12 = (b8 = false))));
                }
                if (b9 && b10) {
                    if (code3.f) {
                        b12 = (b11 = (b8 = false));
                    }
                    if (b11) {
                        if (code3.e) {
                            b8 = (b12 = false);
                        }
                        if (b12 && (b8 = code3.d)) {
                            b8 = code3.c;
                        }
                    }
                }
            }
            if (b8 && code3.Code(2)) {
                this.Code = code3;
            }
            ((d)this.Code).J(code, i);
            return;
        }
        if (this.Code(code, i) != this.Code) {
            this.Code = null;
            this.c();
        }
    }
    
    protected final synchronized void pointerReleased(int code, int i) {
        d.v();
        d.J(code);
        d.J(i);
        d.Z(1);
        if (d.aF) {
            return;
        }
        final int n = code;
        final int n2 = i;
        code = Code(code, i);
        i = I(n, i);
        this.pointerDragged(n, n2);
        final d code2;
        boolean b2;
        final boolean b = b2 = ((code2 = (d)this.Code) instanceof d);
        boolean b6;
        boolean b5;
        boolean b4;
        boolean b3;
        if (b && b && (b3 = (b4 = (b5 = (b6 = (b2 = code2.h)))))) {
            if (code2.g) {
                b4 = (b3 = (b5 = (b6 = (b2 = false))));
            }
            if (b3 && b4) {
                if (code2.f) {
                    b6 = (b5 = (b2 = false));
                }
                if (b5) {
                    if (code2.e) {
                        b2 = (b6 = false);
                    }
                    if (b6 && (b2 = code2.d)) {
                        b2 = code2.c;
                    }
                }
            }
        }
        if (b2) {
            ((d)this.Code).Z(code, i);
        }
        else if (this.Code(code, i) == this.Code && this.Code instanceof Command) {
            this.commandAction((Command)this.Code, (Displayable)this);
            this.c();
        }
        this.Code = null;
    }
    
    protected final synchronized void pointerPressed(int code, int i) {
        this.q = -1;
        this.j = true;
        ++this.b;
        d.v();
        d.J(code);
        d.J(i);
        d.Z(1);
        if (d.aF) {
            return;
        }
        final int n = code;
        final int n2 = i;
        code = Code(code, i);
        i = I(n, i);
        this.Code = this.Code(code, i);
        if (this.Code instanceof Command) {
            if (d.Code(Code((Command)this.Code), "menu:")) {
                this.pointerReleased(n, n2);
                this.Code = Code();
            }
            this.c();
            return;
        }
        final d code2;
        boolean b2;
        final boolean b = b2 = ((code2 = (d)this.Code) instanceof d);
        boolean b6;
        boolean b5;
        boolean b4;
        boolean b3;
        if (b && b && (b3 = (b4 = (b5 = (b6 = (b2 = code2.h)))))) {
            if (code2.g) {
                b4 = (b3 = (b5 = (b6 = (b2 = false))));
            }
            if (b3 && b4) {
                if (code2.f) {
                    b6 = (b5 = (b2 = false));
                }
                if (b5) {
                    if (code2.e) {
                        b2 = (b6 = false);
                    }
                    if (b6 && (b2 = code2.d)) {
                        b2 = code2.c;
                    }
                }
            }
        }
        if (b2) {
            if (this.Code == Code.Z.elementAt(Code.Z.size() - 1) || (this.Code((d)this.Code) && ((d)this.Code).Code(2))) {
                final g task;
                (task = new g(49)).Code = this.b;
                this.Code.schedule(task, 1000L);
                ((d)this.Code).I(code, i);
                return;
            }
            this.Code = null;
        }
    }
    
    private boolean Code(final Graphics graphics) {
        boolean b = true;
        int n = 0;
        int n2 = 0;
        final StringBuffer sb = new StringBuffer();
        int n3 = 0;
        Code.B = 23;
        Code.C = 23;
        if (d.aF) {
            n = 160;
            n2 = d.A;
        }
        else if (d.z >= 0) {
            n = d.y;
            n2 = d.z;
            n3 = 2;
        }
        else if (d.X && d.Z >= 0) {
            d.Code(173);
            Code.C = 3;
            n = d.I;
            n2 = d.Z;
            sb.append(d.Code(172)).append(' ');
            d.Code(sb, n2, n);
        }
        else {
            if (Code(1) == null) {
                return false;
            }
            B b2;
            if ((b2 = Code(1).Code()) == null && Code(4) != null) {
                b2 = Code(4).Code();
            }
            if (b2 != null && !b2.a && b2 != null) {
                final d code;
                if ((code = Code(8)) != null && code.Code != null) {
                    Code.B = code.Code.Code;
                    Code.C = code.Code.I;
                }
                else if (b2.Z() && d.au) {
                    Code.C = 38;
                }
                else {
                    Code.C = 3;
                    if (b2 != null && d.C.equals(b2.Code)) {
                        Code.C = 23;
                    }
                }
                n = b2.Code();
                n2 = b2.I();
                switch (b2.C) {
                    case 1: {
                        sb.append(d.Code(20));
                        n3 = 1;
                        break;
                    }
                    case 2: {
                        sb.append(d.Code(22));
                        n3 = 1;
                        break;
                    }
                    case 3:
                    case 4: {
                        sb.append(d.Code(23));
                        sb.append(' ').append(b2.Z() / 1000).append('/').append(n / 1000).append(" kB");
                        break;
                    }
                }
            }
            else {
                b = false;
                Code().C();
            }
        }
        if (d.ae) {
            if (Code.B != Code.l || Code.C != Code.m || Code.a != Code.n) {
                this.l();
            }
            if (!b) {
                return false;
            }
        }
        if (graphics == null) {
            return b;
        }
        int code2 = 0;
        int code3 = 0;
        final int n4 = Code.g - Code.c;
        final int f = Code.f;
        if (!d.ae) {
            graphics.setColor(Code.Code[27]);
            graphics.drawLine(0, n4, f - 1, n4);
            for (int i = 0; i < Code.c; ++i) {
                graphics.setColor(this.b[i]);
                graphics.drawLine(0, n4 + i + 1, f - 1, n4 + i + 1);
            }
            String s = Code.Code[Code.B].getLabel();
            if (Code.B == 21 && c()) {
                s = "";
            }
            String s2 = Code.Code[Code.C].getLabel();
            final String label = Code.Code[Code.a].getLabel();
            if (d.M) {
                s = "";
            }
            code2 = d.Code(0, s) + ((Code.B == 23 || d.M) ? 0 : 8);
            final int code4 = d.Code(0, s2);
            final int n5 = Code.C - 23;
            code3 = code4 + ((n5 | -n5) >>> 31 << 3);
            final int code5 = d.Code(1, label);
            final int n6 = Code.a - 23;
            final int n7 = code5 + ((n6 | -n6) >>> 31 << 3);
            if (code2 >= (f - n7) / 2 || code3 >= (f - n7) / 2) {
                s = d.Code(0, s, (f - n7) / 2 - 1, ".");
                code2 = d.Code(0, s);
                s2 = d.Code(0, s2, (f - n7) / 2 - 1, ".");
                code3 = d.Code(0, s2);
            }
            int n8 = (Code.C == 12 || Code.C == 38 || (Code.C == 3 && Code().Code() != null && Code().Code().Z() && d.au)) ? 1 : 0;
            if (this.r != null) {
                final int n9 = n8;
                if (this.r.getWidth() + 3 + code3 < (f - n7) / 2 - 1) {
                    n8 = (n9 & 0x1);
                }
                else {
                    n8 = 0;
                }
            }
            if (n8 != 0) {
                code3 += this.r.getWidth() + 2;
            }
            graphics.setColor(Code.Code[1]);
            if (this.Code == Code.Code[Code.B] && Code.Code[Code.B] != Code.Code[23]) {
                d.Code(graphics, 0, n4 + 2, code2, Code.c - 1, Code.Code[8], Code.Code[9]);
                graphics.setColor(Code.Code[2]);
            }
            Code(graphics, 0, s, 4, 20);
            graphics.setColor(Code.Code[1]);
            if (this.Code == Code.Code[Code.C] && Code.Code[Code.C] != Code.Code[23]) {
                d.Code(graphics, f - code3, n4 + 2, code3, Code.c - 1, Code.Code[8], Code.Code[9]);
                graphics.setColor(Code.Code[2]);
                if (n8 != 0) {
                    graphics.drawImage(this.r, f - code3 + 3, Code.g - this.r.getHeight() - this.s, 20);
                }
            }
            else if (n8 != 0) {
                graphics.drawImage(this.s, f - code3 + 3, Code.g - this.r.getHeight() - this.s, 20);
            }
            Code(graphics, 0, s2, f - 4, 24);
            if (this.Code == Code.Code[Code.a] && Code.Code[Code.a] != Code.Code[23]) {
                d.Code(graphics, f / 2 - n7 / 2, n4 + 2, n7, Code.c - 1, Code.Code[8], Code.Code[9]);
            }
            graphics.setColor(Code.Code[1]);
            if (!d.M) {
                Code(graphics, 1, label, 0 + f / 2, 17);
            }
        }
        if (b) {
            Code(graphics, code2, Code.g - Code.c, Code.f - code3 - code2, Code.c, n2, n, sb, n3);
        }
        else if (Code.a == 23) {
            final int code6 = d.Code(0, this.a);
            if (code2 + code6 / 2 + 1 < f / 2 && code3 + code6 / 2 + 1 < f / 2) {
                int r = this.r;
                char c = ' ';
                final B code7;
                final String j;
                if (r == 0 && (code7 = Code().Code) != null && code7.Code() && (j = Code().Code.I()) != null) {
                    final char[] code8 = d.Code(j);
                    if (!Code().Code(2) || Code.c) {
                        r = code8[0];
                        c = code8[1];
                    }
                    else if (code8[0] != '\0' && Code.B == null) {
                        Code.B = new g(24);
                        this.Code.schedule(Code.B, 1500L);
                    }
                }
                if (r != 0) {
                    graphics.drawImage(this.Code, f / 2 - 1, n4 + 1, 24);
                    graphics.drawImage(this.Code, f / 2, n4 + 1, 20);
                    graphics.setColor(Code.Code[32]);
                    Code(graphics, 1, String.valueOf((char)r), (f - this.Code.getWidth()) / 2 - 1, 17);
                    Code(graphics, 1, String.valueOf(c), (f + this.Code.getWidth()) / 2, 17);
                }
                else {
                    graphics.setColor(Code.Code[1]);
                    Code(graphics, 0, this.a, f / 2, 17);
                }
            }
        }
        return b;
    }
    
    private void Code(final Graphics graphics) {
        if (this.i != this.J()) {
            this.i ^= true;
            m();
        }
        int n = -1;
        int i = 0;
        d d = null;
        d d2 = null;
        for (int j = Code.Z.size() - 1; j >= 0; --j) {
            final d d3;
            if ((d3 = Code.Z.elementAt(j)).Code(8)) {
                if (d2 != null) {
                    continue;
                }
                d2 = d3;
            }
            if (n < 0 && d3.Code(21)) {
                n = j;
            }
            d3.I(this.q >= 0);
            if (d == null || !d3.Code(d) || d.Z()) {
                i = j;
                d = d3;
            }
        }
        while (i < Code.Z.size()) {
            final d d4;
            if (!(d4 = (d)Code.Z.elementAt(i)).Code(8) || d4 == d2) {
                d4.Code(graphics);
            }
            if (n == i) {
                if (this.I == null) {
                    final int f = Code.f;
                    if (d.y) {
                        final int n2;
                        final int[] array = new int[n2 = f * 10];
                        for (int k = 0; k < n2; ++k) {
                            array[k] = -1;
                        }
                        Image.createRGBImage(array, f, 10, false);
                    }
                    final int[] array2 = new int[f * 3];
                    final int[] array3 = new int[f << 1];
                    for (int l = 0; l < f; ++l) {
                        array2[l] = -2113929216;
                        array2[l + f] = 1023410176;
                        array2[l + (f << 1)] = 301989888;
                        array3[l] = 134217728;
                        array3[l + f] = 436207616;
                    }
                    this.I = Image.createRGBImage(array2, f, 3, true);
                    this.t = Image.createRGBImage(array3, f, 2, true);
                }
                if (this.i) {
                    if (graphics.getClipY() + graphics.getClipHeight() > Code.g - Code.c) {
                        this.Code(graphics);
                    }
                    if (graphics.getClipY() + graphics.getClipHeight() > Code.g - Code.c - 2 && d.q) {
                        graphics.drawImage(this.t, 0, Code.g - Code.c - 2, 20);
                    }
                }
                if (this.Z()) {
                    if (graphics.getClipY() < Code.d) {
                        Image code = null;
                        String m = null;
                        int n3 = 0;
                        int n4 = 2;
                        int a = 0;
                        final B code2 = Code(5).Code;
                        int f2 = Code.f;
                        for (int n5 = 0; n5 < Code.d; ++n5) {
                            graphics.setColor(this.I[n5]);
                            graphics.drawLine(0, n5, f2, n5);
                        }
                        if (d.M && !d.ae) {
                            String label = Code.Code[Code.B].getLabel();
                            if (Code.B == 21 && c()) {
                                label = "";
                            }
                            graphics.setColor(Code.Code[1]);
                            d.Code(graphics, 1, label, f2 - 2, 1, 24);
                            f2 -= d.Code(1, label) + 4;
                        }
                        if (code2 != null) {
                            m = code2.I;
                            code = code2.Code();
                            a = code2.a;
                            if (code != null) {
                                n4 = 2 + (4 + Code.e);
                            }
                        }
                        if (!d.L && d.C == 0) {
                            switch (((Displayable)this).getHeight()) {
                                case 160: {
                                    n3 = 13;
                                    break;
                                }
                                case 208: {
                                    n3 = 17;
                                    break;
                                }
                                case 320: {
                                    n3 = 22;
                                    break;
                                }
                                case 416: {
                                    n3 = 28;
                                    break;
                                }
                            }
                        }
                        final int n6 = n4 + n3;
                        if (this.o != null) {
                            d.Code(graphics, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), Code.d);
                            if (!d.M) {
                                graphics.drawImage(this.o, f2, 0, 24);
                                f2 -= this.o.getWidth();
                            }
                            if (a == 3) {
                                graphics.drawImage(this.p, f2, (Code.d - this.p.getHeight()) / 2, 24);
                                f2 -= this.p.getWidth();
                            }
                            d.Z(graphics);
                        }
                        if (Code.a || Code.C) {
                            graphics.drawImage(this.q, f2, (Code.d - this.q.getHeight()) / 2, 24);
                            f2 -= this.q.getWidth();
                        }
                        if (m != null) {
                            final String code3 = d.Code(1, m, f2 - n6, null);
                            graphics.setColor(Code.Code[0]);
                            d.Code(graphics, 1, code3, n6, 1, 20);
                            final int index;
                            if (d.Code(code2.Code) != -1 && code3.equals(d.Code) && (index = code3.indexOf(32)) != -1) {
                                graphics.setColor(Code.Code[39]);
                                d.Code(graphics, 1, code3.substring(0, index), n6, 1, 20);
                            }
                        }
                        if (code != null) {
                            graphics.drawImage(code, n3 + 2, (Code.d - Code.e - 1) / 2, 20);
                        }
                    }
                    if (graphics.getClipY() < Code.d + 3 && d.q) {
                        final d code4;
                        final d d5 = ((code4 = Code(16)) != null) ? code4.I() : null;
                        if (code4 != null && d5 != null && d5.Code != null && d.Code(d5.Code.Code) != 65) {
                            graphics.drawImage(this.I, Code.f, Code.d, 20);
                        }
                        else {
                            graphics.drawImage(this.I, 0, Code.d, 20);
                        }
                    }
                }
            }
            ++i;
        }
        if (!this.I()) {
            Code().I(graphics);
        }
        final String i2;
        if ((i2 = d.I()) != null) {
            final int n7 = (Code.f - d.Code(0, i2)) / 2;
            graphics.setColor(16777215);
            graphics.fillRect(0, 1, Code.f, d.J(0));
            graphics.setColor(0);
            d.Code(graphics, 0, i2, n7, 1, 20);
        }
    }
    
    private Object Code(final int n, final int n2) {
        int size = Code.Z.size();
        while (size-- > 0) {
            final d d;
            if ((d = Code.Z.elementAt(size)).Code(n, n2)) {
                return d;
            }
        }
        this.Code((Graphics)null);
        if (this.J() && (n2 > Code.g - Code.c || (d.M && n2 < Code.c))) {
            int n3 = d.Code(1, Code.Code[Code.B].getLabel()) + 4;
            int n4 = (Code.C == 12) ? (Code.f - d.Code(1, Code.Code[Code.C].getLabel()) - this.r.getWidth() - 8) : (Code.f - d.Code(1, Code.Code[Code.C].getLabel()) - 4);
            if (n3 < Code.f / 3) {
                n3 = Code.f / 3;
            }
            if (n4 > Code.f / 3 << 1) {
                n4 = Code.f / 3 << 1;
            }
            if (d.M) {
                if (n > n4 && n2 > Code.g - Code.c) {
                    return Code.Code[Code.C];
                }
                if (n > Code.f - n3 && n2 < Code.c) {
                    return Code.Code[Code.B];
                }
            }
            else if (n2 > Code.g - Code.c) {
                if (n > n4) {
                    return Code.Code[Code.C];
                }
                if (n >= n3 && n <= n4) {
                    return Code.Code[Code.a];
                }
                if (n < n3) {
                    return Code.Code[Code.B];
                }
            }
        }
        return null;
    }
    
    static d Code(final int n) {
        int size = Code.Z.size();
        while (size-- > 0) {
            final d d;
            if ((d = Code.Z.elementAt(size)).Code(n)) {
                return d;
            }
        }
        return null;
    }
    
    static d Code(final String s) {
        int size = Code.Z.size();
        while (size-- > 0) {
            final d d;
            if ((d = Code.Z.elementAt(size)).Code != null && s.equals(d.Code.Code)) {
                return d;
            }
        }
        return null;
    }
    
    private void n() {
        if (d.z) {
            this.setFullScreenMode(false);
        }
        final List current = new List(d.Code(6), 3);
        for (int i = Code.Code.size() - 1; i >= 0; --i) {
            current.append((String)Code.Code.elementAt(i), (Image)null);
        }
        current.setSelectCommand(Code.Code[9]);
        ((Displayable)current).addCommand(Code.Code[4]);
        Code((Screen)current);
        ((Displayable)current).setCommandListener((CommandListener)this);
        Browser.Code.setCurrent((Displayable)current);
    }
    
    private static String Code() {
        final B code;
        if ((code = Code().Code) != null) {
            return code.Code;
        }
        return "";
    }
    
    static void Code(final String s) {
        Code(d.Code(37), s);
    }
    
    final boolean I() {
        return this.j || Code().Code == null;
    }
    
    private static boolean c() {
        final d code;
        final String z;
        return (code = Code(1)) != null && code.Code != null && ((z = code.Code.Z()) == null || !z.startsWith("myopera:///b/g/"));
    }
    
    final boolean J() {
        return ((!d.H || a() || (Code.Z.size() > 0 && Code().Code != null && (Code().Code.Code > 0 || Code().Code.I > 0))) && !d.ae) || this.Code((Graphics)null);
    }
    
    final void J(final String string) {
        if (d.z) {
            this.setFullScreenMode(false);
        }
        if (d.v) {
            this.Code = Code();
        }
        else {
            ((Displayable)this.Code).removeCommand(Code.Code[9]);
            ((Displayable)this.Code).removeCommand(Code.Code[10]);
            ((Displayable)this.Code).removeCommand(Code.Code[15]);
            ((Displayable)this.Code).removeCommand(Code.Code[18]);
            ((Displayable)this.Code).removeCommand(Code.Code[14]);
            ((Displayable)this.Code).removeCommand(Code.Code[11]);
        }
        ((Displayable)this.Code).addCommand(Code.Code[9]);
        ((Displayable)this.Code).addCommand(Code.Code[10]);
        ((Displayable)this.Code).addCommand(Code.Code[11]);
        if (Code.Code.size() > 0) {
            ((Displayable)this.Code).addCommand(Code.Code[15]);
        }
        final B code;
        if (d.Code((code = Code(1).Code).Code) == -1 && !code.C) {
            ((Displayable)this.Code).addCommand(Code.Code[18]);
        }
        Code((Screen)this.Code);
        ((Displayable)this.Code).setCommandListener((CommandListener)this);
        if (string == null) {
            this.Code.setString("www.");
        }
        else {
            this.Code.setString(string);
        }
        Browser.Code.setCurrent((Displayable)this.Code);
    }
    
    final void d() {
        if (this.Code == null) {
            Code.Z = System.currentTimeMillis();
            ((Timer)(this.Code = new g(1))).schedule(this.Code, 0L, 500L);
        }
    }
    
    final void b() {
        d.H ^= true;
        m();
        this.repaint();
    }
    
    protected final synchronized void sizeChanged(int i, int height) {
        if (Code.h == 0 || Code.i == 0 || (i == Code.h && height == Code.i)) {
            return;
        }
        i = ((Displayable)this).getWidth();
        height = ((Displayable)this).getHeight();
        if (d.L) {
            Code.f = height;
            Code.g = i;
        }
        else {
            Code.g = height;
            Code.f = i;
        }
        Code.h = i;
        Code.i = height;
        this.I = null;
        this.Code(d.L);
        d d;
        for (i = 0; i < Code.Z.size(); ++i) {
            if ((d = Code.Z.elementAt(i)).Code != null) {
                d.Code.a();
            }
        }
        m();
        if (d.aj) {
            this.k();
        }
        if (Code.u != null && (Code.u.getWidth() != Code.f || Code.u.getHeight() != Code.g)) {
            i = Code.u.getWidth() * Code.u.getHeight() << 1;
            if (Browser.Code.numColors() > 65536) {
                i <<= 1;
            }
            d.J -= i;
            Code.Code = null;
            Code.u = null;
        }
        this.repaint();
    }
    
    final void e() {
        if (this.Code != null) {
            this.Code.cancel();
            this.Code = null;
        }
    }
    
    final void Code(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        if (this.Z == null) {
            final Image code = d.Code(88);
            (this.Z = new Image[4])[0] = Image.createImage(code, 0, 0, 3, 5, 0);
            this.Z[1] = Image.createImage(code, 4, 0, 4, 5, 0);
            this.Z[2] = Image.createImage(code, 8, 0, 3, 5, 0);
            this.Z[3] = Image.createImage(code, 12, 0, 4, 5, 0);
            this.C = new int[5];
            this.a = new int[5];
            code.getRGB(this.C, 0, 1, 3, 0, 1, 5);
            code.getRGB(this.a, 0, 1, 11, 0, 1, 5);
        }
        Code(graphics, n, n2, n3, n4, this.Z, this.C, this.a);
    }
    
    final void c() {
        if (d.D) {
            this.repaint();
            return;
        }
        final int a = Code.g - Code.c;
        final int f = Code.f;
        final int c = Code.c;
        if (d.Q) {
            g.Code();
            return;
        }
        if (!this.d || Code.b) {
            this.repaint();
            return;
        }
        final int max = Math.max(0, 0);
        final int max2 = Math.max(a, 0);
        if (d.L) {
            this.repaint(max, 0, a + c - max2, f - max);
            return;
        }
        this.repaint(max, max2, f - max, a + c - max2);
    }
    
    static void f() {
        if (!Code.k) {
            Code.k = true;
            Code.Code.repaint();
        }
        Code.l = true;
    }
    
    static int Code(final int n, final int n2, final int n3, int max, final int n4) {
        if (!d.ao && n4 == 160) {
            return n2;
        }
        max = Math.max(0, Code.t - max);
        if (n == n2 || max >= n4) {
            return n2;
        }
        Code.k = true;
        Code.l = true;
        if (n4 == 160) {
            return n3 + (int)((n2 - n3) * (long)max * (160 * (max + 160) - max * max) / 4096000L);
        }
        final long n5 = n4;
        final long n6 = n4 - max;
        return n2 - (int)((n2 - n3) * n6 * n6 / n5 / n5);
    }
    
    static void Code(String code, String substring, final int n, final boolean b) {
        final int length = ((String)substring).length();
        final B code2;
        if ((code2 = Code().Code) != null) {
            code2.h();
        }
        int i = Math.max(5524, ((String)substring).length());
        if (d.a > 0) {
            i = d.a;
        }
        while (i > 255) {
            if (((String)substring).length() > i) {
                substring = ((String)substring).substring(0, i);
            }
            Label_0092: {
                Label_0205: {
                    try {
                        substring = new TextBox("", (String)substring, i, n);
                    }
                    finally {
                        break Label_0205;
                    }
                    break Label_0092;
                }
                i -= i / 10;
                continue;
            }
            if (code == null) {
                code = d.Code(40);
            }
            ((TextBox)substring).setTitle(code + " (" + ((TextBox)substring).getMaxSize() + ")");
            ((Displayable)substring).addCommand(Code.Code[9]);
            ((Displayable)substring).addCommand(Code.Code[10]);
            if (b) {
                ((Displayable)substring).addCommand(Code.Code[19]);
            }
            Code((Screen)substring);
            Code.Code.f = d.u;
            ((Displayable)substring).setCommandListener((CommandListener)Code.Code);
            Code.I = (TextBox)substring;
            Code.v = length;
            Z(true);
        }
    }
    
    private static TextBox Code() {
        try {
            return new TextBox(d.Code(39), "www.", 400, 524292);
        }
        catch (IllegalArgumentException ex) {
            return new TextBox(d.Code(39), "www.", 200, 0);
        }
    }
    
    static void I(final int n) {
        I(n - 1, n);
    }
    
    static void Code(final int n) {
        I(n, n - 1);
    }
    
    private static void Code(final Graphics graphics, final int n, final String s, final int n2, final int n3) {
        d.Code(graphics, n, s, n2, Code.g - Code.c / 2 - 1 - (d.J(n) + d.Code[n + 6]) / 2, n3);
    }
    
    private static void Code(final Graphics graphics, final int n, final int n2, final int n3, final int a, final Image[] array, final int[] array2, final int[] array3) {
        if (a != n3) {
            if (a - array[2].getWidth() < 0) {
                graphics.drawImage(array[2], n, n2, 0);
            }
            final int a2 = n + Math.max(a, array[2].getWidth());
            final int b = n + n3 - array[3].getWidth();
            final int min = Math.min(a2, b);
            for (int i = 0; i < array3.length; ++i) {
                graphics.setColor(array3[i]);
                graphics.drawLine(min, n2 + i, b, n2 + i);
            }
            graphics.drawImage(array[3], n + n3 - array[3].getWidth() + 1, n2, 0);
        }
        if (a >= array[0].getWidth()) {
            graphics.drawImage(array[0], n, n2, 0);
            final int n4 = n + array[0].getWidth();
            final int min2 = Math.min(n + a, n + n3);
            for (int j = 0; j < array2.length; ++j) {
                graphics.setColor(array2[j]);
                graphics.drawLine(n4, n2 + j, min2, n2 + j);
            }
            if (a > n3 - array[1].getWidth()) {
                graphics.drawImage(array[1], n + n3 - array[1].getWidth() + 1, n2, 0);
            }
        }
    }
    
    private static void Code(final Graphics graphics, final int n, int length, final int n2, int n3, int code, int code2, final StringBuffer sb, final int n4) {
        code = d.Code(code, 0, code2);
        ++length;
        final int n5 = (code2 != 0) ? ((int)(n2 * (long)code / code2)) : 0;
        d.Code(graphics, n, length, n5, n3, Code.Code[40], Code.Code[41]);
        final int n6 = n2 - n5;
        graphics.setColor(Code.Code[51]);
        graphics.drawLine(n + n5, length, n2 - 1, length);
        if (n6 >= 2) {
            d.Code(graphics, n + n5, length + 1, n6, n3 - 1, Code.Code[30], Code.Code[31]);
        }
        if (n5 > 0) {
            d.Code(graphics, n + n5 - 1, length + 1, 1, n3 - 1, Code.Code[48], Code.Code[49]);
            graphics.setColor(Code.Code[47]);
            graphics.drawLine(n, length, n + n5 - 2, length);
            graphics.setColor(Code.Code[50]);
            graphics.drawLine(n + n5 - 1, length, n + n5 - 1, length);
            if (n6 > 0) {
                graphics.setColor(Code.Code[51]);
                graphics.drawLine(n + n5, length + 1, n + n5, length + n3 - 2);
            }
        }
        graphics.setColor(Code.Code[29]);
        if (n4 == 2) {
            sb.append(' ').append(code * 100 / Math.max(code2, 1)).append('%');
        }
        length = sb.length();
        n3 = d.Code(0, sb.toString());
        if (n4 == 1) {
            code = ((int)(System.currentTimeMillis() - Code.Z >> 9) & 0x3);
            sb.append("...".substring(0, code));
        }
        String s = sb.toString();
        code2 = d.Code(0, s);
        if ((n2 - n3 >> 1) + code2 > n2) {
            sb.delete(0, length);
            if (n4 != 1) {
                sb.insert(0, "...");
            }
            s = d.Code(0, s, n2, sb.toString());
            n3 = d.Code(0, s);
        }
        Code(graphics, 0, s, n + n2 / 2 - n3 / 2, 20);
    }
    
    private static void I(int i, final int n) {
        Label_0214: {
            if (i < 2) {
                if (i >= 0) {
                    break Label_0214;
                }
            }
            try {
                final Vector vector = new Vector();
                final Vector vector2 = new Vector<Object[]>();
                if (Code.I != null) {
                    for (int j = Code.I.size() - 1; j >= 0; --j) {
                        Code(i, vector, vector2, (Object[])Code.I.elementAt(j));
                    }
                }
                for (int k = 0; k < Code.Z.size(); ++k) {
                    d d;
                    for (int l = (d = Code.Z.elementAt(k)).Code.size() - 1; l >= 0; --l) {
                        Code(i, vector, vector2, (Object[])d.Code.elementAt(l));
                    }
                }
                Object[] array;
                B o;
                for (i = vector2.size() - 1; i >= 0; --i) {
                    o = (B)(array = vector2.elementAt(i))[8];
                    if (vector.contains(o)) {
                        o.Code(2);
                        array[8] = null;
                    }
                    else {
                        o.Code(n + 1);
                    }
                }
                i = Code.Z.size();
                while (i-- > 0) {
                    Code.Z.elementAt(i).I(n);
                }
                if (n > 0) {
                    d.t();
                }
            }
            catch (OutOfMemoryError outOfMemoryError) {
                Object[] array2;
                B b;
                for (i = 0; i < Code.I.size(); ++i) {
                    if ((b = (B)(array2 = Code.I.elementAt(i))[8]) != null && b.Code.Code != b) {
                        array2[8] = null;
                    }
                }
                d d2;
                int index;
                Object[] array3;
                B b2;
                for (i = 0; i < Code.Z.size(); ++i) {
                    for (d2 = Code.Z.elementAt(i), index = 0; index < d2.Code.size(); ++index) {
                        if ((b2 = (B)(array3 = (Object[])d2.Code.elementAt(index))[8]) != null && b2.Code.Code != b2) {
                            array3[8] = null;
                        }
                    }
                }
            }
        }
        System.gc();
    }
    
    protected final void paint(Graphics code) {
        // monitorenter(this)
        int n15 = 0;
        Label_0713: {
            if (this.d && !Code.b) {
                break Label_0713;
            }
            final Graphics graphics = code;
            final Graphics graphics2 = code;
            try {
                d.Code(graphics, graphics2.getClipX(), code.getClipY(), code.getClipWidth(), code.getClipHeight(), 16777215);
                if (this.m == null) {
                    if (d.t != 0 && d.u != -1) {
                        final byte[] code2;
                        if ((code2 = d.Code(d.u, "b")) != null) {
                            this.n = Image.createImage(code2, 0, code2.length);
                        }
                    }
                    else {
                        this.n = d.Code(83);
                    }
                    this.m = d.Code(69);
                }
                if (this.Code == null) {
                    final Image code3 = d.Code(82);
                    (this.Code = new Image[4])[0] = Image.createImage(code3, 0, 0, 4, 8, 0);
                    this.Code[1] = Image.createImage(code3, 5, 0, 4, 8, 0);
                    this.Code[2] = Image.createImage(code3, 9, 0, 5, 8, 0);
                    this.Code[3] = Image.createImage(code3, 15, 0, 5, 8, 0);
                    this.J = new int[8];
                    this.B = new int[8];
                    code3.getRGB(this.J, 0, 1, 4, 0, 1, 8);
                    code3.getRGB(this.B, 0, 1, 14, 0, 1, 8);
                }
                final int n = (Code.i > 225) ? (Code.i * 80 / 100) : (Code.i - 45);
                final int min = Math.min(Code.h - 10, 180);
                final int n2 = n - 4;
                final int n3 = n - 4 - 15;
                final int height = d.Code[0].getHeight();
                final int n4 = n + 4;
                final int n5 = n4 + Math.min(15, (Code.i - n4 - height) / 2);
                if (this.m != null && this.Code != null && n > 0) {
                    int n6 = n3 - this.m.getHeight();
                    if (this.n != null) {
                        if (this.n.getHeight() <= n6) {
                            final int code4 = d.Code(Code.i * 40 / 100 - this.n.getHeight() / 2, 0, n6 - 15 - this.n.getHeight());
                            code.drawImage(this.n, Code.h / 2, code4, 17);
                            final int n7;
                            if ((n7 = n6 - code4 - this.n.getHeight()) < 15) {
                                n6 += (15 - n7) / 2;
                            }
                        }
                        else {
                            d.Code(d.u, "b");
                            d.u = -1;
                            this.n = null;
                        }
                    }
                    code.drawImage(this.m, Code.h / 2, n6, 17);
                    int n8 = 1024;
                    int n9 = 256 * (1 + this.j);
                    StringBuffer sb;
                    if (C()) {
                        sb = new StringBuffer(d.Code(113));
                        n9 += ((int)System.currentTimeMillis() - this.k << 10) / (60000 * Math.max(1, d.Code));
                        n8 += 1024;
                    }
                    else {
                        sb = new StringBuffer(d.Code(134));
                    }
                    final int n10 = (Code.h - min) / 2;
                    final int max = Math.max(this.u, min * n9 / n8);
                    Code(code, n10, n2, min, max, this.Code, this.J, this.B);
                    code.setColor(0);
                    code.setFont(d.Code[0]);
                    code.drawString(sb.append("...").toString(), Code.h / 2, n5, 17);
                    this.u = max;
                    return;
                }
                return;
                // iftrue(Label_1261:, !Code.k)
                // iftrue(Label_0888:, !d.G && !d.L)
                // iftrue(Label_1116:, n11 >= Code.f)
                // iftrue(Label_1106:, !d.G && !d.L)
                // iftrue(Label_0831:, !d.L)
                // iftrue(Label_1215:, Code.I == null)
                // iftrue(Label_0862:, Code.u != null)
                // iftrue(Label_0784:, Browser.Code.numColors() <= 65536)
                // iftrue(Label_1167:, !d.L)
                // iftrue(Label_1185:, !d.Q)
                // iftrue(Label_1093:, !d.L)
                // iftrue(Label_0925:, !this.g || this.q < 0)
                // iftrue(Label_1192:, !Code.l)
                int f;
                int n11 = 0;
                int n12;
                int n13;
                int n14 = 0;
                Label_0940_Outer:Label_0784_Outer:Label_1106_Outer:Label_0862_Outer:
                while (true) {
                Block_31_Outer:
                    while (true) {
                        Label_0843: {
                            while (true) {
                            Label_1106:
                                while (true) {
                                Block_29:
                                    while (true) {
                                        Label_0888: {
                                        Label_0925_Outer:
                                            while (true) {
                                                Block_20: {
                                                    Label_1052: {
                                                        while (true) {
                                                        Block_30_Outer:
                                                            while (true) {
                                                                while (true) {
                                                                Block_34_Outer:
                                                                    while (true) {
                                                                        while (true) {
                                                                            Block_33: {
                                                                                break Block_33;
                                                                                this.m = null;
                                                                                this.n = null;
                                                                                this.Code = null;
                                                                                this.J = null;
                                                                                this.B = null;
                                                                                break Block_34_Outer;
                                                                                Label_1030: {
                                                                                    f = Code.f;
                                                                                }
                                                                                while (true) {
                                                                                    Label_1035: {
                                                                                        break Label_1035;
                                                                                        Code.u = Image.createImage(Code.i, Code.h);
                                                                                        (Code.Code = new Sprite(Code.u)).setTransform(5);
                                                                                        ((Layer)Code.Code).setPosition(0, 0);
                                                                                        break Label_0843;
                                                                                        f = ((n11 == 0 && Code.f != Code.u.getWidth()) ? (Code.f % Code.u.getWidth()) : Code.u.getWidth());
                                                                                        code.translate(-n11 - code.getTranslateX(), -code.getTranslateY());
                                                                                        code.setClip(-code.getTranslateX(), 0, f, Code.u.getHeight());
                                                                                        break Label_1035;
                                                                                        break Block_31_Outer;
                                                                                    }
                                                                                    this.Code(code);
                                                                                    break Label_1052;
                                                                                    continue Label_0940_Outer;
                                                                                }
                                                                                n11 += f;
                                                                                continue Label_0784_Outer;
                                                                                while (true) {
                                                                                    Code.I = new g(48);
                                                                                    this.Code.schedule(Code.I, 1100L);
                                                                                    g.I = false;
                                                                                    g.Code(Code().Code);
                                                                                    return;
                                                                                    Code.I.cancel();
                                                                                    continue Block_34_Outer;
                                                                                }
                                                                                Code.I = code;
                                                                                (code = Code.Code).setClip(0, 0, Code.u.getWidth(), Code.u.getHeight());
                                                                                break Label_0888;
                                                                                g.Code();
                                                                                return;
                                                                            }
                                                                            Code.k = false;
                                                                            continue Label_0862_Outer;
                                                                        }
                                                                        n12 = Code.I.getClipX() + Code.I.getClipWidth() - 1;
                                                                        n13 = Code.I.getClipY() + Code.I.getClipHeight() - 1;
                                                                        Code.I.drawLine(n12, n13, n12, n13);
                                                                        break Label_1106;
                                                                        this.g = false;
                                                                        Code.t = (int)System.currentTimeMillis();
                                                                        n11 = 0;
                                                                        continue Label_0784_Outer;
                                                                    }
                                                                    n14 = Code.h * Code.i << 1;
                                                                    break Block_20;
                                                                    Label_1116: {
                                                                        continue Label_0925_Outer;
                                                                    }
                                                                }
                                                                continue Block_30_Outer;
                                                            }
                                                            this.Code(this.p, ++this.q);
                                                            continue Block_31_Outer;
                                                        }
                                                        Label_1093: {
                                                            Code.I.drawImage(Code.u, 0, 0, 20);
                                                        }
                                                        continue Label_1106;
                                                    }
                                                    break Block_29;
                                                }
                                                n14 <<= 1;
                                                continue Label_1106_Outer;
                                            }
                                            Label_0831: {
                                                Code.u = Image.createImage(Code.h, Code.i);
                                            }
                                            break Label_0843;
                                            Label_1185:
                                            this.repaint();
                                            return;
                                        }
                                        Code.l = false;
                                        continue;
                                    }
                                    Code.I.setClip(0, 0, Code.h, Code.i);
                                    ((Layer)Code.Code).setPosition(0, n11);
                                    Code.Code.paint(Code.I);
                                    continue Label_1106;
                                }
                                continue;
                            }
                        }
                        Code.Code = Code.u.getGraphics();
                        d.J += n14;
                        continue;
                    }
                    continue;
                }
            }
            // iftrue(Label_1030:, !d.L)
            finally {
                n15 = 2;
                Code(n15);
            }
        }
        try {
            Code(n15);
            Label_1261:;
        }
        finally {
        }
        // monitorexit(this)
    }
    
    private static void Code(int n, final Vector vector, final Vector vector2, final Object[] array) {
        final B obj;
        if ((obj = (B)array[8]) != null && !vector2.contains(array) && obj.Code.Code != obj) {
            vector2.addElement(array);
            if (!vector.contains(obj)) {
                if (n < 0) {
                    for (n = 0; n < vector.size() && vector.elementAt(n).Code <= obj.Code; ++n) {}
                    vector.insertElementAt(obj, n);
                    if (vector.size() > 5) {
                        vector.removeElementAt(vector.size() - 1);
                    }
                }
                else {
                    vector.addElement(obj);
                }
            }
        }
    }
    
    static void Code(final Object[] obj) {
        final B b;
        if ((b = (B)obj[8]) != null && !b.J) {
            for (int i = 0; i < Code.I.size(); ++i) {
                if (obj[0].equals(((Object[])Code.I.elementAt(i))[0])) {
                    Code.I.removeElementAt(i);
                    break;
                }
            }
            if (Code.I.size() >= 30) {
                Code.I.removeElementAt(0);
            }
            Code.I.addElement(obj);
        }
    }
    
    static void g() {
        for (int i = 0; i < Code.I.size(); ++i) {
            ((Object[])Code.I.elementAt(i))[8] = null;
        }
        final d d = Code.Z.firstElement();
        for (int j = 0; j < d.Code.size(); ++j) {
            ((Object[])d.Code.elementAt(j))[8] = null;
        }
    }
    
    static void h() {
        int index = 0;
        while (true) {
            final int n = index;
            final Vector i = Code.I;
            try {
                if (n >= i.size()) {
                    final d d;
                    if ((d = Code.Z.firstElement()) != null && d.Code != null) {
                        for (int j = 0; j < d.Code.size(); ++j) {
                            final B b;
                            if ((b = (B)((Object[])d.Code.elementAt(j))[8]) != null) {
                                b.Code = null;
                            }
                        }
                    }
                    return;
                }
                final B b2;
                if ((b2 = (B)((Object[])Code.I.elementAt(index))[8]) != null) {
                    b2.Code = null;
                }
                ++index;
            }
            finally {}
        }
    }
}
