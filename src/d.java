import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.lcdui.game.Layer;
import javax.microedition.lcdui.Displayable;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStore;
import java.io.ByteArrayInputStream;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import java.io.InputStream;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Enumeration;
import java.io.OutputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.Sprite;
import java.util.Stack;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.Vector;
import java.util.Random;
import javax.microedition.io.Connection;
import java.util.Hashtable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class d implements Runnable
{
    private static char[][] Code;
    private static Image C;
    private int M;
    private Image Code;
    private g Code;
    private C Code;
    private static Image B;
    private int[] C;
    private int[] B;
    static int Code;
    private int[] Z;
    static int[] Code;
    static Font[] Code;
    static int a;
    private static String[] Z;
    static String[] Code;
    private static final int[] I;
    private static Hashtable Z;
    private byte[] I;
    private Image I;
    private d Z;
    private Image Z;
    private d C;
    private byte[] B;
    private static int[] b;
    static Hashtable Code;
    private short[] I;
    private static int aB;
    private Connection Code;
    private static int[] a;
    private static boolean bj;
    private static int S;
    static boolean t;
    static boolean aE;
    B Z;
    static boolean ar;
    private I[] Code;
    static int x;
    private static byte[] c;
    private static int U;
    private static int aI;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int K;
    private int L;
    private int N;
    private int O;
    private static int ax;
    private int P;
    private static byte B;
    private static Random Code;
    private String[] I;
    private static f Code;
    private static byte Code;
    private static int Q;
    private static int R;
    private static boolean aG;
    private byte I;
    private Object[] I;
    private Object[] Z;
    private byte[] Z;
    private byte[] J;
    private I Code;
    private static byte[] C;
    private static byte[] a;
    private static byte Z;
    private static byte J;
    private static int[] J;
    static String Code;
    static String I;
    static Vector Z;
    static long B;
    static String Z;
    static d I;
    private static Integer Code;
    static String J;
    static String B;
    static String C;
    static long C;
    static String a;
    static String b;
    static String c;
    static String d;
    static Object[] Code;
    private long a;
    private static byte[] b;
    private static long b;
    private static boolean bd;
    private static boolean bk;
    private static boolean aH;
    public String e;
    public B Code;
    private d J;
    private d B;
    private String t;
    private String u;
    public static String f;
    private static boolean aI;
    private static boolean aJ;
    private static boolean aK;
    private static boolean aL;
    private static boolean aM;
    private static int T;
    private static byte C;
    private static byte a;
    private static String x;
    private static String v;
    private static String w;
    static boolean B;
    public boolean Code;
    public Vector Code;
    static int b;
    private DataInputStream Code;
    private DataOutputStream Code;
    private DataInputStream I;
    private DataOutputStream I;
    public long Code;
    public long I;
    boolean h;
    private boolean aN;
    private d a;
    private d b;
    static boolean I;
    public boolean Z;
    private boolean aO;
    public boolean J;
    private d c;
    private d d;
    private d e;
    private d f;
    private static Object Code;
    private boolean aR;
    boolean g;
    private static boolean aP;
    static String g;
    public boolean C;
    private static d g;
    static int I;
    static int Z;
    public boolean a;
    private int V;
    B I;
    d Code;
    private int W;
    private int X;
    private int Y;
    private int aa;
    private int ab;
    int J;
    static boolean b;
    static boolean m;
    private StringBuffer Code;
    private Vector e;
    private Vector f;
    private Vector g;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean aQ;
    private char[] Code;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private boolean aS;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    private short[] Code;
    static int B;
    private static d[] Code;
    private static d[] I;
    private static d h;
    private static d i;
    private static d j;
    private static d k;
    private static d l;
    private d m;
    static int C;
    static String h;
    static long Z;
    static long J;
    static boolean D;
    private static boolean aT;
    private static boolean aU;
    static boolean k;
    static boolean i;
    static boolean j;
    private static boolean aV;
    private static boolean aW;
    private static boolean aX;
    static boolean l;
    static boolean n;
    static boolean o;
    static boolean p;
    static boolean q;
    static boolean r;
    static boolean s;
    private static boolean aY;
    static boolean u;
    static boolean v;
    static boolean w;
    static boolean x;
    static boolean y;
    static boolean af;
    static boolean z;
    static boolean A;
    private static boolean aZ;
    static boolean E;
    private static boolean ba;
    private static boolean bb;
    static boolean F;
    static boolean G;
    static boolean H;
    static boolean K;
    static boolean L;
    static boolean M;
    static boolean N;
    static boolean O;
    static boolean P;
    static boolean Q;
    private static boolean bc;
    static boolean R;
    static String i;
    static String j;
    static int c;
    static int d;
    static boolean S;
    static boolean T;
    static boolean U;
    static boolean V;
    static boolean W;
    static boolean X;
    static boolean Y;
    static int e;
    static int f;
    static boolean aa;
    static boolean ab;
    static boolean ac;
    static boolean ad;
    private static boolean be;
    private static int ay;
    static boolean ae;
    static int g;
    static int h;
    static boolean ag;
    static boolean ah;
    static boolean ai;
    private static boolean bf;
    private static boolean bg;
    private static boolean bh;
    static boolean aj;
    static boolean ak;
    static int i;
    static boolean al;
    static boolean am;
    private static boolean bi;
    static boolean an;
    static boolean ao;
    static boolean ap;
    static String k;
    static int j;
    static boolean aD;
    static boolean aq;
    static int k;
    static boolean as;
    static int l;
    static int m;
    static boolean at;
    static boolean au;
    static boolean av;
    private static int az;
    static int n;
    static boolean aw;
    static boolean ax;
    static boolean ay;
    static int o;
    static boolean az;
    static boolean aA;
    static int p;
    static int q;
    static int r;
    static String l;
    static Vector I;
    static int s;
    static int t;
    static int u;
    static int v;
    private static int aA;
    static boolean aB;
    static boolean aC;
    static int w;
    static String m;
    static String n;
    static String o;
    static String p;
    static String q;
    static Vector J;
    static Vector B;
    static Vector C;
    static Vector b;
    static Vector a;
    static Vector c;
    static Vector d;
    static boolean aF;
    static String r;
    static String s;
    static int y;
    private static int aC;
    private static int aD;
    private static int aE;
    static final byte[] Code;
    private static byte[] d;
    private static d n;
    private static d o;
    private static byte[][] Code;
    private static int[] d;
    private static Image J;
    private static byte[] e;
    private static byte[] f;
    private static byte[] g;
    static int z;
    private static J Code;
    private static int aF;
    private static int aG;
    private static int aH;
    private static Hashtable I;
    private static Object[] J;
    private static Stack Code;
    private static boolean bl;
    private static int aJ;
    private static int aK;
    private static int aL;
    private static int aM;
    private static int aN;
    private static int aO;
    private static int[] c;
    private static int[] e;
    private static int[] f;
    private static int[] g;
    private static int[] h;
    private static byte[] h;
    static int A;
    private static int aP;
    
    static void g() {
        final String s = ((d.h = Browser.Code.getAppProperty("Operette-UA")) == null) ? "" : d.h.toLowerCase();
        final String code;
        final String s2 = ((code = Code("microedition.platform")) == null) ? "" : code.toLowerCase();
        final String code2;
        final String s3 = ((code2 = Code("device.model")) == null) ? "" : code2.toLowerCase();
        final int numAlphaLevels;
        d.q = ((numAlphaLevels = Browser.Code.numAlphaLevels()) > 2);
        d.r = (numAlphaLevels >= 16);
        d.s = (numAlphaLevels > 4);
        d.n = Code.Code.hasPointerEvents();
        d.o = Code.Code.hasPointerMotionEvents();
        if (!(d.ar = Code(new char[] { '\u05e0', '\u05e1', '\u05e2' }))) {
            d.ar = Code(new char[] { '\u0628', '\u062a', '\u062b' });
        }
        if (System.getProperty("microedition.pim.version") != null && Code("javax.microedition.pim.PIM") && Browser.Code.checkPermission("javax.microedition.pim.ContactList.read") != 0) {
            d.am = true;
        }
        d.X = (System.getProperty("microedition.io.file.FileConnection.version") != null);
        d.e = Browser.Code.checkPermission("javax.microedition.io.Connector.file.read");
        d.f = Browser.Code.checkPermission("javax.microedition.io.Connector.file.write");
        if (s.indexOf("sagem") >= 0) {
            d.C = 5;
            d.V = true;
            d.am = false;
        }
        if (s2.startsWith("vs")) {
            d.C = 8;
        }
        Label_0676: {
            if (s2.startsWith("rim wireless") || s2.startsWith("blackberry")) {
                d.C = 7;
            }
            else if (s2.indexOf("nokia") >= 0 || s2.equals("siemens_sx1") || s2.equals("sendo x") || s2.equals("panasonic x700")) {
                d.C = 0;
            }
            else if (Code("com.siemens.mp.lcdui.Image")) {
                d.C = 2;
            }
            else if (Code("com.motorola.phonebook.PhoneBookRecord") || Code("com.motorola.Dialer") || Code("com.motorola.phone.Dialer") || Code("com.motorola.graphics.j3d.Light") || Code("com.motorola.lwt.ComponentScreen") || Code("com.motorola.game.GameScreen") || Code("com.motorola.funlight.FunLight") || Code("com.motorola.multimedia.Lighting") || Code("com.motorola.io.ConnectorEvent") || Code("com.motorola.extensions.ScalableJPGImage") || Code("batterylevel") != null || Code("BatteryLevel") != null || Code("com.mot.iden.multimedia.Lighting")) {
                d.C = 1;
            }
            else if (s2.indexOf("sonyericsson") >= 0 || s2.equals("symbian os") || s2.startsWith("w302") || ((Code("com.sonyericsson.IMEI") != null || Code("com.sonyericsson.imei") != null) && !s2.startsWith("sonimxp3.20"))) {
                d.C = 3;
            }
            else if (Code("com.samsung.util.AudioClip") || Code("com.samsung.util.LCDLight") || Code("com.samsung.util.SM") || Code("com.samsung.util.SMS") || Code("com.samsung.util.Vibration") || s3.startsWith("sgh")) {
                d.C = 4;
            }
            else {
                if (s2.startsWith("sagem")) {
                    d.V = false;
                    d.C = 5;
                }
                else if (!s2.startsWith("micromax") && !s2.startsWith("nexiannx-g868") && !s2.equals("nexian") && !s2.startsWith("maui")) {
                    break Label_0676;
                }
                d.am = false;
            }
        }
        final boolean code3 = Code("com.jblend.util.Case");
        final String code4 = Code("microedition.profiles");
        final int width = ((Displayable)Code.Code).getWidth();
        final int height = ((Displayable)Code.Code).getHeight();
        final int numColors = Browser.Code.numColors();
        final String code5;
        final boolean b = (code5 = Code("microedition.configuration")) != null && code5.indexOf("CLDC-1.1") >= 0;
        if (width <= 128 && d.C != 3) {
            d.aq = true;
        }
        boolean b2 = false;
        Label_1425: {
            switch (d.C) {
                case 3: {
                    if (s2.indexOf("t270") == -1 && s2.indexOf("t280") == -1) {
                        d.bd = true;
                    }
                    d.c = 3;
                    if (s2.indexOf("symbian") >= 0) {
                        d.c = 0;
                        break Label_1425;
                    }
                    if (s2.indexOf("p910") >= 0) {
                        d.c = 0;
                        break Label_1425;
                    }
                    if (s2.indexOf("m600") >= 0 || s2.indexOf("p1") >= 0 || s2.indexOf("p9") >= 0) {
                        d.c = 10;
                    }
                    break Label_1425;
                }
                case 0: {
                    d.c = 4;
                    if (s2.indexOf("e61") != -1 || s2.indexOf("e62") != -1 || s2.indexOf("e63") != -1 || s2.indexOf("e71") != -1 || s2.startsWith("nokia9300/") || s2.startsWith("nokia9300i/") || s2.startsWith("nokia9500/")) {
                        d.c = 10;
                        d.bd = true;
                    }
                    if (s2.startsWith("nokian") || s2.startsWith("nokiae") || System.getProperty("com.nokia.mid.ui.version") != null || s2.startsWith("nokia6124") || s2.startsWith("nokia6120") || s2.startsWith("nokia6121") || s2.startsWith("nokia5700") || s2.startsWith("nokia6110") || s2.startsWith("nokia5500")) {
                        d.bd = true;
                    }
                    if (s2.startsWith("nokiae90-1/")) {
                        d.bd = false;
                    }
                    if (d.n) {
                        break;
                    }
                    break Label_1425;
                }
                case 1: {
                    if (Code("com.mot.iden.multimedia.Lighting")) {
                        d.c = 6;
                    }
                    else {
                        d.c = 5;
                    }
                    if (d.n) {
                        break;
                    }
                    break Label_1425;
                }
                case 2: {
                    d.c = 7;
                    if (s2.startsWith("sk6r")) {
                        d.c = 0;
                    }
                    break Label_1425;
                }
                case 4: {
                    if (s2.startsWith("gt-m8800")) {
                        d.d = 1;
                    }
                    if (s3.endsWith("sgh-l700")) {
                        d.k = 1;
                    }
                    d.c = 8;
                    if (s.indexOf("sgh-d900") != -1) {
                        d.bd = true;
                    }
                    if (s.startsWith("samsung-sgh-e380")) {
                        d.am = false;
                    }
                    break Label_1425;
                }
                case 7: {
                    d.c = 0;
                    d.bd = true;
                    break Label_1425;
                }
                default: {
                    d.c = 2;
                    if (d.n && s2.indexOf("emulator") == -1) {
                        d.d = 1;
                    }
                    if (s2.startsWith("lg-kc550")) {
                        d.d = 0;
                        d.bd = true;
                        break Label_1425;
                    }
                    if (s2.startsWith("lg-kf510")) {
                        d.n = false;
                        d.o = false;
                        break Label_1425;
                    }
                    if (d.C == 8 && s2.startsWith("vs")) {
                        break Label_1425;
                    }
                    if (s2.indexOf("motoq") >= 0) {
                        d.bd = false;
                        d.c = 10;
                        d.d = 1;
                        d.R = true;
                        break Label_1425;
                    }
                    if (s2.indexOf("palm treo 700w") >= 0) {
                        d.bd = true;
                        d.c = 10;
                        d.R = true;
                        break Label_1425;
                    }
                    if (code3 || s2.equals("jbed-fastdac") || s2.indexOf("windows") >= 0 || s2.indexOf("intent") >= 0 || (s2.equals("jbed") && height > 128 && width > 128)) {
                        break;
                    }
                    break Label_1425;
                }
            }
            d.d = 1;
        }
        if (Code("com.sprintpcs.util.System") && d.c == 2) {
            d.c = 9;
            d.bd = true;
        }
        if (d.C == 0) {
            if (width < 176) {
                d.aU = true;
            }
            if (width == 176) {
                d.i = true;
                d.bd = true;
                d.ax = 150;
            }
            if (width == 240 && height == 248 && b) {
                d.aX = true;
            }
            if (s2.indexOf("3220") >= 0) {
                d.l = true;
            }
            if ((s2.startsWith("nokiae65-1/") && I(s2, "/0633.18.02") <= 0) || (s2.startsWith("nokia5500d/") && I(s2, "/04.60") <= 0) || (s2.startsWith("nokiae50-1/") && I(s2, "/07.13.0.0") <= 0) || (s2.startsWith("nokiae61i-1/") && I(s2, "/0633.22.05") <= 0)) {
                d.W = true;
            }
            if (s2.startsWith("nokia3230/")) {
                d.z = true;
            }
            if (s2.startsWith("nokia6260/")) {
                d.x = true;
                d.ah = true;
            }
            if (s2.startsWith("nokia6600/")) {
                d.z = true;
                d.v = true;
                d.x = true;
                d.ah = true;
            }
            if (s2.startsWith("nokia6620/")) {
                d.x = true;
                d.ah = true;
            }
            if (s2.startsWith("nokia6630/")) {
                d.A = true;
                if (I(s2, "/6.03.40") < 0) {
                    d.X = false;
                }
            }
            if (s2.startsWith("nokia6670/")) {
                d.x = true;
                d.ah = true;
            }
            if (s2.startsWith("nokia6680/")) {
                d.ab = true;
            }
            if (s2.startsWith("nokia7610/")) {
                d.z = true;
                d.x = true;
                d.ah = true;
            }
            if (s2.startsWith("nokia7710/")) {
                d.z = true;
                d.x = true;
                d.ah = true;
            }
            if (s2.startsWith("nokia9300/") || s2.startsWith("nokia9300i/")) {
                d.x = true;
                d.ah = true;
                d.N = true;
            }
            if (s2.startsWith("nokia9500/")) {
                d.x = true;
                d.ah = true;
                d.N = true;
            }
            if (s2.startsWith("nokiae90-1/")) {
                d.N = true;
            }
            if (s2.startsWith("nokiae66-1/") || s2.startsWith("nokian82/") || s2.startsWith("nokia5800d-1/") || s2.startsWith("nokian79-1/")) {
                d.P = true;
                d.ai = true;
            }
            if (s2.startsWith("nokian72/") || s2.startsWith("nokian70/") || s2.startsWith("nokian70-1/")) {
                d.w = true;
            }
            d.i = "rtyfghvbnmuj";
            d.j = "1234567890*#";
        }
        if (d.C == 3) {
            if (width <= 176) {
                d.aU = true;
            }
            if (s2.indexOf("p990") >= 0 || s2.indexOf("m600") >= 0 || s2.indexOf("w950") >= 0) {
                d.T = true;
                if (s2.indexOf("p990") < 0) {
                    d.U = true;
                }
            }
            if (s2.indexOf("p910") >= 0) {
                d.F = true;
                d.t = true;
                d.ah = true;
            }
            if (s2.indexOf("symbian") >= 0) {
                d.t = true;
                d.ah = true;
            }
            if (Code("javax.wireless.messaging.MultipartMessage") && !Code("javax.microedition.amms.GlobalManager")) {
                d.a = 2475;
            }
            if (s2.startsWith("sonyericssonp1") || s2.startsWith("sonyericssonm600")) {
                d.i = "ertyuidfghjkcxvbnm \ufffd\ufffc";
                d.j = "1122334455667788990*#";
            }
            if (width <= 176) {
                d.y = true;
                final Image image;
                final Graphics graphics;
                (graphics = (image = Image.createImage(1, 1)).getGraphics()).setColor(0);
                graphics.fillRect(0, 0, 1, 1);
                final int[] array2;
                final int[] array = array2 = new int[] { 0 };
                array[0] = -1;
                Image.createRGBImage(array2, 1, 1, false);
                array2[0] = Integer.MIN_VALUE;
                graphics.drawImage(Image.createRGBImage(array2, 1, 1, true), 0, 0, 20);
                image.getRGB(array2, 0, 1, 0, 0, 1, 1);
                if ((array2[0] & 0xFF) > 16) {
                    d.q = false;
                    d.r = false;
                }
            }
        }
        if (d.C == 1) {
            d.X = (d.X && d.e != 0 && d.f != 0);
            d.S = true;
            d.a = 1024;
            d.ay = 290;
            if (width <= 176) {
                d.j = true;
            }
            if (s2.indexOf("symbian") >= 0) {
                d.t = true;
                d.ah = true;
            }
            if (code3) {
                d.q = false;
                d.r = false;
                d.s = false;
                d.i = "ertdfgxcv+zb";
                d.j = "1234567890*#";
            }
            if (Code("com.mot.iden.multimedia.Lighting")) {
                d.aT = true;
                d.ah = true;
                d.ag = true;
                d.k = true;
                d.m = true;
                d.p = true;
                d.aY = true;
                d.r = false;
            }
        }
        if (d.C == 4) {
            d.bg = false;
            if (s3.endsWith("sgh-gt-b2700")) {
                d.n = false;
                d.o = false;
            }
            if (s3.startsWith("sgh-g400")) {
                d.n = false;
                d.o = false;
            }
            if (s2.startsWith("s7220")) {
                d.n = false;
                d.o = false;
            }
            if (s2.startsWith("s7350")) {
                d.n = false;
                d.o = false;
            }
            if (s2.equals("j2me") && numAlphaLevels == 2 && b && width == 240 && height == 286 && numColors == 65536) {
                d.ba = true;
                d.a = 256;
            }
            if (width == 240 && height == 279 && numColors == 65536 && numAlphaLevels == 256 && b) {
                d.E = true;
            }
            d.aZ = true;
            if (width == 320 && height == 186 && numColors == 65536 && numAlphaLevels == 65536) {
                d.ac = true;
            }
            if ((width == 128 && height == 144) || (width == 176 && height == 204) || (width == 220 && height == 160)) {
                d.aT = true;
            }
            if (s2.startsWith("gt-m8800")) {
                d.O = true;
            }
            if (s2.startsWith("sgh-p310") || s.indexOf("x820") != -1 || s.indexOf("sghd830") != -1 || s.indexOf("sgh-e25") != -1) {
                d.X = false;
            }
            if (s.indexOf("sgh-e250") != -1 || s.indexOf("sgh-e370") != -1 || s.indexOf("sgh-d900") != -1 || s.indexOf("sphm500") != -1 || s.indexOf("sphm610") != -1 || s.indexOf("spha800") != -1 || s.indexOf("spha900") != -1) {
                d.R = true;
            }
            if (s2.startsWith("sgh-t459")) {
                d.Y = true;
                d.a = 1024;
            }
            if (s2.startsWith("samsung gt-c3510") || s2.startsWith("samsung gt-b3410") || s2.startsWith("samsung gt-b5722") || s2.startsWith("samsung sgh-d980")) {
                d.n = true;
                d.o = true;
            }
        }
        if (s2.indexOf("sxg75") >= 0 || s2.indexOf("ef81") >= 0) {
            d.aX = true;
            d.C = 2;
        }
        else if (d.C == 2) {
            d.aV = true;
            d.k = true;
            d.ah = true;
            d.R = true;
            d.G = true;
            if (width < 176) {
                d.aU = true;
            }
            if (s2.indexOf("s68") >= 0) {
                d.D = true;
            }
            if (s2.indexOf("el71") >= 0 || s2.indexOf("e71") >= 0) {
                d.bc = true;
            }
            if (s2.indexOf("c6") >= 0 || s2.indexOf("cx6") >= 0 || s2.indexOf("m6") >= 0 || s2.indexOf("sl75") >= 0) {
                d.ai = true;
            }
        }
        if (d.C == 8 && s2.startsWith("vs")) {
            d.S = true;
            d.ae = true;
        }
        if (d.C == 7) {
            d.G = true;
            d.i = "wersdfzxc\u0089aq";
            d.j = "1234567890*#";
            d.ae = true;
            d.Q = true;
            d.ai = true;
            b2 = true;
        }
        if (d.C == -1) {
            if (s2.startsWith("wx320kr") || s2.startsWith("wx340k") || s2.startsWith("wx333k")) {
                d.ae = true;
            }
            if (s2.startsWith("windows ce")) {
                d.aX = true;
                if (!Code.Code.hasPointerEvents() || s2.indexOf("palm treo 700w") >= 0) {
                    d.ae = true;
                }
                d.be = true;
            }
            if (code3) {
                d.S = true;
                if ((s2.equals("j2me") && width == 320 && height == 186) || (width == 240 && height == 268) || (width == 320 && height == 250)) {
                    final Font font = Font.getFont(64, 0, 8);
                    final Font font2 = Font.getFont(64, 1, 8);
                    final Font font3 = Font.getFont(64, 1, 16);
                    if (font2.stringWidth(Code(7)) <= font.stringWidth(Code(7))) {
                        if (font2.stringWidth(Code(7)) <= font3.stringWidth(Code(7))) {
                            d.bk = true;
                            d.Code = new byte[6][2048];
                            for (int i = 0; i < 6; ++i) {
                                for (int j = 0; j < 2048; ++j) {
                                    d.Code[i][j] = -1;
                                }
                            }
                        }
                        else {
                            d.m = true;
                        }
                    }
                }
            }
            else if (s2.equals("j2me")) {
                d.aX = true;
                if (width == 128 && height == 129) {
                    d.u = true;
                }
            }
            if (s2.equals("jbed")) {
                d.bb = true;
                if (width == 128 && (height == 110 || height == 142)) {
                    d.u = true;
                }
                if (s.startsWith("semc-venus")) {
                    d.k = 1;
                    d.aj = true;
                }
            }
            if (s2.equals("jbed-fastdac")) {
                d.ae = true;
                d.aX = true;
                d.a = 260;
            }
            if (s2.equals("intent jte")) {
                if (!Code.Code.hasPointerEvents()) {
                    d.ae = true;
                }
                d.af = true;
            }
            if (s2.equals("jbed-fastbcc") && width == 240 && height == 325 && numColors == 65536 && numAlphaLevels == 256 && b) {
                d.k = 2;
                d.n = true;
                d.o = true;
            }
            if (s2.startsWith("maui") || s2.startsWith("fly-sx210")) {
                d.ai = true;
            }
            if (s2.startsWith("lg-kc910")) {
                d.O = true;
            }
            if (s2.startsWith("lg-kc550")) {
                d.n = false;
                d.o = false;
            }
            if (s2.startsWith("htc touch diamond p3700") || s2.startsWith("htc touch pro t7272") || s2.startsWith("htc touch hd t8282")) {
                d.k = 2;
            }
            if (s2.startsWith("htc s740")) {
                d.aj = true;
                d.bh = true;
                d.ai = true;
            }
            if (s2.startsWith("htc touch pro t7272")) {
                d.aj = true;
            }
            if (s2.startsWith("amoi8512")) {
                d.ak = true;
            }
            if (s.indexOf("t-mobile vairy touch ii/") >= 0) {
                d.n = true;
                d.o = true;
            }
        }
        if (Code("com.sprintpcs.util.System") || (code4 != null && code4.indexOf("SPRINTPCS-1.0") >= 0)) {
            if (s2.endsWith("sph-m800") || s2.endsWith("sph-m810")) {
                d.c = 0;
                d.aX = true;
                d.Q = true;
            }
            b2 = true;
            if (d.C == -1) {
                if ((width == 176 && (height == 177 || height == 182)) || (width == 128 && height == 136)) {
                    d.S = true;
                }
                if (width == 176 && height == 185 && numColors == 65536 && numAlphaLevels == 256) {
                    d.s = false;
                }
                if (Code.Code.hasRepeatEvents() && numAlphaLevels == 256) {
                    d.R = true;
                }
            }
        }
        if (!b2) {
            if (Code("javax.wireless.messaging.MessageConnection") && Code("javax.wireless.messaging.TextMessage")) {
                d.aa = true;
            }
            else {
                d.aa = false;
            }
        }
        if (s.indexOf("spha900") != -1 || s.indexOf("spha920") != -1) {
            d.bf = true;
            return;
        }
        final Image image2;
        final Graphics graphics2 = (image2 = Image.createImage(10, 20)).getGraphics();
        final Image image3 = Image.createImage(10, 10);
        final Sprite sprite = new Sprite(image3);
        final Graphics graphics3 = image3.getGraphics();
        sprite.setTransform(5);
        graphics3.setColor(0);
        graphics3.fillRect(0, 0, 5, 5);
        ((Layer)sprite).setPosition(0, 0);
        sprite.paint(graphics2);
        graphics3.setColor(16777215);
        graphics3.fillRect(0, 0, 10, 10);
        graphics3.setColor(0);
        graphics3.fillRect(5, 0, 5, 5);
        ((Layer)sprite).setPosition(0, 10);
        sprite.paint(graphics2);
        final int[] array3 = { 0 };
        image2.getRGB(array3, 0, 1, 9, 19, 1, 1);
        if ((array3[0] & 0xFFFFFF) != 0x0) {
            d.ai = true;
        }
    }
    
    private byte[] Code(final f f, int i) {
        synchronized (d.Code) {
            final Object[] code = f.Code();
            final int[] code2 = f.Code();
            g.Z();
            final String s = (String)code[53];
            if ("myopera:async".equals(s)) {
                d.I = false;
                for (int j = 0; j < code.length; ++j) {
                    code[j] = this.I[j];
                    code2[j] = this.C[j];
                }
                if (this.c()) {
                    code[53] = "server:test";
                }
                else {
                    code[53] = "myopera:sync";
                }
                code[38] = null;
            }
            int n = 0;
            final String k = this.J();
            if (!this.Z) {
                n = 41 + (k + "\u0000" + d.I + "\u0000").getBytes().length + this.c.I.length + (this.I() ? Z(1).length() : 0) + ((this.Code == null) ? 2 : 0) + this.c.B.length;
                this.a = this.b;
                this.b = null;
                if (this.E > 0) {
                    this.Z = null;
                    this.a = null;
                    this.E = 0;
                }
                if (this.Z != null) {
                    n += 8 + this.Z.length;
                }
                else {
                    for (int l = 0; l < 110; ++l) {
                        this.I[l] = null;
                        this.C[l] = 0;
                    }
                    this.a = null;
                    d.I = false;
                }
                if (this.a == null) {
                    n += 8;
                }
            }
            if (this.C.C()) {
                code[77] = null;
                code[79] = (code[73] = null);
            }
            code2[0] = 13;
            code[40] = k;
            code[33] = Z(2);
            if (d.g == null) {
                B(false);
            }
            code[6] = d.g;
            final String appProperty = Browser.Code.getAppProperty("OM-Install-Referrer");
            code[100] = ((appProperty != null) ? appProperty : "");
            int n2 = 4;
            for (int n3 = 0; n3 < 110; ++n3) {
                if (code[n3] != null) {
                    if (code[n3] instanceof byte[] && (!(this.I[n3] instanceof byte[]) || !I((byte[])code[n3], (byte[])this.I[n3]))) {
                        n2 += 7 + ((byte[])code[n3]).length;
                    }
                    else if ((this.I[n3] == null || !code[n3].equals(this.I[n3])) && code[n3] instanceof String) {
                        final int z = Z((String)code[n3]);
                        n2 += z + ((z <= 254) ? 4 : 7);
                    }
                }
                else if (this.C[n3] != code2[n3] || this.I[n3] != null) {
                    final int n4 = n2;
                    if (code2[n3] <= 254) {
                        n2 = n4 + 4;
                    }
                    else {
                        n2 = n4 + 7;
                    }
                }
            }
            int n5 = n + (n2 + 16 + 8 * (n2 / 65529));
            J out = null;
            if (s.equals("myopera:logout") || ((s.startsWith("myopera:login") || s.startsWith("myopera:signup")) && (!d.I || Code.Code != Code.Z)) || (Code.Z && (!d.I || Code.B || Code.Code != Code.I))) {
                Code(d.J);
                final boolean b = s.startsWith("myopera:login") || (Code.J & 0x1) != 0x0;
                final boolean b2 = s.startsWith("myopera:login") || (Code.J & 0x2) != 0x0;
                out = new J();
                final DataOutputStream dataOutputStream;
                (dataOutputStream = new DataOutputStream(out)).write(6);
                dataOutputStream.writeUTF(Code.B);
                dataOutputStream.writeInt(Code.Code);
                dataOutputStream.write(Code.J | (s.equals("myopera:logout") ? 1 : 0) << 3);
                dataOutputStream.writeUTF(Code.Z);
                dataOutputStream.writeUTF(Code.J);
                final int size = out.size();
                dataOutputStream.writeShort(0);
                int n6 = 0;
                final int n7 = b2 ? d.J.size() : 0;
                int n8 = 0;
                final int n9 = n7 + (b ? d.a.size() : 0);
                boolean b3 = false;
                for (int index = 0; index < n9; ++index) {
                    Object[] array;
                    if (index < n7) {
                        array = d.J.elementAt(index);
                    }
                    else {
                        array = d.a.elementAt(index - n7);
                        n8 = 1;
                    }
                    int code3;
                    if ((code3 = Code(array, 5)) != 83) {
                        ++n6;
                        if (code3 == 97) {
                            array[5] = new Integer(65);
                            code3 = 65;
                            b3 = true;
                        }
                        dataOutputStream.write((n8 == 0) ? 0 : (index - n7 + 1));
                        dataOutputStream.write(code3);
                        final int b4 = n8 * -3 + 31;
                        dataOutputStream.write(b4);
                        if (n8 == 0) {
                            dataOutputStream.write((byte[])array[7], 0, 16);
                        }
                        if ((b4 & 0x2) != 0x0) {
                            dataOutputStream.write((byte[])array[8], 0, 16);
                        }
                        if (n8 != 0 && (Code(array, 9) & 0x2) != 0x0) {
                            dataOutputStream.writeUTF("");
                            dataOutputStream.writeUTF("");
                            dataOutputStream.writeShort(0);
                        }
                        else {
                            dataOutputStream.writeUTF((String)array[0]);
                            dataOutputStream.writeUTF((String)array[1]);
                            final byte[] b5;
                            if ((b5 = (byte[])array[2]) == null || b5.length == 0) {
                                dataOutputStream.writeShort(0);
                            }
                            else {
                                dataOutputStream.writeShort(b5.length);
                                dataOutputStream.write(b5, 0, b5.length);
                            }
                        }
                    }
                }
                Code(n6, out.Code(), size);
                if (b3) {
                    Code(d.J, false);
                    Code(d.a, false);
                }
                n5 += 25 + out.size() + 8 * (out.size() / 1014);
            }
            final J out2 = new J(n5);
            final DataOutputStream dataOutputStream2 = new DataOutputStream(out2);
            int size2 = 0;
            if (!this.Z) {
                int n10 = 0;
                if (this.Code == null) {
                    dataOutputStream2.write(1);
                    dataOutputStream2.write(2);
                    n10 = 2;
                }
                dataOutputStream2.write(1);
                dataOutputStream2.write(this.c.J, 0, 8);
                dataOutputStream2.writeInt(this.c.Z[0]);
                dataOutputStream2.write(this.c.I);
                dataOutputStream2.writeShort(i);
                dataOutputStream2.write(this.c.B);
                i = out2.size();
                dataOutputStream2.writeUTF(this.I() ? Z(1) : "");
                this.B.I(out2.Code(), n10, out2.size() - n10);
                this.d.I(out2.Code(), n10, out2.size() - n10);
                this.B.Z(out2.Code(), out2.size(), 16);
                out2.Code(out2.size() + 16);
                this.e.B(out2.Code(), i, out2.size() - i);
                size2 = out2.size();
                final byte[] bytes = (k + "\u0000" + d.I + "\u0000").getBytes();
                Code(out2, 128, 3, bytes.length);
                dataOutputStream2.write(bytes);
                if (this.Z != null) {
                    Code(out2, 15, 0, 8);
                    dataOutputStream2.write(this.Z);
                }
                if (this.a == null) {
                    Code(out2, 16, 0, 0);
                }
            }
            if (out != null) {
                Code(out2, 5, 0, 1);
                dataOutputStream2.write(1);
                i = out.size();
                for (int n11 = 0; n11 < i; n11 += 1014) {
                    final int min = Math.min(i - n11, 1014);
                    Code(out2, 10, 0, min);
                    System.arraycopy(out.Code(), n11, out2.Code(), out2.size(), min);
                    out2.Code(out2.size() + min);
                }
                Code(out2, 6, 0, 0);
                d.I = true;
                Code.Z = Code.Code;
            }
            if ("myopera:logout".equals(s)) {
                d.I = false;
            }
            ++this.E;
            Code(out2, 5, f.I(), 0);
            Code(out2, 22, f.I(), Math.min(n2, 65529));
            dataOutputStream2.writeInt(n2 - 4 + Code(f.Code(false)));
            int size3;
            String s2;
            byte[] b6;
            int n12;
            int index2;
            int n13;
            for (i = 0; i < 110; ++i) {
                if (code[i] != null) {
                    if (code[i] instanceof byte[] && (!(this.I[i] instanceof byte[]) || !I((byte[])code[i], (byte[])this.I[i]))) {
                        dataOutputStream2.write(1);
                        dataOutputStream2.writeShort(i);
                        dataOutputStream2.writeInt(((byte[])code[i]).length);
                        dataOutputStream2.write((byte[])code[i]);
                    }
                    else if ((this.I[i] == null || !code[i].equals(this.I[i])) && code[i] instanceof String) {
                        if (Z((String)code[i]) <= 254) {
                            dataOutputStream2.write(0);
                            dataOutputStream2.write(i >> 16);
                            size3 = out2.size();
                            dataOutputStream2.writeUTF((String)code[i]);
                            out2.Code()[size3] = (byte)i;
                        }
                        else {
                            dataOutputStream2.write(1);
                            dataOutputStream2.writeShort(i);
                            b6 = new byte[Z(s2 = (String)code[i])];
                            n12 = 0;
                            for (index2 = 0; index2 < s2.length(); ++index2) {
                                n12 += Code((int)s2.charAt(index2), b6, n12);
                            }
                            dataOutputStream2.writeInt(b6.length);
                            dataOutputStream2.write(b6);
                        }
                    }
                }
                else if (this.C[i] != code2[i] || this.I[i] != null) {
                    if ((n13 = code2[i]) <= 254) {
                        dataOutputStream2.write(2);
                        dataOutputStream2.writeShort(i);
                        dataOutputStream2.write(n13);
                    }
                    else {
                        dataOutputStream2.write(3);
                        dataOutputStream2.writeShort(i);
                        dataOutputStream2.writeInt(n13);
                    }
                }
                this.I[i] = code[i];
                this.C[i] = code2[i];
            }
            i = out2.size() - n2;
            while (n2 > 65529) {
                System.arraycopy(out2.Code(), i + 65529, out2.Code(), i + 65529 + 8, n2 - 65529);
                i += 65537;
                n2 -= 65529;
                out2.Code(i - 8);
                Code(out2, 22, f.I(), Math.min(n2, 65529));
            }
            this.J(out2.Code(), size2, n5);
            this.Z = true;
            return out2.Code();
        }
    }
    
    final synchronized void Code(String s, String str, final String s2, final Hashtable hashtable) {
        if (s.length() == 0) {
            return;
        }
        if (this.Code != null && this.G >= 0) {
            this.Code.Code();
        }
        int n = Code(s);
        int code = -1;
        if (this.Code != null) {
            code = Code(this.Code.Code);
        }
        if (Code(s, "menu:")) {
            Code.Code.Code(I(s), s2, 2, this);
            return;
        }
        if (Code(s, "si:")) {
            this.Code.Code.Code(I(s));
            Code.Code.I(this);
            Code.Code.I(this.Code);
            return;
        }
        if (this.Code(16) && n == 132) {
            this.a(-8, 0);
            return;
        }
        if (this.Code != null && this.Code(2)) {
            if (n == 115) {
                this.Code.c();
                return;
            }
            Code.Code.I(this);
            if (n != 114 || this.Code.Code(2)) {
                this.Code.Code(s, str, s2);
            }
            if (n == 129 && this.Code.Code(16)) {
                Code.Code.I(this.Code);
            }
        }
        else {
            if (this.Code != null && this.Code(8) && code == 76) {
                Code.Code.I(this);
                if (n != 114) {
                    this.Code.Code(s, str, s2);
                }
                return;
            }
            if (Code(s, "nint:")) {
                if (this.Code != null && this.Code.Code()) {
                    return;
                }
                n = Code(s = I(s));
            }
            if (Code(s, "dialog:")) {
                Code.Code.Code(I(s), s2, 4, this);
                return;
            }
            if (Code(s, "overlay:")) {
                Code.Code.Code(I(s), s2, 8, this);
                return;
            }
            if (Code(s, "openno:")) {
                for (d i = this; i != null && i.Code(8); i = i.I()) {
                    Code.Code.I(i);
                }
                Code.Code.I(I(s));
                return;
            }
            if (Code(s, "get:")) {
                final g g;
                (g = new g(37)).I = I(s);
                g.Code = this;
                g.Code = this.Code.Code;
                Code(g);
                return;
            }
            if (Code(s, "cwd:")) {
                C.Code(I(s));
                final g g2;
                (g2 = new g(36)).Code = this;
                Code(g2);
                return;
            }
            if (Code(s, "put:")) {
                s = I(s);
                this.Code.Code.Code(s, false);
                Code.Code.I(this);
                return;
            }
            if (Code(s, "mkdir:")) {
                Code.Code(Code(171), "", 0, false);
                return;
            }
            if (Code(s, "open:") && Code(str) != -1) {
                this.I = new B(this);
                s = I(s);
                this.I.Code(s.substring(s.indexOf(58) + 1));
                return;
            }
            if (Code(s, "sets:")) {
                C.Code(true);
                Code.Code.I(this);
                Code.Code.Code(I(134), null, "r");
                return;
            }
            if (Code(s, "set:")) {
                final g g3;
                (g3 = new g(39)).Code = Code.Code(1);
                Code(g3);
                Code.Code.I(this);
                return;
            }
            boolean b = false;
            if (Code(s, "tssr:")) {
                d.aq ^= true;
                n = Code(s = I(s));
            }
            if (Code(s, "timg:")) {
                b = true;
                n = Code(s = I(s));
            }
            if (this.Code != null && this.Code.d) {
                if (n == 115) {
                    this.Code.B(false);
                    return;
                }
                if (code == 60 && n == 116) {
                    this.Code.B(false);
                    return;
                }
                if (code == 60 && n == 81 && C.Code != null) {
                    this.Code("cwd:..", (String)null, (String)null);
                    return;
                }
                if (n == 113) {
                    this.Code.Code.Code(B.Code(this.Code.Code), false);
                }
                else if (n != 114) {
                    if (code == 54) {
                        final int int1 = Integer.parseInt(s);
                        if (B.Code == d.J || B.Code == Code.I) {
                            System.arraycopy(B.Code.elementAt(int1), 0, B.I, 0, 3);
                            this.Code.Code.J = "keep";
                            this.Code.Z();
                        }
                        else {
                            B.d = int1 - 1;
                        }
                    }
                    else {
                        this.Code.Code.Code(s, false);
                    }
                }
                Code.Code.I(this);
            }
            else {
                if (n == 115 && this.Code != null) {
                    this.Code.c();
                    return;
                }
                Label_3948: {
                    switch (this.J = n) {
                        case 79: {
                            Browser.Code();
                            return;
                        }
                        case 80: {
                            this.Code.B = null;
                            if (b() != 0) {
                                this.b();
                                Code.Code.Code("", null, 16, this);
                                break;
                            }
                            Code.Code.J("www.");
                            break;
                        }
                        case 130: {
                            Code.Code.J(this.u);
                            break;
                        }
                        case 131: {
                            this.Code("");
                            break;
                        }
                        case 120: {
                            Code.Code.b();
                            break;
                        }
                        case 39: {
                            if (!((this.Code != null) ? ((this.Code.Code != null) ? this.Code.Code : "") : "").startsWith("server:")) {
                                Code.Code.Code(d.L ^ true);
                                break;
                            }
                            break;
                        }
                        case 92:
                        case 93:
                        case 96: {
                            this.K();
                            break;
                        }
                        case 81: {
                            this.C(-1, 0);
                            break;
                        }
                        case 117: {
                            this.Code.I(true);
                            break;
                        }
                        case 82: {
                            this.C(1, 0);
                            break;
                        }
                        case 97: {
                            this.Code(d.J, -1);
                            break;
                        }
                        case 98: {
                            this.Code(d.J, 1);
                            break;
                        }
                        case 41: {
                            this.Code(d.c, -1);
                            break;
                        }
                        case 42: {
                            this.Code(d.c, 1);
                            break;
                        }
                        case 137: {
                            this.Code(d.d, -1);
                            break;
                        }
                        case 138: {
                            this.Code(d.d, 1);
                            break;
                        }
                        case 140: {
                            this.Code(true, null, "s=1&r=2");
                            break;
                        }
                        case 110: {
                            this.M();
                            break;
                        }
                        case 83: {
                            this.Code(true, b, null);
                            break;
                        }
                        case 119: {
                            this.Code.d();
                            break;
                        }
                        case 113: {
                            if (this.Code(16)) {
                                this.Code(-5, 0);
                                break;
                            }
                            if (code == 60 && this.Code != null) {
                                this.Code(d.b = false, null, this.Code.Z);
                                break;
                            }
                            Code.Code.I(this);
                            break;
                        }
                        case 114: {
                            Code.J = false;
                            if (this.Code(1)) {
                                this.C(-1, 65);
                                break;
                            }
                            if (!d.X || Code.Code.Code != this) {
                                if (d.X) {
                                    Code.Code.Code();
                                }
                                Code.Code.I(this);
                                break;
                            }
                            break;
                        }
                        case 116: {
                            if (code == 73) {
                                this.Code.Z();
                                this.C(-1, 65);
                                break;
                            }
                            if (code == 101 || code == 100 || code == 45 || code == 44 || code == 52 || code == 89 || code == 141) {
                                Code.Code.I(this);
                                B b2;
                                Vector vector;
                                if (code == 100 || code == 89) {
                                    if (B.d >= 0) {
                                        b2 = this.Code;
                                        vector = d.a;
                                    }
                                    else {
                                        b2 = this.Code;
                                        vector = d.J;
                                    }
                                }
                                else {
                                    b2 = this.Code;
                                    vector = ((code == 52) ? d.a : ((code == 141) ? d.d : ((code > 47) ? d.J : d.c)));
                                }
                                b2.Code(vector);
                                if (code != 89) {
                                    this.Code.J = true;
                                    this.Code.Code(true, false, null);
                                }
                                if (code <= 47) {
                                    break;
                                }
                                Code.J = false;
                                if (Code.Code != Code.I) {
                                    this.Code(I(49), (String)null, (String)null);
                                    break;
                                }
                                break;
                            }
                            else {
                                if (code == 47) {
                                    this.Code.Code(d.c);
                                    d.n = d.c.size() - 1;
                                    Code.Code.I(I(109));
                                    break;
                                }
                                if (code == 135) {
                                    Code.Code.I(this);
                                    final g g4;
                                    (g4 = new g(41)).Code = (B)B.I[8];
                                    g4.Code = this;
                                    g4.Z = this.Code.Code();
                                    g4.C = this.Code.Code.get("a");
                                    Code(g4);
                                    break;
                                }
                                if (code != 154) {
                                    this.K();
                                    break;
                                }
                                if (d.X && Code.Code.Code == this) {
                                    break;
                                }
                                s = this.Code.Code.get("a");
                                str = this.Code.Code.get("b");
                                if (s != null && s.length() != 0) {
                                    Code.Code.Code(str, s, this);
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        case 121: {
                            switch (code) {
                                case 43:
                                case 50:
                                case 99:
                                case 139:
                                case 149: {
                                    final int b3 = this.Code.B();
                                    if (code == 139) {
                                        final Runnable runnable;
                                        ((g)(runnable = new g(40))).I = "file:///" + Code(d.d, b3)[0];
                                        Code(runnable);
                                    }
                                    Label_2628: {
                                        if (code == 149) {
                                            final g g5;
                                            (g5 = new g(43)).Code = (C)d.B.elementAt(b3);
                                            g5.Code.Code = true;
                                            Code(g5);
                                            // monitorenter(str = d.B)
                                            final Vector b4 = d.B;
                                            final int index = b3;
                                            try {
                                                b4.removeElementAt(index);
                                                m();
                                                break Label_2628;
                                            }
                                            finally {
                                            }
                                            // monitorexit(str)
                                        }
                                        I((code == 99) ? d.J : ((code == 50) ? d.a : ((code == 139) ? d.d : d.c)), b3);
                                    }
                                    Code.Code.I(this);
                                    this.Code.J = true;
                                    this.Code.Code(true, false, null);
                                    if (code != 99 && code != 50) {
                                        break Label_3948;
                                    }
                                    Code.J = false;
                                    if (Code.Code != Code.I) {
                                        this.Code(I(49), (String)null, (String)null);
                                        break Label_3948;
                                    }
                                    break Label_3948;
                                }
                                case 32: {
                                    Code.Code.removeAllElements();
                                    Code.I.removeAllElements();
                                    Code.g();
                                    Z("h1");
                                    d.Code = null;
                                    J(false);
                                    Code.Code.I(this);
                                    Code.Code.I(I(65));
                                    break Label_3948;
                                }
                                case 33: {
                                    Code.Code.I(this);
                                    Code.Code.I("server:reset");
                                    break Label_3948;
                                }
                                case 126: {
                                    Code.Code.I(this);
                                    this.Code.Z();
                                    break Label_3948;
                                }
                                case 46: {
                                    Code.Code.I(this);
                                    Code.Code.I(I(127));
                                    break Label_3948;
                                }
                                case 144: {
                                    Code.Code.I(this);
                                    Code.Z(false);
                                    break Label_3948;
                                }
                                case 155: {
                                    Code.Code.I(this);
                                    final g g6;
                                    (g6 = new g(44)).Code = this;
                                    Code(g6);
                                    break Label_3948;
                                }
                                case 153: {
                                    Code.Code.I(this);
                                    Code.Code.Z();
                                    break Label_3948;
                                }
                                default: {
                                    this.K();
                                    break Label_3948;
                                }
                            }
                            break;
                        }
                        case 122: {
                            Code.J = false;
                            if (!Code.Code.I(this)) {
                                this.C(-1, 65);
                            }
                            if (code == 126) {
                                d.al = false;
                            }
                            if (code == 153 || code == 155) {
                                Code.Code.I();
                                break;
                            }
                            break;
                        }
                        case 49: {
                            if (Code.Z) {
                                final g g7;
                                (g7 = new g(31)).Code = this;
                                Code(g7);
                                break;
                            }
                            break;
                        }
                        case 94: {
                            if ((s = this.Code.Z()) != null && s.length() > 0 && !s.startsWith("myopera:///b/f/")) {
                                this.Code(s + "/c/", this.Code.Code, this.Code.Code());
                                break;
                            }
                            break;
                        }
                        case 53: {
                            if (I(s2, "b")) {
                                B.I[0] = I(s2, "b");
                            }
                            this.Code("server:gettitle?u=" + (String)B.I[0], (String)null, (String)null);
                            break;
                        }
                        case 59: {
                            this.Code.I(false);
                            break;
                        }
                        case 127: {
                            Code.Code(Code(141), this.e, 0, false);
                            break;
                        }
                        case 51: {
                            if (this.Code != null) {
                                this.Code.g();
                                break;
                            }
                            break;
                        }
                        case 134: {
                            if (C.Code(false)) {
                                this.Code("dialog:" + I(135), (String)null, s2);
                                break;
                            }
                            this.Code(true, "", "s=1&r=1");
                            break;
                        }
                        case 150: {
                            d.B.elementAt(this.B()).Code = true;
                            break;
                        }
                        case 151: {
                            C.Code(d.B.elementAt(this.B()), null);
                            break;
                        }
                        case 152: {
                            // monitorenter(s = d.B)
                            int n2 = 0;
                            while (true) {
                                final int n3 = n2;
                                final Vector b5 = d.B;
                                try {
                                    if (n3 < b5.size()) {
                                        final C c;
                                        if ((c = d.B.elementAt(n2)).Code == 1 || c.Code == 2) {
                                            if (c.Code == 1) {
                                                C.Code(c);
                                            }
                                            d.B.removeElementAt(n2);
                                            continue;
                                        }
                                        ++n2;
                                        continue;
                                    }
                                    else {
                                        m();
                                    }
                                }
                                finally {
                                }
                                // monitorexit(s)
                                break;
                            }
                            this.Code(this.J = true, false, null);
                            break;
                        }
                        case 142: {
                            Code();
                            Code.Code.I("server:setup");
                            break;
                        }
                        case 63: {
                            if (this.Code.b) {
                                Code.Code.I("share:list?url=" + Code(this.Code.Code, true) + "&title=" + Code(this.Code.I, true));
                                break;
                            }
                            break;
                        }
                        case 146: {
                            s = d.q;
                            if ((str = Browser.Code.getAppProperty("OM-Upgrade")) != null) {
                                final StringBuffer append = new StringBuffer().append(s);
                                final int n4 = s.indexOf(63) + 1;
                                s = append.append((char)(((n4 | -n4) >>> 31) * -25 + 63)).append(str).toString();
                            }
                            Code.Code.I(this);
                            Code.Code.I(I(65));
                            P();
                            I(s);
                            break;
                        }
                        case 147: {
                            Code.Code.I(this);
                            Code.Code.I(I(65));
                            P();
                            J(false);
                            break;
                        }
                        default: {
                            if (Code(s, "bookmark:")) {
                                Code.Code.I("ext:" + (String)Code(d.J, J(s))[0]);
                                break;
                            }
                            if (Code(s, "download:")) {
                                break;
                            }
                            if (Code(s, "search:")) {
                                d.n = J(s);
                                Code.Code((String)Code(d.c, d.n)[1], "", 0, false);
                                break;
                            }
                            if (Code(s, "speeddial:")) {
                                if (Code(Code(d.a, J(s)))) {
                                    Code.Code.I("dialog:" + I(52));
                                    break;
                                }
                                if (!(s = (String)Code(d.a, J(s))[0]).equals("www.")) {
                                    Code.Code.I("ext:" + s);
                                    break;
                                }
                                break;
                            }
                            else {
                                if (Code(s, "spl:")) {
                                    Code.Code.I("ext:" + (String)Code(d.I, J(s))[0]);
                                    break;
                                }
                                if (Code(s) == 65 && !d.ax) {
                                    Code.Code.I(s);
                                    break;
                                }
                                Object[] array;
                                if (Code(s, "history:")) {
                                    array = Code.I.elementAt(J(s));
                                }
                                else {
                                    int value = 0;
                                    if (Code(s, "scl:")) {
                                        value = 52;
                                        s = I(s);
                                        str = null;
                                    }
                                    else if (Code(s, "ext:") && (s = I(s)).length() == 0) {
                                        return;
                                    }
                                    (array = new Object[12])[0] = s;
                                    array[3] = s2;
                                    array[7] = new int[6];
                                    array[11] = hashtable;
                                    array[10] = new Integer(value);
                                }
                                this.Code(array, str, false, b, false, false, null);
                                break;
                            }
                            break;
                        }
                    }
                }
                this.J = n;
            }
        }
    }
    
    private static void P() {
        d.m = "";
        d.n = "";
        d.o = "";
        d.p = "";
        d.q = "";
    }
    
    private void Code(final String s, final Vector vector) {
        for (int i = 0; i < vector.size(); ++i) {
            Object o = null;
            String s2;
            if (vector == Code.Code) {
                s2 = vector.elementAt(i);
            }
            else {
                s2 = (String)Code(vector, i)[0];
                o = Code(vector, i)[2];
            }
            final String s3;
            final int index = (s3 = s2).indexOf("://");
            final int index2 = s3.indexOf("www.");
            int n = 0;
            if (Code(s3, "http://", 0) && !Code(s, "http://", 0)) {
                n = 7;
            }
            Label_0525: {
                if (((Code(s3, s, n) ? 0 : ((index2 == 0 && Code(s3, s, n + 4)) ? 4 : ((index != -1 && Code(s3, s, index + 3)) ? (index + 3) : ((index != -1 && index2 == index + 3 && Code(s3, s, index2 + 4)) ? (index2 + 7) : -1)))) != -1 || s.length() == 0) && !s2.equals("www.")) {
                    int beginIndex = 0;
                    int n2 = 0;
                    if (Code(s2, "http://", 0)) {
                        beginIndex += 7;
                    }
                    final int index3;
                    if (s2.charAt(s2.length() - 1) == '/' && s2.indexOf(47, ((index3 = s2.indexOf("://")) == -1) ? beginIndex : (index3 + 3)) == s2.length() - 1) {
                        ++n2;
                    }
                    final String substring = s2.substring(beginIndex, s2.length() - n2);
                    final Vector e = this.e;
                    final Object o2 = o;
                    final Vector g = this.g;
                    final Object o3 = o2;
                    final Vector vector2 = e;
                    final String s4 = substring;
                    final int index4;
                    final String s5 = ((index4 = substring.indexOf("://")) == -1) ? s4 : s4.substring(index4 + 3);
                    for (int j = 0; j < vector2.size(); ++j) {
                        final String anotherString2;
                        final int index5;
                        final String anotherString = ((index5 = (anotherString2 = vector2.elementAt(j)).indexOf("://")) == -1) ? anotherString2 : anotherString2.substring(index5 + 3);
                        final int compareTo = s4.compareTo(anotherString2);
                        final int compareTo2 = s5.compareTo(anotherString);
                        if (compareTo == 0) {
                            break Label_0525;
                        }
                        if (compareTo2 < 0 || (compareTo2 == 0 && ((compareTo < 0 && index5 != -1) || index4 == -1))) {
                            vector2.insertElementAt(s4, j);
                            g.insertElementAt(o3, j);
                            break Label_0525;
                        }
                    }
                    vector2.addElement(s4);
                    g.addElement(o3);
                }
            }
            if (this.e.size() > 50) {
                this.e.removeElementAt(this.e.size() - 1);
                this.g.removeElementAt(this.e.size() - 1);
            }
        }
    }
    
    private d(final char c) {
        this.h = true;
        this.d = true;
        this.B = new byte[64];
        this.Z = new byte[32];
    }
    
    private void a(final int n) {
        this.J.B(n);
    }
    
    private synchronized void z() {
        if (this.J() || this.C == null) {
            this.y();
            return;
        }
        if (this.B != null) {
            final d d = new d((byte)0);
            final byte[] code;
            if ((code = Code(Code(this.B, this.Z)))[0] != 0 || code[1] != 1 || code[code.length - 32 - 1] != 0) {
                this.y();
                return;
            }
            for (int i = 2; i < code.length - 32 - 2; ++i) {
                if (code[i] != -1) {
                    this.y();
                    return;
                }
            }
            d.B((int)(this.a >> 32));
            d.B((int)this.a);
            d.Code(Code(this.C), 0, this.C.length << 2);
            d.Code(code);
            for (int j = 0; j < 32; ++j) {
                if (code[j] != code[j + code.length - 32]) {
                    this.y();
                    return;
                }
            }
            this.B = null;
            if (d.Code[1] != null) {
                J(false);
            }
        }
        if (this.B == null) {
            final d code2 = Code(this.J);
            final byte[] array = new byte[this.C.length << 2];
            for (int k = 2; k < array.length - 32; ++k) {
                while (array[k] == 0) {
                    code2.J(array, k);
                }
            }
            array[0] = 0;
            array[1] = 2;
            array[array.length - 32 - 1] = 0;
            code2.J(array, array.length - 32);
            this.Z.I(array, array.length - 32);
            code2.I(array, array.length - 32);
            this.B = Code(Code(Code(array, 0, array.length), this.C));
            this.H = 0;
        }
    }
    
    private void x() {
        for (int i = 16; i <= 63; ++i) {
            final int n;
            final int n2;
            this.Z[i] = (((n = this.Z[i - 2]) >>> 17 | n << 15) ^ (n >>> 19 | n << 13) ^ n >>> 10) + this.Z[i - 7] + (((n2 = this.Z[i - 15]) >>> 7 | n2 << 25) ^ (n2 >>> 18 | n2 << 14) ^ n2 >>> 3) + this.Z[i - 16];
        }
        int d = this.D;
        int e = this.E;
        int f = this.F;
        int g = this.G;
        int h = this.H;
        int k = this.K;
        int l = this.L;
        int m = this.M;
        int n3 = 0;
        for (int j = 0; j < 8; ++j) {
            final int n4 = m + (I(h, k, l) + d.I[n3] + this.Z[n3++]);
            final int n5 = g + n4;
            final int n6 = n4 + Z(d, e, f);
            final int n7 = l + (I(n5, h, k) + d.I[n3] + this.Z[n3++]);
            final int n8 = f + n7;
            final int n9 = n7 + Z(n6, d, e);
            final int n10 = k + (I(n8, n5, h) + d.I[n3] + this.Z[n3++]);
            final int n11 = e + n10;
            final int n12 = n10 + Z(n9, n6, d);
            final int n13 = h + (I(n11, n8, n5) + d.I[n3] + this.Z[n3++]);
            final int n14 = d + n13;
            final int n15 = n13 + Z(n12, n9, n6);
            final int n16 = n5 + (I(n14, n11, n8) + d.I[n3] + this.Z[n3++]);
            m = n6 + n16;
            g = n16 + Z(n15, n12, n9);
            final int n17 = n8 + (I(m, n14, n11) + d.I[n3] + this.Z[n3++]);
            l = n9 + n17;
            f = n17 + Z(g, n15, n12);
            final int n18 = n11 + (I(l, m, n14) + d.I[n3] + this.Z[n3++]);
            k = n12 + n18;
            e = n18 + Z(f, g, n15);
            final int n19 = n14 + (I(k, l, m) + d.I[n3] + this.Z[n3++]);
            h = n15 + n19;
            d = n19 + Z(e, f, g);
        }
        this.D += d;
        this.E += e;
        this.F += f;
        this.G += g;
        this.H += h;
        this.K += k;
        this.L += l;
        this.M += m;
        this.O = 0;
        for (int n20 = 0; n20 < 16; ++n20) {
            this.Z[n20] = 0;
        }
    }
    
    private boolean a() {
        return this.N == 0;
    }
    
    static Vector Code(final int n) {
        switch (n) {
            case 101: {
                return d.J;
            }
            case 52: {
                return d.a;
            }
            case 141: {
                return d.d;
            }
            default: {
                return d.c;
            }
        }
    }
    
    static {
        d.C = -1;
        d.J = 32768L;
        d.ax = 256;
        d.b = 400;
        d.c = 2;
        d.e = -1;
        d.f = -1;
        d.g = -1;
        d.h = 1;
        d.bg = true;
        d.i = -1;
        d.Code = new Random(System.currentTimeMillis());
        d.al = true;
        d.am = false;
        d.bi = false;
        d.bj = false;
        d.an = true;
        d.j = 1;
        d.aq = false;
        d.k = 0;
        d.as = true;
        d.l = 0;
        d.m = 0;
        d.au = true;
        d.av = true;
        d.az = -1;
        d.n = 0;
        d.aw = false;
        d.ax = false;
        d.B = 0L;
        d.C = 0L;
        d.ay = false;
        d.o = -1;
        d.az = true;
        d.k = "classic";
        d.Code = new String[3];
        d.q = -1;
        d.I = new Vector();
        d.s = 0;
        d.t = 0;
        d.u = -1;
        d.v = 0;
        d.aA = -1;
        d.Z = new Vector();
        d.aB = false;
        d.w = 0;
        d.m = "";
        d.n = "";
        d.o = "";
        d.p = "";
        d.q = "";
        d.aB = -1;
        d.J = null;
        d.B = new Vector();
        d.C = new Vector();
        d.a = null;
        d.b = new Vector();
        d.x = 0;
        d.aD = false;
        d.c = null;
        d.d = new Vector();
        d.r = "";
        d.c = null;
        d.s = "";
        d.Z = null;
        d.x = null;
        d.aC = 1024;
        d.aD = 1048576;
        d.aE = 1073741824;
        Code = new byte[8];
        d.d = new byte[8];
        d.bk = false;
        d.e = new byte[32];
        d.f = new byte[32];
        d.z = -1;
        d.I = null;
        d.J = null;
        d.Code = new Stack();
        d.bl = false;
        d.c = new int[64];
        d.d = null;
        d.aE = false;
        d.aF = false;
        d.I = new d((byte)0);
        (d.Z = new Hashtable(6)).put("http", new Integer(80));
        d.Z.put("https", new Integer(443));
        d.Z.put("ftp", new Integer(21));
        d.Z.put("rtsp", new Integer(554));
        d.Code = new Integer(0);
        d.a = new int[29];
        d.b = new int[30];
        d.h = new d("i", "*", 0, "/firsttime/*", 1);
        d.i = new d("sk", "*", 0, "/*", 1);
        d.j = new d("server", "*", 0, "setup", 1);
        d.k = new d(0, 0, "server4.operamini.com", 80, 1080, "c1dd7ab77e2c967746fe10681026c920f864811321bcb8be6bbfa5a03fda4e16c9c8db3af280f7703366e778e93c55e7159a8852d2b1381e521a337f22b1406cddf41a3114aecb4f4bfe79e0c5aa2ba8824fc989cb8bdcbf8ec5cef5176bfd4059f229b91bfa025126b295f9c409e75f6f6415ee094fd7f5dfd395a1f431668c5a08e88de891dc4dd38d4e9aa9b9c00dc604a0428e3aa5a28ccfa75af099147b", "server4.operamini.com");
        d.b = true;
        d.B = -1;
        d.aM = true;
        d.C = -1;
        d.a = -1;
        d.v = "";
        d.w = "";
        d.Code = new Hashtable();
        d.Code = new Object();
        d.U = -1;
        d.g = "-";
        d.Z = -1;
        d.b = new byte[0];
        d.J = "";
        d.C = "";
        I = Code(Code("428a2f9871374491b5c0fbcfe9b5dba53956c25b59f111f1923f82a4ab1c5ed5d807aa9812835b01243185be550c7dc372be5d7480deb1fe9bdc06a7c19bf174e49b69c1efbe47860fc19dc6240ca1cc2de92c6f4a7484aa5cb0a9dc76f988da983e5152a831c66db00327c8bf597fc7c6e00bf3d5a7914706ca63511429296727b70a852e1b21384d2c6dfc53380d13650a7354766a0abb81c2c92e92722c85a2bfe8a1a81a664bc24b8b70c76c51a3d192e819d6990624f40e3585106aa07019a4c1161e376c082748774c34b0bcb5391c0cb34ed8aa4a5b9cca4f682e6ff3748f82ee78a5636f84c878148cc7020890befffaa4506cebbef9a3f7c67178f2"), 0, 256);
    }
    
    private d(final byte[] array, final byte b) {
        this.h = true;
        this.f = true;
        this.I = new byte[256];
        for (int i = 0; i < 256; ++i) {
            this.I[i] = (byte)i;
        }
        int n = 0;
        int n2 = 0;
        for (int j = 0; j < 256; ++j) {
            n2 = (array[n] + this.I[j] + n2 & 0xFF);
            final byte b2 = this.I[j];
            this.I[j] = this.I[n2];
            this.I[n2] = b2;
            n = (n + 1) % 32;
        }
    }
    
    final boolean I() {
        return this.aN;
    }
    
    public static void I(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >> 24);
        array[n2 + 1] = (byte)(n >> 16);
        array[n2 + 2] = (byte)(n >> 8);
        array[n2 + 3] = (byte)n;
    }
    
    public static void Code(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >> 8);
        array[n2 + 1] = (byte)n;
    }
    
    d(final B code, final String e) {
        this.h = true;
        this.d = true;
        this.Code = code;
        this.e = e;
    }
    
    final synchronized void Code(final String s, final String s2, final String s3) {
        this.Code(s, s2, s3, null);
    }
    
    private d(final String u) {
        this.h = true;
        this.e = true;
        this.u = u;
    }
    
    static void I(final String code) {
        final g g;
        (g = new g(6)).Code = code;
        Code(g);
    }
    
    final int B() {
        final String i;
        if (Code(i = this.Code.I(), "bookmark:") || Code(i, "speeddial:") || Code(i, "search:") || Code(i, "open:") || Code(i, "download:")) {
            return J(i);
        }
        return -1;
    }
    
    final void I(final boolean b) {
        if (this.D == 16) {
            this.L = Code.Code(this.L, 0, -this.aw, this.ab);
            return;
        }
        if (this.Code != null) {
            this.Code.J(b);
        }
        this.M -= this.W;
        this.W = Code.Code(this.W, 0, this.aa, this.ab);
        this.M += this.W;
    }
    
    private static synchronized void Code(final DataOutputStream dataOutputStream) {
        dataOutputStream.writeBoolean(d.aM);
        dataOutputStream.writeByte(d.C);
        dataOutputStream.writeByte(d.a);
        dataOutputStream.writeUTF((d.w == null) ? "" : d.w);
        dataOutputStream.writeUTF((d.v == null) ? "" : d.v);
        dataOutputStream.writeByte(d.Code);
        dataOutputStream.writeByte(d.Code.size());
        final Enumeration<String> keys = d.Code.keys();
        while (keys.hasMoreElements()) {
            final String s = keys.nextElement();
            dataOutputStream.writeUTF(s);
            final d d = (d)((Object[])d.Code.get(s))[0];
            Code(dataOutputStream, d.Z);
            dataOutputStream.writeLong(d.a);
            dataOutputStream.write(d.Z);
            dataOutputStream.write(d.I.length);
            dataOutputStream.write(d.I);
            if (d.Code[1] == null) {
                dataOutputStream.writeInt(0);
            }
            else {
                Code(dataOutputStream, d.B);
                Code(dataOutputStream, d.C);
            }
        }
    }
    
    private boolean e() {
        return !this.Code.Code(2) && this.Code != null && Code(this.Code.Code) != 123;
    }
    
    private int e() {
        while (this.aa >= this.ab) {
            this.m.a(true);
        }
        ++this.W;
        return this.Z[this.aa++] & 0xFF;
    }
    
    final boolean Z() {
        return this.Code(24);
    }
    
    final d I() {
        return this.Code;
    }
    
    final void Code(final C code) {
        this.Code = code;
    }
    
    static String Code(long n) {
        if (n < 1024L) {
            return n + " B";
        }
        n /= 1024L;
        return n + " kB";
    }
    
    public final d Code() {
        return this.C;
    }
    
    private static void J(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >> 24);
        array[n2 + 1] = (byte)(n >>> 16);
        array[n2 + 2] = (byte)(n >>> 8);
        array[n2 + 3] = (byte)n;
    }
    
    private d(final byte b) {
        this.I = new byte[4];
        this.Z = new int[64];
        this.w();
    }
    
    static long Code(final boolean b, final boolean b2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (b2) {
            currentTimeMillis += d.l * 60 * 60 * 1000 + d.m * 60 * 1000;
        }
        if (b) {
            currentTimeMillis += 1800000L;
        }
        return currentTimeMillis;
    }
    
    static void v() {
        J((int)System.currentTimeMillis());
    }
    
    public static int Code(final int a, final int b, final int b2) {
        return Math.max(Math.min(a, b2), b);
    }
    
    private static int B(final String s) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            n = n * 31 + s.charAt(i);
        }
        return n;
    }
    
    private static String J(final String s) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            final char char1;
            if (((char1 = s.charAt(i)) <= '/' || char1 >= ':') && (char1 <= '@' || char1 >= '[') && (char1 <= '`' || char1 >= '{') && "-_.~".indexOf(char1) == -1 && "%&=".indexOf(char1) == -1) {
                sb.append('%').append(Integer.toString(char1, 16));
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    private static void Code(final int[] array, final int[] array2) {
        final int n = array.length - Code(0, array);
        final int n2 = array2.length - Code(0, array2);
        final int n3 = array.length - n - (array2.length - n2);
        final int[] array3 = new int[array2.length - n2 + n3];
        for (int i = n3 << 5; i >= 0; --i) {
            final int n4 = i;
            final int[] array4 = array3;
            final int n5 = n4;
            int n6 = n5 >>> 5;
            final int n7 = n5 & 0x1F;
            final int n8 = array2.length - n2;
            if (n7 == 0) {
                System.arraycopy(array2, n2, array4, array4.length - n8 - n6, n8);
            }
            else {
                final int n9 = 32 - n7;
                final int n10;
                if ((n10 = array2[n2] >>> n9) != 0) {
                    ++n6;
                }
                int n11 = array4.length - n8 - n6;
                if (n10 != 0) {
                    array4[n11++] = n10;
                }
                int n12 = array2[n2];
                for (int j = n2 + 1; j < n8; ++j) {
                    final int n13 = array2[j];
                    array4[n11++] = (n12 << n7 | n13 >>> n9);
                    n12 = n13;
                }
                array4[n11] = array2[n8 + n2 - 1] << n7;
            }
            final int n14 = array4.length - n8 - n6;
            while (true) {
                final int n15 = n14;
                final int[] array5 = array3;
                final int n16 = n15;
                int n17 = array.length - Code(n, array);
                int n18 = array5.length - Code(n16, array5);
                if (array.length - n17 != array5.length - n18) {
                    if (array.length - n17 - (array5.length - n18) < 0) {
                        break;
                    }
                }
                else {
                    while (n17 < array.length - 1 && array[n17] == array5[n18]) {
                        ++n17;
                        ++n18;
                    }
                    if ((int)(((long)array[n17] & 0xFFFFFFFFL) - ((long)array5[n18] & 0xFFFFFFFFL) >> 63) < 0) {
                        break;
                    }
                }
                final int n19 = n14;
                final int[] array6 = array3;
                final int n20 = n19;
                int n21 = array.length - 1;
                int k = array6.length - 1;
                int n22 = 0;
                long n23;
                do {
                    n23 = ((long)array[n21] & 0xFFFFFFFFL) - ((long)array6[k--] & 0xFFFFFFFFL) + n22;
                    array[n21--] = (int)n23;
                    n22 = (int)(n23 >> 63);
                } while (k >= n20);
                while (n21 >= n && n23 < 0L) {
                    n23 = ((long)array[n21] & 0xFFFFFFFFL) + n22;
                    array[n21--] = (int)n23;
                }
            }
        }
    }
    
    private void w() {
        this.P = 0;
        this.N = 0;
        final byte[] i = this.I;
        int length = this.I.length;
        final byte[] array = i;
        while (length-- > 0) {
            array[length] = 0;
        }
        this.O = 0;
        Code(this.Z, this.Z.length);
        this.D = 1779033703;
        this.E = -1150833019;
        this.F = 1013904242;
        this.G = -1521486534;
        this.H = 1359893119;
        this.K = -1694144372;
        this.L = 528734635;
        this.M = 1541459225;
    }
    
    private static void Code(final int[] array, int n) {
        while (n-- > 0) {
            array[n] = 0;
        }
    }
    
    private d(final int f, final int h, final String e, final int e2, final int n, final String t, final String u) {
        this.h = true;
        this.d = true;
        this.F = f;
        this.H = h;
        this.e = e;
        this.E = e2;
        this.N = n;
        this.t = t;
        this.u = u;
    }
    
    private d(final byte[] array, final int n) {
        this.h = true;
        this.d = true;
        this.J = new d((byte)0);
        this.B = new byte[64];
        this.Z = new byte[64];
        this.J = new byte[32];
        System.arraycopy(array, n, this.B, 0, 32);
        System.arraycopy(array, n, this.Z, 0, 32);
        for (int i = 0; i < 64; ++i) {
            final byte[] z = this.Z;
            final int n2 = i;
            z[n2] ^= 0x36;
            final byte[] b = this.B;
            final int n3 = i;
            b[n3] ^= 0x5C;
        }
        this.J.Code(this.Z, 0, 64);
    }
    
    final void Code(final boolean b, String i, final String z) {
        final g g;
        (g = new g(38)).Code = this;
        g.Z = z;
        g.B = i;
        i = I(60);
        g.J = (b ? ("overlay:" + i) : i);
        Code(g);
    }
    
    private synchronized void Z(final f obj) {
        if (obj != null) {
            this.Code.removeElement(obj);
        }
    }
    
    final C Code() {
        return this.Code;
    }
    
    private void Code(final byte b) {
        this.I[this.N++] = b;
        if (this.N == this.I.length) {
            this.Code(this.I, 0);
            this.N = 0;
        }
        ++this.P;
    }
    
    private static int[] Code(final int[] array, final int[] array2, final int[] array3) {
        for (int i = array3.length - 1; i >= 0; --i) {
            final long n = (long)array3[i] & 0xFFFFFFFFL;
            long n2 = 0L;
            for (int j = array2.length - 1; j >= 0; --j) {
                final long n3 = n2 + (n * ((long)array2[j] & 0xFFFFFFFFL) + ((long)array[i + j + 1] & 0xFFFFFFFFL));
                array[i + j + 1] = (int)n3;
                n2 = n3 >>> 32;
            }
            array[i] = (int)n2;
        }
        return array;
    }
    
    private static char Code(final char c) {
        if (c >= ' ' && c <= '\u00ff') {
            return (char)(c - ' ');
        }
        if (c >= '\u0410' && c <= '\u044f' && d.aG) {
            return (char)(c - '\u0330');
        }
        if (d.aG) {
            switch (c) {
                case '\u0401': {
                    return '\u0120';
                }
                case '\u0451': {
                    return '\u0121';
                }
                case '\u0407': {
                    return '\u0122';
                }
                case '\u0457': {
                    return '\u0123';
                }
                case '\u040e': {
                    return '\u0124';
                }
                case '\u045e': {
                    return '\u0125';
                }
                case '\u0491': {
                    return '\u0126';
                }
                case '\u0492': {
                    return '\u0127';
                }
                case '\u0406': {
                    return '\u0128';
                }
                case '\u0456': {
                    return '\u0129';
                }
            }
        }
        switch (c) {
            case '\u2022': {
                return 'u';
            }
            case '\u2013': {
                return 'v';
            }
            case '\u2026': {
                return 'e';
            }
            case '\u20ac': {
                return 'f';
            }
            case '\u2020': {
                return 'g';
            }
            case '\u2030': {
                return 'h';
            }
            case '\u201e': {
                return 'i';
            }
            case '\u2122': {
                return 'j';
            }
            case '\u201d': {
                return 't';
            }
            case '\u2014': {
                return 'w';
            }
            case '\u201c': {
                return 's';
            }
            case '\u2018': {
                return 'q';
            }
            case '\u2019': {
                return 'r';
            }
            default: {
                return (char)(d.Q - 1);
            }
        }
    }
    
    private void B(final int n) {
        this.Code((byte)(n >> 24));
        this.Code((byte)(n >>> 16));
        this.Code((byte)(n >>> 8));
        this.Code((byte)n);
    }
    
    private void Code(final byte[] array, int n, int i) {
        while (this.N != 0 && i > 0) {
            this.Code(array[n]);
            ++n;
            --i;
        }
        while (i > this.I.length) {
            this.Code(array, n);
            n += this.I.length;
            i -= this.I.length;
            this.P += this.I.length;
        }
        while (i > 0) {
            this.Code(array[n]);
            ++n;
            --i;
        }
    }
    
    private void Code(final byte[] array, final int n) {
        this.Z[this.O++] = ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8 | (array[n + 3] & 0xFF));
        if (this.O == 16) {
            this.x();
        }
    }
    
    private void Code(final byte[] array) {
        final int n = this.P << 3;
        this.Code((byte)(-128));
        while (this.N != 0) {
            this.Code((byte)0);
        }
        if (this.O > 14) {
            this.x();
        }
        this.Z[15] = n;
        this.x();
        J(this.D, array, 0);
        J(this.E, array, 4);
        J(this.F, array, 8);
        J(this.G, array, 12);
        J(this.H, array, 16);
        J(this.K, array, 20);
        J(this.L, array, 24);
        J(this.M, array, 28);
        this.w();
    }
    
    private static int I(final int n, final int n2, final int n3) {
        return ((n >>> 6 | n << 26) ^ (n >>> 11 | n << 21) ^ (n >>> 25 | n << 7)) + ((n & n2) ^ (~n & n3));
    }
    
    private void C(final boolean b) {
        this.Code(b, 0);
    }
    
    private static int Z(final int n, final int n2, final int n3) {
        return ((n >>> 2 | n << 30) ^ (n >>> 13 | n << 19) ^ (n >>> 22 | n << 10)) + ((n & n2) ^ (n & n3) ^ (n2 & n3));
    }
    
    private static int[] Code(final int[] array, final int[] array2) {
        final int[] array3 = new int[array2.length];
        final int[] array4;
        Code(array4 = new int[array2.length << 1], array, array);
        Code(array4, array2);
        System.arraycopy(array4, array4.length - array3.length, array3, 0, array3.length);
        Code(array4, array4.length);
        Code(array4, array3, array);
        Code(array4, array2);
        System.arraycopy(array4, array4.length - array3.length, array3, 0, array3.length);
        return array3;
    }
    
    private void Z(final byte[] array, final int b) {
        for (int i = b; i < 64; ++i) {
            this.B[i] = 0;
        }
        System.arraycopy(array, 0, this.B, 0, Math.min(64, b));
        this.B.I(this.B, 0, 64);
        this.B.Z(this.Z, 0, 32);
    }
    
    static void Code(final Object o) {
        synchronized (o) {
            o.notifyAll();
        }
    }
    
    private static boolean Code(final String s, final String s2, final int n) {
        if (n < 0 || n > s.length() - s2.length()) {
            return false;
        }
        for (int i = s2.length() - 1; i >= 0; --i) {
            if (Character.toLowerCase(s.charAt(i + n)) != Character.toLowerCase(s2.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    private void Code(final Object[] array, final String s, final boolean i, final boolean code, final Hashtable code2, final String code3) {
        this.I = new B(this);
        this.I.Code = code;
        if (array != null) {
            this.I.Code(array);
        }
        if (code2 != null) {
            this.I.Code = code2;
        }
        if (code3 != null) {
            this.I.Code = code3;
        }
        this.I.I = i;
        this.I.Code(s, code);
    }
    
    final void C() {
        if (this.Code(16)) {
            if (d.bd) {
                Code.B = 36;
                Code.C = 10;
            }
            else {
                Code.B = 25;
                if (this.ag > 0 && this.ak > 0) {
                    Code.C = 26;
                }
            }
            Code.a = 23;
            return;
        }
        Code.B = 0;
        Code.C = (this.I(-1) ? 1 : 0) * -19 + 23;
        Code.a = 23;
        if (this.Code != null) {
            if (this.Code.J()) {
                Code.a = 27;
            }
            else if (this.Code.B()) {
                Code.a = 29;
            }
            if (this.Code.Z()) {
                if (d.au) {
                    Code.C = 12;
                }
                else if (this.G > 0 && ((Object[])this.Code.elementAt(this.G - 1))[8] == this.Code) {
                    Code.C = 4;
                }
            }
            if (I(60).equals(this.Code.Code)) {
                final String z;
                if (Code(z = this.Code.Z(), "cwd:") || Code(z, "get:")) {
                    this.Code.Code = 1;
                }
                else if (Code(z, "put:")) {
                    this.Code.Code = 7;
                }
            }
            if (this.Code.Code >= 0) {
                Code.B = this.Code.Code;
            }
            if (this.Code.I >= 0) {
                Code.C = this.Code.I;
            }
            if (this.Code.B >= 0) {
                Code.a = this.Code.B;
            }
        }
    }
    
    private boolean B() {
        return (this.H & 0x1) != 0x0;
    }
    
    final B Code() {
        if (this.Code != null && this.Code.C <= 4) {
            return this.Code;
        }
        return this.I;
    }
    
    private static boolean Z(String substring, String s) {
        final int i = substring.length();
        final int length = s.length();
        int n = 0;
        while (i != n) {
            final char char1;
            if ((char1 = substring.charAt(n)) == '*') {
                final String substring2 = substring.substring(n + 1);
                substring = s.substring(n);
                s = substring2;
                final int length2 = substring.length();
                int beginIndex = 0;
                while (!Z(s, substring.substring(beginIndex))) {
                    if (length2 <= beginIndex++) {
                        return false;
                    }
                }
                return true;
            }
            if (n >= length || char1 != s.charAt(n++)) {
                return false;
            }
        }
        return length == n;
    }
    
    static boolean Code(final Object[] array, final int n) {
        return (Code(array, 3) & n) != 0x0;
    }
    
    private static int Code(int n, final int[] array) {
        while (array[n] == 0) {
            if (++n == array.length) {
                return 0;
            }
        }
        return array.length - n;
    }
    
    private void Z(final byte[] array, final int n, final int n2) {
        this.J.Code(this.J);
        this.J.Code(this.B, 0, 64);
        this.J.Code(this.J, 0, 32);
        this.J.Code(this.J);
        System.arraycopy(this.J, 0, array, n, n2);
        this.J.Code(this.Z, 0, 64);
    }
    
    static void Z(final int n) {
        d.A += n;
        if (d.aF) {
            Code.Code.c();
            if (d.A >= 160) {
                J(d.aF = false);
                Code((Object)d.I);
            }
        }
    }
    
    private static int B(final int n) {
        switch ((n & 0xFF) >> 4) {
            case 12:
            case 13: {
                return 2;
            }
            case 14: {
                return 3;
            }
            case 15: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }
    
    public static int I(final byte[] array, final int n) {
        return ((array[n] & 0xFF) << 8) + (array[n + 1] & 0xFF);
    }
    
    public static void Z(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >> 16);
        array[n2 + 1] = (byte)(n >> 8);
        array[n2 + 2] = (byte)n;
    }
    
    private d(final boolean b) {
        this.h = true;
        this.d = true;
        if (d.C == null) {
            DataInputStream code = null;
            final int n = 0;
            try {
                if (d.aG = ((code = Code(n)).readByte() > 0)) {
                    d.Q = 299;
                    d.R = 14;
                }
                else {
                    d.Q = 225;
                    d.R = 10;
                }
                final byte[] c = new byte[d.Q];
                final byte[] a = new byte[d.Q];
                byte b2 = 0;
                d.Z = code.readByte();
                for (int i = 0; i < d.Q; ++i) {
                    c[i] = (b2 += code.readByte());
                }
                d.J = code.readByte();
                for (int j = 0; j < d.Q; ++j) {
                    a[j] = (byte)(c[j] + code.readByte());
                }
                d.C = c;
                d.a = a;
            }
            finally {
                final DataInputStream dataInputStream = code;
                try {
                    dataInputStream.close();
                }
                finally {}
            }
        }
        Image image;
        if (b) {
            image = Code(4);
            this.I = d.a;
            d.Code = d.J;
            this.H = 4;
        }
        else {
            image = Code(5);
            this.I = d.C;
            d.Code = d.Z;
            this.H = 7;
        }
        if (image == null) {
            return;
        }
        this.N = image.getWidth();
        this.E = image.getHeight();
        this.Code = new I[this.H];
        for (int k = 0; k < this.H; ++k) {
            this.Code[k] = new I();
        }
        this.F = 0;
        final int[] array = new int[this.N * this.E];
        image.getRGB(array, 0, this.N, 0, 0, this.N, this.E);
        this.B = new byte[this.N * this.E];
        this.Z = new int[8];
        for (int length = array.length, l = 0; l < length; ++l) {
            this.B[l] = (byte)(7 - ((array[l] & 0xFF) >> 5));
            this.Z[this.B[l]] = 255 - (array[l] & 0xFF);
        }
        this.Z[0] = 0;
        if (!d.q) {
            for (int n2 = 0; n2 < this.Z.length; ++n2) {
                this.Z[n2] = ((n2 < 3) ? 0 : 255);
            }
        }
        this.Z = new byte[d.Q];
        this.J = new byte[d.Q];
        byte b3 = 0;
        byte b4 = 0;
        for (int n3 = 0; n3 < d.Q; ++n3) {
            if (b3 + this.I[n3] >= this.N) {
                b3 = 0;
                ++b4;
            }
            this.Z[n3] = b3;
            this.J[n3] = b4;
            b3 += this.I[n3];
        }
        final byte[] m = this.I;
        final int n4 = 0;
        m[n4] = m[n4];
    }
    
    private static int[] Code(final byte[] array, final int n, final int n2) {
        final int[] array2;
        int length = (array2 = new int[n2 / 4]).length;
        while (--length >= 0) {
            array2[length] = (array[n + (length << 2)] << 24 | (array[n + (length << 2) + 1] & 0xFF) << 16 | (array[n + (length << 2) + 2] & 0xFF) << 8 | (array[n + (length << 2) + 3] & 0xFF));
        }
        return array2;
    }
    
    private void Code(final Vector vector, final int n) {
        final int b = this.B();
        if (vector == d.J) {
            final Object[] array;
            if (Code(array = d.J.elementAt(b), 5) != 97) {
                array[5] = new Integer(77);
                array[6] = new Integer(Code(array, 6) | 0x2);
            }
            Code(vector, b, b + n);
            if (Code.Code == null) {
                if (Code.Code != Code.I) {
                    g.I();
                }
            }
            else {
                Code.Code.Code = System.currentTimeMillis() + 10000L;
            }
        }
        else {
            Code(vector, b, b + n);
        }
        this.Code((n > 0) ? 6 : 1, 0);
        this.Code(this.J = true, false, null);
    }
    
    static boolean Z(final int n) {
        return (n & 0x1) != 0x0;
    }
    
    static synchronized void J(final int n) {
        d.I.B(n);
    }
    
    private boolean J() {
        if (!d.ax) {
            return false;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        return this.Code(currentTimeMillis) && this.Code(currentTimeMillis - d.b);
    }
    
    final void Code(final int n, final int n2) {
        if (this.Code(16)) {
            this.a(n, n2);
            return;
        }
        final int g = this.Code.g();
        final int h = this.Code.h();
        switch (n) {
            case -5: {
                this.Code.c();
            }
            case 1: {
                this.Code.Code(0, -1, n2);
            }
            case 6: {
                this.Code.Code(0, 1, n2);
            }
            case 2: {
                if (this.Code(2)) {
                    Code.Code.I(this);
                    return;
                }
                this.Code.Code(-1, 0, n2);
            }
            case 5: {
                if (this.Code(2)) {
                    this.Code.b();
                    return;
                }
                this.Code.Code(1, 0, n2);
            }
            case 52: {
                this.Code.Code(-g, 0, true, true);
            }
            case 54: {
                this.Code.Code(g, 0, true, true);
            }
            case -9:
            case 50: {
                this.Code.Code(0, -h, true, true);
            }
            case -10:
            case 56: {
                this.Code.Code(0, h, true, true);
            }
            case 53: {
                if (!this.Code.I()) {
                    this.J = 117;
                }
                this.Code.I(this.Code.I() ^ true);
            }
            case 48: {
                Code.Code.I(true);
            }
            case 49: {
                this.Code.Code(false);
                break;
            }
        }
    }
    
    final synchronized void Code(final B b) {
        if (b != this.Code && b != this.I) {
            return;
        }
        switch (b.C) {
            case 1: {
                Code.Code.d();
            }
            case 2: {
                Code.Code.c();
            }
            case 4: {
                this.Code(this.I, false);
                this.I = null;
            }
            case 5:
            case 6:
            case 7: {
                if (this.Code != null) {
                    final Object[] code = b.Code;
                    final C code2 = this.Code;
                    final Object[] array = code;
                    code2.Code = null;
                    if (array == null || array[4] == null) {
                        code2.Code = 1;
                        m();
                        return;
                    }
                    C.I(code2, array);
                    return;
                }
                else {
                    if (b.Code != null) {
                        if (b.Code[4] != null) {
                            final g g;
                            (g = new g(47)).Code = b.Code;
                            g.Code = this;
                            Code(g);
                        }
                        else if (b.Code[5] != null) {
                            I((String)b.Code[5]);
                        }
                    }
                    this.I = null;
                    if (!b.Code()) {
                        Code.Code.e();
                    }
                    a();
                    if (d.bc) {
                        Code.Code.Code.schedule(new g(12), 4000L);
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    static synchronized d Code(final byte[] array) {
        J(d.aP++);
        d.I.Code(array);
        d.I.Code(array, 0, 32);
        final d d;
        (d = new d('\0')).I(array, 0);
        final byte[] b = d.b;
        d.Z(b, b.length);
        d.J(array, 0);
        return d;
    }
    
    static String I(String string, final String s) {
        if (string != null && s != null) {
            if ((string = '&' + string + '&').indexOf('&' + s + '&') >= 0) {
                return "";
            }
            final int index;
            if ((index = string.indexOf('&' + s + '=')) >= 0) {
                final int n = index + (s.length() + 2);
                return C(string.substring(n, string.indexOf(38, n)));
            }
        }
        return null;
    }
    
    private void J(final byte[] array, final int n, final int n2) {
        int j;
        for (int i = n; i < n2; i += j + 6) {
            j = I(array, i + 4);
            this.B.a(this.O++);
            this.B.I(array, i + 4, j + 2);
            this.B.Z(array, i, 4);
        }
        this.e.B(array, n, n2 - n);
    }
    
    final void B() {
        if (this.Code == null) {
            return;
        }
        if (!this.Code(16)) {
            this.Code.f();
        }
    }
    
    private void A() {
        if (this.I[this.I].indexOf("10.0.0.172") != -1) {
            d.aI = true;
            return;
        }
        d.aI = false;
    }
    
    private boolean Code(final long n) {
        return this.a < n || this.a - 1814400000L > n;
    }
    
    private int I(final String s) {
        final int length = s.length();
        int n = 0;
        for (int min = Math.min(length, s.length()), i = 0; i < min; ++i) {
            n += this.I[Code(s.charAt(i))];
        }
        return n;
    }
    
    private synchronized void E() {
        this.F();
        this.H = 0;
    }
    
    private synchronized f Code(final int n) {
        for (int i = 0; i < this.Code.size(); ++i) {
            final f f;
            if ((f = this.Code.elementAt(i)).I() == n) {
                return f;
            }
        }
        return null;
    }
    
    private void Code(final boolean b, final int n) {
        if (this.J(n)) {
            if (b) {
                this.run();
                return;
            }
            Code((Runnable)this);
        }
    }
    
    private int Code(final Graphics graphics, final char c, final int n, final int n2) {
        final char code;
        if ((code = Code(c)) != '\0') {
            final byte b = this.J[code];
            if (this.Code.Code[b] == null) {
                final int n3 = d.Code * this.N;
                final int n4 = b * n3;
                for (byte b2 = 0; b2 < n3; ++b2) {
                    d.J[b2] = this.Code.Code[this.B[b2 + n4]];
                }
                this.Code.Code[b] = Image.createRGBImage(d.J, this.N, (int)d.Code, true);
            }
            graphics.drawRegion(this.Code.Code[b], (int)this.Z[code], 0, (int)this.I[code], (int)d.Code, 0, n, n2, 0);
        }
        return this.I[code];
    }
    
    private void C(final int code) {
        if (this.Code != null && this.Code.Code != null && this.Code.Code == code) {
            return;
        }
        for (int i = 0; i < this.H; ++i) {
            if (code == this.Code[i].Code && this.Code[i].Code != null) {
                this.Code = this.Code[i];
                return;
            }
        }
        this.F = (this.F + 1) % this.H;
        this.Code = this.Code[this.F];
        this.Code.Code = new Image[d.R];
        if (d.J == null || d.J.length < this.N * d.Code) {
            d.J = new int[this.N * d.Code];
        }
        this.Code.Code = code;
        this.Code.Code = new int[8];
        for (int j = 0; j < 8; ++j) {
            this.Code.Code[j] = (this.Z[j] << 24 | (code & 0xFFFFFF));
        }
    }
    
    private void I(final byte[] array, final int n) {
        this.B = new d(array, n);
    }
    
    private synchronized int Code(final d d) {
        if (this.B == null) {
            return -1;
        }
        final byte[] b;
        (b = d.B)[0] = (byte)(this.H >> 16);
        b[1] = (byte)this.H;
        this.Z.Z(b, 2);
        this.Z.J(b, 0);
        (d.B = new d(b, 0)).I(this.Z, 0, 8);
        this.Z.J(b, 0);
        (d.d = new d(b, 0)).I(this.Z, 0, 8);
        this.Z.J(b, 0);
        (d.e = new d(b, (byte)0)).B(b, 0, 1024);
        this.Z.J(b, 0);
        (d.f = new d(b, (byte)0)).B(b, 0, 1024);
        return this.H++;
    }
    
    private static d Code(final int n, final byte b, final boolean b2) {
        // monitorenter(code = d.Code)
        Label_0061: {
            if (d.g != null && d.g.L == n) {
                break Label_0061;
            }
            final d g = d.g;
            try {
                d.g = new d(n, b, b2);
                if (g != null) {
                    g.Code(false, 0);
                }
                Code((Runnable)d.g);
                return d.g;
                Code(d.Code);
                return d.g;
            }
            finally {
            }
            // monitorexit(code)
        }
    }
    
    public static int Code(final byte[] array, int n, final char[] array2, int n2, int i) {
        while (i > 0) {
            final int b = B(array, n);
            final int b2 = B((int)array[n]);
            i -= b2;
            n += b2;
            if (b <= 65535) {
                array2[n2++] = (char)b;
            }
            else {
                array2[n2++] = (char)(0xD800 | b - 65536 >> 10);
                array2[n2++] = (char)(0xDC00 | (b & 0x3FF));
            }
        }
        return n2;
    }
    
    private synchronized void y() {
        this.C = null;
        this.B = null;
        this.B = null;
        System.arraycopy(this.J, 0, this.Z, 0, 8);
    }
    
    private static int Z(final String s) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            final char char1;
            if ((char1 = s.charAt(i)) > '\0' && char1 <= '\u007f') {
                ++n;
            }
            else if (char1 > '\u07ff') {
                n += 3;
            }
            else {
                n += 2;
            }
        }
        return n;
    }
    
    private void I(final byte[] array, final int n, final int n2) {
        this.J.Code(array, n, n2);
    }
    
    private static synchronized void I(final byte[] array) {
        d.I.Code(array, 0, array.length);
    }
    
    private static String Code(final byte[] array, int i, final int n) {
        final StringBuffer sb = new StringBuffer(n - i);
        while (i < n) {
            final int b;
            if ((b = B(array, i)) <= 65535) {
                sb.append((char)b);
            }
            else {
                sb.append((char)(0xD800 | b - 65536 >> 10));
                sb.append((char)(0xDC00 | (b & 0x3FF)));
            }
            i += B((int)array[i]);
        }
        return sb.toString();
    }
    
    private void a(int ae, int code) {
        if (d.Code == null) {
            return;
        }
        if (ae == -6 || ae == -7) {
            return;
        }
        if (ae == -11 && d.c == 2) {
            ae = 49;
        }
        final boolean b = this.af != -1 && this.ae == ae && System.currentTimeMillis() - this.I < 1000L;
        boolean b2 = false;
        boolean b3 = true;
        if (this.af != -1 && !b) {
            b2 = this.Code(true);
        }
        switch (ae) {
            case -5: {
                this.Code = null;
                if (!b2) {
                    if (this.ac != -1 && this.ac == this.e.size() - 1) {
                        Code.Code.J(this.u);
                    }
                    else {
                        Code.Code.I(this);
                        String value;
                        if (this.ac == -1 || this.e.size() == 0) {
                            Code.Code.Z(value = this.u);
                        }
                        else if (this.ac == this.e.size() - 2) {
                            Code.Code.I((String)Code(d.c, 0)[0], this.u);
                            value = this.u;
                        }
                        else {
                            Code.Code.Z(value = this.e.elementAt(this.ac));
                        }
                        final B code2 = this.Code.Code;
                        if (value != null && Code(code2.Code) == 65) {
                            code2.Code.put("o:a", value);
                        }
                    }
                    b3 = false;
                    break;
                }
                break;
            }
            case 1: {
                if (!b2) {
                    d d;
                    int n;
                    if (this.ac < 0) {
                        d = this;
                        n = this.e.size();
                    }
                    else {
                        d = this;
                        n = this.ac;
                    }
                    d.ac = n - 1;
                    b3 = (this.e.size() == 0);
                    break;
                }
                break;
            }
            case 6: {
                if (!b2) {
                    if (this.aN) {
                        this.ag = this.Code.length();
                    }
                    else if (this.ac >= this.e.size() - 1) {
                        this.ac = -1;
                    }
                    else {
                        ++this.ac;
                    }
                    b3 = (this.e.size() == 0);
                    break;
                }
                break;
            }
            case -8: {
                if (this.aN) {
                    this.Code = new StringBuffer();
                }
                else if ((b2 || this.ac == -1) && this.Code.length() > 0 && this.ag > 0) {
                    this.Code.deleteCharAt(--this.ag);
                }
                this.ac = -1;
                break;
            }
            case 2: {
                if (this.ac != -1 && this.ac < this.e.size() - 2) {
                    this.Code = new StringBuffer(this.e.elementAt(this.ac));
                    this.ac = -1;
                }
                this.ag = Math.max(0, this.ag - 1);
                break;
            }
            case 5: {
                if (this.aN) {
                    this.ag = this.Code.length();
                    break;
                }
                if (b2) {
                    break;
                }
                if (this.ac != -1 && this.ac < this.e.size() - 2) {
                    this.Code = new StringBuffer(this.e.elementAt(this.ac));
                    this.ac = -1;
                    this.ag = this.Code.length();
                    break;
                }
                this.ag = Math.min(this.Code.length(), this.ag + 1);
                break;
            }
            default: {
                if ((code = Code(ae, this.af, code > 0)) == -1) {
                    break;
                }
                if (this.aN) {
                    this.Code = new StringBuffer();
                }
                if (code == 8 || code == 127) {
                    if ((b2 || this.ac == -1) && this.Code.length() > 0 && this.ag > 0) {
                        this.Code.deleteCharAt(--this.ag);
                    }
                    this.ac = -1;
                    break;
                }
                this.af = (char)code;
                if (!B(ae)) {
                    b2 = this.Code(true);
                    break;
                }
                b3 = false;
                break;
            }
        }
        if (b3) {
            this.Z(b2);
        }
        this.e();
        this.aN = false;
        this.I = System.currentTimeMillis();
        this.ae = ae;
    }
    
    private d(final String e, final String u, final int l, final String t, final int h) {
        this.h = true;
        this.d = true;
        this.e = e;
        this.u = u;
        this.L = l;
        this.t = t;
        this.H = h;
    }
    
    final void Z() {
        this.Code(false, false, null);
    }
    
    static String[] Code(final String s) {
        final String[] array = new String[2];
        final Object[] code = Code(s, false);
        array[0] = (String)code[1] + ':' + code[2];
        array[1] = "http://10.0.0.172:80" + (String)code[3] + (String)code[4];
        return array;
    }
    
    static String I() {
        if (d.B) {
            return (d.aP ? "*" : "") + d.U + ":" + d.g;
        }
        return null;
    }
    
    static Calendar Code(final boolean b, final boolean b2) {
        final Calendar instance;
        (instance = Calendar.getInstance(TimeZone.getDefault())).setTime(new Date(Code(b, b2)));
        return instance;
    }
    
    private String Z() {
        return "http://" + this.C.e + ":" + this.C.E + "/";
    }
    
    private d(final int[] z) {
        this.h = true;
        this.d = true;
        this.Z = new d('\0');
        this.I = new byte[0];
        this.Z = new byte[8];
        this.J = new byte[32];
        this.Z = z;
    }
    
    private void J(final byte[] array, final int n) {
        this.B.I(this.Z, 0, 32);
        this.B.I(this.B, 0, 64);
        this.B.Z(array, n, 32);
        this.B.I(this.Z, 0, 32);
        this.B.Z(this.Z, 0, 32);
    }
    
    private static void I(final byte a, final String w) {
        d.a = a;
        d.w = w;
    }
    
    public static String Code(final byte[] array, int n) {
        final int i = I(array, n);
        n += 2;
        return Code(array, n, n + i);
    }
    
    public static void Code(final boolean ad) {
        // monitorenter(code = d.Code)
        if (d.ad == ad) {
            return;
        }
        d.ad = ad;
        try {
            Code();
        }
        finally {
        }
        // monitorexit(code)
    }
    
    private static void c(final int n) {
        // monitorenter(code = d.Code)
        while (true) {
            if (d.Code == null) {
                return;
            }
            final f code2 = d.Code;
            try {
                code2.I(n);
                d.Code = d.Code.Code();
                continue;
            }
            finally {
            }
            // monitorexit(code)
        }
    }
    
    private static int Code(final int n, final byte[] array, int n2) {
        if (n <= 127) {
            array[n2] = (byte)n;
            return 1;
        }
        if (n <= 2047) {
            array[n2++] = (byte)(0xC0 | n >> 6);
            array[n2] = (byte)(0x80 | (n & 0x3F));
            return 2;
        }
        array[n2++] = (byte)(0xE0 | n >> 12);
        array[n2++] = (byte)(0x80 | (n >> 6 & 0x3F));
        array[n2] = (byte)(0x80 | (n & 0x3F));
        return 3;
    }
    
    final int Z() {
        return this.K;
    }
    
    private static int B(final byte[] array, final int n) {
        switch (B((int)array[n])) {
            case 1: {
                return array[n];
            }
            case 2: {
                return (array[n] & 0x1F) << 6 | (array[n + 1] & 0x3F);
            }
            case 3: {
                return (array[n] & 0xF) << 12 | (array[n + 1] & 0x3F) << 6 | (array[n + 2] & 0x3F);
            }
            default: {
                return (array[n] & 0x7) << 18 | (array[n + 1] & 0x3F) << 12 | (array[n + 2] & 0x3F) << 6 | (array[n + 3] & 0x3F);
            }
        }
    }
    
    private String J() {
        return (String)this.Z[1];
    }
    
    public static int Code(final byte[] array, final int n) {
        return (array[n] << 8) + (array[n + 1] & 0xFF);
    }
    
    public static int J(final byte[] array, final int n) {
        return ((array[n] & 0xFF) << 16) + ((array[n + 1] & 0xFF) << 8) + (array[n + 2] & 0xFF);
    }
    
    public static int Z(final byte[] array, final int n) {
        return (array[n] << 24) + ((array[n + 1] & 0xFF) << 16) + ((array[n + 2] & 0xFF) << 8) + (array[n + 3] & 0xFF);
    }
    
    public static boolean Code() {
        return d.aI;
    }
    
    public static void Code(final int s) {
        if (s != d.S) {
            c(0);
            d.S = s;
            d.aJ = true;
        }
    }
    
    static int Code(int n, final int n2, final boolean b) {
        if (d.Code != null) {
            int i = d.Code.length - 1;
            while (i > 0) {
                if (d.Code[i][0] == (char)n) {
                    n = d.Code[i].length - 1;
                    if (b && n > 1) {
                        return d.Code[i][n];
                    }
                    for (int n3 = 1; n3 < n && n2 != -1; ++n3) {
                        if (d.Code[i][n3] == (char)n2) {
                            return d.Code[i][n3 + 1];
                        }
                    }
                    if (n > 0) {
                        return d.Code[i][1];
                    }
                    return -1;
                }
                else {
                    --i;
                }
            }
            if ((d.Code[0][0] & '\u0001') != 0x0 && (n == 8 || (n >= 32 && n <= 255))) {
                return n;
            }
            if ((d.Code[0][0] & '\u0002') == 0x0 && n >= 32) {
                final Code code = Code.Code;
                final int n4 = n;
                try {
                    final String keyName;
                    if (((keyName = code.getKeyName(n4)).length() == 1 && Character.toLowerCase(keyName.charAt(0)) == Character.toLowerCase((char)n)) || (n == 32 && keyName.toLowerCase().equals("space"))) {
                        return n;
                    }
                }
                finally {}
            }
        }
        return -1;
    }
    
    private static void Code(final byte c, final String v) {
        d.C = c;
        d.v = v;
    }
    
    private boolean C() {
        return (this.H & 0x4) != 0x0;
    }
    
    final boolean Code(final int n) {
        return (n & this.D) != 0x0;
    }
    
    private synchronized boolean b() {
        return this.H > 0 && ((this.a >= this.I) ? (Math.max(this.a, this.Code) + 240000L) : ((this.c() ? this.I : Math.max(this.I, this.Code)) + this.H)) - System.currentTimeMillis() < 0L;
    }
    
    final synchronized void Code(final f f) {
        if (this.b()) {
            this.Code(false, 2);
            if (f.Z()) {
                throw new IOException();
            }
        }
    }
    
    private void a(final boolean b) {
    Label_0000:
        while (true) {
            while (true) {
                this.B(0, 6);
                this.f.B(this.B, 0, 6);
                int i;
                if ((i = I(this.B, 4)) > 1014) {
                    throw new IOException();
                }
                this.B(6, i);
                this.a = System.currentTimeMillis();
                this.f.B(this.B, 6, i);
                this.d.a(this.N++);
                this.d.I(this.B, 4, i + 2);
                this.d.Z(this.B, 1020, 4);
                if (this.B[1020] != this.B[0] || this.B[1021] != this.B[1] || this.B[1022] != this.B[2] || this.B[1023] != this.B[3]) {
                    throw new IOException();
                }
                final byte b2 = this.B[6];
                final byte b3 = this.B[7];
                i -= 2;
                switch (b2) {
                    case 11: {
                        this.a.m = this;
                        this.a.C(this.B, 8, i);
                        if (b) {
                            return;
                        }
                    }
                    case 6:
                    case 10: {
                        f code = this.Code((int)b3);
                        int n = 8;
                        int n2 = 0;
                    Label_0342:
                        while (code != null) {
                            while (true) {
                                while (code.Code() == null) {
                                    if (code.Z()) {
                                        code = null;
                                        if (n2 != 0) {
                                            continue Label_0000;
                                        }
                                        continue Label_0342;
                                    }
                                    else {
                                        Code((Object)code, 1000);
                                    }
                                }
                                int n3 = Math.min(code.J(), i);
                                switch (b2) {
                                    case 10: {
                                        System.arraycopy(this.B, n, code.Code(), code.Z(), n3);
                                        final int n4 = n3 - i;
                                        n2 = ((n4 | -n4) >>> 31 ^ 0x1);
                                        code.J(n3);
                                        break;
                                    }
                                    case 11: {
                                        final int n5 = n3 = this.a.Code(code.Code(), code.Z(), code.J());
                                        n2 = ((n5 | -n5) >>> 31 ^ 0x1);
                                        code.J(this.a.W);
                                        break;
                                    }
                                    case 6: {
                                        code.J();
                                        Code(code, true);
                                        if (this.aN && !this.c()) {
                                            this.b = this.a;
                                            continue Label_0000;
                                        }
                                        continue Label_0000;
                                    }
                                }
                                code.Code(n3);
                                n += n3;
                                i -= n3;
                                continue;
                            }
                        }
                        if (b2 == 11) {
                            while (this.a.Code((byte[])null, 0, 1024) > 0) {}
                            continue;
                        }
                        continue;
                    }
                    case 7: {
                        this.b(b3);
                        continue;
                    }
                    case 9: {
                        this.E = Math.max(this.E - 1, 0);
                        final f code2;
                        if ((code2 = this.Code((int)b3)) != null) {
                            code2.I();
                        }
                        B(false);
                        continue;
                    }
                    case 4: {
                        this.C(true);
                        continue;
                    }
                    case 15: {
                        if (!this.aN) {
                            continue;
                        }
                        if (this.Z != null) {
                            System.arraycopy(this.B, 8, this.Z, 0, 8);
                            this.C(this.Code = true);
                            return;
                        }
                        this.Z = new byte[8];
                        System.arraycopy(this.B, 8, this.Z, 0, 8);
                        continue;
                    }
                    case 17: {
                        this.a = new d();
                        continue;
                    }
                    case 20: {
                        Code((Runnable)new d(Code(this.B, 8, i + 8)));
                        continue;
                    }
                    case 5: {
                        final byte b4 = this.B[8];
                        final f f = new f();
                        this.Code.addElement(f);
                        f.Code(this, b3);
                        if (b4 == 1) {
                            final Runnable runnable;
                            ((g)(runnable = new g(30))).Code = f;
                            Code(runnable);
                            continue;
                        }
                        f.close();
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    private boolean Code(f f) {
        if (this.B[0] != 72 || this.B[1] != 84 || this.B[2] != 84 || this.B[3] != 80) {
            return false;
        }
        this.B(5, 7);
        if (this.C.B() && this.B[8] == 32 && this.B[9] == 51 && this.B[10] == 48 && (this.B[11] == 49 || this.B[11] == 50 || this.B[11] == 51 || this.B[11] == 55)) {
            this.F = 1;
            String z = null;
            final String s = "location";
            try {
                z = this.Z(s);
            }
            finally {}
            if (z == null || z.length() == 0) {
                return false;
            }
            if (f != null) {
                if (f.Code(z)) {
                    this.Z(f);
                    I(f);
                    D();
                }
                else {
                    f.close();
                }
            }
            // monitorenter(code = d.Code)
            f f2 = d.Code;
        Label_0281_Outer:
            while (true) {
                while (true) {
                    if (f2 != null) {
                        final f f3 = f2;
                        try {
                            if (f3.Code() == this.L && !f2.Z() && f2 != f) {
                                if (f2.Code(z)) {
                                    D();
                                }
                                else {
                                    f2.close();
                                }
                            }
                            f2 = f2.Code();
                            continue Label_0281_Outer;
                        }
                        // monitorexit(code)
                        finally {
                        }
                        // monitorexit(code)
                        break;
                    }
                    continue;
                }
            }
            this.Code(false, 0);
            return true;
        }
        else {
            if (this.B[8] == 32 && this.B[9] == 52 && this.B[10] == 48 && this.B[11] == 51) {
                this.F = 2;
                f = (f)new StringBuffer();
                final String s2 = null;
                try {
                    this.Z(s2);
                    int n = 0;
                Block_34:
                    while (++n <= 256) {
                        this.B(0, 1);
                        if (this.B[0] <= 32) {
                            break;
                        }
                        ((StringBuffer)f).append((char)this.B[0]);
                        if (n == 4 && !((StringBuffer)f).toString().toLowerCase().equals("http")) {
                            break Block_34;
                        }
                    }
                    ((StringBuffer)f).setLength(0);
                }
                finally {}
                d.f = ((((StringBuffer)f).length() > 4) ? ((StringBuffer)f).toString() : null);
                this.Code(false, 4);
                Code.Code.I(I(62));
                return true;
            }
            return false;
        }
    }
    
    public final String Code() {
        return this.u + this.t.substring(0, 8);
    }
    
    private d(int l, final byte b, final boolean b2) {
        this.h = true;
        this.d = true;
        this.a = true;
        this.Code = new Vector();
        this.B = new byte[1024];
        this.I = new Object[110];
        this.C = new int[110];
        this.C = false;
        this.L = l;
        if (b2) {
            this.C = I(l);
            this.C = true;
        }
        else {
            this.C = Code(l);
        }
        l = 0;
        int endsWith = 0;
        Label_0258: {
            final int c;
            if ((c = c()) == 460) {
                endsWith = 1;
            }
            else {
                if (c == -1) {
                    final String e;
                    final int index = (e = Code(0).e).indexOf(46);
                    final int index2 = e.indexOf("cn");
                    final int index3 = e.indexOf("china");
                    if ((index2 >= 0 && index2 < index) || (index3 >= 0 && index3 < index)) {
                        endsWith = 1;
                        break Label_0258;
                    }
                    final String property;
                    if ((property = System.getProperty("wireless.messaging.sms.smsc")) != null) {
                        endsWith = ((property.startsWith("+86") || property.startsWith("0086")) ? 1 : 0);
                        break Label_0258;
                    }
                    final String property2;
                    if (Z(1).length() == 0 && (property2 = System.getProperty("microedition.locale")) != null) {
                        endsWith = (property2.toLowerCase().endsWith("cn") ? 1 : 0);
                        break Label_0258;
                    }
                }
                endsWith = 0;
            }
        }
        final int n = endsWith;
        this.I = new String[n + 2];
        String[] array;
        int n2;
        String string;
        if (!this.C.a()) {
            array = this.I;
            n2 = 0;
            string = "socket://" + this.C.e + ":" + this.C.N;
        }
        else {
            array = this.I;
            n2 = 0;
            string = "socket://do_not_use_me:0";
        }
        array[n2] = string;
        if (n != 0) {
            this.I[1] = "http://10.0.0.172:80/";
        }
        this.I[this.I.length - 1] = this.Z();
        if (this.I.length != d.Code) {
            d.Code = this.I.length;
            Code();
            l = 1;
        }
        final String code = this.C.Code();
        final Object[] z;
        if ((z = d.Code.get(code)) != null) {
            this.Z = z;
            this.c = (d)z[0];
        }
        else {
            this.c = new d(Code(Code(this.C.t), 0, 160));
            (this.Z = new Object[2])[0] = this.c;
            this.Z[1] = "";
            d.Code.put(code, this.Z);
            l = 1;
        }
        if (l != 0) {
            J(false);
        }
        this.I = (byte)((b != -1) ? b : ((d.C >= 0 && !this.C.a()) ? d.C : ((d.a >= 0) ? d.a : 1)));
        this.A();
        if (d.ax && d.A >= 160) {
            this.aN = true;
            return;
        }
        this.aN = false;
    }
    
    private boolean d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_1       
        //     5: monitorenter   
        //     6: getstatic       d.aK:Z
        //     9: ifne            16
        //    12: iconst_0       
        //    13: aload_1        
        //    14: monitorexit    
        //    15: ireturn        
        //    16: getstatic       d.T:I
        //    19: istore_2       
        //    20: iconst_0       
        //    21: putstatic       d.aK:Z
        //    24: iconst_1       
        //    25: putstatic       d.aL:Z
        //    28: getstatic       d.B:B
        //    31: aload_0        
        //    32: getfield        d.I:[Ljava/lang/String;
        //    35: arraylength    
        //    36: iconst_1       
        //    37: isub           
        //    38: if_icmplt       45
        //    41: iconst_m1      
        //    42: putstatic       d.B:B
        //    45: aload_0        
        //    46: astore_3       
        //    47: iconst_0       
        //    48: istore          4
        //    50: iconst_0       
        //    51: istore          5
        //    53: iload           4
        //    55: ifne            67
        //    58: getstatic       d.B:B
        //    61: iconst_1       
        //    62: iadd           
        //    63: i2b            
        //    64: putstatic       d.B:B
        //    67: getstatic       d.B:B
        //    70: aload_0        
        //    71: getfield        d.I:[Ljava/lang/String;
        //    74: arraylength    
        //    75: if_icmplt       217
        //    78: iload           5
        //    80: ifeq            97
        //    83: invokestatic    d.G:()V
        //    86: iconst_0       
        //    87: putstatic       d.aL:Z
        //    90: invokestatic    d.D:()V
        //    93: aload_1        
        //    94: monitorexit    
        //    95: iconst_1       
        //    96: ireturn        
        //    97: aload_0        
        //    98: getfield        d.L:I
        //   101: invokestatic    d.I:(I)Ld;
        //   104: astore          5
        //   106: aload_0        
        //   107: getfield        d.C:Ld;
        //   110: getfield        d.u:Ljava/lang/String;
        //   113: aload           5
        //   115: getfield        d.u:Ljava/lang/String;
        //   118: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   121: ifeq            171
        //   124: aload_0        
        //   125: getfield        d.C:Ld;
        //   128: getfield        d.t:Ljava/lang/String;
        //   131: aload           5
        //   133: getfield        d.t:Ljava/lang/String;
        //   136: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   139: ifeq            171
        //   142: aload_0        
        //   143: getfield        d.C:Ld;
        //   146: getfield        d.E:I
        //   149: aload           5
        //   151: getfield        d.E:I
        //   154: if_icmpne       171
        //   157: invokestatic    d.G:()V
        //   160: iconst_0       
        //   161: putstatic       d.aL:Z
        //   164: invokestatic    d.D:()V
        //   167: aload_1        
        //   168: monitorexit    
        //   169: iconst_1       
        //   170: ireturn        
        //   171: iconst_1       
        //   172: istore          5
        //   174: getstatic       d.Code:Ljava/util/Hashtable;
        //   177: invokevirtual   java/util/Hashtable.elements:()Ljava/util/Enumeration;
        //   180: astore          6
        //   182: aload           6
        //   184: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   189: ifeq            213
        //   192: aload           6
        //   194: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   199: checkcast       [Ljava/lang/Object;
        //   202: iconst_0       
        //   203: aaload         
        //   204: checkcast       Ld;
        //   207: invokespecial   d.y:()V
        //   210: goto            182
        //   213: iconst_0       
        //   214: putstatic       d.B:B
        //   217: aload_0        
        //   218: getfield        d.I:[Ljava/lang/String;
        //   221: getstatic       d.B:B
        //   224: aaload         
        //   225: ldc_w           "socket://"
        //   228: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   231: ifeq            286
        //   234: getstatic       d.C:B
        //   237: ifge            262
        //   240: getstatic       d.ad:Z
        //   243: ifne            262
        //   246: getstatic       d.ac:Z
        //   249: ifne            262
        //   252: aload_0        
        //   253: getfield        d.C:Ld;
        //   256: invokespecial   d.a:()Z
        //   259: ifeq            286
        //   262: getstatic       d.ad:Z
        //   265: ifne            274
        //   268: getstatic       d.ac:Z
        //   271: ifeq            280
        //   274: bipush          -2
        //   276: aconst_null    
        //   277: invokestatic    d.Code:(BLjava/lang/String;)V
        //   280: iconst_0       
        //   281: istore          4
        //   283: goto            53
        //   286: aload_0        
        //   287: getfield        d.c:Ld;
        //   290: invokespecial   d.y:()V
        //   293: iconst_0       
        //   294: invokestatic    d.J:(Z)V
        //   297: aload_3        
        //   298: ifnonnull       317
        //   301: aload_0        
        //   302: getfield        d.L:I
        //   305: getstatic       d.B:B
        //   308: iload           5
        //   310: invokestatic    d.Code:(IBZ)Ld;
        //   313: astore_3       
        //   314: goto            338
        //   317: aload_3        
        //   318: aconst_null    
        //   319: putfield        d.Z:[B
        //   322: aload_3        
        //   323: aconst_null    
        //   324: putfield        d.b:Ld;
        //   327: aload_3        
        //   328: getstatic       d.B:B
        //   331: putfield        d.I:B
        //   334: aload_3        
        //   335: invokestatic    d.Code:(Ljava/lang/Runnable;)V
        //   338: getstatic       d.aM:Z
        //   341: ifeq            370
        //   344: aload_3        
        //   345: getfield        d.aO:Z
        //   348: ifne            370
        //   351: aload_3        
        //   352: invokespecial   d.b:()Z
        //   355: ifne            370
        //   358: getstatic       d.Code:Ljava/lang/Object;
        //   361: sipush          1000
        //   364: invokestatic    d.Code:(Ljava/lang/Object;I)V
        //   367: goto            338
        //   370: getstatic       d.aM:Z
        //   373: ifeq            383
        //   376: iload_2        
        //   377: getstatic       d.T:I
        //   380: if_icmpeq       394
        //   383: iconst_0       
        //   384: putstatic       d.aL:Z
        //   387: invokestatic    d.D:()V
        //   390: aload_1        
        //   391: monitorexit    
        //   392: iconst_1       
        //   393: ireturn        
        //   394: aload_3        
        //   395: getfield        d.F:I
        //   398: iconst_1       
        //   399: if_icmpne       413
        //   402: iload           4
        //   404: ifne            413
        //   407: iconst_1       
        //   408: istore          4
        //   410: goto            416
        //   413: iconst_0       
        //   414: istore          4
        //   416: aload_3        
        //   417: getfield        d.F:I
        //   420: iconst_2       
        //   421: if_icmpne       447
        //   424: iconst_4       
        //   425: invokestatic    d.c:(I)V
        //   428: iconst_m1      
        //   429: putstatic       d.B:B
        //   432: iconst_0       
        //   433: invokestatic    d.J:(Z)V
        //   436: iconst_0       
        //   437: putstatic       d.aL:Z
        //   440: invokestatic    d.D:()V
        //   443: aload_1        
        //   444: monitorexit    
        //   445: iconst_1       
        //   446: ireturn        
        //   447: aload_3        
        //   448: invokespecial   d.c:()Z
        //   451: ifeq            484
        //   454: iload           4
        //   456: ifne            484
        //   459: aload_0        
        //   460: getfield        d.I:[Ljava/lang/String;
        //   463: getstatic       d.B:B
        //   466: iconst_1       
        //   467: iadd           
        //   468: aaload         
        //   469: ldc_w           "socket://"
        //   472: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   475: ifne            484
        //   478: bipush          -2
        //   480: aconst_null    
        //   481: invokestatic    d.Code:(BLjava/lang/String;)V
        //   484: aload_3        
        //   485: iconst_0       
        //   486: iconst_0       
        //   487: invokespecial   d.Code:(ZI)V
        //   490: aconst_null    
        //   491: astore_3       
        //   492: goto            53
        //   495: pop            
        //   496: invokestatic    d.G:()V
        //   499: iconst_0       
        //   500: putstatic       d.aL:Z
        //   503: invokestatic    d.D:()V
        //   506: aload_1        
        //   507: monitorexit    
        //   508: iconst_1       
        //   509: ireturn        
        //   510: astore_2       
        //   511: iconst_0       
        //   512: putstatic       d.aL:Z
        //   515: invokestatic    d.D:()V
        //   518: aload_2        
        //   519: athrow         
        //   520: astore_2       
        //   521: aload_1        
        //   522: monitorexit    
        //   523: aload_2        
        //   524: athrow         
        //    StackMap: 00 19 00 10 00 02 07 01 7C 07 01 8C 00 00 00 2D 00 03 07 01 7C 07 01 8C 01 00 00 00 35 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 00 43 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 00 61 00 05 07 01 7C 07 01 8C 01 07 01 7C 01 00 00 00 AB 00 05 07 01 7C 07 01 8C 01 07 01 7C 01 00 00 00 B6 00 07 07 01 7C 07 01 8C 01 07 01 7C 01 01 07 01 97 00 00 00 D5 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 00 D9 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 06 00 06 07 01 7C 07 01 8C 01 07 01 7C 00 01 00 00 01 12 00 06 07 01 7C 07 01 8C 01 07 01 7C 00 01 00 00 01 18 00 06 07 01 7C 07 01 8C 01 07 01 7C 00 01 00 00 01 1E 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 3D 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 52 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 72 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 7F 00 02 00 07 01 8C 00 00 01 8A 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 9D 00 06 07 01 7C 07 01 8C 01 07 01 7C 00 01 00 00 01 A0 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 BF 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 E4 00 06 07 01 7C 07 01 8C 01 07 01 7C 01 01 00 00 01 EF 00 02 00 07 01 8C 00 01 07 01 94 01 FE 00 02 00 07 01 8C 00 01 07 01 94 02 08 00 02 00 07 01 8C 00 01 07 01 94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  35     86     495    520    Any
        //  90     93     520    525    Any
        //  101    160    495    520    Any
        //  164    167    520    525    Any
        //  177    367    495    520    Any
        //  387    390    520    525    Any
        //  425    436    495    520    Any
        //  440    443    520    525    Any
        //  448    490    495    520    Any
        //  496    499    510    520    Any
        //  503    520    520    525    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static int c() {
        final String property = System.getProperty("com.sonyericsson.net.mcc");
        try {
            return Integer.parseInt(property);
        }
        finally {
            return -1;
        }
    }
    
    static boolean Code(final String s, final String prefix) {
        return s != null && s.startsWith(prefix);
    }
    
    static f Code(final Object[] array, final int[] array2, final int n) {
        final f f;
        I(f = new f(array, array2, n));
        D();
        return f;
    }
    
    private f Code() {
        // monitorenter(code = d.Code)
        while (true) {
            Label_0025: {
                if (d.Code == null) {
                    break Label_0025;
                }
                final int l = this.L;
                final f code2 = d.Code;
                try {
                    if (l != code2.Code()) {
                        if (this.J) {
                            for (int i = 0; i < this.Code.size(); ++i) {
                                final f f;
                                if ((f = this.Code.elementAt(i)).B() != 0) {
                                    return f;
                                }
                            }
                        }
                        this.J = false;
                        Code(d.Code, 0);
                        if (this.aO) {
                            D();
                            return null;
                        }
                        continue;
                    }
                    else {
                        if (this.aO) {
                            D();
                            return null;
                        }
                        final f code3;
                        d.Code = (code3 = d.Code).Code();
                        int n;
                        for (n = 1; this.Code(n) != null; ++n) {}
                        this.Code.addElement(code3);
                        code3.Code(this, n);
                        D();
                        return code3;
                    }
                }
                finally {
                }
                // monitorexit(code)
            }
        }
    }
    
    private static void I(final f code) {
        // monitorenter(code2 = d.Code)
        final f code3 = d.Code;
        try {
            code.Code(code3);
            d.Code = code;
        }
        finally {
        }
        // monitorexit(code2)
    }
    
    private static void D() {
        // monitorenter(code = d.Code)
        if (d.aL) {
            // monitorexit(code)
            return;
        }
        Label_0028: {
            if (!d.aJ) {
                break Label_0028;
            }
            d.aJ = false;
            try {
                Code();
                if (d.Code == null) {
                    return;
                }
                final int code3;
                final d code2 = Code(code3 = d.Code.Code());
                if (d.C == -2 && d.a == -2) {
                    Code((byte)(-1), null);
                    I((byte)(-1), null);
                }
                if (code2.a() && d.a == -2) {
                    I((byte)(-1), null);
                }
                if (((code2.a() && d.a == -1) || (!code2.a() && (d.C == -1 || (d.C == -2 && d.a == -1)))) && !d.aK) {
                    ++d.T;
                    d.B = -1;
                    d.aM = true;
                    d.aK = true;
                }
                Code(code3, (byte)(((d.aM ? 1 : 0) << 1) - 1), false);
            }
            finally {
            }
            // monitorexit(code)
        }
    }
    
    public static void Code() {
        // monitorenter(code = d.Code)
        if (d.aL) {
            return;
        }
        final byte b = -1;
        final String s = null;
        try {
            Code(b, s);
            I((byte)(-1), null);
            ++d.T;
            d.aM = true;
            final d g;
            if ((g = d.g) != null) {
                final d d = g;
                d.Code |= true;
                final d d2 = g;
                final boolean b2 = false;
                final int n = 0;
                try {
                    d2.Code(b2, n);
                }
                finally {}
            }
        }
        finally {
        }
        // monitorexit(code)
    }
    
    private static void G() {
        c(0);
        Code((byte)(-2), null);
        I((byte)(-2), null);
        d.B = -1;
        J(false);
    }
    
    static void Code(final f f, final boolean b) {
        synchronized (d.Code) {
            if (!f.Z()) {
                f.I(0);
                final d code;
                if ((code = f.Code()) != null) {
                    if (code.c()) {
                        code.J = true;
                        f.Z((b ? 1 : 0) + 6);
                        Code(d.Code);
                    }
                }
                else if (d.Code != null) {
                    d.Code = d.Code.Code(f);
                }
            }
        }
    }
    
    private synchronized void b(final int n) {
        this.Z(this.Code(n));
    }
    
    private static void Code(final J n, final int n2, final int n3, final int n4) {
        n.Code(n.size() + 8);
        Code(n.Code(), n.size() - 8, n2, n3, n4);
    }
    
    private static void Code(final byte[] array, final int n, final int n2, final int n3, final int n4) {
        array[n + 4] = (byte)(n4 + 2 >> 8);
        array[n + 4 + 1] = (byte)(n4 + 2);
        array[n + 4 + 2] = (byte)n2;
        array[n + 4 + 3] = (byte)n3;
    }
    
    private boolean J(final int n) {
        // monitorenter(code = d.Code)
        if (d.g == this) {
            d.g = null;
        }
        final boolean b = d.aM || this.Code;
        int index = 0;
        while (true) {
            final int n2 = index;
            final Vector code2 = this.Code;
            try {
                if (n2 < code2.size()) {
                    final f f;
                    if (!(f = this.Code.elementAt(index)).Z() && !f.Code() && (b || !f.I())) {
                        if (!b) {
                            f.Z();
                        }
                        f.Code();
                        I(f);
                        ++index;
                    }
                    else {
                        f.I(n);
                        ++index;
                    }
                }
                else {
                    this.Code.removeAllElements();
                    if (!this.aO) {
                        this.aO = true;
                        this.Code = null;
                        this.Code = null;
                        D();
                        Code(d.Code);
                        return true;
                    }
                    return false;
                }
            }
            finally {
            }
            // monitorexit(code)
        }
    }
    
    private synchronized void d(final int h) {
        this.I = System.currentTimeMillis();
        this.H = h;
    }
    
    private synchronized void F() {
        if (this.aO) {
            throw new IOException();
        }
        this.a = System.currentTimeMillis();
    }
    
    private static int Code(final Hashtable hashtable) {
        if (hashtable == null) {
            return 0;
        }
        int n = 7;
        final Enumeration<String> keys = (Enumeration<String>)hashtable.keys();
        while (keys.hasMoreElements()) {
            final String key = keys.nextElement();
            final Object[] array = hashtable.get(key);
            n = n + (2 + Z(key)) + (2 + Z((String)array[0])) + (4 + (int)array[1]);
        }
        return n;
    }
    
    private void J(final f f) {
        if (f == null) {
            return;
        }
        final Hashtable code;
        if ((code = f.Code(true)) == null) {
            return;
        }
        final int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(1);
        final int n = d.I = Code(code);
        d.Z = 0;
        final J out = new J(4104);
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        Code(out, 22, f.I(), 7);
        dataOutputStream.write(1);
        dataOutputStream.writeShort(9);
        dataOutputStream.writeInt(n - 7);
        this.J(out.Code(), 0, 15);
        this.B(out.Code(), 15);
        out.Code(0);
        InputStream openInputStream = null;
        final Hashtable hashtable = code;
        try {
            final Enumeration<String> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                final String s = keys.nextElement();
                final Object[] array = code.get(s);
                final int n2 = Z(s) + Z((String)array[0]) + 8;
                Code(out, 22, f.I(), n2);
                dataOutputStream.writeUTF(s);
                dataOutputStream.writeUTF((String)array[0]);
                final int intValue = (int)array[1];
                dataOutputStream.writeInt(intValue);
                this.J(out.Code(), 0, n2 + 8);
                this.B(out.Code(), n2 + 8);
                out.Code(0);
                openInputStream = Code.Code.Code((String)array[2]).openInputStream();
                final byte[] code2 = out.Code();
                int n3 = 0;
                int read;
                while (!f.Z() && (read = openInputStream.read(code2, 8, 4096)) >= 0 && n3 < intValue) {
                    n3 += read;
                    d.Z += read;
                    Code(code2, 0, 22, f.I(), read);
                    this.J(code2, 0, read + 8);
                    this.B(code2, read + 8);
                }
                final InputStream inputStream = openInputStream;
                try {
                    inputStream.close();
                }
                finally {}
            }
        }
        finally {
            d.Z = -1;
            final InputStream inputStream2 = openInputStream;
            try {
                inputStream2.close();
            }
            finally {}
            Thread.currentThread().setPriority(priority);
            Code.Code.c();
        }
    }
    
    private void B(final byte[] b, final int len) {
        this.Code.write(b, 0, len);
        d.B += len;
        d.C += len;
        if (this.c()) {
            this.Code.flush();
        }
        this.Code = System.currentTimeMillis();
    }
    
    private void B(final int off, final int len) {
        this.Code.readFully(this.B, off, len);
        d.B += len;
        d.C += len;
    }
    
    private boolean c() {
        return this.I[this.I].startsWith("socket://");
    }
    
    private void Code(final f f, final byte[] array) {
        String str;
        final int index;
        String substring;
        if ((index = (str = this.I[this.I]).indexOf(59)) >= 0) {
            substring = str.substring(index);
            str = str.substring(0, index);
        }
        else {
            substring = "";
        }
        d.U = this.L;
        d.aP = this.C;
        if (this.c()) {
            if (this.Code == null) {
                final SocketConnection code = (SocketConnection)Connector.open(str + substring, 3, d.be ^ true);
                this.Code = (Connection)code;
                if (d.bg) {
                    code.setSocketOption((byte)1, 0);
                }
                this.Code = ((OutputConnection)code).openDataOutputStream();
                this.I = this.Code;
                this.Code = ((InputConnection)code).openDataInputStream();
                this.I = this.Code;
            }
            this.B(array, array.length);
            this.J(f);
            return;
        }
        String s = "";
        String s2;
        if (f != null) {
            final Object[] code2;
            s2 = (String)(code2 = f.Code())[53];
            s = (String)code2[42];
        }
        else {
            s2 = "server:test";
        }
        if ((this.C.H & 0x2) != 0x0) {
            String s3 = Z(s2, s);
            if (s2 != null && (s2.startsWith("b:") || s2.startsWith("javascript:"))) {
                s3 = Z((String)f.Code()[38], (String)null);
            }
            else if ("".equals(s3)) {
                if (s2 != null) {
                    s3 = s2;
                }
                else {
                    s3 = "internal";
                }
            }
            str += s3;
        }
        final HttpConnection code3 = (HttpConnection)Connector.open(str + substring, 3, d.be ^ true);
        ((HttpConnection)(this.Code = (Connection)code3)).setRequestMethod("POST");
        if (str.startsWith("http://10.0.0.172")) {
            code3.setRequestProperty("X-Online-Host", Code(this.Z())[0]);
        }
        code3.setRequestProperty("Content-Type", "application/xml");
        this.Code = ((OutputConnection)code3).openDataOutputStream();
        this.I = this.Code;
        this.B(array, array.length);
        this.J(f);
        this.Code.close();
        this.Code = null;
        this.Code = ((InputConnection)code3).openDataInputStream();
        this.I = this.Code;
        final int responseCode;
        if ((responseCode = code3.getResponseCode()) == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
            this.F = 1;
            final String headerField;
            if (f != null && this.C.B() && (headerField = code3.getHeaderField("Location")) != null && headerField.length() > 0) {
                if (f.Code(headerField)) {
                    this.Z(f);
                    I(f);
                    D();
                }
                else {
                    f.close();
                }
            }
            this.C(false);
            return;
        }
        if (responseCode == 403) {
            this.F = 2;
            try {
                final StringBuffer sb = new StringBuffer();
                int n = 0;
                int read;
                while ((read = this.Code.read()) > 32 && ++n <= 256) {
                    sb.append((char)read);
                    if (n == 4 && !sb.toString().toLowerCase().equals("http")) {
                        sb.setLength(0);
                        break;
                    }
                }
                if (sb.length() > 0) {
                    d.f = sb.toString();
                }
                else {
                    d.f = null;
                }
            }
            finally {}
            this.Code(false, 4);
            Code.Code.I(I(62));
        }
    }
    
    d(int d, final d code) {
        this.h = true;
        this.d = true;
        this.c = true;
        this.Code = new Vector(30);
        this.G = -1;
        this.P = -1;
        this.a = false;
        this.e = "";
        this.Code = false;
        this.e = new Vector();
        this.f = new Vector();
        this.g = new Vector();
        this.ac = -1;
        this.ad = 0;
        this.ae = Integer.MAX_VALUE;
        this.I = 0L;
        this.af = -1;
        this.Code = null;
        this.Z = false;
        this.ag = 0;
        this.ah = 0;
        this.aN = false;
        this.D = d;
        this.Code = code;
        if (d == 16) {
            this.au = J(0);
            this.av = this.au + 5;
            final Image code2 = Code(Code.J, 0, Code.J.length, 256, null);
            this.Z = code2;
            this.I = code2;
            this.aR = (Code.f > 128);
            this.aw = Math.max(this.au, this.Z.getHeight()) + 5;
            d = ((code.Code != null && Code(code.Code.Code) == 65) ? 1 : 0);
            if (code.Code != null && code.Code.Code != null && Code(code.Code.Code) == -1 && !code.Code.C && !code.Code.Code.startsWith("myopera:") && !code.Code.Code.startsWith("feed:") && !code.Code.Code.startsWith("sk:") && !code.Code.Code.startsWith("share:")) {
                this.Code = new StringBuffer(code.Code.Code);
                this.aN = true;
            }
            else {
                String str = "www.";
                if (d != 0) {
                    code.Code.Z(true);
                    final String value;
                    if ((value = code.Code.Code.get("o:a")) != null && value instanceof String) {
                        str = value;
                    }
                }
                this.Code = new StringBuffer(str);
                this.ag = this.Code.length();
            }
            if (d == 0) {
                this.ab = (int)System.currentTimeMillis();
                Code.f();
                this.L = -this.aw - 9;
            }
        }
        this.I();
    }
    
    private static String Z(String s, String str) {
        String string = null;
        String s2 = null;
        Label_0111: {
            if ((s = s) == null) {
                s2 = (string = null);
            }
            else {
                final int length = s.length();
                final int index = s.indexOf(":/");
                final int index2 = s.indexOf(58);
                if (index >= 0 && index <= 10) {
                    s2 = (string = s);
                }
                else {
                    if (index2 != -1 && index == -1) {
                        if (index2 + 1 == length) {
                            s2 = (string = s);
                            break Label_0111;
                        }
                        final char char1;
                        if ((char1 = s.charAt(index2 + 1)) < '0' || char1 > '9') {
                            s2 = (string = s);
                            break Label_0111;
                        }
                    }
                    s2 = (string = "http://" + s);
                }
            }
        }
        s = string;
        if (s2 == null) {
            return "";
        }
        final int index3 = s.indexOf("https://");
        final int index4 = s.indexOf(47, index3 + 8);
        final StringBuffer sb = new StringBuffer(s);
        if (str != null && str.length() > 0 && index3 == -1) {
            final int index5;
            if ((index5 = str.indexOf("={\"c\":")) != -1) {
                str = str.substring(0, index5);
            }
            str = J(str);
            sb.append('?').append(str);
        }
        if (index3 != -1 && index4 != -1) {
            sb.delete(index4, sb.length());
        }
        int n = 0;
        int n2 = 0;
        for (int i = sb.length() - 1; i >= 0; --i) {
            final char char2;
            if ((char2 = sb.charAt(i)) < '!' || char2 > '~' || "\"#;<>[]^`{|}~\\".indexOf(char2) >= 0) {
                sb.deleteCharAt(i);
            }
            else {
                if (char2 == '=') {
                    n = 1;
                }
                else if (char2 == '&') {
                    n2 = (n = 0);
                }
                else if (char2 == '.') {
                    n2 = 1;
                }
                if (i > s.length() && n != 0 && n2 != 0) {
                    sb.deleteCharAt(i);
                }
            }
        }
        sb.setLength(127);
        if (sb.charAt(126) == '%') {
            sb.setLength(126);
        }
        else if (sb.charAt(125) == '%') {
            sb.setLength(125);
        }
        return sb.toString().trim();
    }
    
    private String Z(final String prefix) {
        final StringBuffer sb = new StringBuffer();
        while (true) {
            this.B(0, 1);
            if (this.B[0] == 13) {
                this.B(0, 1);
            }
            if (this.B[0] == 10) {
                if (sb.length() == 0) {
                    if (prefix != null) {}
                    return null;
                }
                final String string;
                final int index;
                if (prefix != null && (index = (string = sb.toString()).indexOf(58)) >= 0 && string.toLowerCase().startsWith(prefix)) {
                    return string.substring(index + 1).trim();
                }
                sb.setLength(0);
            }
            else {
                sb.append((char)this.B[0]);
            }
        }
    }
    
    private static void Z(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        Code(graphics, n + 1, n2, n3 - 2, n4, d.Code[17]);
        graphics.drawLine(n, n2 + 1, n, n2 + n4 - 2);
        graphics.drawLine(n + n3 - 1, n2 + 1, n + n3 - 1, n2 + n4 - 2);
    }
    
    private static void I(final Graphics graphics, final int n, final int n2, int n3, final int n4) {
        graphics.setColor(d.Code[20]);
        graphics.drawLine(n, n3, n2, n3);
        final int n5;
        graphics.drawLine(n, n5 = n3 + n4, n2, n5);
        final int n6;
        graphics.drawLine(n + 1, n6 = n5 + n4, n2 - 1, n6);
        final int n7;
        graphics.drawLine(n + 2, n7 = n6 + n4, n2 - 2, n7);
        final int n8 = n + 4;
        final int n9 = n7 + n4;
        graphics.drawLine(n8, n9, n2 - 4, n9);
        graphics.setColor(d.Code[3]);
        graphics.drawLine(n + 1, n3, n2 - 1, n3);
        graphics.drawLine(n + 1, n3 += n4, n2 - 1, n3);
        graphics.drawLine(n + 2, n3 += n4, n2 - 2, n3);
        final int n10 = n + 4;
        final int n11 = n3 + n4;
        graphics.drawLine(n10, n11, n2 - 4, n11);
    }
    
    private void H() {
        this.F();
        this.c.y();
        final int n = ((this.B[1] & 0xFF) << 2) + 128;
        final int n2 = this.B[2] & 0xFF;
        this.B(5, n2 + 166 + n);
        this.E();
        this.c.I = new byte[n2 + 1];
        d.b = this.c.I;
        System.arraycopy(this.B, 2, this.c.I, 0, n2 + 1);
        final int[] code = Code(this.B, n2 + 3, 160);
        final int[] code2 = Code(this.B, n2 + 163, n);
        final d c = this.c;
        final byte[] b = this.B;
        final int n3 = n2 + 163 + n;
        c.a = ((long)Z(b, n3) << 32 | ((long)Z(b, n3 + 4) & 0xFFFFFFFFL));
        this.c.B = code;
        this.c.C = code2;
        if (!d.aH) {
            d.b = System.currentTimeMillis() - (this.c.a - 1209600000L);
            d.aH = true;
        }
    }
    
    private static synchronized void I(final DataInputStream dataInputStream) {
        d.aM = dataInputStream.readBoolean();
        d.C = dataInputStream.readByte();
        d.a = dataInputStream.readByte();
        final String utf;
        d.w = (((utf = dataInputStream.readUTF()).length() == 0) ? null : utf);
        final String utf2;
        d.v = (((utf2 = dataInputStream.readUTF()).length() == 0) ? null : utf2);
        d.Code = dataInputStream.readByte();
        for (byte byte1 = dataInputStream.readByte(), b = 0; b < byte1; ++b) {
            final String utf3 = dataInputStream.readUTF();
            final d d;
            (d = new d(Code(dataInputStream))).a = dataInputStream.readLong();
            dataInputStream.readFully(d.Z);
            final int unsignedByte;
            if ((unsignedByte = dataInputStream.readUnsignedByte()) != 0) {
                dataInputStream.readFully(d.I = new byte[unsignedByte]);
                d.b = d.I;
            }
            d.B = Code(dataInputStream);
            d.C = Code(dataInputStream);
            if (!d.J()) {
                final Object[] value;
                (value = new Object[2])[0] = d;
                value[1] = "";
                d.Code.put(utf3, value);
            }
        }
    }
    
    final void Z(int n, int n2) {
        if (this.Code(16)) {
            if (n2 - this.H < this.at && this.ai < this.at) {
                if (this.aN || this.e.size() == 0) {
                    this.aN = false;
                    this.Z(true);
                    this.e();
                }
                else if (this.ac >= 0 && this.ac < this.e.size() - 2) {
                    this.Code = new StringBuffer(this.e.elementAt(this.ac));
                    this.Z(true);
                    this.e();
                }
                int ag;
                for (n2 = this.O + 4 + this.ar + this.ah, ag = 0; ag < this.Code.length && Code(0, this.Code, 0, ag) + Code(0, this.Code[ag], true) / 2 + n2 < n; ++ag) {}
                this.ag = ag;
                this.ac = -1;
                this.e();
                a();
                return;
            }
            if (!this.aQ) {
                n = (this.ai - this.at) / this.av;
                n2 = (n2 - this.H - this.at) / this.av;
                if (n == n2 && n2 >= 0 && n2 < this.ao) {
                    if (this.ac == n2 + this.ad) {
                        this.a(-5, 0);
                    }
                    else {
                        this.ac = n2 + this.ad;
                        this.e();
                    }
                }
                a();
            }
        }
        else if (this.Code != null) {
            this.Code.Z(n - this.O, n2 - this.H);
        }
    }
    
    final void J() {
        this.Code = new Vector(30);
        final int n = -1;
        this.P = n;
        this.G = n;
    }
    
    final int a() {
        return Code(this.Code.f(), 0, this.F - 1);
    }
    
    final int I() {
        return this.F;
    }
    
    final int C() {
        return Code(this.Code.e(), 0, this.N - 1);
    }
    
    final int Code() {
        return this.N;
    }
    
    final void I() {
        this.O = 0;
        this.H = (Code.Code.Z() ? Code.d : 0);
        this.E = Code.f;
        this.F = Code.g - (Code.Code.J() ? Code.c : 0) - this.H;
        final int e = this.E;
        this.N = e;
        this.K = e;
        int b = 0;
        int c = 0;
        if (this.Code != null) {
            b = this.Code.B();
            c = this.Code.C();
        }
        if (this.Code(16)) {
            this.E = this.Code.K;
            final int e2 = this.E;
            this.N = e2;
            this.K = e2;
            if (this.e.size() > 0) {
                this.Z(false);
            }
            this.e();
        }
        else if (this.Code(2)) {
            final int n = d.ae ? 0 : Code.c;
            this.K = this.E;
            final int n2 = b;
            this.N = n2;
            this.E = n2;
            this.F = Math.min(c, Code.g);
            int n3;
            int a;
            if (this.Code.Code(2)) {
                if ((n3 = this.Code.O + this.Code.E - 6) + this.E > Code.f && this.Code.O - this.E + 6 >= 0) {
                    n3 = this.Code.O - this.E + 6;
                }
                if ((a = this.Code.H + this.Code.a() - 10) + this.F > Code.g - n) {
                    a += 20 - this.F;
                }
            }
            else if (this.Code == null || Code(this.Code.Code) != 123) {
                n3 = (d.M ? (Code.f - this.E) : 0);
                if (d.M) {
                    a = Code.d - 4;
                }
                else {
                    a = Code.g + 4;
                }
            }
            else {
                n3 = this.Code.O + this.Code.C();
                a = this.Code.H + this.Code.a();
            }
            this.O = Code(n3, 0, Code.f - this.E);
            this.H = Code((d.M && this.e()) ? a : Math.max(a, this.H), 0, Code.g - n - this.F + 4);
        }
        if (this.Code(8)) {
            this.K = Code.f * 9 / 10;
            final int min = Math.min(b, this.K);
            this.N = min;
            this.E = min;
            this.F = Math.min(c, (Code.g << 3) / 10);
            if (c > this.F) {
                this.E += 4;
            }
            this.O = (Code.f - this.E) / 2;
            this.H = (Code.g - this.F) / 2;
            if (this.Code != null) {
                this.Code.I(this.F - this.I(false));
            }
        }
        if (this.Code(1) && (this.Code == null || this.N != this.Code.getWidth() || this.F != this.Code.getHeight())) {
            this.Code = null;
            final int n4 = this.N;
            final int f = this.F;
            try {
                this.Code = Image.createImage(n4, f);
                this.aO = true;
            }
            finally {}
        }
        if (this.Code != null) {
            this.Code.Code(0, 0, false, false);
        }
    }
    
    private void M() {
        final B code;
        if ((code = this.Code()) != null && code.C != 5 && !code.Code()) {
            code.B();
        }
    }
    
    final void Code(final String s, final Hashtable hashtable) {
        if (this.Code == null) {
            return;
        }
        this.L();
        this.Code(null, this.Code.J, false, true, hashtable, s);
    }
    
    final boolean Code(final d d) {
        return d.Code(this.O, this.H) && d.Code(this.O + this.E, this.H + this.E);
    }
    
    private void Code(final Object[] array, final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4, final Hashtable hashtable) {
        this.L();
        final B code = B.Code(array);
        if (b || code == null) {
            this.Code(array, s, b2, b3, hashtable, null);
            return;
        }
        code.Code(array);
        this.Code(code, b4);
        this.Code(code);
    }
    
    final int J() {
        return this.F;
    }
    
    final void I(final Graphics graphics) {
        Code(graphics, this.O, this.H, this.N, this.F);
        this.Code.I(graphics, this.O, this.H);
    }
    
    private void K() {
        this.Code.Code.put("s", "1");
        this.Code(this.Code.Code, this.Code.Code, this.Code.Code(), this.Code.I);
    }
    
    private void J(final Graphics graphics) {
        if (this.Code == null) {
            return;
        }
        final boolean e = this.e();
        final int n = this.H + 4 - this.Code.d();
        final int n2 = this.Code.b() - 8;
        Code(graphics, this.O, n, this.E, n2, d.Code[3]);
        if (!e || !d.M) {
            if (n > 0) {
                if (d.r) {
                    int o = this.O;
                    final int n3 = n - 4 - 6;
                    final int n4 = this.O + this.E - 4;
                    if (!e) {
                        o += 4;
                        graphics.drawImage(Code.Z, this.O - 6, n3, 0);
                    }
                    for (int i = o; i < n4; ++i) {
                        graphics.drawImage(Code.J, i, n3, 0);
                    }
                    graphics.drawImage(Code.B, n4, n3, 0);
                }
                else {
                    I(graphics, this.O, this.O + this.E - 1, this.H + 3, -1);
                    if (e) {
                        Code(graphics, this.O, this.H, 4, 4, d.Code[3]);
                        graphics.setColor(d.Code[20]);
                        graphics.drawLine(this.O, this.H - 1, this.O + 3, this.H - 1);
                    }
                }
            }
            if (d.r) {
                for (int j = n; j < n + n2; ++j) {
                    graphics.drawImage(Code.a, this.O + this.E, j, 0);
                }
            }
            else {
                graphics.setColor(d.Code[20]);
                graphics.drawLine(this.O + this.E, n, this.O + this.E, n + n2 - 1);
            }
        }
        if (!e || d.M) {
            final int n5 = n + n2;
            if (d.r) {
                final int n6 = this.O + 4;
                int n7 = this.O + this.E;
                if (!e) {
                    n7 -= 4;
                    graphics.drawImage(Code.b, n7, n5, 0);
                }
                for (int k = n6; k < n7; ++k) {
                    graphics.drawImage(Code.c, k, n5, 0);
                }
                graphics.drawImage(Code.d, this.O - 6, n5, 0);
            }
            else {
                I(graphics, this.O, this.O + this.E - 1, n5, 1);
                if (e) {
                    Code(graphics, this.O + this.E - 4, n5, 4, 4, d.Code[3]);
                    graphics.setColor(d.Code[20]);
                    graphics.drawLine(this.O + this.E - 4, n5 + 4, this.O + this.E + 1, n5 + 4);
                }
            }
            if (d.r) {
                for (int l = n; l < n + n2; ++l) {
                    graphics.drawImage(Code.C, this.O - 6, l, 0);
                }
                return;
            }
            graphics.setColor(d.Code[20]);
            graphics.drawLine(this.O - 1, n, this.O - 1, n5 - 1);
        }
    }
    
    final void I(final int n) {
        if (this.Code != null) {
            this.Code.Code(n);
        }
    }
    
    static void Code(final StringBuffer sb, int n, int n2, final boolean b) {
        if (n < 0) {
            sb.append('?');
            return;
        }
        boolean b2 = true;
        if (n2 >= d.aE) {
            n2 = d.aE;
            b2 = false;
        }
        else if (n2 >= d.aD) {
            n2 = d.aD;
            b2 = false;
        }
        else if (n2 >= d.aC / 2) {
            n2 = d.aC;
        }
        else {
            n2 = 1;
        }
        final int i = n / n2;
        n -= i * n2;
        if (b2) {
            n = i + ((n << 1 >= n2) ? 1 : 0);
            sb.append(n);
        }
        else {
            n = n * 10 / n2;
            sb.append(i);
            if (i > 0 || n > 0) {
                sb.append('.').append(n);
            }
        }
        if (b) {
            sb.append(' ');
            if (n2 >= d.aE) {
                sb.append('G');
            }
            else if (n2 >= d.aD) {
                sb.append('M');
            }
            else if (n2 >= d.aC) {
                sb.append('k');
            }
            sb.append('B');
        }
    }
    
    final boolean Code(final boolean b) {
        if (this.af != -1 && (b || System.currentTimeMillis() - this.I >= 1000L)) {
            this.Code.insert(this.ag, (char)this.af);
            ++this.ag;
            this.af = -1;
            return true;
        }
        return false;
    }
    
    final void Code(final int n, final int n2, final String str) {
        this.Code.Code();
        final Object[] i;
        final int index;
        if ((index = ((String)(i = this.Code.I())[0]).indexOf(35)) >= 0) {
            i[0] = ((String)i[0]).substring(0, index);
        }
        i[0] = i[0] + "#" + str;
        final int[] array2;
        final int[] array = array2 = (int[])i[7];
        final int n3 = 2;
        array[n3] += n - array2[0];
        final int[] array3 = array2;
        final int n4 = 3;
        array3[n4] += n2 - array2[1];
        array2[0] = n;
        array2[1] = n2;
        this.Code(i, null, false, false, false, false, null);
    }
    
    static void a() {
        if (d.Q) {
            g.Code();
            return;
        }
        Code.Code.repaint();
    }
    
    private void L() {
        this.M();
        if (this.Code != null) {
            this.Code.h();
        }
    }
    
    final void Code(final boolean b, final boolean b2, final Hashtable hashtable) {
        if (this.Code == null) {
            return;
        }
        this.Code(this.Code.Code(), this.Code.J, true, b2, b, false, hashtable);
    }
    
    private void C(int n, final int n2) {
        final boolean b = n < 0;
        if (n == -1 && this.Code != null && this.Code.B) {
            n = 0;
        }
        if (!this.I(n)) {
            if (n2 > 0) {
                Code.Code.I(I(n2));
            }
            return;
        }
        this.P = this.G + n;
        this.Code(this.Code.elementAt(this.P), null, false, false, this.a, b, null);
    }
    
    private static int J(String s) {
        final int index;
        if ((index = (s = I(s)).indexOf(58)) != -1) {
            s = s.substring(0, index);
        }
        return Integer.parseInt(s);
    }
    
    final boolean I(int n) {
        if (n == -1 && this.Code != null && this.Code.B) {
            n = 0;
        }
        return this.G + n >= 0 && this.G + n < this.Code.size();
    }
    
    private void Code(final B code, final boolean b) {
        boolean b2 = true;
        if (code == null) {
            return;
        }
        if (this.Code != code) {
            if (this.Code != null) {
                this.Code.Code();
                if (this.Code != null) {
                    final Graphics graphics = this.Code.getGraphics();
                    this.X = 0;
                    Code(graphics, this.Y = 0, 0, this.Code.getWidth(), this.Code.getHeight(), 16777215);
                    if (!d.Q) {
                        this.Code.Z(graphics, -this.Code.c(), -this.Code.d());
                    }
                    if (this.J) {
                        this.aO = true;
                        this.J = false;
                    }
                    else {
                        g.I = true;
                        this.W = ((this.P < this.G || (this.G >= 0 && this.Code.B)) ? (-this.Code.getWidth()) : this.Code.getWidth());
                        this.aa = this.W;
                        this.ab = (int)System.currentTimeMillis();
                    }
                }
                if (!d.n) {
                    Code.Code.I(false);
                }
                this.I(0);
                B b3;
                boolean i;
                if (!d.au) {
                    b3 = code;
                    i = false;
                }
                else if (code.c && !b && d.au && !code.Code) {
                    b3 = code;
                    i = true;
                }
                else if (code.Code) {
                    b3 = code;
                    i = (code.Code != null && code.Code[4] == 1);
                }
                else {
                    b3 = code;
                    i = code.I();
                }
                b3.I(i);
                code.e();
                this.M = code.c();
                this.V = code.d();
            }
            else if (!b) {
                code.I(true);
            }
            code.e();
            if (b && this.Code != null && Code(this.Code.Code) == 73) {
                b2 = false;
            }
            (this.Code = code).J();
            g.J();
            Code.f();
        }
        if (b2) {
            final Object[] code2;
            Code.Code(code2 = this.Code.Code());
            if (!this.Code.B) {
                if (!this.Code.Code()) {
                    (d.Code = Code())[1] = this.Code.I;
                    d.Code[0] = this.Code.Code;
                    d.Code[2] = this.Code.Code;
                }
                if (this.P == this.G) {
                    boolean b4 = false;
                    if (this.G >= 0) {
                        final Object[] array = this.Code.elementAt(this.G);
                        if (this.Code.Code() && array != null && code2 != null && array.length > 0 && code2.length > 0 && code2[0] != null && code2[0].equals(array[0])) {
                            b4 = true;
                        }
                    }
                    if (!this.Code.Code && !b4 && this.Code.c) {
                        ++this.G;
                        this.Code.setSize(this.G + 1);
                    }
                    if (this.G > 30) {
                        this.Code.removeElementAt(0);
                        --this.G;
                    }
                    this.P = this.G;
                }
                this.G = this.P;
                this.Code.setElementAt(code2, this.G);
            }
            for (int j = 0; j < this.Code.size(); ++j) {}
            for (int k = 0; k < Code.I.size(); ++k) {}
        }
        if (this.Code != null) {
            this.Code.I();
        }
    }
    
    private int Code(final byte[] array, final int n, int m) {
        this.W = 0;
        if (this.M == this.Y) {
            this.M = 0;
        }
        final int n2 = m;
        m = this.Y - this.M;
        final int n3 = n2;
        m = ((n2 < m) ? n3 : m);
        this.D = this.M + m;
        m = this.M;
    Label_0605:
        while (this.D != this.M && this.aa < this.ab) {
            switch (this.G) {
                case 7: {
                    return 0;
                }
                case 0: {
                    this.X = 0;
                    this.V = this.C(16);
                    this.C(16);
                    this.G = 3;
                }
                case 3: {
                    while (this.V > 0) {
                        --this.V;
                        this.I[this.M++] = (byte)this.e();
                        if (this.D == this.M) {
                            break Label_0605;
                        }
                    }
                    break;
                }
                case 1: {
                    int i;
                    for (i = 0; i < 144; ++i) {
                        this.B[i] = 8;
                    }
                    while (i < 256) {
                        this.B[i] = 9;
                        ++i;
                    }
                    while (i < 280) {
                        this.B[i] = 7;
                        ++i;
                    }
                    while (i < 288) {
                        this.B[i] = 8;
                        ++i;
                    }
                    Code(this.B, 288, this.Code);
                    for (int j = 0; j < 32; ++j) {
                        this.B[j] = 5;
                    }
                    Code(this.B, 32, this.I);
                    this.G = 4;
                }
                case 4: {
                    if (this.h()) {
                        break Label_0605;
                    }
                    break;
                }
                case 2: {
                    final int n4 = this.C(5) + 257;
                    final int n5 = this.C(5) + 1;
                    final int n6 = this.C(4) + 4;
                    for (int k = 0; k < 19; ++k) {
                        int n7;
                        if (k < 3) {
                            n7 = k + 16;
                        }
                        else if (k == 3) {
                            n7 = 0;
                        }
                        else if ((k & 0x1) == 0x1) {
                            n7 = 7 - (k - 5 >>> 1);
                        }
                        else {
                            n7 = 8 + (k - 4 >>> 1);
                        }
                        this.B[n7] = (byte)((k < n6) ? ((byte)this.C(3)) : 0);
                    }
                    final short[] array2 = new short[36];
                    Code(this.B, 19, array2);
                    Code(this.Code(array2, n4), n4, this.Code);
                    Code(this.Code(array2, n5), n5, this.I);
                    this.G = 5;
                }
                case 5: {
                    if (!this.h()) {
                        break;
                    }
                    break Label_0605;
                }
            }
            if (this.O == 1) {
                this.G = 7;
                break;
            }
            this.O = this.C(1);
            this.G = this.C(2);
        }
        if (array != null) {
            System.arraycopy(this.I, m, array, n, this.M - m);
        }
        return this.M - m;
    }
    
    final void e() {
        this.u = this.Code.toString();
        ((StringBuffer)(Object)(this.Code = new char[this.Code.length()])).getChars(0, this.Code.length(), this.Code, 0);
        this.ag = Math.min(this.ag, this.Code.length());
        this.ak = Code(0, this.u);
        this.al = ((this.af == -1) ? 0 : Code(0, (char)this.af, true));
        this.am = Code(0, this.Code, 0, this.ag);
        this.at = this.aw + 4;
        this.an = (this.F - this.at - 7) / this.av;
        this.ao = Math.min(this.an, this.e.size());
        this.ap = 2 + this.ao * this.av;
        final byte[] array;
        if ((array = (byte[])((this.ac >= 0 && this.ac < this.e.size() - 1) ? ((byte[])this.g.elementAt(this.ac)) : null)) == null) {
            this.I = this.Z;
        }
        else {
            this.I = Code(array, (Object)array);
        }
        this.aq = this.E - 10;
        this.ar = (this.aR ? (this.Z.getWidth() + 5) : 2);
        this.as = Math.max(Code(0, 'M', true), this.aq / 10) + 2;
        this.ah = Code(this.ah, -this.am, this.aq - this.ar - this.as - this.am - this.al);
        this.ah = Math.max(this.ah, Math.min(0, this.aq - this.ar - this.as - this.ak));
        this.ad = Code(this.ad, this.ac - this.ao + 1, Code(this.ac, 0, this.e.size() - this.ao));
    }
    
    final void Code(final String str) {
        this.Code = new StringBuffer(str);
        this.Z(true);
        this.ag = this.Code.length();
        this.e();
    }
    
    final void I(int n, int ai) {
        final boolean code = this.Code(16);
        this.aQ = false;
        if (this.Code == null && !code) {
            return;
        }
        n -= this.O;
        ai -= this.H;
        if (!code) {
            if (n < this.N && ai < this.F) {
                this.Code.I(n, ai);
            }
            return;
        }
        if (this.af != -1 && this.Code(true)) {
            this.Z(true);
            this.e();
            return;
        }
        this.ai = ai;
        this.aj = this.ad;
    }
    
    final void J(int n, int n2) {
        this.J = -1;
        final boolean code = this.Code(16);
        n -= this.O;
        n2 -= this.H;
        if (code) {
            if (n2 > this.at && Math.abs(n2 - this.ai) > 6) {
                this.aQ = true;
                this.ad = Code(this.aj - 2 * (n2 - this.ai) / this.av, 0, this.e.size() - this.ao);
            }
            a();
            return;
        }
        if (this.Code != null) {
            this.Code.J(n, n2);
        }
    }
    
    final boolean Code(final int n, final int n2) {
        if (this.Code(16)) {
            return n >= this.O && n <= this.O + this.E && n2 >= this.H && n2 <= this.H + this.at + this.ap;
        }
        return n >= this.O && n <= this.O + this.E && n2 >= this.H && n2 <= this.H + this.F;
    }
    
    private int Code(final boolean b) {
        if (!b) {
            return this.V * (this.F - this.I(false)) / Math.max(Math.max(this.Code.b(), this.F) - this.F, 1);
        }
        final int n = this.at + 1;
        if (this.ad < 0) {
            return n;
        }
        return n + (this.ap - this.I(true)) * this.ad / (this.e.size() - this.ao);
    }
    
    private static boolean I(final String s, final String s2) {
        return I(s, s2) != null;
    }
    
    private int I(final boolean b) {
        if (b) {
            return Math.max(this.ap * this.ao / this.e.size(), d.n ? Math.max(this.ap >> 3, 5) : 5);
        }
        return Math.max(this.F * this.F / Math.max(this.Code.b(), this.F), d.n ? Math.max(this.F >> 3, 5) : 5);
    }
    
    final void Code(final Graphics graphics) {
        if (this.D == 2) {
            this.J(graphics);
        }
        if (this.D == 16) {
            final int n = this.H + this.L;
            if (this.Code == null) {
                this.Code = new g(33);
                this.Code.Code = this;
                Code.Code.Code.schedule(this.Code, 100L, 100L);
            }
            if (this.Code.Code != null && Code(this.Code.Code.Code) != 65) {
                Code(graphics, this.O, n, this.E, this.aw + 10, d.Code[59], d.Code[60]);
                if (Code.Code.I != null) {
                    Code(graphics, this.O, n, this.E, this.F);
                    graphics.drawImage(Code.Code.I, this.O, n + this.aw + 9, 0);
                    Z(graphics);
                }
            }
            else {
                Code(graphics, this.O, n, this.E, this.aw + 9, d.Code[61]);
            }
            Code(graphics, this.O + 3, n + 5, this.aq + 4, this.aw, d.Code[16]);
            graphics.setColor(d.Code[7]);
            graphics.drawLine(this.O + 4, n + 5, this.O + 5 + this.aq, n + 5);
            graphics.drawLine(this.O + 4, n + 4 + this.aw, this.O + 5 + this.aq, n + 4 + this.aw);
            graphics.drawLine(this.O + 3, n + 5, this.O + 3, n + 4 + this.aw);
            graphics.drawLine(this.O + 6 + this.aq, n + 5, this.O + 6 + this.aq, n + 4 + this.aw);
            graphics.setColor(d.Code[4]);
            graphics.drawLine(this.O + 4, n + 6, this.O + 3 + this.aq + 2, n + 6);
            graphics.setColor(d.Code[5]);
            graphics.drawLine(this.O + 4, n + 7, this.O + 3 + this.aq + 2, n + 7);
            graphics.setColor(d.Code[6]);
            graphics.drawLine(this.O + 4, n + 8, this.O + 3 + this.aq + 2, n + 8);
            final int max = Math.max(0, (this.aw - this.I.getHeight()) / 2 + 1);
            final int n2 = (this.Z.getWidth() - this.I.getWidth()) / 2;
            if (this.aR) {
                if (this.I == this.Z) {
                    graphics.drawImage(this.I, this.O + 6, n + 5 + max, 20);
                }
                else {
                    graphics.drawImage(this.I, this.O + 6 + n2, n + 5 + max, 20);
                }
            }
            if (this.af != -1) {
                graphics.setColor(d.Code[62]);
                graphics.fillRect(this.O + 3 + this.ar + this.ah + this.am, n + 8, this.al + 2, this.au);
                final char[] array = { (char)this.af };
                graphics.setColor(-16777216);
                Code(graphics, 0, array, 0, 1, this.O + 4 + this.ar + this.ah + this.am, n + 8);
                this.ak += this.al;
            }
            else if (!this.Z && !this.aN && this.ac == -1) {
                graphics.setColor(d.Code[63]);
                graphics.drawLine(this.O + 4 + this.ar + this.ah + this.am, n + 8, this.O + 4 + this.ar + this.ah + this.am, n + 7 + this.au);
            }
            Code(graphics, this.O + 4 + this.ar, n + 6, this.aq - this.ar + 2, this.av + 2);
            graphics.setColor(-16777216);
            if (this.al > 0 && this.ag < this.Code.length) {
                Code(graphics, 0, this.Code, 0, this.ag, this.O + 4 + this.ar + this.ah, n + 8);
                Code(graphics, 0, this.Code, this.ag, this.Code.length - this.ag, this.O + 4 + this.ar + this.ah + this.am + this.al, n + 8);
            }
            else {
                if (this.aN) {
                    Code(graphics, this.O + 4 + this.ar + this.ah, n + 8, this.ak, this.au + 1, d.Code[64]);
                    graphics.setColor(-16777216);
                }
                Code(graphics, 0, this.Code, 0, this.Code.length, this.O + 4 + this.ar + this.ah, n + 8);
            }
            final String s;
            final int z;
            if (this.af == -1 && this.ac >= 0 && this.ac < this.e.size() - 2 && (z = Z(s = this.e.elementAt(this.ac), this.u)) != -1) {
                Code(graphics, this.O + 4 + this.ar + this.ah + this.ak, n + 8, Code(0, s.substring(z + this.Code.length())), this.au + 1, d.Code[64]);
                graphics.setColor(-16777216);
                Code(graphics, 0, s.substring(z + this.Code.length()), this.O + 4 + this.ar + this.ah + this.ak, n + 8, 20);
            }
            Z(graphics);
            if (this.e.size() > 0) {
                Code(graphics, this.O + 3, n + this.at + 1, this.E - 7, this.ap - 1, d.Code[16]);
                graphics.setColor(d.Code[7]);
                graphics.drawRect(this.O + 3, n + this.at, this.E - 7, this.ap);
                if (d.r) {
                    final int n3 = this.O + 3;
                    final int n4 = n + this.at;
                    final int n5 = this.O + this.E - 3;
                    final int n6 = n4 + this.ap + 1;
                    graphics.drawImage(Code.e, n5, n4, 0);
                    for (int i = n4 + 4; i < n6; ++i) {
                        graphics.drawImage(Code.f, n5, i, 0);
                    }
                    graphics.drawImage(Code.g, n5, n6, 0);
                    for (int j = n3; j < n5; ++j) {
                        graphics.drawImage(Code.h, j, n6, 0);
                    }
                    graphics.drawImage(Code.i, n3 - 4, n6, 0);
                    for (int k = n4 + 4; k < n6; ++k) {
                        graphics.drawImage(Code.j, n3 - 4, k, 0);
                    }
                    graphics.drawImage(Code.k, n3 - 4, n4, 0);
                }
                int n7 = this.E - 8;
                if (this.ao < this.e.size()) {
                    n7 -= 4;
                    Z(graphics, this.O + this.N - 4 - 4, n + this.Code(true), 3, this.I(true) - 2);
                }
                for (int min = Math.min(this.ao, this.e.size()), l = 0; l < min; ++l) {
                    final int n9;
                    final int n8 = (n9 = n + this.at + 1 + l * this.av) + this.av;
                    final int n11;
                    final int n10 = (n11 = this.O + 4) + n7 - 1;
                    if (this.ac == l + this.ad) {
                        graphics.setColor(d.Code[10]);
                        graphics.drawLine(n11, n9, n10, n9);
                        Code(graphics, n11, n9 + 1, n7, this.av - 1, d.Code[11], d.Code[12]);
                        graphics.setColor(d.Code[13]);
                        graphics.drawLine(n11, n8 - 1, n10, n8 - 1);
                        graphics.setColor(d.Code[14]);
                        graphics.drawLine(n11, n8, n10, n8);
                        int color = -16777216;
                        if ((Code.Code[36] >> 8 & 0xFF) > 127) {
                            color = 16777215;
                        }
                        graphics.setColor(color);
                    }
                    else {
                        if (l + 1 < min) {
                            graphics.setColor(d.Code[15]);
                            graphics.drawLine(n11, n8, n10, n8);
                        }
                        graphics.setColor(-16777216);
                    }
                    String code;
                    if (this.f.elementAt(l + this.ad) == null) {
                        code = Code(0, this.e.elementAt(l + this.ad), n7 - 1, "...");
                        this.f.setElementAt(code, l + this.ad);
                    }
                    else {
                        code = this.f.elementAt(l + this.ad);
                    }
                    Code(graphics, 0, code, this.O + 6, n9 + (this.av - this.au) / 2, 20);
                }
            }
            return;
        }
        if (this.Code != null && this.Code.C >= 4) {
            // monitorenter(code2 = this.Code)
            final B code3 = this.Code;
            try {
                final int a = code3.c() - this.M;
                final int a2 = this.Code.d() - this.V;
                this.M += a;
                this.V += a2;
                Code(graphics, this.O, this.H, this.Code(), this.I());
                if (graphics.getClipWidth() > 0 && graphics.getClipHeight() > 0) {
                    if (this.Code != null) {
                        final Graphics graphics2 = this.Code.getGraphics();
                        this.X = (this.X + a) % this.Code.getWidth();
                        if (this.X < 0) {
                            this.X += this.Code.getWidth();
                        }
                        this.Y = (this.Y + a2) % this.Code.getHeight();
                        if (this.Y < 0) {
                            this.Y += this.Code.getHeight();
                        }
                        if (this.J == 117) {
                            this.aO = true;
                        }
                        if (this.aO || (a != 0 && a2 != 0) || (a2 != 0 && this.X != 0) || (a != 0 && this.Y != 0)) {
                            this.aO = true;
                        }
                        else {
                            this.Code.Code(this.W - this.M, -this.V);
                            int n12 = (a > 0) ? (this.Code.getWidth() - a) : 0;
                            int n13 = (a2 > 0) ? (this.Code.getHeight() - a2) : 0;
                            int g = (a2 == 0) ? Math.abs(a) : this.Code.getWidth();
                            int h = (a == 0) ? Math.abs(a2) : this.Code.getHeight();
                            if (g == 0) {
                                n12 = this.Code.e;
                                n13 = this.Code.f;
                                g = this.Code.g;
                                h = this.Code.h;
                            }
                            else if (this.Code.g > 0 && this.Code.h > 0 && Code(this.Code.e, this.Code.f, this.Code.g, this.Code.h, 0, 0, this.Code.getWidth(), this.Code.getHeight())) {
                                if (this.Code.e < n12) {
                                    g += n12 - this.Code.e;
                                    n12 = this.Code.e;
                                }
                                g = Math.max(n12 + g, this.Code.e + this.Code.g) - n12;
                                if (this.Code.f < n13) {
                                    h += n13 - this.Code.f;
                                    n13 = this.Code.f;
                                }
                                h = Math.max(n13 + h, this.Code.f + this.Code.h) - n13;
                            }
                            final int n14 = this.Code.getWidth() - this.X;
                            final int n15 = this.Code.getHeight() - this.Y;
                            if (n12 < n14 && n12 + g > n14) {
                                if (n13 < n15 && n13 + h > n15) {
                                    this.aO = true;
                                }
                                else {
                                    this.J(graphics2, n12, n13, n14 - n12, h);
                                    this.J(graphics2, n14, n13, g - n14 + n12, h);
                                }
                            }
                            else if (n13 < n15 && n13 + h > n15) {
                                this.J(graphics2, n12, n13, g, n15 - n13);
                                this.J(graphics2, n12, n15, g, h - n15 + n13);
                            }
                            else {
                                this.J(graphics2, n12, n13, g, h);
                            }
                        }
                        if (this.aO) {
                            this.aO = false;
                            if (this.W > 0) {
                                this.X = this.Code.getWidth() - this.W;
                            }
                            else {
                                this.X = -this.W;
                            }
                            this.Y = 0;
                            graphics2.setClip(Math.max(0, -this.W), 0, Math.min(this.Code.getWidth(), this.Code.getWidth() - this.W), this.Code.getHeight());
                            Code(graphics2, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 16777215);
                            this.Code.Z(graphics2, -this.M, -this.V);
                            this.N();
                        }
                        if (this.X != 0) {
                            graphics.drawImage(this.Code, this.O - this.X, this.H, 20);
                            Code(graphics, this.O + this.Code.getWidth() - this.X, this.H, this.X, this.I());
                            graphics.drawImage(this.Code, this.O + this.Code.getWidth() - this.X, this.H, 20);
                            Z(graphics);
                        }
                        else {
                            graphics.drawImage(this.Code, this.O, this.H - this.Y, 20);
                            Code(graphics, this.O, this.H + this.Code.getHeight() - this.Y, this.Code(), this.Y);
                            graphics.drawImage(this.Code, this.O, this.H + this.Code.getHeight() - this.Y, 20);
                            Z(graphics);
                        }
                    }
                    else {
                        this.W = 0;
                        if (this.Code(1) || this.Code(4)) {
                            Code(graphics, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight(), 16777215);
                        }
                        if (this.Code(8)) {
                            if (d.q) {
                                Code(graphics, this.O, this.H, this.Code(), this.F, 0xD9FFFFFF & d.Code[42], true);
                            }
                            else {
                                I(graphics, this.O, this.H, this.Code(), this.F, d.Code[43]);
                            }
                        }
                        this.Code.Z(graphics, this.O - this.M, this.H - this.V);
                        this.N();
                    }
                    this.Code.Code(graphics, this.O + this.W - this.M, this.H - this.V);
                }
                this.B(graphics);
                Z(graphics);
                return;
            }
            finally {
            }
            // monitorexit(code2)
        }
        Code(graphics, this.O, this.H, this.E, this.F, 16777215);
    }
    
    final void Z(final boolean b) {
        this.e = new Vector();
        this.g = new Vector();
        final String str = new String(this.Code);
        if (this.Code.length() > 0) {
            if (str.indexOf(32) < 0) {
                this.Code(str, Code.Code);
                this.Code(str, Code.I);
                this.Code(str, d.a);
                this.Code(str, d.J);
                if (this.Code.length() == 1 && this.Code.charAt(0) == 'w') {
                    this.e.insertElementAt("www.", 0);
                    this.g.insertElementAt(null, 0);
                }
                final int index = str.indexOf(46);
                final int index2 = str.indexOf("www.");
                if (d.x.length() > 0 && this.Code.charAt(this.Code.length() - 1) == '.' && (index != this.Code.length() - 1 || index < 3 || index2 == -1 || index2 == index - 4) && str.indexOf(47, index) == -1 && str.indexOf(32) == -1) {
                    int index3;
                    for (int n = 0; (index3 = d.x.indexOf(44, n)) != -1; n = index3 + 1) {
                        this.e.insertElementAt(str + d.x.substring(n, index3), 0);
                        this.g.insertElementAt(null, 0);
                    }
                }
            }
            this.e.addElement(Code(158, this.Code.toString()));
            this.g.addElement(Code(d.c, 0)[2]);
        }
        this.e.addElement(Code(159));
        this.g.addElement(null);
        Label_0417: {
            d d = null;
            int ac = 0;
            Label_0409: {
                if (this.e.size() == 0) {
                    d = this;
                }
                else {
                    if (!b) {
                        break Label_0417;
                    }
                    d = this;
                    if (this.e.size() > 2 || (this.e.size() == 2 && str.indexOf(32) >= 0)) {
                        ac = 0;
                        break Label_0409;
                    }
                }
                ac = -1;
            }
            d.ac = ac;
            this.ad = 0;
        }
        (this.f = new Vector()).setSize(this.e.size());
    }
    
    private void B(final byte[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            this.G = (this.G + 1 & 0xFF);
            this.Y = (this.I[this.G] + this.Y & 0xFF);
            final byte b = this.I[this.G];
            this.I[this.G] = this.I[this.Y];
            this.I[this.Y] = b;
            array[n + i] ^= this.I[this.I[this.G] + this.I[this.Y] & 0xFF];
        }
    }
    
    static void Code(final int n, final String anObject, final boolean b) {
        if (d.Code[n] == null || !d.Code[n].equals(anObject)) {
            d.Code[n] = anObject;
            if (n == 1 && b) {
                J(false);
            }
        }
    }
    
    private int d() {
        return Math.max(this.N * this.N / Math.max(this.Code.a(), this.N), 5);
    }
    
    final void b() {
        if (this.Code == null || this.aS) {
            return;
        }
        Code(this.Code.getGraphics(), 0, 0, this.Code.getWidth(), this.Code.getHeight(), 553648128, false);
        this.aS = true;
    }
    
    private void B(final Graphics graphics) {
        if (System.currentTimeMillis() > this.Code) {
            return;
        }
        Code(graphics, this.O, this.H, this.E, this.F);
        final int n = this.N;
        final int f = this.F;
        if (this.Code != null && this.Code.b() > this.F) {
            Z(graphics, this.O + n - 4, this.H + this.Code(false), 4, this.I(false));
        }
        if (this.Code != null && this.Code.a() > this.N) {
            Z(graphics, this.O + this.M * (this.N - this.d()) / Math.max(Math.max(this.Code.a(), this.N) - this.N, 1), this.H + f - 4, this.d(), 4);
        }
        Z(graphics);
    }
    
    final void c() {
        if (this.aS) {
            this.aO = true;
            this.aS = false;
        }
    }
    
    private void N() {
        if (this.aS) {
            this.aS = false;
            this.b();
        }
    }
    
    private void J(final Graphics graphics, int max, int n, int n2, int n3) {
        if (max < 0) {
            n2 += max;
            max = 0;
        }
        if (n < 0) {
            n3 += n;
            n = 0;
        }
        max += this.X;
        n += this.Y;
        int x = this.X;
        int y = this.Y;
        if (max >= this.Code.getWidth()) {
            max -= this.Code.getWidth();
            x -= this.Code.getWidth();
            n2 = Math.min(max + n2, this.X) - max;
        }
        if (n >= this.Code.getHeight()) {
            n -= this.Code.getHeight();
            y -= this.Code.getHeight();
            n3 = Math.min(n + n3, this.Y) - n;
        }
        max = Math.max(max, -this.W);
        graphics.setClip(max, n, n2, n3);
        if (graphics.getClipWidth() > 0 && graphics.getClipHeight() > 0) {
            Code(graphics, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 16777215);
            this.Code.Z(graphics, this.W + x - this.M, y - this.V);
            if (this.aS) {
                Code(graphics, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 553648128, false);
            }
        }
    }
    
    static void h() {
        if (d.aX) {
            return;
        }
        final Image code;
        if ((code = Code(6)) != null && code.getWidth() == 1) {
            d.aW = true;
            return;
        }
        d.aW = false;
    }
    
    static int b() {
        final boolean b = d.bh && Code.h > Code.i;
        if (d.d != 0) {
            return 0;
        }
        if (b) {
            return 0;
        }
        return d.c;
    }
    
    private static boolean B(final int n) {
        for (int i = d.Code.length - 1; i > 0; --i) {
            if (d.Code[i][0] == (char)n) {
                return d.Code[i].length > 2;
            }
        }
        return false;
    }
    
    static void d() {
        synchronized (Code.Code) {
            switch (b()) {
                case 2: {
                    d.Code = Code("\u0001\u0004\u00020 0\u00171./:_-~%$?=&!+#*@,;\\'()1\u0001**\u0001##");
                    break;
                }
                case 3: {
                    d.Code = Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                    break;
                }
                case 4: {
                    d.Code = Code("\u0001\u0002\u00020 0\u0000#");
                    break;
                }
                case 5: {
                    d.Code = Code("\u0001\u0003\u000100\u0001* \u0000#");
                    break;
                }
                case 6: {
                    d.Code = Code("\u0001\u0002\u00170./:_-~%$?=&!+#*@,;\\'()0\u0001# ");
                    break;
                }
                case 7: {
                    d.Code = Code("\u0001\u0003\u00170./:_-~%$?=&!+#*@,;\\'()0\u00021 1\u0000#");
                    break;
                }
                case 8: {
                    d.Code = Code("\u0001\u0002\u000100\u0001# ");
                    break;
                }
                case 9: {
                    d.Code = Code("\u0001\u0002\u000100\u0001# ");
                    break;
                }
                case 10: {
                    d.Code = Code("\u0002\u0000");
                    break;
                }
                default: {
                    d.Code = null;
                    break;
                }
            }
        }
    }
    
    private static char[][] Code(final String s) {
        char[][] code = null;
        switch (s.charAt(0)) {
            case '\u0001': {
                code = Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                break;
            }
            case '\u0002': {
                (code = new char[1][1])[0][0] = '\u0001';
                break;
            }
            case '\u0003': {
                (code = new char[25][])[0] = new char[1];
                code[0][0] = '\u0001';
                final String str = "QWERTYUIOPASDFGHJKZXCVBN";
                final String string = str + str.toLowerCase();
                for (int i = 1; i <= 24; ++i) {
                    (code[i] = new char[3])[0] = (code[i][1] = string.charAt(2 * (i - 1)));
                    code[i][2] = string.charAt(2 * (i - 1) + 1);
                }
                break;
            }
            default: {
                code = new char[1][1];
                break;
            }
        }
        final char char1;
        final char[][] array = new char[(char1 = s.charAt(1)) + code.length][];
        System.arraycopy(code, 0, array, 0, code.length);
        int srcBegin = 2;
        for (char c = '\0'; c < char1; ++c) {
            final int n = s.charAt(srcBegin++) + '\u0001';
            s.getChars(srcBegin, srcBegin + n, array[code.length + c] = new char[n], 0);
            srcBegin += n;
        }
        return array;
    }
    
    private static String B(String string) {
        final int index = string.indexOf(46);
        final int lastIndex = string.lastIndexOf(45, index - 1);
        final String s = string;
        final int beginIndex = lastIndex;
        final int endIndex = index;
        try {
            final int int1;
            if ((int1 = Integer.parseInt(s.substring(beginIndex, endIndex))) >= -255 && int1 < 0) {
                string = string.substring(0, lastIndex) + string.substring(index);
            }
            return string;
        }
        finally {
            return string;
        }
    }
    
    private static String Code(String string, final int i) {
        final int index;
        if ((index = string.indexOf(46)) > 0) {
            string = string.substring(0, index) + '-' + i + string.substring(index);
        }
        return string;
    }
    
    private static void Code(final byte[] array, final int n, final short[] array2) {
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = 0;
        }
        short n2 = 2;
        int n3 = 0;
        for (byte b = 1; b <= 16; ++b) {
            for (int j = 0; j < n; j = (short)(j + 1)) {
                if (array[j] == b) {
                    int n4 = 0;
                    for (int k = b - 1; k >= 0; --k) {
                        if ((n3 & 1 << k) != 0x0) {
                            ++n4;
                        }
                        if (k == 0) {
                            break;
                        }
                        if (array2[n4] == 0) {
                            array2[n4] = n2;
                            n4 = n2;
                            n2 += 2;
                        }
                        else {
                            n4 = array2[n4];
                        }
                    }
                    array2[n4] = (short)(j | 0x8000);
                    ++n3;
                }
            }
            n3 <<= 1;
        }
    }
    
    private static char[] Code(final int n) {
        final byte[] code;
        final char[] array = new char[(code = Code(n)).length / 2];
        int n2 = 0;
        for (int i = 0; i < code.length; i += 2) {
            array[n2++] = (char)(code[i] << 8 | (code[i + 1] & 0xFF));
        }
        return array;
    }
    
    static Image Code(byte[] array, Object j) {
        int n = -1;
        if (array == null || array.length == 0 || j == null) {
            array = (byte[])(j = Code.J);
        }
        if (d.i) {
            if (d.I == null) {
                d.I = new Hashtable(20);
                d.J = new Object[20];
            }
            final Image image;
            if ((image = d.I.get(j)) != null) {
                return image;
            }
            for (int i = 0; i < 20; ++i) {
                if (d.J[i] == null) {
                    n = i;
                    break;
                }
            }
            if (n == -1) {
                n = (d.Code.nextInt() & Integer.MAX_VALUE) % 20;
                d.I.remove(d.J[n]);
            }
        }
        final Object[] array2 = new Object[3];
        Image value = Code(array, 0, array.length, 256, (Object[])((d.q && !d.aY) ? null : array2));
        if (array2[0] != null) {
            if ((int)array2[2] != Code.e) {
                array2[0] = Code((int[])array2[0], (int)array2[1], (int)array2[2], Code.e, true);
                array2[1] = new Integer(Code.e);
                array2[2] = new Integer(Code.e);
            }
            value = Code(array2, new int[] { 16777215 }, 0);
        }
        else if (value.getHeight() != Code.e && !d.aY) {
            value = Code(value, 0, Code.e, true);
        }
        if (d.i) {
            d.I.put(j, value);
            d.J[n] = j;
        }
        return value;
    }
    
    static char[] Code(String substring) {
        final char[] array = new char[2];
        if (Code(substring, "speeddial:")) {
            substring = substring.substring(12);
        }
    Label_0173:
        for (int i = 0; i < 2; ++i) {
            final char char1 = "#*".charAt(i);
            for (int j = 0; j < 12; ++j) {
                final char char2 = "1234567890#*".charAt(j);
                final String code;
                if ((code = Code((int)char1, (int)char2, false)) != null && (code.equals(substring) || code.equals("ext:" + substring) || code.equals("nint:" + substring) || (code.startsWith("feed:start") && substring.startsWith("feed:start")))) {
                    array[0] = char1;
                    array[1] = char2;
                    break Label_0173;
                }
            }
        }
        return array;
    }
    
    static Object[] Code(final Object[] array) {
        final Object[] array2 = new Object[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    static synchronized void Code(final int n, final byte[] buf) {
        try {
            Code(n, new DataInputStream(new ByteArrayInputStream(buf)), false);
            J(false);
        }
        finally {}
    }
    
    public final void run() {
        while (this.e) {
            final d d = this;
            Object o = null;
            String headerField = null;
            Label_0044: {
                if (!d.aI) {
                    break Label_0044;
                }
                final String u = d.u;
                try {
                    final String[] code = Code(u);
                    d.e = code[0];
                    d.u = code[1];
                    o = Connector.open(d.u, 3, false);
                    if (d.B) {
                        ((HttpConnection)o).setRequestProperty("Test-Header", "debug");
                    }
                    if (d.e != null) {
                        ((HttpConnection)o).setRequestProperty("X-Online-Host", d.e);
                    }
                    ((InputConnection)o).openDataInputStream().close();
                    final int responseCode;
                    if ((((responseCode = ((HttpConnection)o).getResponseCode()) >= 301 && responseCode <= 303) || responseCode == 307) && ++d.G <= 4) {
                        headerField = ((HttpConnection)o).getHeaderField("Location");
                    }
                }
                finally {}
            }
            Code((Connection)o);
            if (headerField == null) {
                return;
            }
            d.u = headerField;
            this = d;
        }
        final d d2;
        if ((d2 = this).a) {
            Label_0229: {
                final d target;
                if (!(target = d2).aO) {
                    break Label_0229;
                }
                final DataOutputStream i = target.I;
                try {
                    i.close();
                }
                finally {}
                final DataInputStream j = target.I;
                try {
                    j.close();
                }
                finally {}
                final Connection code2 = target.Code;
                try {
                    code2.close();
                    return;
                    d d3;
                    int n;
                    byte[] array;
                    f code3;
                    int b;
                    int n2;
                    f code4;
                    d d4;
                    String[] k;
                    byte l;
                    String s;
                    String substring;
                    byte[] array2;
                    d d5;
                    f f;
                    byte[] array3;
                    Block_33_Outer:Block_28_Outer:Label_0967_Outer:Label_0474_Outer:Block_32_Outer:Label_0833_Outer:
                    while (true) {
                        d3 = target;
                        n = 8;
                        try {
                            array = new byte[n];
                            while (true) {
                                if ((code3 = d3.Code()).Z()) {
                                    b = code3.B();
                                    code3.Z(0);
                                    Code(array, 0, b, code3.I(), 0);
                                    d3.J(array, 0, 8);
                                    d3.B(array, 8);
                                    if (b != 7) {
                                        continue Block_33_Outer;
                                    }
                                    d3.Z(code3);
                                }
                                else {
                                    if (code3.Code()) {
                                        continue Block_33_Outer;
                                    }
                                    d3.d(10000);
                                    d3.Code(code3, d3.Code(code3, 0));
                                }
                            }
                            // iftrue(Label_0967:, !target.c())
                            // iftrue(Label_0515:, target.B[0] == 2)
                            // iftrue(Label_0981:, target.Code(code4))
                            // switch([Lcom.strobel.decompiler.ast.Label;@6176bbad, target.B[0])
                            // iftrue(Label_0949:, target.B[1] == target.B[5] && target.B[2] == target.B[6] && target.B[3] == target.B[7] && target.B[4] == target.B[8])
                            // iftrue(Label_0833:, target.aN)
                            // iftrue(Label_0725:, n2 >= 0)
                            // iftrue(Label_0686:, !target.c.J())
                            // iftrue(Label_0981:, target.Code((f)null))
                            // monitorenter(code5 = d.Code)
                            // iftrue(Label_0642:, !d.aM)
                            // iftrue(Label_0705:, n2 = target.c.Code(target) >= 0)
                            // iftrue(Label_0705:, target.c())
                            // iftrue(Label_0805:, !target.c.J())
                        Block_31:
                            while (true) {
                                Block_35: {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                            Block_29_Outer:
                                                while (true) {
                                                    Block_40: {
                                                        while (true) {
                                                            while (true) {
                                                                while (true) {
                                                                    Block_27: {
                                                                        Label_0805: {
                                                                            while (true) {
                                                                                target.c.z();
                                                                                n2 = target.c.Code(target);
                                                                                Block_39: {
                                                                                    Label_0725: {
                                                                                        break Label_0725;
                                                                                        Label_0949: {
                                                                                            break Block_40;
                                                                                        }
                                                                                        target.F = 1;
                                                                                        target.Code();
                                                                                        target.Code(true, 0);
                                                                                        return;
                                                                                        target.a(false);
                                                                                        return;
                                                                                        target.B(0, 5);
                                                                                        break Block_27;
                                                                                        Label_0929:
                                                                                        break Block_39;
                                                                                        target.Code(target.Code = true, 0);
                                                                                        return;
                                                                                    }
                                                                                    code4 = target.Code();
                                                                                    target.d(240000);
                                                                                    target.Code(code4, target.Code(code4, n2));
                                                                                    target.B(0, 5);
                                                                                }
                                                                                target.F = 1;
                                                                                target.Code(true, 0);
                                                                                return;
                                                                                while (true) {
                                                                                    target.Code(true, 0);
                                                                                    return;
                                                                                    target.f.B(target.B, 1, 4);
                                                                                    target.d.Z(target.B, 5, 4);
                                                                                    continue Label_0833_Outer;
                                                                                }
                                                                                Label_0812: {
                                                                                    target.a = System.currentTimeMillis();
                                                                                }
                                                                                break Block_35;
                                                                                target.c.y();
                                                                                c(1);
                                                                                break Label_0805;
                                                                                Label_0705:
                                                                                continue Block_28_Outer;
                                                                            }
                                                                            d4.A();
                                                                            break Block_31;
                                                                        }
                                                                        target.Code(true, 0);
                                                                        return;
                                                                    }
                                                                    continue Label_0967_Outer;
                                                                }
                                                                d.aM = false;
                                                                d.aL = false;
                                                                k = d4.I;
                                                                l = d4.I;
                                                                try {
                                                                    s = k[l];
                                                                    substring = null;
                                                                    if (s.indexOf(59) >= 0) {
                                                                        substring = s.substring(s.indexOf(59));
                                                                    }
                                                                    if (d4.c()) {
                                                                        Code(d4.I, substring);
                                                                    }
                                                                    else {
                                                                        I(d4.I, substring);
                                                                    }
                                                                    if (d4.C && f()) {
                                                                        Code.J();
                                                                        Code(d.B);
                                                                    }
                                                                    d.B = -1;
                                                                    d.aw = true;
                                                                    J(false);
                                                                    Label_0642:;
                                                                }
                                                                finally {
                                                                }
                                                                // monitorexit(code5)
                                                                continue Block_29_Outer;
                                                            }
                                                            Label_0515: {
                                                                target.H();
                                                            }
                                                            d4 = target;
                                                            continue;
                                                        }
                                                    }
                                                    new Thread(target).start();
                                                    continue Label_0474_Outer;
                                                }
                                                Label_0351: {
                                                    target.c.z();
                                                }
                                                (array2 = new byte[15])[0] = 1;
                                                array2[1] = 2;
                                                array2[2] = 0;
                                                Code(target.c.J);
                                                System.arraycopy(target.c.J, 0, target.c.Z, 0, 8);
                                                System.arraycopy(target.c.Z, 0, array2, 3, 8);
                                                I(target.c.Z[0], array2, 11);
                                                target.d(30000);
                                                d5 = target;
                                                f = null;
                                                array3 = array2;
                                                try {
                                                    d5.Code(f, array3);
                                                }
                                                finally {
                                                    target.Code();
                                                }
                                                continue Block_32_Outer;
                                            }
                                            Label_0686: {
                                                continue Label_0833_Outer;
                                            }
                                        }
                                        Label_0780: {
                                            target.H();
                                        }
                                        continue;
                                    }
                                }
                                target.c.y();
                                continue;
                            }
                            target.c.y();
                            c(1);
                            target.Code(true, 0);
                            return;
                        }
                        finally {
                            target.C(true);
                            return;
                        }
                        continue;
                    }
                }
                // iftrue(Label_0351:, !target.Z)
                // iftrue(Label_0981:, target.d())
                finally {}
            }
            Label_0981: {
                return;
            }
        }
        Object code6 = null;
        DataInputStream openDataInputStream = null;
        final C code7 = Code.Code;
        final String e = d2.e;
        try {
            openDataInputStream = ((InputConnection)(code6 = code7.Code(e))).openDataInputStream();
            B.Code(d2.Code, openDataInputStream);
            B.Code(d2.Code);
            Code((Connection)code6);
            openDataInputStream.close();
        }
        finally {
            final B code8 = d2.Code;
            try {
                code8.B();
                Code.Code(Code(149));
                Code((Connection)code6);
                openDataInputStream.close();
            }
            finally {
                Code((Connection)code6);
                final DataInputStream dataInputStream = openDataInputStream;
                try {
                    dataInputStream.close();
                }
                finally {}
            }
        }
    }
    
    private byte[] Code(final short[] array, final int n) {
        final byte[] array2 = new byte[n];
        int code;
        for (int i = 0; i < n; array2[i++] = (byte)code) {
            if ((code = this.Code(array)) >= 16) {
                int n2 = this.C((code == 18) ? 7 : (code - 14)) + 3;
                if (code == 18) {
                    n2 += 8;
                }
                byte b;
                if (code > 16) {
                    b = 0;
                }
                else {
                    b = array2[i - 1];
                }
                while (n2-- > 0) {
                    array2[i++] = b;
                }
            }
        }
        return array2;
    }
    
    private static synchronized boolean f() {
        if (d.B != 0) {
            O();
            J(false);
            return true;
        }
        return false;
    }
    
    private static synchronized void Code(final int b, final DataInputStream dataInputStream, final boolean b2) {
        try {
            O();
            d l = null;
            final int unsignedByte;
            final d[] i = new d[unsignedByte = dataInputStream.readUnsignedByte()];
            for (int j = 0; j < unsignedByte; ++j) {
                final int unsignedByte2 = dataInputStream.readUnsignedByte();
                final int unsignedByte3 = dataInputStream.readUnsignedByte();
                final String utf = dataInputStream.readUTF();
                i[j] = new d(unsignedByte2, unsignedByte3, utf, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUTF(), utf);
                if (i[j].F == 255) {
                    l = i[j];
                }
            }
            final int unsignedByte4 = dataInputStream.readUnsignedByte();
            d[] code;
            int k;
            if (b2) {
                code = new d[unsignedByte4];
                k = 0;
            }
            else {
                (code = new d[unsignedByte4 + 3])[0] = d.j;
                code[unsignedByte4 + 1] = d.i;
                code[unsignedByte4 + 2] = d.h;
                k = 0;
            }
            while (k < unsignedByte4) {
                code[k + ((b2 ^ true) ? 1 : 0)] = new d(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readUnsignedShort(), dataInputStream.readUTF(), dataInputStream.readUnsignedByte());
                ++k;
            }
            d.l = l;
            d.I = i;
            d.Code = code;
            d.B = b;
        }
        catch (IOException ex) {
            throw ex;
        }
    }
    
    private static d Code(final int n) {
        String code = null;
        String s = null;
        int h = 0;
        String t = null;
        int e = 0;
        int n2 = 0;
        final d[] array;
        (array = new d[3])[0] = d.k;
        array[1] = d.l;
        final d[] array2 = array;
        final int n3 = 2;
        while (true) {
            for (int i = 0; i < d.I.length; ++i) {
                if (d.I[i].F == n) {
                    final d d = d.I[i];
                    array2[n3] = d;
                    int n4 = 0;
                    for (int j = 0; j < 3; ++j) {
                        final d d2;
                        if ((d2 = array[j]) != null) {
                            if (d2.e.length() != 0) {
                                code = (s = d2.e);
                                n4 = j;
                            }
                            if (d2.t.length() != 0) {
                                t = d2.t;
                            }
                            h = d2.H;
                            e = d2.E;
                            n2 = d2.N;
                        }
                    }
                    if (n4 == 2) {
                        s = B(s);
                    }
                    else if (n != 0) {
                        code = Code(code, n);
                    }
                    return new d(n, h, code, e, n2, t, s);
                }
            }
            final d d = null;
            continue;
        }
    }
    
    static void f() {
        if (d.Code == null) {
            O();
        }
    }
    
    private static d I(final int n) {
        return new d(n, d.k.H, Code(d.k.e, 1), d.k.E, d.k.N, d.k.t, d.k.e);
    }
    
    static Vector Code(final DataInputStream dataInputStream, final boolean b) {
        final int unsignedByte;
        final int n = (unsignedByte = dataInputStream.readUnsignedByte()) & 0x2;
        d.aC = ((n | -n) >>> 31 != 0);
        d.aB = ((unsignedByte & 0x1) != 0x0);
        final Vector<Object[]> vector = new Vector<Object[]>();
        for (int unsignedByte2 = dataInputStream.readUnsignedByte(), i = 0; i < unsignedByte2; ++i) {
            final int unsignedByte3 = dataInputStream.readUnsignedByte();
            final Object[] obj;
            final Object[] array = obj = new Object[dataInputStream.readUnsignedByte() + 2];
            array[array.length - 2] = new Integer(unsignedByte3);
            for (int j = 0; j < obj.length - 2; ++j) {
                final Object[] array2 = new Object[4];
                final byte[] b2 = new byte[dataInputStream.readShort()];
                dataInputStream.readFully(b2, 0, b2.length);
                array2[2] = b2;
                array2[1] = dataInputStream.readUTF();
                array2[0] = dataInputStream.readUTF();
                final byte[] b3 = new byte[dataInputStream.readShort()];
                dataInputStream.readFully(b3, 0, b3.length);
                array2[3] = b3;
                obj[j] = array2;
            }
            int unsignedByte4 = 0;
            if (b) {
                unsignedByte4 = dataInputStream.readUnsignedByte();
            }
            obj[obj.length - 1] = new Integer(unsignedByte4);
            vector.addElement(obj);
        }
        return vector;
    }
    
    static Vector Code(final DataInputStream dataInputStream) {
        final byte byte1 = dataInputStream.readByte();
        final Vector vector = new Vector<Object[]>(byte1);
        for (byte b = 0; b < byte1; ++b) {
            final Object[] obj;
            (obj = new Object[4])[1] = dataInputStream.readUTF();
            obj[0] = dataInputStream.readUTF();
            final short short1;
            final byte[] b2 = new byte[short1 = dataInputStream.readShort()];
            dataInputStream.readFully(b2, 0, short1);
            obj[2] = b2;
            vector.addElement(obj);
        }
        return vector;
    }
    
    public static int Code(final String s, final String s2) {
        final boolean b = true;
        try {
            final Object[] code = Code(s, b);
            int i = 0;
            while (i < d.Code.length) {
                final d d = d.Code[i];
                final String s3 = (String)code[0];
                final String s4 = (String)code[1];
                final int intValue = (int)code[2];
                final String s5 = (String)code[3];
                final int n = intValue;
                final String s6 = s4;
                final String s7 = s3;
                final d d2 = d;
                if (!Z(d.e, s7) || !Z(d2.u, s6) || (d2.L != 0 && n != d2.L) || !Z(d2.t, s5)) {
                    ++i;
                }
                else {
                    if (d.Code[i].H == 255) {
                        return Code(s2, (String)null);
                    }
                    return d.Code[i].H;
                }
            }
        }
        finally {
            return 0;
        }
    }
    
    static void j() {
        DataInputStream code = null;
        final int n = 64;
        try {
            d.I = (code = Code(n)).readUTF();
            if ((d.Z = code.readUTF()) != null && d.Z.indexOf("-") != -1) {
                d.J = d.Z.substring(d.Z.indexOf("-") + 1);
            }
            d.Code = code.readUTF();
            d.d = code.readUTF();
            d.a = code.readUTF();
            d.b = code.readUTF();
            d.c = code.readUTF();
            d.B = code.readUTF();
            d.C = code.readUTF();
            d.ap = code.readBoolean();
            d.j = code.readInt();
            code.readBoolean();
            d.ao = code.readBoolean();
            code.readBoolean();
            d.at = code.readBoolean();
            d.l = code.readBoolean();
        }
        finally {
            code.close();
        }
    }
    
    static synchronized void J(final boolean b) {
        int n = 0;
        int n2 = 0;
        while (true) {
            if (n2 != 0) {
                if (n >= 2) {
                    break;
                }
            }
            else if (n > 0) {
                break;
            }
            final J out = new J();
            try {
                final DataOutputStream dataOutputStream;
                (dataOutputStream = new DataOutputStream(out)).write(9);
                dataOutputStream.writeUTF(Z(1));
                dataOutputStream.writeUTF(":");
                dataOutputStream.write((d.ax ? 1 : 0) << 1);
                dataOutputStream.writeBoolean(d.A >= 160);
                dataOutputStream.write(new byte[14]);
                dataOutputStream.write(59);
                dataOutputStream.writeBoolean(d.ap);
                dataOutputStream.writeInt(d.j);
                dataOutputStream.writeBoolean(d.ao);
                dataOutputStream.writeBoolean(d.aw);
                dataOutputStream.writeBoolean(d.as);
                dataOutputStream.writeBoolean(d.at);
                dataOutputStream.writeInt(d.l);
                dataOutputStream.writeInt(d.m);
                dataOutputStream.writeInt(d.g);
                dataOutputStream.writeInt(d.i);
                dataOutputStream.writeLong(d.Z);
                dataOutputStream.writeLong(d.C);
                dataOutputStream.writeUTF(d.s);
                dataOutputStream.writeInt(d.n);
                dataOutputStream.writeInt(d.az);
                dataOutputStream.writeInt(d.k);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.write(((d.az ^ true) ? 1 : 0) * 3);
                dataOutputStream.writeInt(d.o);
                dataOutputStream.writeBoolean(d.az);
                dataOutputStream.writeUTF(d.k);
                dataOutputStream.writeBoolean(d.an);
                dataOutputStream.write((d.ad ? 1 : 0) << 1);
                dataOutputStream.write(-1);
                dataOutputStream.writeBoolean(true);
                final byte[] b2 = new byte[32];
                d.I.Code(b2);
                d.I.Code(b2, 0, 32);
                dataOutputStream.write(b2);
                dataOutputStream.writeLong(0L);
                dataOutputStream.writeLong(0L);
                dataOutputStream.write(0);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeBoolean(d.bi);
                dataOutputStream.writeBoolean(d.aq);
                dataOutputStream.writeBoolean(d.au);
                dataOutputStream.writeBoolean(d.H);
                dataOutputStream.writeBoolean(d.L && !d.bf);
                dataOutputStream.writeBoolean(d.K);
                dataOutputStream.writeUTF(Code.B);
                dataOutputStream.writeInt(Code.Code);
                dataOutputStream.writeInt(Code.I);
                dataOutputStream.writeBoolean(Code.B);
                dataOutputStream.writeBoolean(Code.Z);
                dataOutputStream.writeUTF(Code.J);
                dataOutputStream.writeUTF(Code.Z);
                dataOutputStream.write(Code.J);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeBoolean(false);
                final int size = Code.Code.size();
                dataOutputStream.write(size);
                for (int i = 0; i < size; ++i) {
                    dataOutputStream.writeUTF((String)Code.Code.elementAt(i));
                }
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeInt(d.d);
                dataOutputStream.writeUTF(d.r);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeByte(d.d.size());
                for (int j = 0; j < d.d.size(); ++j) {
                    final Object[] array = d.d.elementAt(j);
                    dataOutputStream.writeUTF((String)array[0]);
                    dataOutputStream.writeUTF((String)array[1]);
                    final byte[] b3 = (byte[])array[2];
                    dataOutputStream.writeShort(b3.length);
                    dataOutputStream.write(b3);
                }
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeInt(d.r);
                dataOutputStream.writeUTF((d.l != null) ? d.l : "");
                dataOutputStream.writeByte(d.av ? 1 : 0);
                dataOutputStream.writeInt(d.s);
                Code(dataOutputStream, d.I);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeByte(d.aD ? 1 : 0);
                dataOutputStream.writeInt(d.x);
                Code(dataOutputStream, d.b);
                I(dataOutputStream);
                Code(dataOutputStream);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(d.t);
                dataOutputStream.writeInt(d.u);
                dataOutputStream.write(Code.Z);
                dataOutputStream.writeInt(d.w);
                dataOutputStream.writeUTF(d.m);
                dataOutputStream.writeUTF(d.n);
                dataOutputStream.writeUTF(d.o);
                dataOutputStream.writeUTF(d.p);
                dataOutputStream.writeUTF(d.q);
                dataOutputStream.writeBoolean(d.aH);
                dataOutputStream.writeLong(d.b);
                dataOutputStream.writeInt(d.aB);
                dataOutputStream.write(d.e, 0, 32);
                dataOutputStream.write(d.f, 0, 32);
                dataOutputStream.writeByte(d.p);
                dataOutputStream.writeInt(d.q);
                dataOutputStream.writeInt(d.v);
                dataOutputStream.writeInt(d.aA);
                final J out2 = new J();
                Z(new DataOutputStream(out2));
                d.aA = Code(d.aA, out2.toByteArray(), "b", false);
            }
            catch (IOException ex) {}
            if (!Code("s", out.toByteArray(), null, b)) {
                n2 = 1;
                Code.Code(1);
                Code.Code.removeAllElements();
                final String s = "h1";
                try {
                    RecordStore.deleteRecordStore(s);
                }
                catch (RecordStoreException ex2) {}
                Code(d.u, "b");
                d.u = -1;
            }
            ++n;
        }
    }
    
    private static void O() {
        d.Code = new d[] { d.h, d.j, d.i };
        d.I = new d[0];
        d.l = null;
        d.B = 0;
    }
    
    private static synchronized void Z(final DataInputStream dataInputStream) {
        final int int1 = dataInputStream.readInt();
        Code(dataInputStream.readInt(), dataInputStream, true);
        if (int1 != "server4.operamini.com".hashCode()) {
            O();
        }
    }
    
    private static synchronized void I(final DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt("server4.operamini.com".hashCode());
        dataOutputStream.writeInt(d.B);
        dataOutputStream.writeByte(d.I.length);
        for (int i = 0; i < d.I.length; ++i) {
            final d d = d.I[i];
            dataOutputStream.writeByte(d.F);
            dataOutputStream.writeByte(d.H);
            dataOutputStream.writeUTF(d.e);
            dataOutputStream.writeShort(d.E);
            dataOutputStream.writeShort(d.N);
            dataOutputStream.writeUTF(d.t);
        }
        dataOutputStream.writeByte(d.Code.length);
        for (int j = 0; j < d.Code.length; ++j) {
            final d d2 = d.Code[j];
            dataOutputStream.writeUTF(d2.e);
            dataOutputStream.writeUTF(d2.u);
            dataOutputStream.writeShort(d2.L);
            dataOutputStream.writeUTF(d2.t);
            dataOutputStream.writeByte(d2.H);
        }
    }
    
    private d(final byte[] i) {
        this.h = true;
        this.g = true;
        this.G = 6;
        this.Code = new short[574];
        this.I = new short[62];
        this.B = new byte[288];
        this.I = i;
        this.Y = i.length;
        if (d.b[0] == 0) {
            d.b[0] = 1;
            d.b[1] = 2;
            for (int j = 1; j < 29; ++j) {
                d.b[j + 1] = (1 << j / 2) + (1 << (j - 1) / 2) + 1;
            }
            int k = 0;
            int n = 3;
            while (k < 28) {
                d.a[k] = n;
                n += ((k < 8) ? 1 : (1 << (k - 4) / 4));
                ++k;
            }
            d.a[28] = 258;
        }
    }
    
    private int Code(final short[] array) {
        int i;
        for (i = 0; i >= 0; i = array[i + (this.K & 0x1)], this.K >>>= 1, --this.X) {
            if (this.X == 0) {
                this.K = this.e();
                this.X = 8;
            }
        }
        return i & 0xFFF;
    }
    
    public d() {
        this.h = true;
        this.g = true;
        this(new byte[32768]);
    }
    
    private void C(final byte[] z, final int aa, final int n) {
        this.Z = z;
        this.aa = aa;
        this.ab = aa + n;
    }
    
    private int C(final int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (this.X == 0) {
                this.K = this.e();
                this.X = 8;
            }
            n2 |= (this.K & 0x1) << i;
            this.K >>>= 1;
            --this.X;
        }
        return n2;
    }
    
    private boolean g() {
        while (this.V-- > 0) {
            this.I[this.M++] = this.I[this.P++];
            if (this.P == this.Y) {
                this.P = 0;
            }
            if (this.D == this.M) {
                return true;
            }
        }
        return false;
    }
    
    private boolean h() {
        if (this.V > 0 && this.g()) {
            return true;
        }
        int code;
        while ((code = this.Code(this.Code)) != 256) {
            if (code > 256) {
                final int n = code - 257;
                this.V = d.a[n];
                if (n > 7 && n != 28) {
                    this.V += this.C(n / 4 - 1);
                }
                final int code2 = this.Code(this.I);
                int n2 = d.b[code2];
                if (code2 > 3) {
                    n2 += this.C(code2 / 2 - 1);
                }
                this.P = this.M - n2;
                if (this.P < 0) {
                    this.P += this.Y;
                }
                if (this.g()) {
                    return true;
                }
            }
            else {
                this.I[this.M++] = (byte)code;
            }
            if (this.D == this.M) {
                return true;
            }
        }
        return false;
    }
    
    private static int I(final String s, final String s2) {
        if (s == null || s.indexOf(47) == -1 || s2.indexOf(47) == -1) {
            return 0;
        }
        return s.substring(s.indexOf(47)).compareTo(s2.substring(s2.indexOf(47)));
    }
    
    static String Code(String property) {
        if ((property = System.getProperty(property)) != null) {
            I(property.getBytes());
        }
        return property;
    }
    
    private static boolean Code(final String className) {
        try {
            Class.forName(className);
            return true;
        }
        finally {
            return false;
        }
    }
    
    private static String Z(final int n) {
        if (d.Code[n] != null) {
            return d.Code[n];
        }
        return "";
    }
    
    static void i() {
        System.gc();
        if (d.aT) {
            d.Z = Runtime.getRuntime().freeMemory() * 10L / 8L;
            return;
        }
        if (d.aU && d.Z > 0L) {
            return;
        }
        final Vector<byte[]> vector = new Vector<byte[]>(d.ax);
        int n = 0;
        try {
            System.gc();
            while (vector.size() <= d.ax) {
                vector.addElement(new byte[8192]);
                ++n;
            }
        }
        finally {}
        System.gc();
        d.Z = (n << 13) + 4;
    }
    
    static synchronized void k() {
        final String s = "s";
        try {
            final byte[] buf;
            if ((buf = Code(s).firstElement()) != null) {
                final DataInputStream dataInputStream;
                final int unsignedByte = (dataInputStream = new DataInputStream(new ByteArrayInputStream(buf))).readUnsignedByte();
                d.bj |= (unsignedByte < 9);
                if (unsignedByte < 9) {
                    Code(dataInputStream, 5L);
                    dataInputStream.readUTF();
                    Code(dataInputStream, 6L);
                    final String utf;
                    if ((utf = dataInputStream.readUTF()).length() == 64) {
                        d.Code[1] = utf;
                    }
                    Code(dataInputStream, Integer.MAX_VALUE);
                    return;
                }
                if (unsignedByte != 9) {
                    Code(dataInputStream, Integer.MAX_VALUE);
                    return;
                }
                final String utf2;
                if ((utf2 = dataInputStream.readUTF()).length() >= 64) {
                    Code(1, utf2, false);
                }
                dataInputStream.readUTF();
                d.ax = (dataInputStream.readByte() >= 2);
                d.A = (dataInputStream.readBoolean() ? 1 : 0) * 160;
                Code(dataInputStream, 14L);
                int unsignedByte2 = dataInputStream.readUnsignedByte();
                d.bj |= (unsignedByte2 < 59);
                if (unsignedByte2 == 58) {
                    unsignedByte2 = 59;
                }
                if (unsignedByte2 != 59) {
                    Code(dataInputStream, Integer.MAX_VALUE);
                    return;
                }
                d.ap = dataInputStream.readBoolean();
                d.j = dataInputStream.readInt();
                d.ao = dataInputStream.readBoolean();
                d.aw = dataInputStream.readBoolean();
                d.as = dataInputStream.readBoolean();
                d.at = dataInputStream.readBoolean();
                d.l = dataInputStream.readInt();
                d.m = dataInputStream.readInt();
                if ((d.g = dataInputStream.readInt()) < d.h) {
                    d.ag = true;
                }
                d.i = dataInputStream.readInt();
                d.Z = dataInputStream.readLong();
                d.C = dataInputStream.readLong();
                d.s = dataInputStream.readUTF();
                d.n = dataInputStream.readInt();
                d.n = 0;
                d.az = dataInputStream.readInt();
                d.k = dataInputStream.readInt();
                dataInputStream.readBoolean();
                final byte byte1 = dataInputStream.readByte();
                d.o = dataInputStream.readInt();
                if (byte1 == 3) {
                    d.az = dataInputStream.readBoolean();
                    d.k = dataInputStream.readUTF();
                }
                else {
                    dataInputStream.readBoolean();
                    dataInputStream.readUTF();
                }
                d.an = dataInputStream.readBoolean();
                final int n = dataInputStream.readByte() - 2;
                d.ad = (((n | -n) >>> 31 ^ 0x1) != 0x0);
                dataInputStream.readByte();
                dataInputStream.readBoolean();
                Code(dataInputStream, 8);
                dataInputStream.readLong();
                dataInputStream.readLong();
                Code(dataInputStream, (long)dataInputStream.readUnsignedByte());
                Code(dataInputStream, (long)(dataInputStream.readUnsignedShort() << 2));
                Code(dataInputStream, (long)(dataInputStream.readUnsignedShort() << 2));
                d.bi = dataInputStream.readBoolean();
                d.aq = dataInputStream.readBoolean();
                d.au = dataInputStream.readBoolean();
                d.H = dataInputStream.readBoolean();
                d.L = dataInputStream.readBoolean();
                d.K = dataInputStream.readBoolean();
                Code.B = dataInputStream.readUTF();
                Code.Code = dataInputStream.readInt();
                Code.I = dataInputStream.readInt();
                Code.B = dataInputStream.readBoolean();
                Code.Z = dataInputStream.readBoolean();
                Code.J = dataInputStream.readUTF();
                Code.Z = dataInputStream.readUTF();
                Code.J = dataInputStream.readUnsignedByte();
                dataInputStream.readBoolean();
                dataInputStream.readBoolean();
                for (byte byte2 = dataInputStream.readByte(), b = 0; b < byte2; ++b) {
                    Code.Code.addElement(dataInputStream.readUTF());
                }
                dataInputStream.readBoolean();
                dataInputStream.readBoolean();
                dataInputStream.readBoolean();
                dataInputStream.readBoolean();
                d.d = dataInputStream.readInt();
                d.r = dataInputStream.readUTF();
                dataInputStream.readBoolean();
                for (byte byte3 = dataInputStream.readByte(), b2 = 0; b2 < byte3; ++b2) {
                    final Object[] obj;
                    (obj = new Object[3])[0] = dataInputStream.readUTF();
                    obj[1] = dataInputStream.readUTF();
                    final byte[] b3 = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(b3);
                    obj[2] = b3;
                    d.d.addElement(obj);
                }
                dataInputStream.readBoolean();
                dataInputStream.readBoolean();
                d.r = dataInputStream.readInt();
                d.l = dataInputStream.readUTF();
                d.av = ((dataInputStream.readByte() & 0x1) != 0x0);
                d.s = dataInputStream.readInt();
                d.I = Code(dataInputStream);
                dataInputStream.readInt();
                dataInputStream.readBoolean();
                for (int unsignedByte3 = dataInputStream.readUnsignedByte(), i = 0; i < unsignedByte3; ++i) {
                    dataInputStream.readUTF();
                    dataInputStream.readUTF();
                    dataInputStream.readUTF();
                    dataInputStream.readUnsignedShort();
                    dataInputStream.readUnsignedShort();
                }
                final int n2 = dataInputStream.readByte() - 1;
                d.aD = (((n2 | -n2) >>> 31 ^ 0x1) != 0x0);
                d.x = dataInputStream.readInt();
                d.b = Code(dataInputStream);
                Z(dataInputStream);
                I(dataInputStream);
                dataInputStream.readInt();
                d.t = dataInputStream.readInt();
                d.u = dataInputStream.readInt();
                final int n3;
                final byte[] array2;
                final byte[] array = array2 = new byte[((n3 = (dataInputStream.readByte() & 0xFF)) << 2) + 1];
                array[0] = (byte)n3;
                dataInputStream.readFully(array2, 1, n3 << 2);
                Code.Z = array2;
                d.w = dataInputStream.readInt();
                Code(dataInputStream);
                d.aH = dataInputStream.readBoolean();
                d.b = dataInputStream.readLong();
                d.aB = dataInputStream.readInt();
                dataInputStream.readFully(d.e, 0, 32);
                dataInputStream.readFully(d.f, 0, 32);
                d.p = dataInputStream.readUnsignedByte();
                d.q = dataInputStream.readInt();
                d.v = dataInputStream.readInt();
                if ((d.aA = dataInputStream.readInt()) != -1) {
                    d.Z = Code(new DataInputStream(new ByteArrayInputStream(Code(d.aA, "b"))), true);
                }
            }
        }
        finally {}
    }
    
    private static void Z(final DataOutputStream dataOutputStream) {
        dataOutputStream.write((d.aB ? 1 : 0) | (d.aC ? 1 : 0) << 1);
        dataOutputStream.write(d.Z.size());
        for (int i = 0; i < d.Z.size(); ++i) {
            final Object[] array = d.Z.elementAt(i);
            dataOutputStream.write((int)array[array.length - 2]);
            dataOutputStream.write(array.length - 2);
            for (int j = 0; j < array.length - 2; ++j) {
                final Object[] array2;
                final byte[] b = (byte[])(array2 = (Object[])array[j])[2];
                dataOutputStream.writeShort((short)b.length);
                dataOutputStream.write(b);
                dataOutputStream.writeUTF((String)array2[1]);
                dataOutputStream.writeUTF((String)array2[0]);
                final byte[] b2 = (byte[])array2[3];
                dataOutputStream.writeShort((short)b2.length);
                dataOutputStream.write(b2);
            }
            dataOutputStream.write((int)array[array.length - 1]);
        }
    }
    
    static Object[] Code(final int index) {
        final Object[] array = d.Z.elementAt(index);
        return (Object[])array[(int)array[array.length - 1]];
    }
    
    static void Code(final DataInputStream dataInputStream) {
        d.m = dataInputStream.readUTF();
        d.n = dataInputStream.readUTF();
        d.o = dataInputStream.readUTF();
        d.p = dataInputStream.readUTF();
        d.q = dataInputStream.readUTF();
    }
    
    private static void Code(final DataInputStream dataInputStream, int n) {
        while (n-- > 0) {
            J(dataInputStream.readInt());
        }
    }
    
    private static void Code(final DataOutputStream dataOutputStream, final Vector vector) {
        final int v = (vector != null) ? vector.size() : 0;
        dataOutputStream.writeByte(v);
        for (int i = 0; i < v; ++i) {
            final Object[] code = Code(vector, i);
            dataOutputStream.writeUTF((String)code[1]);
            dataOutputStream.writeUTF((String)code[0]);
            final byte[] b;
            if ((b = (byte[])code[2]) != null) {
                dataOutputStream.writeShort(b.length);
                dataOutputStream.write(b);
            }
            else {
                dataOutputStream.writeShort(0);
            }
        }
    }
    
    static void l() {
        if (d.aB == -1) {
            return;
        }
        final int ab = d.aB;
        final String s = "b";
        try {
            final byte[] code;
            if ((code = Code(ab, s)) == null) {
                return;
            }
            final DataInputStream dataInputStream;
            if ((dataInputStream = new DataInputStream(new ByteArrayInputStream(code))).readByte() != 1) {
                return;
            }
            for (short short1 = dataInputStream.readShort(), n = 0; n < short1; ++n) {
                final C obj;
                (obj = new C()).Code = dataInputStream.readByte();
                obj.Code = dataInputStream.readInt();
                obj.I = dataInputStream.readInt();
                obj.J = dataInputStream.readUTF();
                obj.B = dataInputStream.readUTF();
                obj.C = dataInputStream.readUTF();
                d.B.addElement(obj);
            }
        }
        finally {}
    }
    
    static void m() {
        try {
            final J out = new J();
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            // monitorenter(b = d.B)
            final DataOutputStream dataOutputStream2 = dataOutputStream;
            final int v = 1;
            try {
                dataOutputStream2.writeByte(v);
                dataOutputStream.writeShort(d.B.size() - d.C.size());
                for (int i = 0; i < d.B.size(); ++i) {
                    final C o = d.B.elementAt(i);
                    if (!d.C.contains(o)) {
                        dataOutputStream.writeByte((o.Code == 0) ? 3 : o.Code);
                        dataOutputStream.writeInt(o.Code);
                        dataOutputStream.writeInt(o.I);
                        dataOutputStream.writeUTF(o.J);
                        dataOutputStream.writeUTF(o.B);
                        dataOutputStream.writeUTF(o.C);
                    }
                }
                if ((d.aB = Code(d.aB, out.toByteArray(), "b", false)) != d.aB) {
                    J(false);
                }
            }
            finally {
            }
            // monitorexit(b)
        }
        catch (IOException ex) {}
    }
    
    private static void I(final Vector vector, final int n) {
        if (vector != null) {
            final Object[] code = Code(vector, n);
            final boolean b;
            if ((b = (vector == d.a)) && (Code(code, 9) & 0x2) != 0x0) {
                Code.Code((Integer)code[10], true);
            }
            code[1] = "";
            code[0] = (b ? "www." : "");
            code[2] = null;
            if (b) {
                code[10] = new Integer(0);
                code[9] = new Integer(0);
            }
            if (Code(code, 5) == 97) {
                if (!b) {
                    vector.removeElementAt(n);
                }
                else {
                    code[5] = new Integer(83);
                }
            }
            else if (vector == d.d) {
                vector.removeElementAt(n);
            }
            else {
                code[5] = new Integer(82);
            }
            Code(vector, true);
        }
    }
    
    private static boolean Code(final Object[] array, final Vector vector) {
        final String anObject = (String)array[0];
        for (int i = 0; i < vector.size(); ++i) {
            if (((String)((Object[])vector.elementAt(i))[0]).equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    static void Code(final Vector vector, final Object[] obj, final int index) {
        if (vector != null) {
            if (vector == d.a) {
                if ((Code(obj, 9) & 0x2) != 0x0) {
                    Code.Code((Integer)obj[10], true);
                }
                obj[9] = new Integer(1);
                obj[10] = new Integer(0);
            }
            if (index + 1 > vector.size()) {
                vector.setSize(index + 1);
            }
            vector.setElementAt(obj, index);
            Code(vector, true);
        }
    }
    
    public static void Code(final Vector vector) {
        if (vector.size() > 0) {
            byte[] array = new byte[16];
            for (int i = 0; i < vector.size(); ++i) {
                if (Code((Object[])vector.elementAt(i), 5) != 82) {
                    if (!Code(array, (byte[])vector.elementAt(i)[8])) {
                        vector.elementAt(i)[8] = array;
                    }
                    array = (byte[])vector.elementAt(i)[7];
                }
            }
        }
    }
    
    static void Code(final Object o, final int n) {
        // monitorenter(o)
        final long n2 = n;
        try {
            o.wait(n2);
        }
        catch (InterruptedException ex) {}
        finally {
        }
        // monitorexit(o)
    }
    
    static void t() {
        if (d.i) {
            d.I = new Hashtable(20);
            d.J = new Object[20];
            return;
        }
        d.I = null;
        d.J = null;
    }
    
    static void n() {
        // monitorenter(b = d.B)
        final Vector c = d.C;
        try {
            final Object[] anArray = new Object[c.size()];
            d.C.copyInto(anArray);
            for (int i = 0; i < anArray.length; ++i) {
                final C c2;
                if ((c2 = (C)anArray[i]).Code != 0) {
                    d.B.removeElement(c2);
                    d.C.removeElement(c2);
                }
            }
        }
        finally {
        }
        // monitorexit(b)
    }
    
    static void o() {
        d.J = Code(true, "b1", 0);
        d.a = Code(true, "sp", 0);
        d.c = Code(true, "u", 0);
        if (d.J == null) {
            d.J = new Vector();
        }
        boolean b = false;
        if (d.a == null) {
            d.a = new Vector();
            b = true;
        }
        while (d.a.size() < 9) {
            final Object[] code;
            (code = Code())[5] = new Integer(83);
            d.a.addElement(code);
        }
        if (d.c == null) {
            d.c = Code(false, null, 67);
        }
        else if (d.bj) {
            final Vector code2;
            if ((code2 = Code(false, null, 67)).size() > 0) {
                d.c.setElementAt(code2.elementAt(0), 0);
            }
            Code(d.c, false);
        }
        if (!d.bi) {
            final Vector code3 = Code(false, null, 66);
            int n = 0;
            for (int i = 0; i < code3.size(); ++i) {
                final Object[] array;
                if (Code((String)(array = code3.elementAt(i))[0]) == -1 && !Code(array, d.J)) {
                    if (Code(array, 1)) {
                        if (b) {
                            d.a.setElementAt(array, n++);
                        }
                    }
                    else {
                        d.J.addElement(array);
                    }
                }
            }
            Code(d.J, true);
            Code(d.a, true);
        }
        d.bi = true;
        p();
    }
    
    static void p() {
        if (d.aD) {
            d.b.removeAllElements();
            return;
        }
        for (int i = 0; i < d.b.size(); ++i) {
            final Object[] array = d.b.elementAt(i);
            array[3] = (Code(array, d.a) ? new Object() : null);
        }
    }
    
    private static int Z(final int n, final char[] array, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n2; i < n2 + n3; ++i) {
            n4 += Code(n, array[i]);
        }
        return n4;
    }
    
    private static boolean I(final byte[] array, final byte[] array2) {
        if (array.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    static int Code(final Object[] array, final int n) {
        if (n < array.length) {
            return (int)array[n];
        }
        return 0;
    }
    
    private static void Code(final Vector vector, final int n, final int n2) {
        if (vector != null) {
            final Object element = vector.elementAt(n);
            final Object element2 = vector.elementAt(n2);
            vector.setElementAt(element, n2);
            vector.setElementAt(element2, n);
            Code(vector, true);
        }
    }
    
    static void Code(final Vector vector, final Object[] obj) {
        if (vector != null && obj != null) {
            vector.addElement(obj);
            Code(vector, true);
        }
    }
    
    public static boolean Code(final Vector vector) {
        int n = Code(vector, new byte[16], true);
        for (int i = 0; i < vector.size(); ++i) {
            if (n == -1) {
                return false;
            }
            final Object element = vector.elementAt(n);
            if (i != n) {
                vector.setElementAt(vector.elementAt(i), n);
                vector.setElementAt(element, i);
            }
            n = Code(vector, (byte[])((Object[])element)[7], true);
        }
        return true;
    }
    
    static boolean Code(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return n < n5 + n7 && n + n3 > n5 && n2 < n6 + n8 && n2 + n4 > n6;
    }
    
    static void Code(final StringBuffer sb, final char c, final char ch) {
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == c) {
                if (ch == '\0') {
                    sb.deleteCharAt(i);
                    --i;
                }
                else {
                    sb.setCharAt(i, ch);
                }
            }
        }
    }
    
    private static int Z(final String s, final String s2) {
        final int max = Math.max(0, 0);
        if (s2.length() == 0) {
            return max;
        }
        if (max <= s.length() - s2.length()) {
            for (int i = max; i <= s.length() - s2.length(); ++i) {
                if (Code(s, s2, max)) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static void q() {
        if (!Code("u", d.c)) {
            d.ay = true;
            return;
        }
        d.ay = false;
    }
    
    public static void Code(final Vector vector, final boolean b) {
        if (vector == d.d) {
            J(false);
            return;
        }
        if (b && (vector == d.J || vector == d.a)) {
            if (!Code.Z || (vector == d.J && (Code.J & 0x2) != 0x0) || (vector == d.a && (Code.J & 0x1) != 0x0)) {
                ++Code.Code;
            }
            J(false);
        }
        Code((vector == d.J) ? "b1" : ((vector == d.c) ? "u" : "sp"), vector);
        if (vector == d.a) {
            Code.I = true;
        }
    }
    
    static boolean Code(final int[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    static boolean Code(final String anObject, final Vector vector) {
        boolean code = false;
        if (vector == null) {
            return false;
        }
        int n = 0;
        int n2 = 0;
        final Vector vector2 = new Vector<byte[]>(vector.size());
        while (true) {
            if (n != 0) {
                if (n2 >= 2) {
                    break;
                }
            }
            else if (n2 > 0) {
                break;
            }
            int n3;
            int i = n3 = 0;
            Vector<Object[]> vector3 = (Vector<Object[]>)vector;
            try {
                while (i < vector3.size()) {
                    final J out = new J();
                    final DataOutputStream dataOutputStream = new DataOutputStream(out);
                    final Object[] array = vector.elementAt(n3);
                    dataOutputStream.write(n3);
                    dataOutputStream.writeUTF((String)array[0]);
                    dataOutputStream.writeUTF((array[1] != null) ? ((String)array[1]) : ((String)array[0]));
                    final byte[] b;
                    if ((b = (byte[])array[2]) == null || (d.j && "h1".equals(anObject) && n3 < vector.size() - 3)) {
                        dataOutputStream.writeShort(0);
                    }
                    else {
                        dataOutputStream.writeShort(b.length);
                        dataOutputStream.write(b);
                    }
                    if (array[3] == null) {
                        dataOutputStream.writeUTF("");
                    }
                    else if (array[3] instanceof String) {
                        dataOutputStream.writeUTF((String)array[3]);
                    }
                    else if (anObject.equals("b1") || anObject.equals("sp")) {
                        dataOutputStream.write(Code(array, 3) | 0x8);
                        dataOutputStream.write(3);
                        dataOutputStream.write(Code(array, 5));
                        dataOutputStream.write(Code(array, 6));
                        dataOutputStream.write((byte[])array[7]);
                        dataOutputStream.write((byte[])array[8]);
                        dataOutputStream.writeByte((byte)Code(array, 9));
                        dataOutputStream.writeInt(Code(array, 10));
                    }
                    else {
                        dataOutputStream.write(Code(array, 3));
                    }
                    vector2.addElement(out.toByteArray());
                    i = ++n3;
                    vector3 = (Vector<Object[]>)vector;
                }
                if (!(code = Code(anObject, null, vector2, false))) {
                    n = 1;
                    Code.Code(1);
                }
                ++n2;
            }
            catch (IOException ex) {
                n = 1;
                ++n2;
            }
        }
        return code;
    }
    
    static Object[] Code(final Vector vector, final int index) {
        if (vector != null) {
            return vector.elementAt(index);
        }
        return null;
    }
    
    private static byte[] Code(final byte[] array) {
        if (array.length < d.ay) {
            final byte[] array2 = new byte[d.ay];
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        return array;
    }
    
    private static byte[] I() {
        final byte[] array = new byte[16];
        for (int i = 0; i < 16; ++i) {
            array[i] = (byte)d.Code.nextInt();
        }
        return array;
    }
    
    private static byte[] Code() {
        if (d.c == null) {
            d.c = new byte[16];
            for (int i = 0; i < 16; ++i) {
                d.c[i] = -1;
            }
        }
        return d.c;
    }
    
    private static boolean Code(final byte[] array, final byte[] array2) {
        if (array == null || array2 == null) {
            return false;
        }
        for (int i = 0; i < 16; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    private static InputStream Code(final String name) {
        return Runtime.getRuntime().getClass().getResourceAsStream(name);
    }
    
    static boolean Code(final Object[] array) {
        return (array[0].equals("www.") || array[0].equals("")) && array[1].equals("");
    }
    
    static int I(final int n, final char[] array, int n2, final int n3) {
        if (Code(n, array, 0, n2) <= n3) {
            return n2;
        }
        int n4 = 0;
        int n5 = 0;
        while (n2 - n4 > 1) {
            n5 = (n2 + n4) / 2;
            if (Code(n, array, 0, n5) >= n3) {
                n2 = n5;
            }
            else {
                n4 = n5;
            }
        }
        if (Code(n, array, 0, n5) > n3) {
            n5 = n4;
        }
        return n5;
    }
    
    static void B(final boolean b) {
        if (!b && d.g != null && d.g.length == 32) {
            return;
        }
        final d d = new d((byte)0);
        d.Code = new J(33);
        d.y = (6 + (((d.l ^ true) ? 1 : 0) << 1)) * 17312;
        r();
        if (!d.l) {
            if (d.n == null || d.o == null) {
                if (b) {
                    d.l = true;
                }
            }
            else {
                d.B(-1988150126);
                d.B(-1319564848);
            }
        }
        for (int i = 0; i < 6; ++i) {
            e(i);
        }
        d.Code(d.Code.Code(), 0, d.Code.size());
        d.Code.reset();
        Code(Code(89), 5);
        d.Code(d.Code.Code(), 0, d.Code.size());
        d.Code.reset();
        final byte[] bytes = (System.getProperty("microedition.platform") + System.getProperty("device.software.version")).getBytes();
        d.Code(bytes, 0, bytes.length);
        final byte[] e = new byte[32];
        d.Code(e);
        if (!I(e, d.e) || I(d.f, new byte[32])) {
            d.e = e;
            final char[] code = Code(90);
            final d d2 = new d((byte)0);
            for (int j = 0; j < 6; ++j) {
                e(j);
                Code((5 == j) ? Code() : code, j);
                d2.Code(d.Code.Code(), 0, d.Code.size());
                d.Code.reset();
            }
            if (!d.l) {
                final byte[] code2 = Code(93);
                d.Code.write(code2, 0, code2.length);
                d2.Code(d.Code.Code(), 0, d.Code.size());
                d.Code.reset();
            }
            d2.Code(d.f);
            J(false);
        }
        d.Code.write(d.f, 0, 32);
        if (b) {
            for (int k = 0; k < 6; ++k) {
                d.Code.write(k);
                e(k);
                b(k, 1);
            }
            if (!d.l) {
                for (int l = 6; l < 8; ++l) {
                    d.Code.write(l);
                    d.Code.write(d.Code - 2);
                    d.Code.write(2);
                    b(l, 1);
                }
            }
        }
        d.g = d.Code.toByteArray();
        d.Code = null;
        d.z = -1;
    }
    
    static Image Code(byte[] array, int n, final int n2, final int n3, final Object[] array2) {
        Image image = null;
        int n4 = 0;
        ++n4;
        while (true) {
            Label_0038: {
                if (!d.bb || n == 0) {
                    break Label_0038;
                }
                try {
                    final byte[] array3 = new byte[n2];
                    System.arraycopy(array, n, array3, 0, n2);
                    array = array3;
                    n = 0;
                    if (array[n] == 82 || array[n] == 67) {
                        final byte[] array4 = array;
                        final int n5 = n + 1;
                        try {
                            final byte value = array4[n5];
                            final byte value2 = array[n + 2];
                            final int[] array5 = new int[value * value2];
                            int n6 = n + 3;
                            if (array[n] == 82) {
                                for (int i = 0; i < value * value2; ++i, n6 += 4) {
                                    array5[i] = Z(array, n6);
                                }
                            }
                            else {
                                final byte[] array6 = new byte[value * value2 << 1];
                                final d d;
                                (d = new d(array6)).C(array, n + 3, n2 - 3);
                                d.Code((byte[])null, 0, array6.length);
                                for (int j = 0; j < value * value2 << 1; array5[j >> 1] = (((array6[j] & 0xF0) >>> 4 | (array6[j] & 0xF0)) << 24) + (((array6[j] & 0xF) << 4 | (array6[j] & 0xF)) << 16) + (((array6[++j] & 0xF0) >>> 4 | (array6[j] & 0xF0)) << 8) + ((array6[j] & 0xF) << 4 | (array6[j] & 0xF)), ++j) {}
                            }
                            if (array2 != null && array2.length == 3) {
                                array2[0] = array5;
                                array2[1] = new Integer(value);
                                array2[2] = new Integer(value2);
                            }
                            return Image.createRGBImage(array5, (int)value, (int)value2, true);
                        }
                        finally {
                            return null;
                        }
                    }
                    if (d.aW || array[n] == -119) {
                        image = Image.createImage(array, n, n2);
                        if (n3 != 256) {
                            if (d.x || d.t || d.ag) {
                                return null;
                            }
                            final Image image2 = image;
                            final int n7 = 0;
                            final int n8 = (image.getHeight() * n3 << 8) + 65535 >> 16;
                            final int n9 = array[n] + 119;
                            image = Code(image2, n7, n8, (boolean)(((n9 | -n9) >>> 31 ^ 0x1) != 0x0));
                        }
                    }
                    else {
                        final a a = new a();
                        if (n3 == 256) {
                            if (a.Code(array, n, n2, 0, false) == 0 && a.Code != 0 && a.I != 0) {
                                image = Image.createRGBImage(a.Code, a.Code, a.I, false);
                            }
                        }
                        else {
                            if (d.ag) {
                                return null;
                            }
                            int n10;
                            for (n10 = 3; 256 >> n10 <= n3; --n10) {}
                            final int code;
                            if (((code = a.Code(array, n, n2, n10, true)) & 0xFFFF0000) >> n10 + 16 == 0 || (code & 0xFFFF) >> n10 == 0) {
                                return null;
                            }
                            if (a.Code(array, n, n2, n10, false) == 0) {
                                final int n11;
                                final int[] code2 = Code(a.Code, a.Code, a.I, n11 = (a.Z * n3 << 8) + 65535 >> 16, false);
                                image = Image.createRGBImage(code2, code2.length / n11, n11, true);
                            }
                        }
                    }
                    if (image != null && image.getHeight() == 0) {
                        image = null;
                    }
                }
                finally {}
            }
            if (image != null || n4 >= 2) {
                break;
            }
            final int n12 = n4 - 1;
            Code.I(((n12 | -n12) >>> 31) * 3);
            ++n4;
        }
        return image;
    }
    
    static void Code(final InputStream inputStream, long n) {
        while (n > 0L) {
            n -= inputStream.skip(n);
        }
    }
    
    private static int[] Code(final DataInputStream dataInputStream) {
        final int unsignedShort;
        if ((unsignedShort = dataInputStream.readUnsignedShort()) == 0) {
            return null;
        }
        final byte[] b = new byte[unsignedShort << 2];
        dataInputStream.readFully(b);
        return Code(b, 0, b.length);
    }
    
    static void Code(final StringBuffer sb, final int n, final int n2) {
        if (n2 <= 0 || n == n2) {
            Code(sb, n, n, true);
            return;
        }
        Code(sb, n, n2, false);
        sb.append('/');
        Code(sb, n2, n2, true);
    }
    
    static int Code(final Vector vector, final byte[] array, final boolean b) {
        for (int i = 0; i < vector.size(); ++i) {
            if (Code(array, (byte[])((Object[])vector.elementAt(i))[(b ? 1 : 0) + 7])) {
                return i;
            }
        }
        return -1;
    }
    
    static Object[] Code() {
        final Object[] array;
        (array = new Object[11])[0] = "www.";
        array[1] = "";
        array[3] = new Integer(0);
        array[4] = new Integer(3);
        array[5] = new Integer(97);
        array[6] = new Integer(0);
        array[7] = I();
        array[8] = Code();
        array[9] = new Integer(0);
        array[10] = new Integer(0);
        return array;
    }
    
    static String Code(final int n) {
        Label_0123: {
            if (d.Z == null) {
                DataInputStream code = null;
                final int n2 = 65;
                try {
                    if ((code = Code(n2)).readByte() != 1) {
                        try {}
                        finally {
                            break Label_0123;
                        }
                    }
                    d.s = code.readUTF();
                    d.Z = new String[code.readShort() - 1];
                    code.readUTF();
                    d.x = code.readUTF();
                    for (int i = 0; i < d.Z.length; ++i) {
                        d.Z[i] = code.readUTF();
                    }
                }
                catch (IOException ex) {}
                finally {
                    final DataInputStream dataInputStream = code;
                    try {
                        dataInputStream.close();
                    }
                    finally {}
                }
            }
        }
        if (d.Z == null || n >= d.Z.length || d.Z[n] == null) {
            return "";
        }
        return d.Z[n];
    }
    
    static String Code(final String s, final String str, final String str2) {
        final int index;
        if ((index = s.indexOf(str)) < 0) {
            return s;
        }
        return s.substring(0, index) + str2 + s.substring(index + str.length());
    }
    
    static String Code(int i, String substring, int n, String str) {
        if (str == null) {
            str = "...";
        }
        substring = substring.substring(0, Math.min(substring.length(), 4096));
        if (Code(i, substring) <= n) {
            return substring;
        }
        n -= Code(i, str);
        final char[] charArray = substring.toCharArray();
        i = I(i, charArray, charArray.length, n);
        return substring.substring(0, i) + str;
    }
    
    static String Code(final int n, final String s) {
        return Code(Code(n), "%s", s);
    }
    
    static String Code(final String s, final String s2) {
        return Code(Code(Code(216), "%0", s), "%1", s2);
    }
    
    static int Code(final String s) {
        if (s != null && s.startsWith("o:")) {
            return s.charAt(2);
        }
        return -1;
    }
    
    static String I(final int n) {
        return "o:" + (char)n;
    }
    
    static String I(final String s) {
        return s.substring(s.indexOf(58) + 1);
    }
    
    static String Code(final int n, int n2, final boolean b) {
        String s = null;
        String s2 = null;
        if (n == 42) {
            if (n2 == 48) {
                s = "feed:start//" + System.currentTimeMillis();
                s2 = Code(34);
            }
            if (n2 == 42) {
                s = I(120);
                s2 = Code(51);
            }
            else if (n2 == 35) {
                if (d.ai) {
                    return null;
                }
                s = I(39);
                s2 = Code(176);
            }
            else {
                final Object[] code;
                if (n2 >= 49 && n2 <= 57 && (code = Code(d.a, n2 - 49)) != null && !Code(code)) {
                    s = "ext:" + code[0];
                    final String s4;
                    String s3;
                    if ((s3 = (((s4 = (String)code[1]) == null || s4.length() == 0) ? s : s4)).startsWith("http://")) {
                        s3 = s3.substring(7);
                    }
                    else if (s3.startsWith("https://")) {
                        s3 = s3.substring(8);
                    }
                    if (s3.startsWith("www.")) {
                        s3 = s3.substring(4);
                    }
                    s2 = s3;
                }
            }
        }
        else if (n == 35) {
            String str = "";
            int n3 = 0;
            switch (n2) {
                case 49: {
                    n2 = 80;
                    n3 = 24;
                    break;
                }
                case 50: {
                    n2 = 90;
                    n3 = 7;
                    break;
                }
                case 51: {
                    n2 = 119;
                    n3 = 52;
                    break;
                }
                case 52: {
                    n2 = 65;
                    n3 = 42;
                    break;
                }
                case 53: {
                    n2 = 86;
                    n3 = 16;
                    break;
                }
                case 54: {
                    str = "nint:";
                    n2 = 77;
                    n3 = 49;
                    break;
                }
                case 55: {
                    str = "nint:dialog:";
                    n2 = 89;
                    n3 = 105;
                    break;
                }
                case 56: {
                    n2 = 73;
                    n3 = 9;
                    break;
                }
                case 57: {
                    n2 = 109;
                    n3 = 47;
                    break;
                }
                case 48: {
                    n2 = 83;
                    n3 = 5;
                    break;
                }
                case 35: {
                    n2 = 82;
                    n3 = 32;
                    break;
                }
                case 42: {
                    n2 = 127;
                    n3 = 141;
                    break;
                }
                default: {
                    return null;
                }
            }
            s = str + I(n2);
            s2 = Code(n3);
        }
        if (b) {
            return s2;
        }
        return s;
    }
    
    static int Z(final int n) {
        return J(n) + d.Code[n + 6] + d.d[n + 6];
    }
    
    static int Code(final int n) {
        return (Code((d.k << 1) + n, 0, (d.l ? 1 : 0) * -2 + 6) & 0xFFFFFFFE) + (n & 0x1);
    }
    
    static int I(final int n) {
        return n - (d.k << 1);
    }
    
    static Image Code(final Image image, final int n, final int n2, int n3, int n4, final int n5) {
        if (d.aY) {
            return Image.createImage(image, n, n2, n3, n4, n5);
        }
        final int[] array = new int[n3 * n4];
        image.getRGB(array, 0, n3, n, n2, n3, n4);
        if (n5 == 6) {
            final int n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        if (!d.q) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i] >>> 24 != 255) {
                    final int[] array2 = array;
                    final int n7 = i;
                    array2[n7] &= 0xFFFFFF;
                }
            }
        }
        return Image.createRGBImage(array, n3, n4, true);
    }
    
    static int[] Code(final int[] array, final int b, final int b2, final int n, final boolean b3) {
        final int max = Math.max(1, b * n / b2);
        final int n2 = (b2 << 8) / n;
        final int[] array2 = new int[max * n];
        for (int i = 0; i < n; ++i) {
            final int min = Math.min(i * n2 / 256, b2);
            final int n3 = i * n2 - (min << 8);
            for (int j = 0; j < max; ++j) {
                final int min2 = Math.min(j * n2 / 256, b);
                final int n4 = max * i + j;
                final int n5 = j * n2 - (min2 << 8);
                final int min3 = Math.min(min2 + 1, b - 1);
                final int min4 = Math.min(min + 1, b2 - 1);
                final int n6 = array[b * min + min2];
                final int n7 = array[b * min + min3];
                final int n8 = array[b * min4 + min2];
                final int n9 = array[b * min4 + min3];
                array2[n4] = 0;
                int k;
                if (b3) {
                    k = 24;
                }
                else {
                    k = 16;
                }
                while (k >= 0) {
                    final int[] array3 = array2;
                    final int n10 = n4;
                    array3[n10] += ((n6 >> k & 0xFF) * (255 - n5) * (255 - n3) + (n7 >> k & 0xFF) * n5 * (255 - n3) + (n8 >> k & 0xFF) * (255 - n5) * n3 + (n9 >> k & 0xFF) * n5 * n3) / 65025 << k;
                    k -= 8;
                }
                if (!b3) {
                    final int[] array4 = array2;
                    final int n11 = n4;
                    array4[n11] |= 0xFF000000;
                }
            }
        }
        return array2;
    }
    
    private static int Code(int code, final char c, final boolean b) {
        if (b) {
            code = Code(code);
        }
        if (code >= 6) {
            final d z = Z(code);
            code = c;
            return z.I[Code((char)code)];
        }
        return Code(code, c);
    }
    
    private static boolean Code(final char[] value) {
        final String s = new String(value);
        final char c = value[0];
        final Font defaultFont = Font.getDefaultFont();
        final Image image;
        final Graphics graphics = (image = Image.createImage(Math.max(defaultFont.charWidth(c), 1), defaultFont.getHeight())).getGraphics();
        final int[] array = new int[image.getWidth() * image.getHeight()];
        final int[] array2 = new int[image.getWidth() * image.getHeight()];
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
        graphics.setColor(0);
        graphics.drawChar(c, 0, 0, 20);
        image.getRGB(array, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
        graphics.setColor(0);
        graphics.drawString(s, 0, 0, 20);
        image.getRGB(array2, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
        boolean b = false;
        for (int i = 0; i < array2.length; ++i) {
            if (array2[i] != array[i]) {
                b = true;
                break;
            }
        }
        return b;
    }
    
    static void r() {
        if (!d.l) {
            Label_0023: {
                if (d.n != null) {
                    break Label_0023;
                }
                try {
                    d.n = new d(false);
                    if (d.o == null) {
                        d.o = new d(true);
                    }
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    System.gc();
                    d.l = true;
                    d.g = null;
                }
            }
        }
    }
    
    static void s() {
        d.Code[Code(0)] = (d.d[Code(0)] = -128);
        d.Code[Code(1)] = (d.d[Code(1)] = -128);
        for (int i = 0; i <= 14; ++i) {
            I(Code(0), Code.Code[i].getLabel());
            I(Code(1), Code.Code[i].getLabel());
        }
        for (int j = 20; j <= 23; ++j) {
            I(Code(0), Code(j));
            I(Code(1), Code(j));
        }
        d.Code[6] = d.d[Code(0)];
        d.Code[7] = d.d[Code(1)];
        d.d[6] = d.d[Code(0)];
        d.d[7] = d.d[Code(1)];
        for (int k = 0; k < 6; ++k) {
            d.Code[k] = (d.d[k] = -128);
            I(k, "\u00c5\u8ba4\u5343I[jg");
        }
        final byte[] code = d.Code;
        final int n = 6;
        code[n] -= d.d[Code(0)];
        final byte[] code2 = d.Code;
        final int n2 = 7;
        code2[n2] -= d.d[Code(1)];
        final byte[] d = d.d;
        final int n3 = 6;
        d[n3] -= d.d[Code(0)];
        final byte[] d2 = d.d;
        final int n4 = 7;
        d2[n4] -= d.d[Code(1)];
    }
    
    private static d Z(final int n) {
        if (Z(n)) {
            return d.o;
        }
        return d.n;
    }
    
    private static void I(final int n, final String s) {
        if (s.length() == 0) {
            return;
        }
        if (n >= 6) {
            return;
        }
        final Font font;
        final int stringWidth = (font = d.Code[n]).stringWidth(s);
        final int charWidth = font.charWidth(s.charAt(0));
        final int n2 = font.getHeight() + 10;
        final Image image;
        final Graphics graphics = (image = Image.createImage(stringWidth, n2)).getGraphics();
        final int[] array = new int[stringWidth];
        Code(graphics, 0, 0, stringWidth, n2, 16777215);
        image.getRGB(array, 0, 1, 0, 0, 1, 1);
        final int n3 = array[0];
        graphics.setColor(0);
        graphics.setFont(font);
        graphics.drawString(s, 0, 10, 0);
        int n4 = 0;
        int b = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = n2 - 1; i >= 0; --i) {
            image.getRGB(array, 0, stringWidth, 0, i, stringWidth, 1);
            for (int j = 0; j < stringWidth; ++j) {
                if (array[j] != n3) {
                    if (n5 == 0) {
                        n5 = 1;
                        b = i + 1 - n2;
                    }
                    n6 = ((j >= charWidth) ? 1 : 0);
                    n4 = -i;
                }
            }
        }
        if (n6 != 0) {
            ++n4;
        }
        d.Code[n] = (byte)Math.max(d.Code[n], n4 + 10);
        d.d[n] = (byte)Math.max(d.d[n], b);
    }
    
    private static void e(int b) {
        final int max = Math.max(0, J(b - (d.k << 1)) - ((d.Code[b].getBaselinePosition() > 0) ? d.Code[b].getBaselinePosition() : (d.Code[b].getHeight() + d.d[b])) - d.Code[b]);
        b = J(b - (d.k << 1)) - max;
        d.Code.write(b);
        d.Code.write(max);
    }
    
    static int J(int code) {
        if ((code = Code(code)) >= 6) {
            return d.Code;
        }
        return d.Code[code].getHeight() + d.Code[code] + d.d[code];
    }
    
    static int Code(int code, final char[] array, final int n, final int n2) {
        if ((code = Code(code)) >= 6) {
            final d z = Z(code);
            code = n2;
            int i = n;
            final d d = z;
            int n3 = 0;
            for (code += i; i < code; ++i) {
                n3 += d.I[Code(array[i])];
            }
            return n3;
        }
        if (!d.bk) {
            return d.Code[code].charsWidth(array, n, n2);
        }
        return Z(code, array, n, n2);
    }
    
    static int[] Code(final int[] array, int n) {
        n &= 0xFFFFFF;
        for (int i = 0; i < array.length; ++i) {
            if ((array[i] & 0xFFFFFF) == 0xFFFFFF) {
                array[i] = ((array[i] & 0xFF000000) | n);
            }
        }
        return array;
    }
    
    static int Code(int code, final String s) {
        if ((code = Code(code)) >= 6) {
            return Z(code).I(s);
        }
        if (!d.bk) {
            return d.Code[code].stringWidth(s);
        }
        return Z(code, s.toCharArray(), 0, s.length());
    }
    
    private static int Code(final int n, final char c) {
        if (!d.bk || c == ' ' || c > '\u07ff') {
            return d.Code[n].charWidth(c);
        }
        if (d.Code[n][c] != -1) {
            return d.Code[n][c];
        }
        final int height = d.Code[d.Code.length - 1].getHeight();
        if (d.J == null) {
            d.J = Image.createImage(32, height);
        }
        final Graphics graphics;
        (graphics = d.J.getGraphics()).setColor(-1);
        graphics.fillRect(0, 0, 32, height);
        graphics.setColor(0);
        graphics.setFont(d.Code[n]);
        graphics.drawChar(c, 0, 0, 20);
        final int[] array = new int[height << 5];
        d.J.getRGB(array, 0, 32, 0, 0, 32, height);
        final int n2 = array[array.length - 1];
        int max = 0;
        for (int i = (height << 5) - 1; i >= 0; --i) {
            if (array[i] != n2) {
                max = Math.max(i & 0x1F, max);
                i &= 0xFFFFFFE0;
            }
        }
        return d.Code[n][c] = (byte)(max + 2);
    }
    
    private static void I(final Graphics graphics, final int n, final int n2, final int n3, final int n4, int n5) {
        Code(graphics, n, n2, n3, n4);
        Code(graphics, n, n2 + 5, n3, n4 - 10, n5);
        n5 = 20;
        for (int i = 0; i < 5; ++i) {
            n5 = n5 / 2 + 1;
            graphics.drawLine(n + (n5 >> 1), n2 + i, n + n3 - (n5 >> 1) - 1, n2 + i);
            graphics.drawLine(n + (n5 >> 1), n2 + n4 - i - 1, n + n3 - (n5 >> 1) - 1, n2 + n4 - i - 1);
        }
        Z(graphics);
    }
    
    static void Code(final Graphics graphics, int clipX, int clipY, int clipWidth, int clipHeight, final int color) {
        graphics.setColor(color);
        if (d.aZ) {
            Code(graphics, clipX, clipY, clipWidth, clipHeight);
            clipX = graphics.getClipX();
            clipY = graphics.getClipY();
            clipWidth = graphics.getClipWidth();
            if ((clipHeight = graphics.getClipHeight()) > 0 && clipWidth > 0) {
                graphics.fillRect(clipX, clipY, clipWidth, clipHeight);
                graphics.drawLine(clipX, clipY + clipHeight - 1, clipX + clipWidth - 1, clipY + clipHeight - 1);
            }
            Z(graphics);
            return;
        }
        graphics.fillRect(clipX, clipY, clipWidth, clipHeight);
    }
    
    public static Image Code(final Object[] array, final int[] array2, final int n) {
        if (array.length != 3) {
            return null;
        }
        final int intValue = (int)array[1];
        final int intValue2 = (int)array[2];
        final int[] array3 = (int[])array[0];
        final int[] array4 = new int[intValue * intValue2];
        for (int i = 0; i < intValue2; ++i) {
            final int code = Code(i + n + array2.length - intValue2 - 1, 0, array2.length - 1);
            for (int j = 0; j < intValue; ++j) {
                final int n2 = i * intValue + j;
                final int n3 = (array3[n2] >>> 24) + 1;
                int n4 = 16711680;
                if (n3 > 4) {
                    for (int k = 0; k < 3; ++k) {
                        final int[] array5 = array4;
                        final int n5 = n2;
                        array5[n5] |= (n3 * (array3[n2] & n4) + (256 - n3) * (array2[code] & n4) >>> 8 & n4);
                        n4 >>= 8;
                    }
                }
                else if (n3 > 252) {
                    array4[n2] = array3[n2];
                }
                else {
                    array4[n2] = array2[code];
                }
            }
        }
        return Image.createRGBImage(array4, intValue, intValue2, false);
    }
    
    static void Code(final Graphics graphics, int code, final char[] value, int i, final int count, final int n, final int n2) {
        if ((code = Code(code)) >= 6) {
            final d z = Z(code);
            final int n3 = i;
            code = n;
            i = n3;
            final d d = z;
            final int n4 = i + count;
            d.C(graphics.getColor());
            while (i < n4) {
                code += d.Code(graphics, value[i], code, n2);
                ++i;
            }
            return;
        }
        graphics.setFont(d.Code[code]);
        if (d.ba) {
            graphics.drawString(new String(value, i, count), n, n2 + d.Code[code], 20);
            return;
        }
        graphics.drawChars(value, i, count, n, n2 + d.Code[code], 20);
    }
    
    static void Code(final Graphics graphics, int b, final String s, int n, final int n2, final int n3) {
        if ((b = Code(b)) >= 6) {
            final d z = Z(b);
            final int n4 = n;
            int a = 0;
            b = n3;
            n = n4;
            final d d = z;
            final int length;
            if ((length = s.length()) != 0) {
                if ((b & 0x1) != 0x0) {
                    n -= d.I(s) / 2;
                }
                else if ((b & 0x8) != 0x0) {
                    n -= d.I(s);
                }
                b = graphics.getClipX();
                final int clipY = graphics.getClipY();
                final int clipWidth = graphics.getClipWidth();
                final int clipHeight = graphics.getClipHeight();
                d.C(graphics.getColor());
                for (int i = 0; i < length; ++i) {
                    final int code = d.Code(graphics, s.charAt(i), n, n2);
                    if (n + code > a) {
                        final int max = Math.max(a, b);
                        graphics.setClip(max, clipY, clipWidth + b - max, clipHeight);
                        a = Integer.MAX_VALUE;
                        --i;
                    }
                    else {
                        n += code;
                    }
                }
                graphics.setClip(b, clipY, clipWidth, clipHeight);
            }
            return;
        }
        graphics.setFont(d.Code[b]);
        graphics.drawString(s, n, n2 + d.Code[b], n3);
    }
    
    private static void c(final int n, final int n2) {
        d.aG = ((d.aG <<= n2) | (n & (1 << n2) - 1));
        d.aF += n2;
        while (d.aF >= 8) {
            d.aF -= 8;
            d.Code.write(d.aG >> d.aF);
        }
    }
    
    private static void Code(final char[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            d.Code.write(Math.max(0, Code(n, array[i], false)));
        }
    }
    
    private static void b(final int n, int i) {
        d.aF = 0;
        d.aH = 4;
        d.aI = 1 << d.aH - 1;
        int n2 = 0;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        final int[] array = { 1, 31, 128, 159, 2143, 2303, 6830, 6911, 7296, 7375, 11098, 11263, 11826, 11903, 13312, 19903, 19904, 19967, 19968, 40907, 40908, 40959, 42648, 42751, 42922, 43001, 43823, 43967, 44032, 55215, 55296, 63743, 65536 };
        int n5 = 0;
        while (i <= 65535) {
            final int code = Code(n, (char)(i++), false);
            ++d.z;
            int a = code - n2;
            n2 = code;
            final int abs = Math.abs(a);
            if (a == n3 && i - 1 != array[n5]) {
                ++n4;
            }
            else {
                if (n4 > 0) {
                    if (n4 < 4) {
                        for (int j = 0; j < n4; ++j) {
                            c(n3, d.aH);
                        }
                        n4 = 0;
                    }
                    else {
                        c(d.aI, d.aH);
                        if (n4 <= 1 << (d.aH << 1) - 1) {
                            c(n4, d.aH << 1);
                            n4 = 0;
                        }
                        else {
                            c(2, d.aH << 1);
                            c(n4, 16);
                            n4 = 0;
                        }
                    }
                }
                while (abs >>> d.aH - 1 != 0) {
                    c(d.aI, d.aH);
                    c(1, d.aH << 1);
                    ++d.aH;
                    d.aI = 1 << d.aH - 1;
                }
                c(a, d.aH);
                if (i - 1 == array[n5]) {
                    a = 0;
                    c(0, d.aH);
                    n4 = array[n5 + 1] - array[n5] - 1;
                    i = array[n5 + 1] + 1;
                    n5 += 2;
                }
                n3 = a;
            }
        }
        if (n4 > 0) {
            c(d.aI, d.aH);
            c(2, d.aH << 1);
            c(n4, 16);
        }
        c(d.aI, d.aH);
        c(3, d.aH << 1);
        if (d.aF != 0) {
            d.Code.write(d.aG << 8 - d.aF);
        }
    }
    
    private static char[] Code() {
        final char[] array = new char[588];
        final char[] code = Code(92);
        int n = 313;
        for (int i = 0; i < code.length; i = (char)(i + 2)) {
            for (char c = code[i]; c <= code[i + 1]; ++c) {
                array[n++] = c;
            }
        }
        final char[] code2 = Code(91);
        final int n2 = 0;
        final char[] array2 = array;
        final int n3 = 313;
        final char[] array3 = array;
        int n4 = 0;
        final char[] array4 = array3;
        int n5 = n3;
        final char[] array5 = array2;
        int n6 = n2;
        for (char[] array6 = code2; n6 < array6.length || n5 < array5.length; array4[n4++] = ((n5 == array5.length) ? array6[n6++] : ((n6 != array6.length && array6[n6] < array5[n5]) ? array6[n6++] : array5[n5++]))) {}
        return array;
    }
    
    static void Code(final Graphics graphics, int n, int a, int a2, final int n2) {
        if (d.bl) {
            final int[] item;
            (item = new int[4])[0] = d.aJ;
            item[1] = d.aK;
            item[2] = d.aL;
            item[3] = d.aM;
            d.Code.push(item);
        }
        d.bl = true;
        d.aJ = graphics.getClipX();
        d.aK = graphics.getClipY();
        d.aL = graphics.getClipWidth();
        d.aM = graphics.getClipHeight();
        final int n3 = n;
        final int n4 = a;
        n = a2;
        a = n4;
        a2 = n3;
        final int clipX = graphics.getClipX();
        final int clipY = graphics.getClipY();
        final int clipWidth = graphics.getClipWidth();
        final int clipHeight = graphics.getClipHeight();
        if (Code(a2, a, n, n2, clipX, clipY, clipWidth, clipHeight)) {
            graphics.setClip(Math.max(a2, clipX), Math.max(a, clipY), (a2 < clipX) ? ((a2 + n > clipX + clipWidth) ? clipWidth : (a2 + n - clipX)) : ((clipX + clipWidth > a2 + n) ? n : (clipX + clipWidth - a2)), (a < clipY) ? ((a + n2 > clipY + clipHeight) ? clipHeight : (a + n2 - clipY)) : ((clipY + clipHeight > a + n2) ? n2 : (clipY + clipHeight - a)));
            return;
        }
        graphics.setClip(0, 0, 0, 0);
    }
    
    static Image Code(final Image image, int n, final int n2, final boolean b) {
        n = image.getHeight() - n;
        final int width;
        final int[] array = new int[(width = image.getWidth()) * n];
        image.getRGB(array, 0, width, 0, 0, width, n);
        final int[] code = Code(array, width, n, n2, b);
        return Image.createRGBImage(code, code.length / n2, n2, true);
    }
    
    public static void Code(final InputStream inputStream) {
        try {
            inputStream.close();
        }
        finally {}
    }
    
    static void Z(final String s) {
        try {
            RecordStore.deleteRecordStore(s);
        }
        catch (RecordStoreException ex) {}
    }
    
    static void Z(final Graphics graphics) {
        if (d.bl) {
            d.bl = false;
            graphics.setClip(d.aJ, d.aK, d.aL, d.aM);
            return;
        }
        final int[] array = d.Code.pop();
        graphics.setClip(array[0], array[1], array[2], array[3]);
    }
    
    static void Code(final Graphics graphics, final int n, int i, int n2, int n3, int n4, int n5) {
        if (n2 <= 0 || n3 <= 0) {
            return;
        }
        int n6 = n4 >> 8 & 0xFF00;
        int n7 = n4 & 0xFF00;
        n4 = (n4 << 8 & 0xFF00);
        final int n8 = ((n5 >> 8 & 0xFF00) - n6) / n3;
        final int n9 = ((n5 & 0xFF00) - n7) / n3;
        n5 = ((n5 << 8 & 0xFF00) - n4) / n3;
        n2 = n + n2 - 1;
        for (n3 = i + n3 - 1; i < n3; ++i) {
            graphics.setColor((n6 & 0xFF00) << 8 | (n7 & 0xFF00) | n4 >> 8);
            graphics.drawLine(n, i, n2, i);
            n6 += n8;
            n7 += n9;
            n4 += n5;
        }
    }
    
    static void Code(final Graphics graphics, int n, int n2, int n3, int n4, int i, final boolean b) {
        final int ao;
        if ((ao = i >>> 24) == 0) {
            return;
        }
        if (ao >= 254) {
            Code(graphics, n, n2, n3, n4, i);
            return;
        }
        if (!d.q) {
            return;
        }
        if (d.aN != i || d.aO != ao) {
            for (int j = 0; j < d.c.length; ++j) {
                d.c[j] = i;
            }
            if (d.y) {
                if (d.d == null || d.d.length != 64) {
                    d.d = new int[64];
                    for (int k = 0; k < d.d.length; ++k) {
                        d.d[k] = -1;
                    }
                }
                Image.createRGBImage(d.d, 8, 8, false);
            }
            if (!d.x) {
                d.B = Image.createRGBImage(d.c, 8, 8, true);
            }
            d.aN = i;
            d.aO = ao;
            if (b) {
                d.e = new int[] { ao, ao, ao, ao, (ao << 1) / 3, ao, ao, ao, ao, ao / 3, ao, ao, ao, (ao << 1) / 3, 0, ao, ao, (ao << 1) / 3, 0, 0, (ao << 1) / 3, ao / 3, 0, 0, 0 };
                for (int l = 0; l < d.e.length; ++l) {
                    d.e[l] = ((i & 0xFFFFFF) | d.e[l] << 24);
                }
                if (d.x) {
                    d.h = new int[25];
                    d.f = new int[25];
                    d.g = new int[25];
                    i = 0;
                    for (int n5 = 0; n5 < 5; ++n5) {
                        for (int n6 = 0; n6 < 5; ++n6) {
                            d.h[i] = d.e[(4 - n5) * 5 + (4 - n6)];
                            d.g[i] = d.e[(4 - n5) * 5 + n6];
                            d.f[i++] = d.e[n5 * 5 + (4 - n6)];
                        }
                    }
                }
                else {
                    d.C = Image.createRGBImage(d.e, 5, 5, true);
                }
            }
        }
        if (b) {
            n3 -= 10;
            n += 5;
        }
        Code(graphics, n, n2, n3, n4);
        int n7;
        for (i = n; i < n + n3; i += 8) {
            for (n7 = n2; n7 < n2 + n4; n7 += 8) {
                if (d.x) {
                    graphics.drawRGB(d.c, 0, 8, i, n7, 8, 8, true);
                }
                else {
                    graphics.drawImage(d.B, i, n7, 20);
                }
            }
        }
        Z(graphics);
        if (b) {
            n3 += 10;
            n -= 5;
            n4 -= 10;
            n2 += 5;
            Code(graphics, n, n2, n3, n4);
            for (i = n2; i < n2 + n4; i += 8) {
                if (d.x) {
                    graphics.drawRGB(d.c, 0, 8, n - 3, i, 8, 8, true);
                    graphics.drawRGB(d.c, 0, 8, n + n3 - 5, i, 8, 8, true);
                }
                else {
                    graphics.drawImage(d.B, n - 3, i, 20);
                    graphics.drawImage(d.B, n + n3 - 5, i, 20);
                }
            }
            Z(graphics);
            n4 += 10;
            n2 -= 5;
            Code(graphics, n, n2, n3, n4);
            if (d.x) {
                graphics.drawRGB(d.g, 0, 5, n + n3 - 5, n2, 5, 5, true);
                graphics.drawRGB(d.e, 0, 5, n + n3 - 5, n2 + n4 - 5, 5, 5, true);
                graphics.drawRGB(d.h, 0, 5, n, n2, 5, 5, true);
                graphics.drawRGB(d.f, 0, 5, n, n2 + n4 - 5, 5, 5, true);
            }
            else {
                graphics.drawRegion(d.C, 0, 0, 5, 5, 3, n, n2, 20);
                graphics.drawRegion(d.C, 0, 0, 5, 5, 6, n + n3 - 5, n2, 20);
                graphics.drawRegion(d.C, 0, 0, 5, 5, 5, n, n2 + n4 - 5, 20);
                graphics.drawRegion(d.C, 0, 0, 5, 5, 0, n + n3 - 5, n2 + n4 - 5, 20);
            }
            Z(graphics);
        }
    }
    
    private static String C(String substring) {
        final StringBuffer sb;
        (sb = new StringBuffer()).ensureCapacity(substring.length());
        int index;
        while ((index = substring.indexOf(37)) >= 0) {
            sb.append(substring.substring(0, index)).append((char)Integer.parseInt(substring.substring(index + 1, index + 3), 16));
            substring = substring.substring(index + 3, substring.length());
        }
        return sb.append(substring).toString();
    }
    
    public static void Code(final OutputStream outputStream) {
        try {
            outputStream.close();
        }
        finally {}
    }
    
    public static void Code(final Connection connection) {
        try {
            connection.close();
        }
        finally {}
    }
    
    static String Code(final String s, final boolean b) {
        if (s == null) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1;
            if ((char1 = s.charAt(i)) <= '\u007f') {
                if (b && char1 == ' ') {
                    sb.append('+');
                }
                else if (char1 == '%' || char1 <= ' ') {
                    Code(sb, char1);
                }
                else if (b && "&=?#:".indexOf(char1) >= 0) {
                    Code(sb, char1);
                }
                else {
                    sb.append(char1);
                }
            }
            else {
                if (char1 > '\u07ff') {
                    Code(sb, (char)(0xE0 | (char1 >> 12 & 0xF)));
                    Code(sb, (char)(0x80 | (char1 >> 6 & 0x3F)));
                }
                else {
                    Code(sb, (char)(0xC0 | (char1 >> 6 & 0x1F)));
                }
                Code(sb, (char)(0x80 | (char1 & '?')));
            }
        }
        return sb.toString();
    }
    
    private static byte[] Code(final String s) {
        final byte[] array = new byte[s.length() / 2];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (byte)Integer.parseInt(s.substring(i << 1, (i << 1) + 2), 16);
        }
        return array;
    }
    
    static void Code(final Runnable target) {
        new Thread(target).start();
    }
    
    private static void Code(final StringBuffer sb, final char i) {
        sb.append('%');
        if (i < '\u0010') {
            sb.append('0');
        }
        sb.append(Integer.toHexString(i));
    }
    
    private static byte[] Code(final int[] array) {
        final byte[] array2;
        int length = (array2 = new byte[array.length << 2]).length;
        while (--length >= 0) {
            array2[length] = (byte)(array[length / 4] >> 8 * (3 - length % 4));
        }
        return array2;
    }
    
    static void Code(final StringBuffer sb, final String s) {
        sb.ensureCapacity(sb.length() + s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1;
            if ((char1 = s.charAt(i)) == '\0') {
                sb.append("%00");
            }
            else if ("%&=".indexOf(char1) >= 0) {
                sb.append('%').append(Integer.toString(char1, 16));
            }
            else {
                sb.append(char1);
            }
        }
    }
    
    static void Code(final DataOutputStream dataOutputStream, final int b) {
        dataOutputStream.writeShort(b >> 8);
        dataOutputStream.write(b);
    }
    
    private static void Code(final DataOutputStream dataOutputStream, final int[] array) {
        if (array != null) {
            dataOutputStream.writeShort(array.length);
            dataOutputStream.write(Code(array));
            return;
        }
        dataOutputStream.writeShort(0);
    }
    
    static String I(final byte[] array, int min) {
        min = Math.min(min, 128);
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < min; ++i) {
            if ((array[i] & 0xFF) < 16) {
                sb.append('0');
            }
            sb.append(Integer.toString(array[i] & 0xFF, 16));
        }
        return sb.toString();
    }
    
    private static int Code(final RecordStore recordStore, byte[] code) {
        code = Code(code);
        return recordStore.addRecord(code, 0, code.length);
    }
    
    private static synchronized Vector Code(String numRecords) {
        RecordStore openRecordStore = null;
        final Vector<byte[]> vector = new Vector<byte[]>();
        final boolean b = false;
        try {
            (openRecordStore = RecordStore.openRecordStore(anObject, b)).getSizeAvailable();
            if ("s".equals(anObject)) {
                final RecordEnumeration enumerateRecords = openRecordStore.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
                int max = -1;
                for (int numRecords2 = enumerateRecords.numRecords(), i = 0; i < numRecords2; ++i) {
                    max = Math.max(max, enumerateRecords.nextRecordId());
                }
                vector.addElement(openRecordStore.getRecord(max));
            }
            else {
                numRecords = (String)openRecordStore.getNumRecords();
                int j = 1;
                while (j <= numRecords) {
                    final RecordStore recordStore = openRecordStore;
                    final int n = j;
                    try {
                        vector.addElement(recordStore.getRecord(n));
                        ++j;
                    }
                    catch (RecordStoreException ex) {
                        ++j;
                    }
                }
            }
        }
        finally {}
        final RecordStore recordStore2 = openRecordStore;
        try {
            recordStore2.closeRecordStore();
        }
        finally {
            return vector;
        }
    }
    
    private static synchronized boolean Code(final String anObject, byte[] array, final Vector vector, final boolean b) {
        RecordStore recordStore = null;
        final String s = "s";
        boolean b2 = false;
        try {
            if (s.equals(anObject) && (!d.aV || b)) {
                final int code = Code(recordStore = RecordStore.openRecordStore(anObject, true), array);
                RecordEnumeration enumerateRecords;
                for (int numRecords = (enumerateRecords = recordStore.enumerateRecords((RecordFilter)null, (RecordComparator)null, (boolean)(0 != 0))).numRecords(), i = 0; i < numRecords; ++i) {
                    final int nextRecordId;
                    if ((nextRecordId = enumerateRecords.nextRecordId()) != code) {
                        recordStore.deleteRecord(nextRecordId);
                    }
                }
            }
            else {
                try {
                    RecordStore.deleteRecordStore(anObject);
                }
                catch (RecordStoreException ex) {}
                recordStore = RecordStore.openRecordStore(anObject, true);
                if (array != null) {
                    Code(recordStore, array);
                }
                else if (vector != null) {
                    for (int j = 0; j < vector.size(); ++j) {
                        array = vector.elementAt(j);
                        Code(recordStore, array);
                    }
                }
            }
        }
        finally {
            b2 = false;
        }
        final RecordStore recordStore2 = recordStore;
        try {
            recordStore2.closeRecordStore();
            return b2;
        }
        finally {
            return false;
        }
    }
    
    static Vector Code(final boolean b, final String anObject, final int n) {
        Vector<Object[]> vector = null;
        DataInputStream code = null;
        int equals = 0;
        Vector<byte[]> code2 = null;
        DataInputStream dataInputStream = null;
        Label_0051: {
            if (!b) {
                break Label_0051;
            }
            try {
                int initialCapacity;
                if ((initialCapacity = (code2 = (Vector<byte[]>)Code(anObject)).size()) == 0) {
                    final InputStream inputStream = null;
                    try {
                        inputStream.close();
                    }
                    finally {
                        return null;
                    }
                }
                equals = (anObject.equals("h1") ? 1 : 0);
                while (true) {
                    vector = new Vector<Object[]>(initialCapacity);
                    for (int i = 0; i < initialCapacity; ++i) {
                        if (b) {
                            (code = new DataInputStream(new ByteArrayInputStream(code2.elementAt(i)))).read();
                        }
                        final Object[] obj;
                        (obj = new Object[equals + 11])[0] = code.readUTF();
                        obj[1] = code.readUTF();
                        final short short1;
                        if ((short1 = code.readShort()) > 0) {
                            final byte[] b2 = new byte[short1];
                            code.readFully(b2);
                            obj[2] = b2;
                        }
                        if (equals != 0) {
                            obj[3] = code.readUTF();
                        }
                        else {
                            final int n2 = n - 66;
                            int n3 = (n2 | -n2) >>> 31 ^ 0x1;
                            final byte byte1 = code.readByte();
                            obj[3] = new Integer(byte1);
                            final byte[] b3 = new byte[16];
                            final byte[] b4 = new byte[16];
                            for (int j = 0; j < 16; ++j) {
                                b4[j] = -1;
                            }
                            if ((byte1 & 0x8) != 0x0) {
                                final byte byte2 = code.readByte();
                                obj[5] = new Integer(code.readByte());
                                obj[6] = new Integer(code.readByte());
                                code.readFully(b3);
                                if (byte2 > 1) {
                                    code.readFully(b4);
                                }
                                if (byte2 > 2) {
                                    obj[9] = new Integer(code.readByte());
                                    obj[10] = new Integer(code.readInt());
                                }
                                else {
                                    n3 = 1;
                                }
                            }
                            else {
                                obj[5] = new Integer(97);
                                obj[6] = new Integer(0);
                                for (int k = 0; k < 16; ++k) {
                                    b3[k] = (byte)d.Code.nextInt();
                                }
                            }
                            obj[4] = new Integer(3);
                            obj[7] = b3;
                            obj[8] = b4;
                            if (n3 != 0 && ("sp".equals(anObject) || Code(obj, 1)) && !Code(obj)) {
                                obj[9] = new Integer(4);
                                final String s;
                                obj[10] = new Integer(B((String)obj[1] + (((s = (String)obj[0]).length() > 2 && s.indexOf(47) == 1) ? s.substring(2) : s)));
                            }
                            else if (n3 != 0) {
                                obj[9] = new Integer(0);
                                obj[10] = new Integer(0);
                            }
                        }
                        if (!obj[1].equals("o:X")) {
                            if (!obj[0].equals("o:u")) {
                                vector.addElement(obj);
                            }
                        }
                    }
                    dataInputStream = code;
                    dataInputStream.close();
                    initialCapacity = (code = Code(n)).readUnsignedByte();
                    continue;
                }
            }
            finally {
                final DataInputStream dataInputStream2 = code;
                dataInputStream2.close();
                return vector;
            }
        }
        try {
            dataInputStream.close();
            final DataInputStream dataInputStream2 = code;
            dataInputStream2.close();
            return vector;
        }
        finally {
            return vector;
        }
    }
    
    static void Code(final int n, final String s) {
        RecordStore openRecordStore = null;
        final boolean b = false;
        RecordStore recordStore;
        try {
            (openRecordStore = RecordStore.openRecordStore(s, b)).deleteRecord(n);
            recordStore = openRecordStore;
            recordStore.closeRecordStore();
            return;
        }
        finally {
            openRecordStore.closeRecordStore();
            return;
        }
        try {
            recordStore.closeRecordStore();
        }
        finally {}
    }
    
    static byte[] Code(int n, final String s) {
        RecordStore openRecordStore = null;
        final boolean b = true;
        try {
            record = (int)(Object)(openRecordStore = RecordStore.openRecordStore(s, b)).getRecord(n);
            final RecordStore recordStore = openRecordStore;
            try {
                recordStore.closeRecordStore();
            }
            finally {
                return (byte[])(Object)record;
            }
        }
        finally {
            final RecordStore recordStore2 = openRecordStore;
            try {
                recordStore2.closeRecordStore();
            }
            finally {
                return null;
            }
        }
    }
    
    static void u() {
        if (d.h == null) {
            final int n = 1;
            final String s = "r";
            byte[] code;
            try {
                if ((code = Code(n, s)) == null) {
                    return;
                }
                final d d;
                (d = new d((byte)0)).Code(code, 0, code.length);
                final byte[] array = new byte[32];
                d.Code(array);
                if (!I(array, Code(70))) {
                    final String s2 = "r";
                    try {
                        RecordStore.deleteRecordStore(s2);
                        return;
                    }
                    catch (RecordStoreException ex) {
                        return;
                    }
                }
            }
            finally {}
            final int i;
            d.h = new byte[i = I(code, 0)];
            final d d2;
            (d2 = new d(d.h)).C(code, 2, code.length - 2);
            d2.Code((byte[])null, 0, i);
            d.aE = true;
        }
    }
    
    static synchronized int Code(int code, byte[] code2, final String s, boolean openRecordStore) {
        if (b) {
            try {
                RecordStore.deleteRecordStore(s);
            }
            catch (RecordStoreException ex) {}
        }
        openRecordStore = (int)null;
        final boolean b2 = true;
        try {
            openRecordStore = (int)RecordStore.openRecordStore(s, b2);
            Label_0037: {
                if (code != -1) {
                    break Label_0037;
                }
                code = Code((RecordStore)openRecordStore, code2);
                final int n = openRecordStore;
                try {
                    ((RecordStore)n).closeRecordStore();
                    final int n2 = openRecordStore;
                    code2 = Code(code2);
                    ((RecordStore)n2).setRecord(code, code2, 0, code2.length);
                    ((RecordStore)openRecordStore).closeRecordStore();
                }
                finally {
                    return code;
                }
            }
        }
        finally {
            final int n3 = openRecordStore;
            try {
                ((RecordStore)n3).closeRecordStore();
            }
            finally {
                return -1;
            }
        }
    }
    
    static Image Code(final int n) {
        try {
            final byte[] code;
            if ((code = Code(n)).length == 0) {
                return null;
            }
            if (code[0] == 67) {
                return Code(code, 0, code.length, 256, null);
            }
            return Image.createImage(code, 0, code.length);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    static DataInputStream Code(final int n) {
        DataInputStream dataInputStream;
        if ((n & 0x40) == 0x0) {
            u();
            dataInputStream = new DataInputStream(new ByteArrayInputStream(d.h));
        }
        else {
            dataInputStream = new DataInputStream(Code(((n & 0x40) == 0x0) ? "/t" : "/v"));
        }
        Code(n, dataInputStream);
        return dataInputStream;
    }
    
    static byte[] Code(int n) {
        DataInputStream dataInputStream = null;
        Label_0069: {
            if ((code & 0x40) != 0x0) {
                break Label_0069;
            }
            try {
                u();
                code = 4 * (code & 0x3F);
                final int z = Z(d.h, code);
                final int n2;
                final byte[] array = new byte[n2 = Z(d.h, code + 4) + 4 - z];
                System.arraycopy(d.h, code + z + 8, array, 0, n2);
                n = (int)(Object)array;
                InputStream inputStream = null;
                while (true) {
                    try {
                        inputStream.close();
                    }
                    finally {
                        return (byte[])(Object)n;
                    }
                    dataInputStream = new DataInputStream(Code(((code & 0x40) == 0x0) ? "/t" : "/v"));
                    final byte[] b = new byte[code = Code(code, dataInputStream)];
                    dataInputStream.readFully(b, 0, code);
                    n = (int)(Object)b;
                    inputStream = dataInputStream;
                    continue;
                }
            }
            catch (Exception ex) {
                final DataInputStream dataInputStream2 = dataInputStream;
                try {
                    dataInputStream2.close();
                }
                finally {
                    return null;
                }
            }
            finally {
                final DataInputStream dataInputStream3 = dataInputStream;
                try {
                    dataInputStream3.close();
                }
                finally {}
            }
        }
    }
    
    private static int Code(int int1, final DataInputStream dataInputStream) {
        Code(dataInputStream, (long)(4 * (int1 & 0x3F)));
        int1 = dataInputStream.readInt();
        final int n = dataInputStream.readInt() + 4 - int1;
        Code(dataInputStream, (long)int1);
        return n;
    }
    
    private static Object[] Code(String s, final boolean b) {
        String substring = "";
        for (s = s.toLowerCase(); s.startsWith("<"); s = s.substring(s.indexOf(62) + 1)) {}
        final int index;
        String substring2;
        if ((index = s.indexOf(58)) != -1 && (substring2 = s.substring(0, index)).indexOf(46) == -1) {
            s = s.substring(index + 1);
        }
        else {
            substring2 = "http";
        }
        String s2;
        Integer n;
        if (!d.Z.containsKey(substring2)) {
            s2 = "";
            n = d.Code;
        }
        else {
            if (s.startsWith("//")) {
                s = s.substring(2);
            }
            final int index2;
            if ((index2 = s.indexOf(63)) != -1) {
                substring = s.substring(index2);
                s = s.substring(0, index2);
            }
            final int index3;
            if ((index3 = s.indexOf(47)) != -1) {
                s2 = s.substring(0, index3);
                s = s.substring(index3);
            }
            else {
                s2 = s;
                s = "";
            }
            final int index4;
            if ((index4 = s2.indexOf(64)) != -1) {
                s2 = s2.substring(index4 + 1);
            }
            if (b && s2.startsWith("www.")) {
                s2 = s2.substring(4);
            }
            final int index5;
            if ((index5 = s2.indexOf(58)) != -1) {
                n = Integer.valueOf(s2.substring(index5 + 1));
                s2 = s2.substring(0, index5);
            }
            else {
                n = d.Z.get(substring2);
            }
        }
        return new Object[] { substring2, s2, n, s, substring };
    }
}
