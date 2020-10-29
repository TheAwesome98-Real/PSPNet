import java.util.Random;
import javax.microedition.lcdui.Graphics;
import java.util.TimerTask;
import javax.microedition.lcdui.Font;
import java.io.OutputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

class B implements Runnable
{
    boolean c;
    d Code;
    boolean J;
    private J Z;
    private f Code;
    boolean Code;
    private int k;
    boolean I;
    private boolean f;
    private boolean g;
    private String c;
    String Code;
    private int[] a;
    private Integer Code;
    String I;
    private static String f;
    byte[] I;
    private String a;
    byte[] Code;
    private String b;
    int j;
    int e;
    String Z;
    static int c;
    String J;
    Image Code;
    boolean Z;
    private boolean h;
    private int o;
    boolean B;
    private boolean m;
    boolean C;
    String C;
    private boolean i;
    private boolean j;
    private boolean k;
    int Code;
    int I;
    int Z;
    int J;
    static Vector Code;
    int B;
    private int l;
    static Image[] Code;
    long Code;
    private DataOutputStream Code;
    private int m;
    boolean a;
    int C;
    private boolean l;
    public int a;
    private String[] Code;
    public boolean b;
    int[] Code;
    private int[] C;
    private Object[] Z;
    private static String e;
    Object[] Code;
    private static int n;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int[] I;
    private int[] Z;
    private int[] J;
    private int[] B;
    public static int i;
    private Vector Z;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean n;
    private boolean o;
    private boolean p;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private Hashtable Z;
    private Hashtable J;
    private int as;
    Hashtable Code;
    private Vector I;
    String B;
    int b;
    private boolean q;
    private boolean r;
    private int at;
    Hashtable I;
    private String d;
    boolean d;
    private String[] I;
    private J Code;
    private J I;
    private DataOutputStream I;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private DataOutputStream Z;
    private int aA;
    private int aB;
    private int aC;
    private static final int aD;
    private boolean s;
    static Object[] I;
    static int d;
    int f;
    int g;
    int h;
    private int aE;
    private int aF;
    private int aG;
    private static char[] Code;
    static Image[] I;
    private static String[] Z;
    private char Code;
    private Vector J;
    private Hashtable B;
    private int aH;
    private int aI;
    private static int[] b;
    private static int[] c;
    private static int[] d;
    private static int aJ;
    private static int aK;
    private int aL;
    private int aM;
    private int aN;
    boolean e;
    private Vector B;
    private Hashtable C;
    private int aO;
    
    public void run() {
        final int n = 1;
        try {
            this.a(n);
            while (this.Code != null) {
                final d code = this.Code;
                try {
                    Code(code);
                    final Object[] array = new Object[110];
                    final int[] array2 = new int[110];
                    if (d.Code(this.Code) == -1 && !this.Code.equals(d.C)) {
                        B.f = this.Code;
                        if (this.Code.startsWith("search:")) {
                            B.f = "ext:" + B.f;
                        }
                    }
                    array[53] = this.Code;
                    array[38] = this.J;
                    array[42] = this.Z;
                    array2[56] = (this.Code ? 1 : 0);
                    array[1] = d.Code("microedition.configuration");
                    array[2] = d.Code("microedition.profiles");
                    array[3] = d.Code("microedition.platform");
                    array[4] = d.Code("microedition.locale");
                    array[5] = d.Code("microedition.encoding");
                    array2[75] = (array2[74] = 109);
                    array[54] = Code.I;
                    array[34] = d.I;
                    array[57] = d.J;
                    array2[52] = d.C;
                    array[41] = d.h;
                    array[49] = d.s;
                    final int[] array3 = array2;
                    final int n2 = 24;
                    final int n3 = ((-d.q) ? 1 : 0) + 2 | 0x4 | (d.an ? 1 : 0) << 4 | (d.ar ? 1 : 0) << 11 | (d.aa ? 1 : 0) << 13 | 0x1000 | (d.X ? 1 : 0) << 15 | 0x4000000;
                    if (d.n) {}
                    array3[n2] = n3;
                    array2[43] = 16384;
                    array2[14] = d.k << 1;
                    array2[19] = this.Code.Z();
                    array2[20] = this.Code.J();
                    array2[25] = Code.f;
                    array2[26] = Code.g;
                    array2[21] = (d.aq ? 1 : 0) * 15 + 100;
                    this.g = d.aq;
                    array[22] = String.valueOf(d.Z - d.J);
                    array[51] = String.valueOf(d.Z);
                    final boolean b = d.ap - this.I;
                    this.f = (((b | -b) ? 1 : 0) >>> 31 != 0);
                    array2[23] = (this.f ? (d.j + 2) : 1);
                    if (d.c != null && d.c.size() > 0) {
                        array[7] = ((Object[])d.c.elementAt(0))[0];
                    }
                    array2[8] = (d.ay ? 1 : 0);
                    array2[50] = (this.Code.equals("server:reset") ? 1 : 0);
                    array2[16] = (int)((d.Z - d.J) / 4L);
                    array[9] = this.Z[11];
                    array2[58] = (int)(d.Code(false, true) / 1000L);
                    array[59] = d.Code(false, true).getTimeZone().getID();
                    final B code2;
                    if ((code2 = Code.Code()) != null) {
                        array2[62] = code2.Q;
                        if (code2.I != null && d.I((String)array[42], code2.I[1]) != null) {
                            final StringBuffer sb;
                            (sb = new StringBuffer((String)array[42])).append("&");
                            d.Code(sb, code2.I[0]);
                            sb.append("=");
                            d.Code(sb, Z.Code());
                            array[42] = sb.toString();
                        }
                    }
                    if (d.am) {
                        final int[] array4 = array2;
                        final int n4 = 43;
                        array4[n4] |= 0x8000000;
                    }
                    final int[] array5 = array2;
                    final int n5 = 43;
                    array5[n5] |= 0x40101000;
                    array2[109] = 16;
                    final int[] array6 = array2;
                    final int n6 = 109;
                    array6[n6] |= 0x80;
                    array2[76] = 7;
                    Code.J();
                    array[77] = Code.Code;
                    if (!this.Code.startsWith("server:gettitle")) {
                        if (Code.I) {
                            Code.B();
                        }
                        if (Code.I != null) {
                            array[73] = Code.I;
                        }
                        if (Code.Z.length > 1) {
                            array[79] = Code.Z;
                            Code.Code = false;
                        }
                    }
                    String s;
                    if ((s = d.l) == null || s.equals("")) {
                        s = Browser.Code.getAppProperty("OM-Campaign");
                    }
                    if (s != null && !s.equals("") && !s.equals("debug")) {
                        array[78] = s;
                    }
                    array[103] = "o";
                    array2[32] = ((d.aE ^ true) ? 1 : 0) * 9;
                    if (this.Code.Code() != null) {
                        array2[93] = 121;
                    }
                    else {
                        array2[93] = this.k;
                    }
                    array2[106] = (d.aA ? d.p : 0);
                    this.Code = d.Code(array, array2, d.Code((String)array[53], (String)array[38]));
                    this.U();
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    this.a(6);
                    Code.Code(2);
                    Code.Code(d.Code(53));
                }
                finally {
                    if (this.C != 7) {
                        if (this.l) {
                            this.l = false;
                            this.T();
                            continue;
                        }
                        String string = (this.Code != null && this.Code.C() == 1) ? d.Code(87) : null;
                        if (this.C < 4) {
                            this.a(6);
                            if (string != null) {
                                final StringBuffer sb2;
                                d.Code((sb2 = new StringBuffer()).append("b="), string);
                                string = sb2.toString();
                            }
                            this.Code.Code(d.I(36), (String)null, string);
                        }
                        else {
                            this.a(6);
                            Code.Code(d.Code(37), (string != null) ? string : d.Code(38));
                        }
                    }
                }
                break;
            }
            this.T();
        }
        finally {}
    }
    
    static String Code(final Hashtable hashtable) {
        final StringBuffer sb = new StringBuffer();
        final Enumeration<String> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            if (sb.length() != 0) {
                sb.append("\u0000");
            }
            sb.append(elements.nextElement());
        }
        return sb.toString();
    }
    
    final void J() {
        final Enumeration<Object> elements = this.I.elements();
        while (elements.hasMoreElements()) {
            this.Code.remove(elements.nextElement());
        }
        this.I.removeAllElements();
    }
    
    final Image Code() {
        if ((this.Code == null || this.Code.getHeight() != Code.e) && this.Code != null) {
            final Object[] array = new Object[3];
            d.Code(this.Code, 0, this.Code.length, 256, array);
            if (array[0] != null) {
                if ((int)array[2] != Code.e) {
                    array[0] = d.Code((int[])array[0], (int)array[1], (int)array[2], Code.e, true);
                    array[1] = new Integer(Code.e);
                    array[2] = new Integer(Code.e);
                }
                this.Code = d.Code(array, Code.Code.I, -((Code.d - Code.e) / 2));
            }
        }
        return this.Code;
    }
    
    public final void Z() {
        d.aq = this.Code.containsKey("b");
        d.ao = this.Code.containsKey("d");
        d.at = this.Code.containsKey("e");
        d.au = this.Code.containsKey("i");
        d.ap = this.Code.containsKey("a");
        if (this.Code.containsKey("c")) {
            d.j = Integer.parseInt(this.Code.get("c"));
        }
        final int int1;
        if (this.Code.containsKey("g") && (int1 = Integer.parseInt(this.Code.get("g"))) != d.k) {
            d.k = int1;
            d.r();
            Code.g();
            Code.Code.I();
            Code.Code.Z();
            this.Code.a = true;
        }
        Code.Code.Code(this.Code.containsKey("m"));
        if (this.Code.containsKey("l") ^ d.H) {
            Code.Code.b();
        }
        final Object value;
        if ((value = this.Code.get("f")) != null) {
            d.Code(value.equals("http://"));
        }
        if (d.I.size() > 0 || d.b.size() > 0) {
            d.av = this.Code.containsKey("z");
        }
        final String s;
        if ((s = this.Code.get("k")) != null) {
            final String s2 = s;
            try {
                final int int2 = Integer.parseInt(s2);
                final int value2 = d.Code(false, false).get(11);
                final int value3 = d.Code(false, false).get(12);
                d.l = int2 / 2 - value2;
                if (((int2 & 0x1) == 0x0 && value3 < 30) || ((int2 & 0x1) == 0x1 && value3 >= 30)) {
                    d.m = 0;
                }
                else {
                    d.m = 30;
                    if (value3 >= 30) {
                        --d.l;
                    }
                }
            }
            catch (NumberFormatException ex) {}
        }
        if (this.q) {
            d.d = ((this.Code.containsKey("u") ^ true) ? 1 : 0);
            d.d();
        }
        final boolean b = d.aA - this.Code.containsKey("A");
        if (((b | -b) ? 1 : 0) >>> 31 != 0) {
            if (!d.aA) {
                d.p = Math.max(1, d.p + 1 & 0xFF);
                this.Code.Code("overlay:" + d.I(156), (String)null, (String)null);
            }
            else {
                this.Code.J();
                d.n();
            }
            d.aA ^= true;
            Code.h();
            B.I = null;
            Code.Code.I();
            Code.Code.Z();
        }
        Code.Code.i();
        d.J(false);
    }
    
    private void o() {
        this.Code = 7;
        this.B = 23;
        this.I = 10;
        this.B = true;
        this.I = d.Code(9);
        this.az -= 5;
        this.Z(d.Code(102), null);
        this.az -= 3;
        this.Code(0, d.Code(13), "a", d.ap ? "" : null, -1);
        final int j = this.j();
        this.C("0", d.Code(115));
        this.C("1", d.Code(116));
        this.C("2", d.Code(117));
        this.S();
        this.Code(2, d.Code(114) + ":", "c", String.valueOf(d.j), j);
        final int i = this.j();
        if (!d.l) {
            this.C("3", d.Code(73));
        }
        this.C("0", d.Code(74));
        this.C("1", d.Code(75));
        this.C("2", d.Code(76));
        this.S();
        this.Code(2, d.Code(79) + ":", "g", String.valueOf(d.k), i);
        this.Code(0, d.Code(89), "b", d.aq ? "" : null, -1);
        if (d.q != -1) {
            this.Code(0, d.Code(222), "A", d.aA ? "" : null, -1);
        }
        this.Z(d.Code(78), null);
        this.az -= 3;
        this.Code(1, d.Code(138) + "...", "sk:///l/" + d.k + "?version=" + 3, null, -1);
        this.Code(0, d.Code(77), "d", d.ao ? "" : null, -1);
        if (!d.ai) {
            this.Code(0, d.Code(175), "m", d.L ? "" : null, -1);
        }
        if (!d.n) {
            this.Code(0, d.Code(107), "l", d.H ? "" : null, -1);
        }
        this.Code(0, d.Code(118), "i", d.au ? "" : null, -1);
        if (d.c != 0) {
            this.Code(0, d.Code(161), "u", (d.d == 0) ? "" : null, -1);
        }
        if (d.I.size() > 0 || d.b.size() > 0) {
            this.Code(0, d.Code(207), "z", d.av ? "" : null, -1);
        }
        if (!d.ae) {
            this.Code(0, d.Code(25), "e", d.at ? "" : null, -1);
            final int k = this.j();
            final String code = Code.Code(-1, true, null);
            final int value = d.Code(false, false).get(12);
            final Calendar code2 = d.Code(false, false);
            final Calendar code3 = d.Code(true, false);
            int l = 0;
            for (int m = 0; m < 48; m += 2) {
                final String code4 = Code.Code(m / 2, false, (value >= 30) ? code3 : code2);
                this.C(String.valueOf(m), code4);
                if (code4.equals(code)) {
                    l = m;
                }
                final String code5 = Code.Code(m / 2, false, (value >= 30) ? code2 : code3);
                this.C(String.valueOf(m + 1), code5);
                if (code5.equals(code)) {
                    l = m + 1;
                }
            }
            this.S();
            this.Code(2, d.Code(64), "k", String.valueOf(l), k);
        }
        this.Z(d.Code(48), null);
        this.az -= 3;
        final int j2 = this.j();
        if (!d.ac) {
            this.C("socket://", "Socket/HTTP");
        }
        this.C("http://", "HTTP");
        this.S();
        this.Code(2, d.Code(50) + ":", "f", d.ad ? "http://" : "socket://", j2);
        this.Code(1, d.Code(205) + "...", d.I(142), null, -1);
        this.Code(1, d.Code(97) + "...", "dialog:" + d.I(33), null, -1);
        this.az -= 5;
    }
    
    private void U() {
        final DataInputStream dataInputStream = new DataInputStream(this.Code);
        int unsignedByte;
        while ((unsignedByte = dataInputStream.readUnsignedByte()) == 255) {
            this.a(2);
            this.aH = dataInputStream.readUnsignedByte();
        }
        this.ar = (unsignedByte << 16 | dataInputStream.readUnsignedShort());
        this.a(3);
        int unsignedShort;
        for (int n = (dataInputStream.readUnsignedByte() << 16) + dataInputStream.readUnsignedShort(), i = 0; i < n; i += unsignedShort + 3) {
            final byte byte1 = dataInputStream.readByte();
            unsignedShort = dataInputStream.readUnsignedShort();
            switch (byte1) {
                case 82: {
                    final byte[] b = new byte[unsignedShort];
                    dataInputStream.readFully(b, 0, unsignedShort);
                    d.Code(-1, b, "r", true);
                    d.r();
                    d.aE = true;
                    break;
                }
                case 102: {
                    final int priority = Thread.currentThread().getPriority();
                    Thread.currentThread().setPriority(5);
                    Code.b = false;
                    this.Code.Code("overlay:" + d.I(34), (String)null, (String)null);
                    Code.Code.d();
                    this.Code.close();
                    d.B(this.l = true);
                    Code.Code.I(Code.Code(8));
                    Code.Code.e();
                    Thread.currentThread().setPriority(priority);
                    break;
                }
                case 99: {
                    for (byte byte2 = dataInputStream.readByte(), b2 = 0; b2 != byte2; ++b2) {
                        final short short1 = dataInputStream.readShort();
                        int byte3 = -1;
                        if (short1 == 1) {
                            byte3 = dataInputStream.readByte();
                        }
                        final int int1 = dataInputStream.readInt();
                        final byte[] b3 = new byte[dataInputStream.readUnsignedShort()];
                        dataInputStream.readFully(b3);
                        Code(byte3, int1, b3);
                    }
                    Code.J();
                    d.J(false);
                    break;
                }
                case 35: {
                    ++Code.Code;
                    Code.J = true;
                    final Vector<Object[]> a = new Vector<Object[]>(9);
                    for (int j = 0; j < 9; ++j) {
                        a.addElement(d.Code(d.Code(d.a, j)));
                    }
                    final boolean k = Code.I;
                    final DataInputStream dataInputStream2 = dataInputStream;
                    try {
                        for (byte byte4 = dataInputStream2.readByte(), b4 = 0; b4 < byte4; ++b4) {
                            final byte byte5 = dataInputStream.readByte();
                            final int unsignedShort2 = dataInputStream.readUnsignedShort();
                            byte[] b5 = null;
                            if (unsignedShort2 > 0) {
                                b5 = new byte[unsignedShort2];
                                dataInputStream.readFully(b5);
                            }
                            final String utf = dataInputStream.readUTF();
                            final String utf2 = dataInputStream.readUTF();
                            final int int2 = dataInputStream.readInt();
                            if (!k) {
                                final boolean b6 = utf2.length() == 0 && utf.length() == 0 && unsignedShort2 == 0;
                                if (byte5 <= 0 || byte5 > 9 || (!b6 && (utf2.length() == 0 || utf.length() == 0 || unsignedShort2 == 0)) || (d.Code(d.Code((Vector)a, byte5 - 1), 9) & 0x1) != 0x0) {
                                    Code.Code(new Integer(int2), false);
                                }
                                else {
                                    final Object[] code2;
                                    final int code;
                                    if ((code = d.Code(code2 = d.Code((Vector)a, byte5 - 1), 5)) == 97) {
                                        code2[5] = new Integer(83);
                                    }
                                    else if (code == 83 && (d.Code(code2, 9) & 0x4) != 0x0) {
                                        code2[5] = new Integer(82);
                                    }
                                    code2[0] = utf2;
                                    code2[1] = utf;
                                    code2[2] = b5;
                                    code2[9] = new Integer(((b6 ^ true) ? 1 : 0) << 1);
                                    code2[10] = new Integer(b6 ? 0 : int2);
                                }
                            }
                        }
                        if (!k) {
                            d.aD = true;
                            d.p();
                            d.Code(d.a = a, true);
                        }
                    }
                    finally {}
                    Code.J = false;
                    break;
                }
                case 103: {
                    Code.C();
                    break;
                }
                case 110: {
                    final int unsignedShort3;
                    final byte[] b7 = new byte[unsignedShort3 = dataInputStream.readUnsignedShort()];
                    final String utf3 = dataInputStream.readUTF();
                    dataInputStream.readFully(b7);
                    if ("private".equals(utf3)) {
                        d.q = d.Code(d.q, b7, "b", false);
                        d.J(false);
                        this.B();
                        Code.Code.I(this.J);
                        break;
                    }
                    if (this.Code.J()) {
                        if (unsignedShort3 == 0) {
                            d.az = true;
                        }
                        else {
                            d.az = false;
                            d.o = d.Code(d.o, b7, "b", false);
                        }
                        d.J(false);
                        Code.h();
                        B.I = null;
                        Code.Code.I();
                        Code.Code.Z();
                        break;
                    }
                    break;
                }
                default: {
                    if (!this.Code.J()) {
                        d.Code(dataInputStream, (long)unsignedShort);
                        break;
                    }
                    switch (byte1) {
                        case 70: {
                            (this.Code = new Object[7])[0] = dataInputStream.readUTF();
                            final long long1;
                            if ((long1 = dataInputStream.readLong()) > 0L) {
                                this.Code[1] = new Integer((int)long1);
                            }
                            this.Code[2] = dataInputStream.readUTF();
                            this.Code[3] = dataInputStream.readUTF();
                            for (byte byte6 = dataInputStream.readByte(), b8 = 0; b8 < byte6; ++b8) {
                                final char c = (char)dataInputStream.readByte();
                                final String utf4 = dataInputStream.readUTF();
                                switch (c) {
                                    case 111: {
                                        this.Code[5] = utf4;
                                        break;
                                    }
                                    case 115: {
                                        this.Code[4] = utf4;
                                        break;
                                    }
                                }
                            }
                            continue;
                        }
                        case 75: {
                            final int unsignedByte2 = dataInputStream.readUnsignedByte();
                            final String utf5 = dataInputStream.readUTF();
                            if (unsignedByte2 == 0) {
                                ((Object[])d.Code.get(this.Code.I().Code()))[1] = utf5;
                                continue;
                            }
                            d.Code(unsignedByte2, utf5, true);
                            continue;
                        }
                        case 68: {
                            final String utf6 = dataInputStream.readUTF();
                            final String utf7 = dataInputStream.readUTF();
                            dataInputStream.readUTF();
                            Code.Code(utf6, utf7);
                            continue;
                        }
                        case 114: {
                            final String utf8 = dataInputStream.readUTF();
                            this.B();
                            this.Code.Code(utf8, this.Code, (String)null);
                            continue;
                        }
                        case 101: {
                            this.j = dataInputStream.readInt();
                            this.Code = (char)dataInputStream.readByte();
                            this.C = dataInputStream.readUTF();
                            if (Code.Code() == this || Code.Code().Code() == this) {
                                g.J();
                                continue;
                            }
                            continue;
                        }
                        case 67: {
                            final int unsignedByte3 = dataInputStream.readUnsignedByte();
                            this.h |= ((unsignedByte3 & 0x1) != 0x0);
                            final boolean b9 = this.B;
                            final int n2 = unsignedByte3 & 0x2;
                            this.B = (((b9 ? 1 : 0) | (n2 | -n2) >>> 31) != 0x0);
                            final boolean l = this.J;
                            final int n3 = unsignedByte3 & 0x4;
                            this.J = (((l ? 1 : 0) | (n3 | -n3) >>> 31) != 0x0);
                            continue;
                        }
                        case 83: {
                            final Object[] code3;
                            (code3 = d.Code())[0] = dataInputStream.readUTF();
                            code3[1] = dataInputStream.readUTF();
                            final short short2;
                            if ((short2 = dataInputStream.readShort()) > 0) {
                                code3[2] = new byte[short2];
                                dataInputStream.readFully((byte[])code3[2]);
                            }
                            d.c.setElementAt(code3, 0);
                            d.q();
                            continue;
                        }
                        case 115: {
                            new e(dataInputStream.readUTF(), dataInputStream.readUTF()).Code();
                            continue;
                        }
                        case 112: {
                            d.I(dataInputStream.readUTF());
                            continue;
                        }
                        case 73: {
                            final byte byte7 = dataInputStream.readByte();
                            final String[] m = new String[dataInputStream.readByte()];
                            for (int n4 = 0; n4 < m.length; ++n4) {
                                m[n4] = dataInputStream.readUTF();
                            }
                            if (byte7 == 99 && m.length == 2) {
                                this.I = m;
                                continue;
                            }
                            continue;
                        }
                        case 52: {
                            for (int unsignedByte4 = dataInputStream.readUnsignedByte(), n5 = 0; n5 < unsignedByte4; ++n5) {
                                final int unsignedByte5 = dataInputStream.readUnsignedByte();
                                final int unsignedByte6 = dataInputStream.readUnsignedByte();
                                final String utf9 = dataInputStream.readUTF();
                                if (unsignedByte5 < d.Z.size()) {
                                    final Object[] array2;
                                    final Object[] array = array2 = d.Z.elementAt(unsignedByte5);
                                    array[array.length - 1] = new Integer(unsignedByte6);
                                    if (utf9.length() > 0) {
                                        ((Object[])array2[unsignedByte6])[1] = utf9;
                                    }
                                }
                            }
                            continue;
                        }
                        default: {
                            d.Code(dataInputStream, (long)unsignedShort);
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        this.Code(dataInputStream);
        this.a(5);
    }
    
    private synchronized Image Code(int i, int n, final int n2) {
        if (i < -9000 && i > -11000) {
            return null;
        }
        int n3 = 256;
        if (this.v < 128) {
            n3 = 256 * this.Code.Code() / this.o;
        }
        final int n4 = i;
        final int n5 = n3 - 256;
        final Integer n6 = new Integer(n4 | ((n5 | -n5) >>> 31 ^ 0x1) * 536870912 | ((n3 == 256 || (n2 & 0x4) != 0x0) ? 0 : 1073741824));
        if (this.J.containsKey(n6)) {
            return null;
        }
        if (this.Z.containsKey(n6)) {
            return (Image)this.Z.get(n6);
        }
        if (i < 0) {
            Image image = null;
            Label_0650: {
                if ((i = i) > -1000) {
                    image = ((i <= -43 && i >= -46) ? Code.Code.Code(-43 - i) : ((i == -41) ? Code.Code.Code : d.Code(d.Code(-i), new StringBuffer().append(i).toString())));
                }
                else if (i > -3000) {
                    final Vector vector = (i <= -2000) ? d.c : d.J;
                    int n7;
                    int n8;
                    if (i <= -2000) {
                        n7 = -2000;
                        n8 = i;
                    }
                    else {
                        n7 = -1000;
                        n8 = i;
                    }
                    final byte[] array = (byte[])d.Code(vector, n7 - n8)[2];
                    image = d.Code(array, (Object)array);
                }
                else if (-3000 - i < Code.I.size() && -3000 - i >= 0) {
                    final byte[] array2 = (byte[])((Object[])Code.I.elementAt(-3000 - i))[2];
                    image = d.Code(array2, (Object)array2);
                }
                else {
                    if (-4000 - i != -1) {
                        if (-4000 - i < d.a.size() && -4000 - i >= 0) {
                            final byte[] array3 = (byte[])((Object[])d.a.elementAt(-4000 - i))[2];
                            image = d.Code(array3, (Object)array3);
                            break Label_0650;
                        }
                        if (-5000 - i < d.d.size() && -5000 - i >= 0) {
                            final byte[] array4 = (byte[])((Object[])d.d.elementAt(-5000 - i))[2];
                            image = d.Code(array4, (Object)array4);
                            break Label_0650;
                        }
                        if (-7000 - i < d.I.size() && -7000 - i >= 0) {
                            if (d.q) {
                                final byte[] array5;
                                final Image code;
                                image = (((code = d.Code(array5 = (byte[])((Object[])d.I.elementAt(-7000 - i))[2], 0, array5.length, 256, null)).getWidth() == 1 && code.getHeight() == 1) ? code : d.Code(array5, (Object)array5));
                                break Label_0650;
                            }
                        }
                        else {
                            if (-8000 - i < d.b.size() && -8000 - i >= 0) {
                                final byte[] array6 = (byte[])((Object[])d.b.elementAt(-8000 - i))[2];
                                image = d.Code(array6, (Object)array6);
                                break Label_0650;
                            }
                            final byte[] array7;
                            if (((-11000 - i < d.Z.size() && -11000 - i >= 0) || (-12000 - i < d.Z.size() && -12000 - i >= 0)) && (array7 = (byte[])d.Code((n = ((i <= -12000) ? 1 : 0)) * -1000 - 11000 - i)[n + 2]).length > 0) {
                                image = d.Code(array7, (Object)array7);
                                break Label_0650;
                            }
                        }
                    }
                    image = null;
                }
            }
            Image code2 = image;
            if (n3 != 256) {
                code2 = d.Code(code2, 0, Code(code2.getHeight(), n3), true);
            }
            this.Code(n6, code2);
            return code2;
        }
        if (n == 0) {
            final Image code3 = this.Code(n6);
            this.Code(n6, code3);
            return code3;
        }
        if (!d.k) {
            this.B.put(new Integer(n | (n6 & 0x60000000)), n6);
            g.Code(this);
            return null;
        }
        if (i + 2 <= this.ao && i + d.I(this.I, i) <= this.ao) {
            final Image code4 = this.Code(n6);
            this.Code(n6, code4);
            return code4;
        }
        this.C();
        return null;
    }
    
    private void a(final int c) {
        if (c <= this.C) {
            return;
        }
        this.C = c;
        if (c == 7 || c == 4 || c == 5 || c == 6) {
            if (c == 4 && this.Code != null && this.Code[4] == 1) {
                this.I(true);
            }
            Code.b = false;
            d.Code((Object)Code.Code);
        }
        if (!d.ax && d.C.equals(this.Code)) {
            this.Code = 13;
            this.I = 14;
            this.h = true;
            this.B = true;
        }
        this.Code.Code(this);
    }
    
    final void Code(final boolean b) {
        if (b) {
            this.Code = null;
        }
        if (this.Code == null) {
            this.I(null, (Image)null);
            return;
        }
        g.Code = true;
        this.I(this.Code, this.Code(this.Code));
    }
    
    private void r() {
        this.Code = 23;
        this.I = d.Code(45);
        final B code2;
        final String code;
        if (!(code = (code2 = this.Code.Code).Code).startsWith("<imgs>") && d.Code(code) == -1) {
            this.Code.Z = code2;
        }
        final B z = this.Code.Z;
        this.Z(d.Code(81), null);
        this.B("<imgs>" + z.Code, d.Code(80));
        this.C(5);
        this.Z(d.Code(56), null);
        this.Code(65, z.I);
        this.Code(63, z.Code);
        this.Code(58, d.Code((long)z.ar));
        this.Code(d.Code(57) + ": ", 1, -16777216);
        if (z.Code != null) {
            this.Code(this.Code(z.Code), false, 1);
        }
        else {
            this.Code(d.Code(131), 0, -16777216);
        }
        this.C(5);
        this.Z(d.Code(59), null);
        if (z.a < 2) {
            this.Code(60, d.Code(12));
            return;
        }
        this.Code(60, d.Code(11));
        if (z.Code != null) {
            if (z.Code[4].length() > 0) {
                this.Code(d.Code(94) + ": ", 1, -16777216);
                this.Code(z.Code[4], 0, -16777216);
                this.Q();
            }
            this.Code(d.Code(119) + " ", 1, -16777216);
            this.Code(z.Code[0], 0, -16777216);
            this.Q();
            this.Code(d.Code(120) + " ", 1, -16777216);
            this.Code(z.Code[6], 0, -16777216);
            this.Q();
            this.Code(d.Code(121) + " ", 1, -16777216);
            this.Code(z.Code[2], 0, -16777216);
            this.Q();
            this.Code(d.Code(122) + " ", 1, -16777216);
            this.Code(z.Code[3], 0, -16777216);
            this.Q();
            this.Q();
        }
    }
    
    private static void Code(final int n, int unsignedByte, final byte[] array) {
        Label_0281: {
            switch (n) {
                case 17: {
                    break Label_0281;
                }
                case 35: {
                    break Label_0281;
                }
                case 0: {
                    Label_0116: {
                        break Label_0116;
                        d.r = unsignedByte;
                        try {
                            d.l = new DataInputStream(new ByteArrayInputStream(array)).readUTF();
                            return;
                            // iftrue(Label_0442:, unsignedByte == d.B)
                            d.Code(unsignedByte, array);
                            Code.J();
                            d.Code(d.B);
                            return;
                            d.s = unsignedByte;
                            try {
                                final DataInputStream dataInputStream;
                                unsignedByte = (dataInputStream = new DataInputStream(new ByteArrayInputStream(array))).readUnsignedByte();
                                final Vector<Object[]> i = new Vector<Object[]>(Math.min(1, unsignedByte));
                                for (int j = 0; j < unsignedByte; ++j) {
                                    if (j == 0) {
                                        final Object[] obj;
                                        (obj = new Object[4])[1] = dataInputStream.readUTF();
                                        obj[0] = dataInputStream.readUTF();
                                        final short short1;
                                        final byte[] b = new byte[short1 = dataInputStream.readShort()];
                                        dataInputStream.readFully(b, 0, short1);
                                        obj[2] = b;
                                        d.Code(dataInputStream, (long)(dataInputStream.readShort() & 0xFFFF));
                                        i.addElement(obj);
                                    }
                                    else {
                                        dataInputStream.readUTF();
                                        dataInputStream.readUTF();
                                        d.Code(dataInputStream, (long)(dataInputStream.readShort() & 0xFFFF));
                                        d.Code(dataInputStream, (long)(dataInputStream.readShort() & 0xFFFF));
                                    }
                                }
                                d.I = i;
                                return;
                                d.v = unsignedByte;
                                d.Z = d.Code(new DataInputStream(new ByteArrayInputStream(array)), false);
                                return;
                            }
                            catch (IOException ex) {
                                return;
                            }
                        }
                        finally {}
                    }
                }
                case 15: {
                    d.x = unsignedByte;
                    d.b = d.Code(new DataInputStream(new ByteArrayInputStream(array)));
                    d.p();
                    return;
                }
                case 4:
                case 3: {
                    d.t = unsignedByte;
                    final DataInputStream dataInputStream2;
                    final byte[] b2;
                    if ((b2 = new byte[(dataInputStream2 = new DataInputStream(new ByteArrayInputStream(array))).readShort()]).length > 0) {
                        dataInputStream2.readFully(b2, 0, b2.length);
                        if (!d.j) {
                            d.u = d.Code(d.u, b2, "b", false);
                            return;
                        }
                        break;
                    }
                    else {
                        if (d.u != -1) {
                            d.Code(d.u, "b");
                            d.u = -1;
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 31: {
                    d.w = unsignedByte;
                    d.Code(new DataInputStream(new ByteArrayInputStream(array)));
                    return;
                }
            }
        }
        Label_0442:;
    }
    
    private void P() {
        this.Code = 5;
        this.I = 6;
        this.B = 28;
        this.h = true;
        this.B = true;
    }
    
    private void v() {
        this.Code = 1;
        this.I = 10;
        this.k = true;
        final int n = 6;
        this.aw = n;
        this.ay = n;
        this.ax = 6;
        this.az = 4;
        this.Z = new Vector();
    }
    
    private void L() {
        this.Code = 39;
        this.I = 40;
        this.B = 23;
        this.I = d.m;
        final int n = Code.Code[44];
        this.Code(this.I, 0, n);
        this.C(5);
        this.Code(d.n, 0, n);
    }
    
    private void G() {
        this.B = 28;
        this.Code = 9;
        this.I = 23;
        final String i = d.I(this.Z, "a");
        final String j = d.I(this.Z, "b");
        this.Code(i, 0, Code.Code[44]);
        this.C(5);
        if (j != null) {
            this.Code(j, 0, Code.Code[44]);
        }
    }
    
    final void Code(String i, final boolean code) {
        this.Code = code;
        this.J = i;
        if (!this.Code()) {
            final Thread thread;
            (thread = new Thread(this)).setPriority(10);
            thread.start();
            while (this.C == 0) {
                Thread.yield();
            }
            return;
        }
        final int code2 = d.Code(this.Code);
        switch (code2) {
            case 129:
            case 130:
            case 131:
            case 132: {}
            default: {
                this.Z = true;
                this.h = true;
                this.J = true;
                this.m = true;
                this.aw = 3;
                this.ax = 3;
                this.o = 0;
                final d code3 = this.Code;
                final int n = 8;
                try {
                    if (code3.Code(n)) {
                        this.aw += 5;
                        this.ax += 5;
                        this.az += 2;
                    }
                    this.Code = new J(2000);
                    this.Code = new DataOutputStream(this.Code);
                    this.I = new J(1000);
                    this.I = new DataOutputStream(this.I);
                    this.Z = new J(1000);
                    this.Z = new DataOutputStream(this.Z);
                    this.Code.write(0);
                    this.I.writeInt(-1);
                    this.I.writeInt(0);
                    this.C(5);
                    switch (code2) {
                        case 65: {
                            this.k();
                            break;
                        }
                        case 90: {
                            this.Code(d.J, false);
                            break;
                        }
                        case 91: {
                            this.Code(d.a, false);
                            break;
                        }
                        case 109: {
                            this.Code(d.c, false);
                            break;
                        }
                        case 54: {
                            final int index;
                            if ((index = this.Code.indexOf(38)) >= 0) {
                                final char char1;
                                if ((char1 = this.Code.charAt(index + 3)) == 'h') {
                                    B.Code = Code.I;
                                }
                                else if (char1 == 'b') {
                                    B.Code = d.J;
                                }
                                this.Code = this.Code.substring(0, index);
                            }
                            this.Code(B.Code, true);
                            break;
                        }
                        case 86: {
                            this.Code = ((Code.I.size() > 0) ? 11 : 23);
                            this.k = true;
                            this.I = d.Code(16);
                            this.C(false);
                            break;
                        }
                        case 148: {
                            this.m();
                            break;
                        }
                        case 74: {
                            this.p();
                            break;
                        }
                        case 88:
                        case 104: {
                            if (code2 == 104) {
                                d.C = 0L;
                                d.B = 0L;
                                d.J(false);
                            }
                            this.Code = 23;
                            this.I = d.Code(2);
                            this.Code(this.Code(d.Code(69)), true, -1);
                            this.C(5);
                            this.Code(Code.Code, 0, -16777216);
                            this.Q();
                            this.C(5);
                            this.Code("Copyright (c) 2005-2013 ", 0, -16777216);
                            this.B("http://www.opera.com/", "Opera Software ASA");
                            this.Code(". ", 0, -16777216);
                            this.Code("All rights reserved.", 0, -16777216);
                            this.Q();
                            this.C(5);
                            this.B("operette://H/thirdparties.html", d.Code(82));
                            this.C(5);
                            this.Code(d.Code(67) + " ", 1, -16777216);
                            this.Code(d.Code(d.B), 0, -16777216);
                            this.Q();
                            this.Code(d.Code(68) + " ", 1, -16777216);
                            this.Code(d.Code(d.C), 0, -16777216);
                            this.Q();
                            this.B(d.I(104), "[" + d.Code(19) + "]");
                            this.Q();
                            break;
                        }
                        case 77: {
                            this.r();
                            break;
                        }
                        case 76: {
                            this.q();
                            break;
                        }
                        case 73: {
                            this.o();
                            break;
                        }
                        case 66: {
                            this.x();
                            break;
                        }
                        case 68: {
                            this.y();
                            break;
                        }
                        case 67: {
                            this.z();
                            break;
                        }
                        case 70: {
                            this.G();
                            break;
                        }
                        case 112: {
                            this.M();
                            break;
                        }
                        case 32:
                        case 33: {
                            this.J(code2);
                            break;
                        }
                        case 99: {
                            this.I(d.J);
                            break;
                        }
                        case 149: {
                            this.I(d.Code(210), d.Code(211, d.B.elementAt(this.Code.I().B()).B));
                            break;
                        }
                        case 155: {
                            this.I(d.Code(217), d.Code(218));
                            break;
                        }
                        case 153: {
                            i = d.I(this.Z, "a");
                            this.I(d.Code(215), d.Code(i, d.I(this.Z, "r")));
                            break;
                        }
                        case 154: {
                            this.n();
                            break;
                        }
                        case 43: {
                            this.I(d.c);
                            break;
                        }
                        case 50: {
                            this.I(d.a);
                            break;
                        }
                        case 139: {
                            this.I(d.d);
                            break;
                        }
                        case 45:
                        case 52:
                        case 101:
                        case 141: {
                            final Vector code4 = d.Code(code2);
                            final int b = ((this.Code.I() != null) ? this.Code.I() : this.Code).B();
                            if (!"keep".equals(this.J)) {
                                B.I = d.Code(d.Code(code4, b));
                                B.d = b;
                            }
                            this.Z(code4);
                            break;
                        }
                        case 89:
                        case 100: {
                            if (!"keep".equals(this.J)) {
                                B.I = d.Code();
                                if (d.Code != null) {
                                    B.I[1] = d.Code[1];
                                    B.I[0] = d.Code[0];
                                    B.I[2] = d.Code[2];
                                }
                                B.d = -1;
                                B.Code = null;
                            }
                            this.Z(null);
                            break;
                        }
                        case 44: {
                            if (!"keep".equals(this.J)) {
                                B.I = d.Code();
                                B.d = -1;
                            }
                            this.Z(d.c);
                            break;
                        }
                        case 47: {
                            if (!"keep".equals(this.J)) {
                                B.I = d.Code();
                                B.d = -1;
                                B.I[1] = this.Code.Code.I;
                                B.I[0] = this.Code.Code.c;
                                B.I[2] = this.Code.Code.Code;
                            }
                            this.Z(d.c);
                            break;
                        }
                        case 126: {
                            this.N();
                            break;
                        }
                        case 123: {
                            this.D();
                            break;
                        }
                        case 124: {
                            this.E();
                            break;
                        }
                        case 37: {
                            this.F();
                            break;
                        }
                        case 40: {
                            this.H();
                            break;
                        }
                        case 34: {
                            final int n2 = 23;
                            this.I = n2;
                            this.Code = n2;
                            this.Code(d.Code(100), 0, Code.Code[44]);
                            break;
                        }
                        case 144: {
                            this.O();
                            break;
                        }
                        case 60: {
                            if (d.b && d.f != 1 && d.e != 1) {
                                this.Z(0);
                                break;
                            }
                            this.K();
                            break;
                        }
                        case 143: {
                            this.Z(1);
                            break;
                        }
                        case 156: {
                            this.Z(2);
                            break;
                        }
                        case 36: {
                            this.s();
                            break;
                        }
                        case 62: {
                            this.t();
                            break;
                        }
                        case 46: {
                            this.u();
                            break;
                        }
                        case 128: {
                            this.A();
                            break;
                        }
                        case 136: {
                            this.Code(d.d, false);
                            break;
                        }
                        case 135: {
                            B.I = d.Code();
                            B.d = -1;
                            B.I[1] = this.Code.Code.Code.I;
                            B.I[0] = this.Code.Code.Code.Code;
                            B.I[2] = this.Code.Code.Code.Code;
                            B.I[8] = this.Code.Code.Code;
                            this.Z(d.d);
                            break;
                        }
                        case 145: {
                            this.L();
                            break;
                        }
                    }
                    this.C(5);
                    this.j();
                    return;
                }
                catch (IOException ex) {
                    return;
                }
                break;
            }
        }
    }
    
    private void j() {
        if (this.Code.Code(8)) {
            this.az += 2;
        }
        if (this.Z.size() != 0) {
            final byte[] code = this.Z.Code();
            int i = 0;
            int n;
            final int ag = n = this.Code.size();
            int n2 = 0;
            while (i != this.Z.size()) {
                if (this.ai <= 0 && this.aj == n2) {
                    this.ai = ag + i;
                }
                ++n2;
                n = this.Code.size();
                this.Code.write(code[i++]);
                if (i == this.ag) {
                    this.ai = n;
                }
                final int off = i;
                final int n3 = i + (d.I(code, i) + 2);
                final int n4;
                final int len = (n4 = n3 + (d.I(code, n3) + 2)) - off;
                final byte b = code[n4];
                this.Code.write(b);
                final int len2 = b * 10;
                this.Code.write(code, n4 + 1, len2);
                i = n4 + (len2 + 1);
                this.Code.write(code, off, len);
            }
            this.ag = ag;
            this.ah = n;
        }
        this.Z = null;
        this.Z = null;
        d.I(this.I.size() - 8, this.I.Code(), 4);
        int size = this.Code.size();
        this.ap += size + this.I.size() - 8;
        this.I = new byte[this.ap];
        System.arraycopy(this.Code.Code(), 0, this.I, 0, size);
        this.an = size;
        int n5 = 0;
        int z;
        do {
            z = d.Z(this.I.Code(), n5);
            final int z2 = d.Z(this.I.Code(), n5 + 4);
            System.arraycopy(this.I.Code(), n5 + 8, this.I, size, z2);
            size += z2;
        } while ((n5 = z) >= 0);
        this.Code = null;
        this.Code = null;
        this.I = null;
        this.I = null;
        this.ao = this.ap;
        this.p = Math.max(this.p, this.az);
        if (this.C()) {
            this.o = Math.min(this.o, this.Code.Z());
        }
        this.X();
        this.C[6] = this.an;
        this.C[7] = this.ap;
        if (this.ai > 0) {
            this.C(this.ai);
            int f = this.f - this.Code.I() / 2 + B.n;
            if (this.Code.Code(2)) {
                if (this.f == 4) {
                    f = 0;
                }
                else {
                    f = this.f;
                }
            }
            this.b(0, f);
        }
        this.ab();
        if (this.ai <= 0) {
            this.ai = this.ag;
        }
        this.a(4);
        this.a(5);
    }
    
    final void I() {
        if (this.Code != null) {
            if (this.Code) {
                this.s = this.Code[0];
                this.t = this.Code[1];
                this.aj = this.Code[5];
            }
            this.b(this.Code[0], this.Code[1]);
            this.S = this.Code[2];
            this.T = this.Code[3];
        }
    }
    
    private void C(final int n, final int b) {
        if (this.Code(n)) {
            this.Q();
        }
        this.o = Math.max(this.o, this.ay + n + this.ax);
        this.au = Math.max(this.au, b);
        this.Code(this.ay, this.az, n, b);
    }
    
    private void Code(final Vector vector, final boolean d) {
        this.d = d;
        this.k = true;
        this.Code = 2;
        if (this.d) {
            this.I = d.Code(41);
            this.Code = 1;
            this.I = 10;
        }
        else if (vector == d.J) {
            this.I = d.Code(7);
            this.Code(null, d.I(91), d.Code(33), -10, false, false, true, -16777216);
            if (Code.Z) {
                this.Code(null, "myopera:///b", d.Code(179), -9, false, false, true, -16777216);
            }
            this.Code(null, "myopera:///n", d.Code(180), -12, false, false, true, -16777216);
            if (d.X) {
                this.Code(null, d.I(136), d.Code(146), -9, false, false, true, -16777216);
            }
            this.Code(null, "feed:start//" + System.currentTimeMillis(), d.Code(34), -7, false, false, false, -16777216);
        }
        else if (vector == d.a) {
            this.I = d.Code(33);
        }
        else if (vector == d.c) {
            this.I = d.Code(47);
        }
        else if (vector == d.d) {
            this.I = d.Code(146);
        }
        this.Code(vector, false, -1);
    }
    
    private void s() {
        if (!d.ax) {
            this.Code = 23;
            this.I = 14;
        }
        this.B = true;
        this.J = true;
        this.I = d.Code(37);
        this.Code(d.Code(83), 1, -16777216);
        this.C(5);
        String anObject;
        if ((anObject = d.I(this.Z, "b")) == null) {
            anObject = d.Code(84, d.a);
        }
        this.Code(anObject, 0, -16777216);
        if (d.ax && !d.Code(87).equals(anObject)) {
            this.Q();
            this.C(5);
            this.B(d.I(142), d.Code(205));
        }
        final String f;
        if ((f = B.f).length() > 0 && d.ax) {
            this.Q();
            this.C(5);
            this.B(f, d.Code(137));
        }
    }
    
    private void p() {
        this.Code = 23;
        this.k = true;
        this.I = d.Code(35);
        this.J(d.I(76), d.Code(29));
        this.Q();
        if (d.a != null && d.a.length() > 0) {
            this.J(d.a, d.Code(18));
            this.Q();
        }
        if (d.d != null && d.d.length() > 0) {
            String s = "";
            final Object[] code;
            if ((code = d.Code) != null && code[0] != null && ((String)code[0]).startsWith("http")) {
                s = (String)code[0];
            }
            final StringBuffer sb;
            (sb = new StringBuffer(d.d)).append("?w=").append(Code.h).append("&h=").append(Code.i).append("&m=").append(d.Z - d.J).append("&ma=").append(d.C).append("&pl=").append(d.Code(d.Code("microedition.platform"), true)).append("&url=").append(d.Code(s, true)).append("&mo=").append(d.Code("device.model: " + d.Code("device.model"), true));
            this.J(sb.toString(), d.Code(61));
            this.Q();
        }
        this.J(d.I(88), d.Code(2));
    }
    
    private void Z(final int n) {
        this.Code = 9;
        this.I = 37;
        Code.C = d.b;
        this.B = 23;
        this.I = "";
        final int n2 = Code.Code[44];
        String str = "";
        if (n == 0) {
            str = d.Code(168);
            if (Browser.Code.getAppProperty("MIDlet-Jar-RSA-SHA1") != null) {
                str = d.Code(169);
            }
        }
        else if (n == 1) {
            this.I = d.Code(37);
            str = d.Code(153) + " " + d.Code(154);
        }
        else if (n == 2) {
            str = d.Code(223);
            Code.C = d.c;
        }
        if (this.I.length() > 0) {
            this.Code(this.I, 0, n2);
            this.C(5);
        }
        this.Code(str + " " + d.Code(170, d.Code(35)), 0, n2);
    }
    
    final void h() {
        if (this.Code.C) {
            this.Code.J = 0;
            this.Code.C = false;
            this.B = null;
            this.C = null;
            this.aO = -1;
            this.Code = this.Z;
            this.B = this.l;
            this.I = this.J;
            this.C();
            this.c(0);
        }
    }
    
    private void t() {
        this.J = true;
        this.B = true;
        this.I = d.Code(189);
        this.Code(d.Code(189), 0, -16777216);
        if (d.f != null) {
            this.C(5);
            this.Code((byte)87, d.f, d.f, false);
            this.Code(d.f, 0, Code.Code[53]);
            this.R();
        }
    }
    
    final void i() {
        switch (this.Code) {
            case 'r': {
                this.Code.Code(this.C, this.C.equals(this.Code) ? this.Code : null);
            }
            case 'u': {
                this.Code.Code(false, false, this.Code);
            }
            case 'l': {
                this.Code.Code(true, false, this.Code);
            }
            default: {}
        }
    }
    
    private void Code(final DataInputStream dataInputStream) {
        final byte[] b = new byte[3];
        int off = 0;
        while ((off += dataInputStream.read(b, off, 3 - off)) < 3) {}
        this.ap = d.J(b, 0);
        int i = 0;
        while (i <= 3) {
            final int ap = this.ap;
            try {
                this.I = new byte[ap];
            }
            finally {
                Code.Code(i);
                ++i;
                continue;
            }
            break;
        }
        if (this.I == null) {
            this.I = new byte[this.ap];
        }
        this.ao = 0;
        int n = 0;
        while (this.ap > this.ao) {
            this.ao += dataInputStream.read(this.I, this.ao, Math.min(1024, this.ap - this.ao));
            g.Code(this);
            Label_0283: {
                if (this.an == 0) {
                    int n2 = 11;
                    for (int j = 0; j < 4; ++j) {
                        if (n2 + 2 >= this.ao) {
                            break Label_0283;
                        }
                        n2 += d.Code(this.I, n2) + 2;
                    }
                    n2 += 5;
                    if (this.ao >= n2) {
                        this.V();
                        n = this.an;
                        if (this.a != null && this.a.startsWith("server:gettitle")) {
                            B.I[1] = this.I;
                            B.I[2] = this.Code;
                            this.Code.Code.J = "keep";
                            this.B();
                            this.Code.Z();
                        }
                        this.e();
                        this.a(4);
                    }
                }
            }
            if (this.an > 0) {
                n = this.I(n);
                this.c(1000);
            }
        }
    }
    
    private void Code(final String s, final String s2, final byte[] array, int n, final int n2) {
        final int n3 = n;
        final int i = this.i();
        final int n4 = n3;
        byte[] array2 = array;
        int a = d.J(0);
        int n5 = 0;
        int max = 0;
        int max2 = 0;
        int code = 0;
        if (array2 != null && array2.length == 0) {
            array2 = null;
        }
        if (array2 != null) {
            code = this.Code(array2);
            this.ao = this.Code.size();
            this.I = this.Code.Code();
            final Image code2;
            n5 = (code2 = this.Code(code, 0, 0)).getWidth() + 3;
            max = Math.max(0, (code2.getHeight() - a) / 2);
            max2 = Math.max(0, (a - code2.getHeight() + 1) / 2);
            a = Math.max(a, code2.getHeight());
        }
        a += 5;
        this.C(i, a);
        this.Z(i, a, 0);
        if (array2 != null) {
            final int n6 = code;
            final int n7 = this.ay + 3;
            n = this.az + 3 + max2;
            final int n8 = n7;
            final int n9 = n6;
            this.ao = this.Code.size();
            this.I = this.Code.Code();
            final Image code3;
            final int width = (code3 = this.Code(n9, 0, 0)).getWidth();
            final int height = code3.getHeight();
            this.Code(n8, n, width, height);
            this.I(n9, n8, n, width, height);
        }
        if ((n4 & 0x80) != 0x0) {
            n = this.ay + i - a / 2 - 6;
            int n10 = this.az + a / 2 - 1;
            for (int j = 7; j > 0; j -= 2) {
                this.Code(n, n10, j, 1, -16777216);
                ++n;
                ++n10;
            }
        }
        this.I("", this.Code(this.ay + 3 + n5, this.az + 3 + max, i - 4 - n5 - (((n4 & 0x80) != 0x0) ? a : 0), a - 4, 'x', n4, s, s2, 0, n2));
        this.Code(this.ay + 1, this.az + 1, i - 2, a - 2);
        this.R();
        this.ay += i;
    }
    
    private void a(final int n, final int n2) {
        this.e = this.Z(this.e);
        this.f = this.Z(this.f);
        this.g = this.Z(this.g);
        this.h = this.Z(this.h);
        if (this.g == 0) {
            this.g = 1;
        }
        if (this.h == 0) {
            this.h = 1;
        }
        this.e += n;
        this.f += n2;
    }
    
    final synchronized String Code() {
        final StringBuffer sb = new StringBuffer();
        if (this.Code.Code(1)) {
            final StringBuffer append = sb.append("x=").append(String.valueOf(this.S)).append("&y=");
            final int t = this.T;
            final int i = this.I(t, 5);
            append.append(String.valueOf(t + this.C[i * 6] - this.C[i * 6 + 5]));
        }
        final Enumeration<String> keys = (Enumeration<String>)this.Code.keys();
        while (keys.hasMoreElements()) {
            final String key;
            if (!(key = keys.nextElement()).startsWith("o:")) {
                d.Code(sb.append("&"), key);
                d.Code(sb.append("="), this.Code.get(key).toString());
            }
        }
        return sb.toString();
    }
    
    B(final d code) {
        this.Code = -1;
        this.I = -1;
        this.Z = -1;
        this.J = -1;
        this.B = -1;
        this.l = -1;
        this.Code = System.currentTimeMillis();
        this.C = 0;
        this.a = 1;
        this.Code = null;
        this.b = false;
        this.Code = new int[6];
        this.Z = new Object[12];
        this.I = new int[12];
        this.Z = new int[12];
        this.J = new int[10];
        this.B = new int[10];
        this.c = true;
        this.ak = 0;
        this.al = 40;
        this.am = 25;
        this.Z = new Hashtable();
        this.J = new Hashtable();
        this.Code = new Hashtable();
        this.I = new Vector();
        this.av = 0;
        this.aA = 0;
        this.aB = 0;
        this.B = new Hashtable();
        this.e = false;
        this.aO = -1;
        this.Code = code;
        this.v = 256;
        this.w = this.v;
        this.m = Code.f;
    }
    
    private void B(final int n, final int n2) {
        this.Code(d.I(n), n2);
    }
    
    final int Z() {
        if (this.Code != null) {
            return this.Code.a();
        }
        return 0;
    }
    
    static {
        B.n = 16;
        aD = Math.max(25 + Font.getFont(64, 1, 16).getHeight(), 2 + (Font.getFont(64, 1, 16).getHeight() << 1));
        B.c = 6;
        B.d = -1;
        B.Code = new char[512];
        B.f = "";
        B.aJ = -1;
        B.aK = -1;
    }
    
    private void A() {
        this.v();
        this.B(113, 160);
        this.B(129, 1);
        this.w();
    }
    
    final boolean Code() {
        return d.Code(this.Code) != -1;
    }
    
    private void Code(final String s, final int n) {
        this.Code(s, d.Code(n));
    }
    
    final void Code(final String s) {
        this.a = true;
        d.Code((Runnable)new d(this, s));
    }
    
    final Object[] Code() {
        this.Code();
        return this.Z;
    }
    
    final void Code() {
        this.Code[0] = this.s;
        this.Code[1] = this.t;
        this.Code[2] = this.S;
        this.Code[3] = this.T;
        this.Code[4] = (this.I() ? 1 : 0);
        this.Code[5] = this.p();
        this.Z[0] = this.Code;
        this.Z[1] = this.I;
        this.Z[2] = this.Code;
        this.Z[3] = this.Z;
        this.Z[4] = this.a;
        this.Z[7] = this.Code;
        if (this.Code() && (this.I[this.ai] == 76 || this.I[this.ai] == 42)) {
            int ai = this.ai;
            ++ai;
            final int n = 10 * (this.I[ai++] & 0xFF) + ai;
            int n2 = n + d.I(this.I, n);
            n2 += 2;
            this.Z[9] = d.Code(this.I, n2);
        }
        if (!this.h) {
            this.Z[8] = this;
        }
        this.Z[10] = new Integer(this.k);
    }
    
    private void q() {
        this.Code = 23;
        int n = -16777216;
        if (this.Code.Code(8)) {
            this.I = 10;
            n = Code.Code[44];
            this.ay = this.aw;
        }
        this.I = d.Code(29);
        this.av = 1;
        String i;
        if ((i = d.I(this.Z, "a")) == null) {
            i = "#*";
        }
        for (int j = 0; j < i.length(); ++j) {
            final char char1 = i.charAt(j);
            for (int k = 0; k < 12; ++k) {
                final char char2 = "1234567890#*".charAt(k);
                final char c = char1;
                final char c2 = char2;
                final int n2 = n;
                final char c3 = c2;
                final char c4 = c;
                final String code;
                if ((code = d.Code((int)c4, (int)c3, true)) != null) {
                    final int l = d.J(1);
                    final int code2 = d.Code(1, String.valueOf(c4));
                    final int code3 = d.Code(1, String.valueOf(c3));
                    final int n3 = l + 2;
                    this.Code(this.ay, this.az, n3, n3, Code.Code[26]);
                    this.ay += n3;
                    this.Code(String.valueOf(c4), 1, Code.Code[28], this.ay - n3 / 2 - code2 / 2, this.az + n3 / 2 - l / 2 - 1);
                    this.Code(++this.ay, this.az, n3, n3, Code.Code[26]);
                    this.ay += n3;
                    this.Code(String.valueOf(c3), 1, Code.Code[28], this.ay - n3 / 2 - code3 / 2, this.az + n3 / 2 - l / 2 - 1);
                    this.ay += 2;
                    final int aw = this.aw;
                    this.aw = this.ay;
                    this.Code(code, 0, n2);
                    this.aw = aw;
                    this.C(2);
                }
            }
        }
    }
    
    private void k() {
        this.I = d.Code;
        this.az = ((d.n ? 1 : 0) << 1) + 4;
        this.Code("o:a", "www.", Code.J, 49, Code.Code[54]);
        this.C(((d.n ? 1 : 0) << 1) + 4);
        this.ay += 6;
        while (d.n >= d.c.size()) {
            --d.n;
        }
        if (d.n >= 0) {
            this.Code("http://m.yahoo.com/opera/search?p=", (String)d.Code(d.c, d.n)[1], null, 129, Code.Code[54]);
        }
        this.C(((d.n ? 1 : 0) << 1) + 4);
        if (d.av && d.I.size() > 0) {
            this.Code(d.I, true, -1);
        }
        if (!d.aB && !d.aC) {
            this.l();
        }
        this.Z(d.Code(7), d.I(90));
        this.az -= 3;
        this.Code(d.a, true, -1);
        this.B(4);
        this.C(5);
        if (d.av) {
            this.Code(d.b, true, -1);
        }
        this.Code(null, Code.Z ? "myopera:logout" : "myopera:login", Code.Z ? d.Code(177, Code.J) : d.Code(178), -11, false, false, false, -16777216);
        if (!d.aB && d.aC) {
            this.l();
        }
        if (Code.I.size() > 0) {
            this.Z(d.Code(16), d.I(86));
            this.az -= 3;
            this.C(true);
        }
        if (d.X && !d.d.isEmpty()) {
            this.Z(d.Code(146), d.I(136));
            this.az -= 3;
            this.Code(d.d, true, 3);
        }
    }
    
    private synchronized void I(final Integer n, final Image image) {
        this.Code = null;
        if (this.Code.Code != this) {
            return;
        }
        int intValue = 0;
        if (n != null) {
            this.Code(n, image);
            if (image != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
        }
        final Enumeration<Integer> keys = (Enumeration<Integer>)this.B.keys();
        while (keys.hasMoreElements()) {
            final Integer key = keys.nextElement();
            final Integer code = this.B.get(key);
            final int intValue2 = key;
            final int n2 = intValue - code;
            if (this.Code(intValue2, (boolean)(((n2 | -n2) >>> 31 ^ 0x1) != 0x0), false) && !this.Z.containsKey(code) && !this.J.containsKey(code)) {
                final int n3 = code & 0x20000000;
                if (((n3 | -n3) >>> 31 ^ (this.I() ? 1 : 0)) == 0x0 || (!this.Code() && this.ao < (code & 0x1FFFFFFF) + 2 + d.I(this.I, code & 0x1FFFFFFF))) {
                    continue;
                }
                this.Code = code;
            }
        }
        if (this.Code != null) {
            g.Code(this);
            return;
        }
        if (n != null) {
            g.Code = false;
            this.c(0);
        }
    }
    
    private int Code(final int n, final int n2, final int n3) {
        if (n < this.P && n + n2 < this.P) {
            return n + n2;
        }
        if (n < this.P) {
            return this.P + (n2 - (this.P - n) << 8) / n3;
        }
        if (n + (n2 << 8) / n3 < this.P) {
            return this.P + (n2 + Code(n - this.P, n3));
        }
        return n + (n2 << 8) / n3;
    }
    
    public final void Code(final Vector vector) {
        if (this.Code.get("a") != null) {
            B.I[1] = this.Code.get("a");
        }
        if (this.Code.get("b") != null) {
            B.I[0] = this.Code.get("b");
        }
        if (((String)B.I[1]).length() == 0) {
            B.I[1] = d.Code(72);
        }
        final String i = d.I(this.Code(), "s");
        final Object[] array;
        if ((array = (Object[])((B.d == -1) ? null : d.Code(vector, B.d))) != null && array[1].equals(B.I[1]) && array[0].equals(B.I[0]) && ((array[2] == null && B.I[2] == null) || (array[2] != null && array[2].equals(B.I[2])) || (B.I[2] != null && B.I[2].equals(array[2]))) && vector == d.d && i == null) {
            return;
        }
        if (vector == d.a) {
            final int code;
            Object[] array2;
            int n;
            Integer n2;
            if ((code = d.Code(array, 5)) == 97 || (code == 83 && d.Code(array))) {
                array2 = B.I;
                n = 5;
                n2 = new Integer(97);
            }
            else {
                array2 = B.I;
                n = 5;
                n2 = new Integer(65);
            }
            array2[n] = n2;
            B.I[6] = new Integer(28);
        }
        else if (d.Code(B.I, 5) != 97 && vector != d.d) {
            B.I[5] = new Integer(77);
            B.I[6] = new Integer(31);
        }
        if (i != null && vector == d.d) {
            d.d.removeElementAt(B.d);
            d.d.insertElementAt(B.I, 0);
            d.Code(d.d, true);
            return;
        }
        if (B.d == -1) {
            d.Code(vector, B.I);
            return;
        }
        d.Code(vector, B.I, B.d);
    }
    
    private void Code(final String s, final String s2, int n, final int n2, final boolean b, final boolean b2, final boolean b3, final int n3) {
        this.ay = 4;
        this.C(B.c / 2);
        if (n != 0 && this.Code(n, 0, 0) != null) {
            this.Code(n, false, 0);
            this.ay += 4;
        }
        Image code = null;
        int n4 = 0;
        if (n2 != 0 && (code = this.Code(n2, 0, 0)) != null) {
            n4 = code.getWidth() + 4;
        }
        this.Code(d.Code(0, s2, this.i() - this.ay - n4, null), 0, n3);
        if (code != null) {
            this.ay = this.i() - code.getWidth();
            this.Code(n2, false, 0);
        }
        if (b3) {
            this.I(this.i(), d.J(0) + 2, n3);
            this.ay = this.i();
        }
        n = this.i() + this.aw + this.ax;
        if (!b) {
            this.Code((byte)42, s2, s, b2, 0, this.az - B.c / 2, n, this.au + B.c);
        }
        this.Q();
        this.C(B.c / 2);
        this.Code(0, this.az++, n, 1, Code.Code[15]);
    }
    
    private void Z(final String s, final String s2) {
        this.Q();
        final int az = this.az;
        final int n = d.J(0) + 6;
        if (s2 != null) {
            this.Code((byte)76, s, s2, false, 3, this.az + 2, this.o - 6, n - 4);
        }
        this.B(n);
        this.C(3);
        this.Code(s, 1, -16777216);
        this.Q();
        this.az = az + n + 4;
    }
    
    private void Code(final int n, final int n2, final boolean b, final boolean b2, final boolean b3) {
        String s = null;
        if (!b3) {
            s = d.I(n);
            if (b) {
                s = "menu:" + s;
            }
            if (b2) {
                s = "dialog:" + s;
            }
        }
        this.Code(s, n2);
    }
    
    private void J(final int n) {
        this.P();
        this.I = "";
        String s = "";
        switch (n) {
            case 32: {
                this.I = d.Code(96);
                s = d.Code(98);
                break;
            }
            case 33: {
                this.I = d.Code(97);
                s = d.Code(99);
                break;
            }
        }
        this.Code(s, 0, -16777216);
    }
    
    private void c(final int n, final int n2) {
        final int n3 = (int)System.currentTimeMillis();
        Code(this.I, this.J, n, n3);
        Code(this.Z, this.B, n2, n3);
    }
    
    private void l() {
        if (d.aB || d.Z.size() == 0) {
            return;
        }
        for (int i = 0; i < d.Z.size(); ++i) {
            final Object[] code = d.Code(i);
            final Object[] array = d.Z.elementAt(i);
            if (((int)array[array.length - 2] & 0x1) != 0x0) {
                final String s = (String)code[0];
                this.Z((String)code[1], "".equals(s) ? null : ("scl:" + s));
                this.az -= 3;
            }
            else {
                this.Code("scl:" + (String)code[0], (String)code[1], -11000 - i, -12000 - i, false, false, false, -16777216);
            }
        }
    }
    
    final Object[] I() {
        this.Z = new Object[12];
        this.Code = new int[6];
        this.Code();
        return this.Z;
    }
    
    final void Code(final Object[] z) {
        this.Z = z;
        this.Code = (String)z[0];
        this.I = (String)z[1];
        this.Code = (byte[])z[2];
        this.Z = (String)z[3];
        if (z.length > 4) {
            this.a = (String)z[4];
            this.Code = (int[])z[7];
            if (this.Code != null) {
                if (this.Code || d.Code(this.Code) == 65) {
                    this.s = this.Code[0];
                    this.t = this.Code[1];
                    this.aj = this.Code[5];
                }
                this.b(this.Code[0], this.Code[1]);
                this.S = this.Code[2];
                this.T = this.Code[3];
            }
            else {
                this.Code = new int[6];
            }
            if (z[10] != null) {
                this.k = (int)z[10];
            }
        }
    }
    
    static B Code(final Object[] array) {
        if (array.length <= 8) {
            return null;
        }
        return (B)array[8];
    }
    
    private void m() {
        this.az -= 5;
        this.I(false);
        this.Code = 2;
        this.I = d.Code(209);
        for (int i = 0; i < d.B.size(); ++i) {
            final C c;
            final String b = (c = d.B.elementAt(i)).B;
            final String string = "download:" + i + ":";
            final StringBuffer sb = new StringBuffer(" ");
            if (c.Code != c.I) {
                sb.append("000/");
            }
            final int n = (c.I != -1) ? c.I : 500;
            d.Code(sb, n, n, true);
            final int code = d.Code(0, sb.toString());
            final int az = this.az;
            final int n2 = this.aw + this.i() - 6;
            this.az += 7;
            this.I(-10000 - i, this.ay = 6, this.az, 23, 23);
            this.ay = 35;
            this.Code(d.Code(0, b, n2 - 35 - code, null), 0, -16777216);
            this.ay = n2 - code;
            sb.insert(0, (char)(' ' + (char)(i + 10000)));
            sb.insert(0, '\0');
            this.Code(sb.toString(), 0, -16777216, this.ay, this.az);
            this.Q();
            this.ay = 35;
            this.Code(new String(new char[] { '\0', (char)(' ' + (char)(i + 20000)) }), 0, -16777216, this.ay, this.az);
            final int b2 = this.az + d.J(0);
            this.az += 6;
            this.C(n2 - 35, 5);
            this.I(-9000 - i, this.ay, this.az, n2 - 35, 5);
            this.az += 12;
            this.Code(0, this.az = Math.max(Math.max(this.az, az + 35), b2), this.i() + this.aw + this.ax, 1, Code.Code[15]);
            ++this.az;
            this.Code((byte)42, b, string, false, 0, az, this.i() + this.aw + this.ax, this.az - az - 1);
        }
        final g task;
        (task = new g(42)).Code = this;
        Code.Code.Code.schedule(task, 1000L, 1000L);
        if (C.Code != null) {
            final StringBuffer sb2;
            d.Code(sb2 = new StringBuffer("u="), (String)C.Code[0]);
            sb2.append("&r=");
            if (C.Code[1] != null) {
                final int intValue = (int)C.Code[1];
                d.Code(sb2, intValue, intValue, true);
            }
            final g g;
            (g = new g(38)).Code = this.Code;
            g.Z = sb2.toString();
            g.B = this.Code;
            g.J = "overlay:" + d.I(154);
            d.Code(g);
        }
    }
    
    private void I(final String i, final String s) {
        this.P();
        this.I = i;
        this.Code(0, this.az, this.i() + this.aw + this.ax, 1, 0);
        this.Code(i, 1, Code.Code[44]);
        this.C(5);
        this.Code(this.aw, this.az++, this.i(), 1, Code.Code[45]);
        this.C(5);
        this.Code(s, 0, Code.Code[44]);
    }
    
    private void Q() {
        this.ay = this.aw;
        this.az += this.au + this.av;
        this.au = 0;
    }
    
    private String B() {
        final String j;
        if ((j = this.J()) != null && j.length() > 0 && j.charAt(0) == '\0') {
            return this.b + j.substring(1, j.length());
        }
        return j;
    }
    
    private void H() {
        d.aF = true;
        final int n = 23;
        this.I = n;
        this.Code = n;
        this.Code(d.Code(85), 0, Code.Code[44]);
        this.C(5);
        this.Code(d.Code(86), 0, Code.Code[44]);
    }
    
    private void M() {
        this.az -= 5;
        this.d = true;
        final B code = this.Code.I().Code;
        final int n = (d.I(this.Z, "b").equals("0") ^ true) ? 1 : 0;
        this.Code = (n << 3) + 1;
        this.I = 10;
        this.I = d.Code(41);
        final String string = "\u0000" + d.I(this.Z, "a") + "\u0000";
        int at = code.at;
        final int j = d.J(code.I, at);
        at += 3;
        final int aw = this.aw;
        for (int i = 0; i < j; ++i) {
            final String code2 = d.Code(code.I, at);
            final int n2 = at + (d.I(code.I, at) + 2);
            final String code3 = d.Code(code.I, n2);
            at = n2 + (d.I(code.I, n2) + 2);
            final int az = this.az;
            this.az += B.c / 2;
            final int n3 = (string.indexOf("\u0000" + code2 + "\u0000") >= 0) ? 1 : 0;
            if (n != 0) {
                this.ay = 6;
                final int code4 = this.Code(String.valueOf(i), code2, n3 << 1, d.J(0));
                this.ay += 6;
                this.aw = this.ay;
                this.Code(code3, n3, -16777216);
                this.Q();
                this.I("", code4);
            }
            else {
                this.ay = 5;
                this.aw += 10;
                this.Code(code3, 0, -16777216);
                this.Q();
                this.Code((byte)42, "", code2, (boolean)(n3 != 0));
            }
            this.aw = aw;
            this.C(B.c / 2);
            final int n4 = this.i() + this.aw + this.ax;
            this.Code(aw, az, n4, this.az - az);
            this.R();
            this.Code(0, this.az++, n4, 1, Code.Code[15]);
        }
    }
    
    private void N() {
        this.P();
        this.I = d.Code(110);
        this.Code(d.Code(111), 0, Code.Code[44]);
        this.C(5);
        this.Code(d.Code(112), 0, Code.Code[44]);
    }
    
    private void Code(final Vector vector, final boolean b, int a) {
        String str = null;
        int n;
        if (vector == d.J) {
            str = "bookmark:";
            n = -1000;
        }
        else if (vector == d.c) {
            str = "search:";
            n = -2000;
        }
        else if (vector == d.a) {
            str = "speeddial:";
            n = -4000;
        }
        else if (vector == Code.I) {
            n = -3000;
        }
        else if (vector == d.d) {
            str = "open:";
            n = -5000;
        }
        else if (vector == d.I) {
            str = "spl:";
            n = -7000;
        }
        else if (vector == d.b) {
            n = -8000;
        }
        else {
            n = -3999;
        }
        a = ((a >= 0) ? Math.min(a, vector.size()) : vector.size());
        for (int i = 0; i < a; ++i) {
            Object[] code = d.Code(vector, i);
            int n2 = (vector == Code.I || vector == d.d) ? 0 : ((d.Code(code, 5) == 82) ? 1 : 0);
            if (vector == d.b) {
                final int n3 = n2;
                if (code[3] != null) {}
                n2 = n3;
            }
            String code2 = null;
            boolean code3 = false;
            int n4 = -16777216;
            if (vector == d.a && (code3 = d.Code(code)) && !b) {
                code2 = d.Code(128);
            }
            if (this.d) {
                code2 = (String)code[1];
                str = "";
                code = null;
                if (vector != d.J && vector != Code.I && i > 0) {
                    n2 = 0;
                    if (d.Code(d.Code(d.a, i - 1))) {
                        n4 = Code.Code[52];
                    }
                }
            }
            if ((!b || !code3) && (n2 == 0 || vector == d.a)) {
                this.Code(code, (str == null) ? null : (str + i + ((str.length() > 0) ? ":" : "")), code2, n - i, false, vector == d.c && this.aj == 0 && i == d.n, false, n4);
            }
        }
    }
    
    private void I(final Vector vector) {
        if (vector == d.J || vector == d.a) {
            Code.J = true;
        }
        this.P();
        final int b = this.Code.I().B();
        B b2;
        String s;
        if (vector == d.J) {
            this.I = d.Code(26);
            b2 = this;
            s = d.Code(27);
        }
        else if (vector == d.c) {
            this.I = d.Code(123);
            b2 = this;
            s = d.Code(124);
        }
        else if (vector == d.d) {
            this.I = d.Code(150);
            b2 = this;
            s = d.Code(151);
        }
        else {
            this.I = d.Code(125);
            b2 = this;
            s = d.Code(126);
        }
        b2.Code(s, 0, -16777216);
        this.C(5);
        final Object[] code = d.Code(vector, b);
        final String s2 = null;
        final String s3 = null;
        int n;
        int n2;
        if (vector == d.J) {
            n = -1000;
            n2 = b;
        }
        else if (vector == d.a) {
            n = -4000;
            n2 = b;
        }
        else if (vector == d.d) {
            n = -5000;
            n2 = b;
        }
        else {
            n = -2000;
            n2 = b;
        }
        this.Code(code, s2, s3, n - n2, true, false, false, Code.Code[52]);
    }
    
    private void n() {
        this.az -= 5;
        final int n = d.J(0) + B.c;
        this.Code(0, this.az, this.i() + this.aw + this.ax, 1, 0);
        final String i = d.I(this.Z, "u");
        final String j = d.I(this.Z, "r");
        final int code = d.Code(1, j);
        this.I = d.Code(219);
        this.Code = 7;
        this.Code((String)(this.I = 10), 1, Code.Code[44], this.ay, this.az + B.c / 2);
        this.Code(j, 1, Code.Code[44], this.ay + this.i() - code, this.az + B.c / 2);
        this.az += n;
        this.Code(this.aw, this.az++, this.i(), 1, Code.Code[45]);
        this.Code(d.Code(220), 1, Code.Code[44], this.ay, this.az + B.c / 2);
        this.az += n;
        this.Code.put("a", i);
        this.Code("a", i, null, 0, Code.Code[44]);
        this.Q();
        this.Code(d.Code(221), 1, Code.Code[44], this.ay, this.az + B.c / 2);
        this.az += n;
        String s = C.Code(false);
        this.d = C.Code(true);
        if (s == null) {
            final C code2 = Code.Code;
            if (C.I == null) {
                try {
                    final Vector vector;
                    C.Code(vector = new Vector<Object[]>());
                    if (vector.size() > 0) {
                        final Object[] array;
                        C.I = (String)(array = vector.elementAt(0))[0];
                        C.Z = (String)array[2];
                    }
                }
                catch (IOException ex) {
                    code2.J();
                }
            }
            s = C.I;
            this.d = C.Z;
        }
        final String s2 = "b";
        final String s3 = s;
        final int n2 = Code.Code[44];
        final int k = this.i();
        final int n3 = n2;
        final String value = s3;
        final String key = s2;
        this.Code.put(key, value);
        final int n4 = d.J(0) + 5;
        this.C(k, n4);
        this.Z(k, n4, 0);
        this.I("", this.Code(this.ay + 3, this.az + 3, k - 4, n4 - 4, 'F', 0, key, value, 0, n3));
        this.Code(this.ay + 1, this.az + 1, k - 2, n4 - 2);
        this.R();
        this.I(this.ay + k, n4, n3);
        this.ay += k;
    }
    
    final void Z(final boolean b) {
        if (b) {
            this.ai = this.ag;
        }
        this.Code(0, -this.p, false, false);
    }
    
    private void Code(int code, String s, final String s2, String s3, final int n) {
        final int az = this.az;
        this.C(B.c / 2);
        final int ax = this.ax;
        final int aw = this.aw;
        final int n2 = 12;
        this.ay = n2;
        this.aw = n2;
        int code2 = -1;
        if (code == 0) {
            this.ax = 30;
        }
        else {
            this.ax = 12;
        }
        this.Code(s, 0, -16777216);
        this.ax = ax;
        if (code == 0) {
            code = d.J(0) + this.az - az - B.c / 2;
            this.ay = this.Code.Z() - 12 - 12;
            this.az = az + B.c / 2;
            code2 = this.Code(s2, "", (s3 != null) ? 2 : 0, code);
            this.au = code;
        }
        else if (code == 2) {
            this.ay += 4;
            final String s4 = s3;
            code = n;
            s = s4;
            s3 = s2;
            if (this.i() - this.ay < this.i() / 3) {
                this.Q();
                this.C(5);
            }
            final int n3 = this.Code.Z() - this.ay - 12;
            final int j = d.J(0);
            this.C(n3, j);
            this.I(this.Code.Z() + this.ax - 12, j, -16777216);
            code = this.Code(this.ay, this.az, n3 - j / 2 - 4, j, 's', 64, s3, s, code, -16777216);
            this.ay += n3;
            code2 = code;
        }
        this.aw = aw;
        this.C(B.c / 2 + 1);
        if (code2 >= 0) {
            this.I("", code2);
        }
        else {
            this.Code((byte)76, "", s2, false);
        }
        this.Code(0, az, this.o, this.az - az - 1);
        this.R();
        this.Code(0, this.az - 1, this.o, 1, Code.Code[15]);
    }
    
    private void u() {
        this.J = true;
        this.B = true;
        this.P();
        this.Code(d.Code(144) + " " + d.Code(143), 0, Code.Code[44]);
    }
    
    private void J(final String s, final String s2) {
        this.Code(s, s2, 0, 0, false, false, false, -16777216);
    }
    
    private void Code(final String obj, String string) {
        int b;
        for (int n = 0; (b = d.Code(0, string) + ((obj != null && d.Code(obj, "menu:")) ? ((d.J(0) + 4) / 3 + 2) : 0) + this.ay + this.ax) > this.Code.Z(); string = string.substring(0, string.length() - (n * 3 + 1)) + "...", n = 1) {}
        this.o = Math.max(this.o, b);
        this.Z.addElement(obj);
        this.Z.addElement(string);
    }
    
    private void Code(final int n, final boolean b, final int n2) {
        this.ao = this.Code.size();
        this.I = this.Code.Code();
        final Image code;
        final int width = (code = this.Code(n, 0, 0)).getWidth();
        final int height = code.getHeight();
        if (b) {
            this.ay = this.Code.Z() / 2 - width / 2;
            this.ay = Math.max(0, this.ay);
        }
        if (n2 >= 0) {
            this.az += (d.J(n2) - height) / 2;
        }
        this.C(width, height);
        this.I(n, this.ay, this.az, width, height);
        if (n2 >= 0) {
            this.az -= (d.J(n2) - height) / 2;
        }
        this.ay += width;
    }
    
    final synchronized void B(final boolean b) {
        if (this.ai <= 0 || this.Code.I != null || this.e) {
            return;
        }
        this.a(b);
        this.aG = this.ai;
        this.b = this.I[this.aG];
        this.c = null;
        final int r = this.r();
        Label_1004: {
            switch (this.b) {
                case 42:
                case 76: {
                    this.Code.Code(this.B(), this.Code, this.Code(), this.I);
                    return;
                }
                case 83: {
                    this.B = this.J();
                    this.r = true;
                    this.aG = r;
                    this.Code(this.J(), true);
                    return;
                }
                case 73: {
                    this.aG += 2;
                    this.aG = this.k();
                    this.aG += 15;
                    this.b = this.o();
                    final int o = this.o();
                    this.B = this.J();
                    String j = this.J();
                    if ((o & 0x8) != 0x0) {
                        j = "";
                    }
                    String s2;
                    final String s = s2 = this.Code.get(this.B);
                    if (this.B.equals("http://m.yahoo.com/opera/search?p=")) {
                        Code.Code.I(d.I(109));
                        return;
                    }
                    if (this.B.equals("$")) {
                        Code.Code.I("dialog:" + d.I(54));
                        return;
                    }
                    if (s2 == null) {
                        s2 = j;
                    }
                    int n = 0;
                    switch (o & 0x30) {
                        case 16: {
                            n = 2;
                            break;
                        }
                        case 32: {
                            n = 3;
                            break;
                        }
                        case 48: {
                            n = 4;
                            break;
                        }
                    }
                    this.r = ((o & 0x1) != 0x0);
                    switch (this.b) {
                        case 83:
                        case 85:
                        case 120: {
                            if (n != 4) {
                                Code.Code(null, s2, n, this.c != null && this.c.length() > 0);
                                return;
                            }
                            if (d.b() != 0 && d.Code(this.Code) == 65) {
                                this.Code.b();
                                Code.Code.Code("", null, 16, this.Code);
                                return;
                            }
                            Code.Code.J(s2);
                            return;
                        }
                        case 112: {
                            if (d.w) {
                                Code.Code(null, s2, n, false);
                                return;
                            }
                            Code.Code(null, s2, n | 0x10000, false);
                            return;
                        }
                        case 97: {
                            Code.Code(null, s2, 0, false);
                            return;
                        }
                        case 99: {
                            this.Code((s != null) ? null : j, false);
                            return;
                        }
                        case 114: {
                            this.Code(j, false);
                            return;
                        }
                        case 115: {
                            final StringBuffer sb;
                            d.Code((sb = new StringBuffer()).append("a="), s2);
                            sb.append("&b=").append(o & 0x4);
                            this.at = this.k();
                            this.Code.Code("dialog:" + d.I(112), this.Code, sb.toString());
                            return;
                        }
                        case 102: {
                            this.Code.Code(true, this.Code, "s=0");
                            return;
                        }
                        case 70: {
                            if (this.Code()) {
                                C.Code("/");
                                this.Code.Code(true, this.Code, "s=1");
                                return;
                            }
                            break Label_1004;
                        }
                    }
                    break;
                }
                case 119: {
                    if (d.X) {
                        this.e = true;
                        final String b2 = this.B();
                        final int code;
                        final String s3 = ((code = this.Code(this.ai, 'o')) >= 0) ? d.Code(this.I, code) : b2;
                        String s4;
                        final int index;
                        if ((index = (s4 = b2.substring(b2.lastIndexOf(47) + 1)).indexOf(63)) > 0) {
                            s4 = s4.substring(0, index);
                        }
                        final Object[] code2;
                        (code2 = new Object[7])[0] = s4;
                        code2[2] = this.c;
                        code2[3] = s3;
                        code2[4] = b2;
                        final g g;
                        (g = new g(47)).Code = code2;
                        g.Code = this.Code;
                        g.B = this.Code;
                        g.Code = this;
                        d.Code(g);
                        return;
                    }
                }
                case 80:
                case 87:
                case 105: {
                    d.I(this.B());
                    return;
                }
                case 78: {
                    this.aG += 2;
                    this.Code.Code(this.n(), this.k(), this.J());
                    return;
                }
                case 67: {
                    this.aa();
                    this.ai = this.Code(this.S, this.T, 1, 1, 0, false);
                    break;
                }
            }
        }
    }
    
    private void Z(final int n, final int n2, final int n3) {
        final int n4 = Code.Code[(this.Code.Code(8) ? 1 : 0) * 38 + 7] & 0xFEFFFFFF;
        this.Code(this.ay + 1, this.az + n3, n - 2, 1, n4);
        this.Code(this.ay + 1, this.az + n3 + n2 - 1, n - 2, 1, n4);
        this.Code(this.ay, this.az + n3, 1, n2, n4);
        this.Code(this.ay + n - 1, this.az + n3, 1, n2, n4);
        if (!this.Code.Code(8)) {
            this.Code(this.ay + 1, this.az + 1 + n3, n - 2, 1, Code.Code[4] & 0xFEFFFFFF);
            this.Code(this.ay + 1, this.az + 2 + n3, n - 2, 1, Code.Code[5] & 0xFEFFFFFF);
            this.Code(this.ay + 1, this.az + 3 + n3, n - 2, 1, Code.Code[6] & 0xFEFFFFFF);
        }
    }
    
    private void w() {
        final int n = d.J(0) + B.c;
        for (int i = 0; i < this.Z.size(); i += 2) {
            final String s;
            if ((s = this.Z.elementAt(i)) != null && d.Code(s, "menu:")) {
                this.o = Math.min(this.Code.Z(), this.o + n / 3);
                break;
            }
        }
        int j = 0;
        while (j < this.Z.size()) {
            final String s2 = this.Z.elementAt(j++);
            final String s3 = this.Z.elementAt(j++);
            if (s2 == null) {
                this.Code(s3, 0, Code.Code[35], this.ay, this.az + B.c / 2);
            }
            else {
                this.Code(s3, 0, Code.Code[34], this.ay, this.az + B.c / 2);
                if (d.Code(s2, "menu:")) {
                    this.I(this.o, n, Code.Code[34]);
                }
                this.Code((byte)76, "", s2, false);
                this.Code(0, this.az, this.o, n);
                this.R();
            }
            this.az += n;
        }
        this.Z = null;
        --this.az;
    }
    
    private void x() {
        this.v();
        this.B(80, 39);
        this.B(65, 46);
        this.B(90, 7);
        if (d.X) {
            this.B(148, 209);
        }
        this.Code(67, 36, true, false, false);
        this.B(79, 10);
        this.w();
    }
    
    private void z() {
        this.v();
        d d;
        for (d = this.Code; d.Code(2); d = d.I()) {}
        final B code = d.Code;
        if (d.I(1)) {
            this.B(82, 32);
        }
        if (code != null && !code.Code()) {
            if (!code.i) {
                this.B(77, 45);
            }
            if (!code.j) {
                this.Code(89, 8, false, true, false);
            }
            if (code.b) {
                this.B(63, 208);
            }
            this.B(83, 5);
            this.B(127, 141);
            if (d.X && !code.a) {
                this.B(134, 145);
            }
        }
        this.B(86, 16);
        this.B(73, 9);
        this.B(74, 35);
        this.w();
    }
    
    private void D() {
        this.v();
        final B code;
        final String i = (code = this.Code.I().Code).I();
        final int b = this.Code.I().B();
        if (d.Code(i, "bookmark:")) {
            this.Code(101, 15, false, true, false);
            this.Code(99, 14, false, true, false);
        }
        else if (d.Code(i, "speeddial:")) {
            final boolean b2 = b < 0 || d.Code(d.Code(d.a, b));
            this.Code(52, 15, false, true, false);
            this.Code(50, 19, false, true, b2);
        }
        else if (d.Code(i, "search:")) {
            this.Code(45, 15, false, true, b <= 0);
            this.Code(43, 14, false, true, b <= 0);
        }
        else {
            this.az += B.c / 2;
            this.Code("fittoscreen", "on", (code.g ? 1 : 0) << 1, d.J(0));
            this.ay += this.aw;
            this.az -= B.c / 2;
            this.Code(((d.aq == code.g) ? "tssr:" : "") + d.I(83), d.Code(89));
            if (!code.f) {
                this.Code((d.ap ? "" : "timg:") + d.I(83), d.Code(13));
            }
            this.B(83, 5);
            if (!code.i) {
                this.B(77, 94);
            }
            if (i != null) {
                this.Code(124, 95, true, false, false);
            }
            final int code2;
            if ((code2 = code.Code(code.S, code.T, 1, 1, 0, true)) != 0) {
                this.Code(code.Code(code2, 105), d.Code(103));
            }
        }
        this.w();
    }
    
    private void y() {
        this.v();
        int n = 0;
        int n2 = 0;
        final int b = Code.Code(1).B();
        final int code;
        Vector vector;
        if ((code = d.Code(this.Code.I().Code.Code)) == 109) {
            vector = d.c;
            n2 = 1;
            n = 56;
        }
        else if (code == 90) {
            vector = d.J;
        }
        else if (code == 136) {
            vector = d.d;
            n = -40;
        }
        else {
            if (code == 148) {
                if (b >= 0) {
                    final C c = d.B.elementAt(b);
                    final int n3 = 150;
                    final int n4 = 212;
                    final boolean b2 = false;
                    final boolean b3 = false;
                    final byte code2 = c.Code;
                    this.Code(n3, n4, b2, b3, (boolean)((code2 | -code2) >>> 31 != 0));
                    this.Code(151, 213, false, false, c.Code != 3 && c.Code != 1);
                    this.Code("overlay:" + d.I(149), 210);
                }
                this.Code(152, 214, false, false, false);
                this.w();
                return;
            }
            final boolean b4 = b < 0 || d.Code(d.Code(d.a, b));
            this.Code(52, 15, false, true, b < 0);
            this.Code(50, 19, false, true, b4);
            this.w();
            return;
        }
        final boolean b5 = b < n2 || d.Code(d.Code(vector, b), 2);
        if (vector != d.d) {
            this.Code(100 - n, 44, false, true, false);
        }
        this.Code(101 - n, 15, false, true, b5);
        this.Code(99 - n, 14, false, true, b5);
        this.Code(97 - n, 30, false, false, b <= n2);
        this.Code(98 - n, 31, false, false, b == vector.size() - 1 || b < n2);
        if (vector == d.d) {
            this.Code(d.I(140), 156);
        }
        if (n == 0) {
            this.Code(49, 90, false, false, Code.Z ^ true);
        }
        this.w();
    }
    
    private void E() {
        this.v();
        d d;
        for (d = this.Code; d.Code(2); d = d.I()) {}
        final String i = d.Code.I();
        this.Code = d.Code.Code;
        this.I = d.Code.I;
        this.Code = d.Code.Code;
        this.Code(i, d.Code(91));
        this.Code("timg:" + i, d.Code((d.ap ? 1 : 0) + 92));
        this.Code("overlay:" + d.I(37), 94);
        this.w();
    }
    
    private void F() {
        this.Code = 9;
        final String i = Code.Code(1).Code.I();
        this.Code(d.Code(63) + ":", 1, Code.Code[44]);
        this.Q();
        this.Code(i, 0, Code.Code[44]);
    }
    
    private void K() {
        final boolean equals = "1".equals(d.I(this.Z, "s"));
        int int1 = 0;
        final String i;
        if ((i = d.I(this.Z, "r")) != null) {
            int1 = Integer.parseInt(i);
        }
        this.aj = 0;
        this.J = Code.Code.Code(equals);
        this.I = C.Code();
        this.d = true;
        this.Code = 1;
        this.I = 10;
        final int n = d.J(0) + B.c;
        this.Code(0, this.az, this.i() + this.aw + this.ax, 1, 0);
        if (int1 > 0) {
            this.Code(d.Code(155), 1, Code.Code[44]);
            this.Q();
        }
        String string = "...";
        final int lastIndex;
        if ((lastIndex = this.I.lastIndexOf(47, this.I.length() - 2)) > 0) {
            string += this.I.substring(lastIndex);
        }
        this.Code(d.Code(0, this.I, this.i(), string), 0, Code.Code[44], this.ay, this.az + B.c / 2);
        if (equals && !C.Code()) {
            B b;
            byte b2;
            String s;
            String string2;
            if (int1 == 1) {
                b = this;
                b2 = 76;
                s = "new file";
                string2 = "sets:";
            }
            else if (int1 == 2) {
                b = this;
                b2 = 76;
                s = "new file";
                string2 = "set:";
            }
            else {
                b = this;
                b2 = 76;
                s = "new file";
                string2 = "put:" + C.Code();
            }
            b.Code(b2, s, string2, false);
            this.Code(0, this.az, this.o, n);
            this.R();
        }
        this.az += n;
        this.Q();
        this.Code(this.aw, this.az++, this.i(), 1, Code.Code[45]);
        for (int j = 0; j < this.J.size(); ++j) {
            final Object[] array;
            final String str = (String)(array = this.J.elementAt(j))[0];
            final int intValue = (int)array[1];
            String str2 = null;
            if ((intValue & 0x4) != 0x0) {
                if ("+".equals(array[0])) {
                    str2 = "mkdir:";
                }
                else {
                    str2 = "cwd:";
                }
            }
            else if (!equals && (intValue & 0x1) != 0x0) {
                str2 = "get:";
            }
            if (str2 != null) {
                final String s2 = (String)array[2];
                String string3 = "...";
                final int lastIndex2;
                if ((lastIndex2 = s2.lastIndexOf(47)) != -1) {
                    string3 += s2.substring(lastIndex2);
                }
                this.Code(d.Code(0, s2, this.i(), string3), 0, Code.Code[44], this.aw, this.az + B.c / 2);
                this.Code((byte)76, s2, str2 + str, false);
                this.Code(0, this.az, this.o, n);
                this.R();
                this.az += n;
            }
        }
    }
    
    final boolean Code(final String s, final boolean b) {
        if (this.B == null) {
            return false;
        }
        final String b2 = this.B;
        this.B = null;
        this.q |= "u".equals(b2);
        if (this.b == 70) {
            this.d = null;
        }
        if (s == null) {
            this.Code.remove(b2);
        }
        else {
            this.Code.put(b2, s);
        }
        this.C();
        if (this.r) {
            String s2 = this.Code;
            String code = "";
            if (b2.equals("o:a")) {
                Code.Code.Z(s);
                return true;
            }
            switch (d.Code(s2)) {
                case 65:
                case 118: {
                    s2 = b2 + s;
                    break;
                }
                default: {
                    code = this.Code();
                    break;
                }
            }
            if (b) {
                this.Code.remove(b2);
            }
            this.Code.Code(s2, this.Code, code, this.I);
        }
        return true;
    }
    
    final boolean Code(final boolean b) {
        if (!this.Code.Code(2) && this.Code.I == null && this.Code != null && !this.Code.startsWith("myopera:") && !this.Code.startsWith("sk:") && !this.Code.startsWith("server:") && (!this.Code() || (d.Code(this.Code) == 90 && d.Code(this.Code(this.ai, 76), "bookmark:")) || (d.Code(this.Code) == 91 && d.Code(this.Code(this.ai, 76), "speeddial:")) || (d.Code(this.Code) == 109 && d.Code(this.Code(this.ai, 76), "search:"))) && d.ax) {
            this.a(b);
            this.Code.Code("menu:" + d.I(123), (String)null, (String)null);
            return true;
        }
        return false;
    }
    
    static void Code(final d d) {
        if (d.A < 160 && d.ax) {
            d.Code("overlay:" + d.I(40), (String)null, (String)null);
            while (d.aF) {
                d.Code(d.I, 1000);
            }
            Code.Code.I(Code.Code(8));
        }
        if (d.A >= 160 && d.Code[1] == null) {
            final byte[] array;
            d.Code(array = new byte[32]);
            d.Code(1, d.I(array, array.length), true);
        }
    }
    
    final synchronized boolean B() {
        if (this.ai == 0 || this.I[this.ai] != 73) {
            return false;
        }
        final int ag = this.aG;
        this.aG = this.ai;
        this.r();
        this.aG += 2;
        this.aG = this.k();
        this.aG += 15;
        final int o = this.o();
        this.aG = ag;
        return o == 120 || o == 97 || o == 112 || o == 102 || o == 70 || o == 115 || o == 85 || o == 83;
    }
    
    final synchronized String I() {
        if (this.ai <= 0) {
            return null;
        }
        this.aG = this.ai;
        final byte b = this.I[this.aG];
        this.r();
        if (b == 76 || b == 42) {
            return this.B();
        }
        return null;
    }
    
    private synchronized String Code(final int ag, final int n) {
        this.aG = ag;
        if (this.I[ag] == n || (n == 76 && this.I[ag] == 42)) {
            this.r();
            return this.B();
        }
        return "";
    }
    
    private int Z(final int n) {
        return n * this.v + 255 >> 8;
    }
    
    final void Code(final String s, final int value, final Object o) {
        if (this.I == null) {
            this.I = new Hashtable();
        }
        this.I.put(this.B, new Object[] { s, new Integer(value), o });
        this.Code(s, false);
    }
    
    private void b(final int n) {
        switch (n) {
            case 84: {
                this.aG += 5;
                this.aG += this.n();
            }
            case 73: {
                this.aG += 10;
            }
            case 66: {
                this.aG += 4;
            }
            case 70: {
                this.aG += 6;
                this.aG += this.n();
                this.aG = this.n() + this.aG + 3;
            }
            case 83: {
                this.aG += this.k();
            }
            case 76: {
                this.aG += 9;
            }
            case 77: {
                ++this.aG;
                this.aG += this.k();
                break;
            }
        }
    }
    
    final void d() {
        if (this.I()) {
            if (this.T >= this.p - this.Code.I()) {
                this.Code(0, this.Code.I() / 2 - this.T, false);
            }
            else if (this.I() && this.T < this.M) {
                this.Code(this.L + this.Code.Code() / 2 - this.S, this.M + this.Code.I() / 2 - this.T, false);
            }
            else {
                this.Code(0, this.p - this.Code.I() / 2 + this.J(1) - this.T, false);
            }
            Code.Code.I(false);
            return;
        }
        if (this.t >= this.p - this.Code.I()) {
            this.Z(false);
        }
        else if (this.t < this.M) {
            this.Code(this.L - this.s, this.M - this.t, false, false);
        }
        else {
            this.Code(0, this.p, false, false);
        }
        Code.Code.I(true);
    }
    
    private void c(final int n) {
        if (this.H > 0 && (int)System.currentTimeMillis() - this.as >= n) {
            this.as = (int)System.currentTimeMillis();
            d.a();
        }
    }
    
    private int Code(final String key, final String value, int n, int n2) {
        n2 = ((n2 == -1) ? 0 : ((n2 - 12) / 2));
        if ((n & 0x2) != 0x0) {
            n &= 0xFFFFFFFD;
            this.Code.put(key, value);
        }
        this.Code(this.ay, this.az + n2, 12, 12, Code.Code[16] & 0xFEFFFFFF);
        this.Z(12, 12, n2);
        final int code = this.Code(this.ay, this.az + n2, 12, 12, 'c', n, key, value, 0, 0);
        this.ay += 13;
        return code;
    }
    
    private void Z(Vector code) {
        if (code == d.J || code == d.a || code == null) {
            Code.J = true;
        }
        this.Code = 7;
        this.I = 10;
        this.B = true;
        final String s = (String)B.I[1];
        if (code == d.J || code == null) {
            this.I = d.Code(7);
        }
        else if (code == d.a) {
            this.I = d.Code(33);
        }
        else if (code == d.c) {
            this.I = d.Code(47);
        }
        else if (code == d.d) {
            this.I = d.Code(145);
        }
        this.Z(d.Code(65), null);
        this.Code("a", s, (byte[])B.I[2], 0, -16777216);
        this.C(5);
        if (code == d.d) {
            this.C(B.c - 5);
            if (code.size() > 2 && B.d == -1) {
                this.Code(0, this.az - 1, this.o, 1, Code.Code[15]);
                this.Code(0, d.Code(157), "s", "1", -1);
            }
        }
        else {
            this.Z(d.Code(63), null);
            this.Code("b", (String)B.I[0], null, 48, -16777216);
            this.C(B.c - 4);
            this.B(d.I(53), d.Code(129));
            this.C(5);
        }
        if (code == d.a) {
            if (d.J.size() > 0) {
                this.B("dialog:" + d.I(54) + "&l=b", d.Code(132));
                this.Q();
            }
            if (Code.I.size() > 0) {
                this.B("dialog:" + d.I(54) + "&l=h", d.Code(133));
                this.Q();
            }
        }
        if (code == null) {
            this.Code(d.Code(33), 0, -16777216);
            this.Q();
            this.C(2);
            if (B.Code == null) {
                code = new Vector<Object[]>();
                final Object[] code2;
                (code2 = d.Code())[1] = "- " + d.Code(131) + " -";
                code.addElement(code2);
                for (int i = 0; i < d.a.size(); ++i) {
                    final Object[] code3;
                    if (d.Code(code3 = d.Code((Object[])d.a.elementAt(i)))) {
                        code3[1] = d.Code(130);
                    }
                    code.addElement(code3);
                }
                B.Code = code;
                B.d = -1;
            }
            this.Code("$", "", null, 129, -16777216);
        }
        if (code == d.c && s.length() == 0) {
            this.Code(d.Code(127, d.Code(108)), 0, Code.Code[52]);
        }
    }
    
    private void O() {
        this.P();
        this.I = d.Code(139);
        this.Code(d.Code(140) + " " + d.Code(136), 0, Code.Code[44]);
    }
    
    private int J(final int n) {
        return (n << 8) / this.v;
    }
    
    private void C(final boolean b) {
        final int size = Code.I.size();
        int n = 0;
        if (b) {
            n = size - Math.min(3, size);
        }
        for (int i = size - 1; i >= n; --i) {
            this.Code((Object[])Code.I.elementAt(i), "history:" + i + ":", null, -3000 - i, false, false, false, -16777216);
        }
    }
    
    private void B(String s, String s2) {
        final String s3 = s;
        s = s2;
        s2 = s3;
        this.Code((byte)76, s, s2, false);
        this.Code(s, 0, Code.Code[53]);
        this.R();
    }
    
    private void Code(final Object[] array, String string, String string2, final int n, final boolean b, final boolean b2, final boolean b3, final int n2) {
        if (string2 == null) {
            string2 = "";
        }
        if (string == null) {
            string = "";
        }
        if (array != null) {
            string2 += (String)array[1];
            string += (String)array[0];
        }
        this.Code(string, string2, n, 0, b, b2, b3, n2);
    }
    
    private void C(final int n) {
        this.Q();
        this.az += n;
    }
    
    private void Code(final int n, final String s) {
        this.Code(d.Code(n) + ": ", 1, -16777216);
        this.Code(s, 0, -16777216);
        this.Q();
    }
    
    private void B(int n) {
        final int n2 = this.i() + this.aw + this.ax;
        this.Code(0, this.az, n2, 1, Code.Code[57]);
        this.Code(0, this.az + n - 1, n2, 1, Code.Code[58]);
        final int n3 = Code.Code[55];
        final int n4 = Code.Code[56];
        int n5 = n3 >> 8 & 0xFF00;
        int n6 = n3 & 0xFF00;
        int n7 = n3 << 8 & 0xFF00;
        n -= 2;
        final int n8 = ((n4 >> 8 & 0xFF00) - n5) / n;
        final int n9 = ((n4 & 0xFF00) - n6) / n;
        final int n10 = ((n4 << 8 & 0xFF00) - n7) / n;
        for (int i = 0; i < n; ++i) {
            this.Code(0, this.az + 1 + i, n2, 1, 0xFF000000 | (n5 & 0xFF00) << 8 | (n6 & 0xFF00) | n7 >> 8);
            n5 += n8;
            n6 += n9;
            n7 += n10;
        }
    }
    
    private void I(final int n, final int n2, final int n3) {
        for (int i = 1; i < n2 / 3; ++i) {
            this.Code(n - i - this.ax, this.az + n2 / 2 - i + 1, 1, (i << 1) - 1, n3);
        }
    }
    
    private int Code(final byte[] b) {
        final int length = b.length;
        final int size = this.Code.size();
        this.Code.writeShort(length);
        this.Code.write(b, 0, length);
        return size;
    }
    
    private Image Code(final Integer n) {
        final int n2 = ((n & 0x40000000) != 0x0) ? (256 * this.Code.Code() / this.o) : 256;
        final int n3 = n & 0x1FFFFFFF;
        return d.Code(this.I, n3 + 2, d.I(this.I, n3), n2, null);
    }
    
    public final int Code(String lowerCase) {
        if (lowerCase == null || lowerCase.length() == 0) {
            return 0;
        }
        this.Code.e = lowerCase;
        lowerCase = lowerCase.toLowerCase();
        this.B = new Vector();
        this.aG = this.an;
        while (this.aG < this.I.length) {
            final int o;
            if ((o = this.o()) == 84 || o == 66 || o == 73 || o == 70) {
                this.W();
            }
            if (o == 84) {
                final int ag = this.aG;
                int n = 0;
                int index = 0;
                int n2 = 0;
                int n3 = 0;
                this.aG += 4;
                final int i = d.I(this.o());
                final String j;
                final String lowerCase2;
                if ((lowerCase2 = (j = this.J()).toLowerCase()).indexOf(lowerCase) == -1) {
                    continue;
                }
                for (int k = 0; k < j.length(); ++k) {
                    if (j.charAt(k) == '\n') {
                        ++n3;
                    }
                }
                for (int l = 0; l < lowerCase2.length(); ++l) {
                    if (lowerCase2.charAt(l) == '\n') {
                        n = l + 1;
                        ++n2;
                        index = 0;
                    }
                    else {
                        if (index < lowerCase.length() && lowerCase2.charAt(l) == lowerCase.charAt(index)) {
                            ++index;
                        }
                        else {
                            index = 0;
                        }
                        if (index == lowerCase.length()) {
                            final int code = d.Code(i, j.substring(n, l - lowerCase.length() + 1));
                            final int[] obj;
                            final int n4 = (obj = new int[] { code, this.h / (n3 + 1) * n2, d.Code(i, j.substring(n, l + 1)) - code, this.h / (n3 + 1), this.e, this.f, ag })[1] + obj[5];
                            int index2;
                            for (index2 = this.B.size() - 1; index2 >= 0; --index2) {
                                final int[] array = this.B.elementAt(index2);
                                if (n4 >= array[1] + array[5]) {
                                    break;
                                }
                            }
                            this.B.insertElementAt(obj, index2 + 1);
                            index = 0;
                        }
                    }
                }
            }
            else {
                this.b(o);
            }
        }
        this.C = new Hashtable();
        for (int index3 = 0; index3 < this.B.size(); ++index3) {
            final Integer key = new Integer(((int[])this.B.elementAt(index3))[6]);
            int[] value = { index3 };
            if (this.C.containsKey(key)) {
                final int[] array3;
                final int[] array2 = value = new int[(array3 = (int[])this.C.get(key)).length + 1];
                array2[array3.length] = index3;
                System.arraycopy(array3, 0, value, 0, array3.length);
            }
            this.C.put(key, value);
        }
        return this.B.size();
    }
    
    final void Code(final Graphics graphics, final int n, final int n2) {
        final int v = this.v;
        if (this.T < this.P || this.af != 0) {
            this.v = 256;
        }
        final boolean b = this.d || this.I[this.ai] == 42 || d.Code(this.Code) == 73 || (d.Code(this.Code) == 135 && this.ai != this.ag);
        if (this.Code.Code(2) || (this.d && this.Code.Code(8))) {
            this.s = ((Code.Code[36] & 0xFF) > 127);
            this.Code(graphics, n, n2, Code.Code[8], Code.Code[9], 0, true, false);
            this.s = false;
        }
        else if (Code.Code(d.I(66)) == null && (this.d || this.af > 0 || this.C() || (!this.I() && Code.Code(this) && !Code.Code.I()))) {
            if (b) {
                this.Code(graphics, n, n2, Code.Code[11], Code.Code[12], 0, true, true);
            }
            else {
                final int n3 = (this.I[this.ai] == 73) ? 0 : (0x29000000 | (Code.Code[21] & 0xFFFFFF));
                this.Code(graphics, n, n2, n3, n3, 0xFF000000 | Code.Code[21], false, false);
            }
        }
        this.v = v;
    }
    
    final synchronized String Z() {
        return this.Code(this.ai, 76);
    }
    
    private static int Code(final int n, final int n2) {
        return n * n2 + 255 >> 8;
    }
    
    private int l() {
        return this.k() << 8 >> 8;
    }
    
    final boolean J() {
        return this.I() && this.v == this.w && this.T >= this.P;
    }
    
    private boolean C() {
        return this.m || this.o <= this.Code.Code();
    }
    
    private void ab() {
        if (!this.C()) {
            this.ai = this.Code(this.S, this.T, 1, 1, 0, false);
        }
    }
    
    private void S() {
        d.Z(this.aC, this.Code.Code(), this.at);
    }
    
    final void I(final int n) {
        if (n != 0) {
            final int n2 = 0;
            this.b();
            this.Code.I();
            this.Code(n2, 0 / n - this.d(), false, false);
            this.r = this.t;
        }
    }
    
    private int m() {
        this.aG += 4;
        int z = d.Z(this.I, this.aG - 4);
        if (this.s && z >>> 24 != 254) {
            z = ((z & 0xFF000000) | 16777215 - (z & 0xFFFFFF));
        }
        return z;
    }
    
    private int j() {
        this.aC = 0;
        this.at = this.Code.size();
        d.Code(this.Code, 0);
        return this.at;
    }
    
    private void Code(final byte b, final String s, final String s2, final boolean b2, final int n, final int n2, final int n3, final int n4) {
        this.Code(b, s, s2, b2);
        Code(this.Z, n, n2, n3, n4);
        this.R();
    }
    
    private boolean Code(final int n) {
        return this.ay + n + this.ax > this.Code.Z();
    }
    
    private int i() {
        return this.Code.Z() - this.aw - this.ax;
    }
    
    private void C(final String str, final String str2) {
        ++this.aC;
        this.Code.writeUTF(str);
        this.Code.writeUTF(str2);
    }
    
    private void Code(final int n, final int n2, final int n3, final int n4) {
        this.o = Math.max(this.o, n + n3);
        this.p = Math.max(n2 + n4, this.p);
        if (this.aA > 0) {
            Code(this.Z, n, n2, n3, n4);
        }
    }
    
    private static void Code(final DataOutputStream dataOutputStream, final int v, final int n, final int v2, final int n2) {
        dataOutputStream.writeShort(v);
        d.Code(dataOutputStream, n);
        dataOutputStream.writeShort(v2);
        d.Code(dataOutputStream, n2);
    }
    
    private void Code(final byte b, final String str, final String s, final boolean b2) {
        if (this.Z[9] != null && this.Z[9].equals(s)) {
            this.aj = this.aB;
        }
        ++this.aB;
        this.Z.write(b);
        if (b2) {
            this.ag = this.Z.size();
        }
        this.Z.writeUTF(str);
        this.Z.writeUTF(s);
        this.aA = this.Z.size();
        this.Z.write(0);
    }
    
    private void I(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.I.write(73);
        Code(this.I, n2, n3, n4, n5);
        this.I.writeInt(0);
        this.I.write(0);
        this.I.write(0);
        this.I.write(0);
        d.Code(this.I, n);
    }
    
    static void Code(final B b) {
        b.a(5);
    }
    
    static void Code(final B b, final DataInputStream dataInputStream) {
        b.Code(dataInputStream);
    }
    
    final void e() {
        this.v = this.w;
        this.q = this.s;
        this.r = this.t;
    }
    
    private void I(final String str, final int n) {
        ++this.aB;
        this.Z.write(73);
        this.Z.writeUTF(str);
        this.Z.writeShort(3);
        d.Code(this.Z, n);
        this.aA = this.Z.size();
        this.Z.write(0);
    }
    
    private void X() {
        (this.C = new int[9])[1] = this.p;
        this.C[2] = 6;
        this.C[4] = 3;
        this.N = 1;
    }
    
    private void R() {
        this.Z.Code()[this.aA] = (byte)((this.Z.size() - this.aA) / 10);
        this.aA = 0;
    }
    
    private void Code(final int n, final int n2, final int n3, final int n4, final int v) {
        this.Code(n, n2, n3, n4);
        this.I.write(66);
        Code(this.I, n, n2, n3, n4);
        this.I.writeInt(v);
    }
    
    private void Code(final String str, final int n, final int v, final int n2, final int n3) {
        final int code = d.Code(n, str);
        final int j = d.J(n);
        this.Code(n2, n3, code, j);
        this.I.write(84);
        Code(this.I, n2, n3, code, j);
        this.I.writeInt(v);
        this.I.write(d.Code(n));
        this.I.writeUTF(str);
    }
    
    private void Code(String str, final int n, final int v) {
        int code;
        while (true) {
            final int index;
            if ((index = str.indexOf(10)) >= 0) {
                if (index > 0) {
                    this.Code(str.substring(0, index), n, v);
                }
                this.Q();
                final B b = this;
                str = str.substring(index + 1, str.length());
                this = b;
            }
            else {
                code = d.Code(n, str);
                final int n2 = this.Code.Z() - Math.min(this.ay, this.aw) - this.ax;
                if (code <= n2) {
                    break;
                }
                int endIndex;
                for (endIndex = str.lastIndexOf(32, str.length()); endIndex > 0 && d.Code(n, str.substring(0, endIndex)) > n2; endIndex = str.substring(0, endIndex).lastIndexOf(32)) {}
                if (endIndex > 0 && endIndex != str.length()) {
                    this.Code(str.substring(0, endIndex), n, v);
                    this.Q();
                    final B b2 = this;
                    str = str.substring(endIndex + 1);
                    this = b2;
                }
                else {
                    if (this.Code(d.Code(n, str.substring(0, 3)))) {
                        this.Q();
                    }
                    final int n3 = this.Code.Z() - this.ax - this.ay;
                    final char[] charArray = str.toCharArray();
                    final int max = Math.max(d.I(n, charArray, charArray.length, n3), 1);
                    this.Code(str.substring(0, max), n, v);
                    final B b3 = this;
                    str = str.substring(max);
                    this = b3;
                }
            }
        }
        final int j = d.J(n);
        this.C(code, j);
        this.I.write(84);
        Code(this.I, this.ay, this.az, code, j);
        this.I.writeInt(v);
        this.I.write(d.Code(n));
        this.I.writeUTF(str);
        final B b4 = this;
        b4.ay += code;
    }
    
    final void c() {
        if (this.I() && this.T >= this.P) {
            this.I(false);
            return;
        }
        this.B(false);
    }
    
    private int Code(final int ag) {
        if (this.aG == ag) {
            return 23;
        }
        switch (this.o()) {
            case 99: {
                return this.o();
            }
            case 117: {
                this.o();
                this.aG += this.n();
                return 23;
            }
            case 115: {
                this.aG += this.n();
                this.aG += this.n();
                return 23;
            }
            case 108: {
                this.aG += this.n();
                this.o();
                return 23;
            }
            default: {
                this.aG = ag;
                return 23;
            }
        }
    }
    
    final synchronized void Code(final int n) {
        if (n > 0) {
            this.Z.clear();
            return;
        }
        if (n >= 0) {
            final Hashtable<Integer, Object> z = new Hashtable<Integer, Object>();
            final Enumeration<Integer> keys = this.B.keys();
            while (keys.hasMoreElements()) {
                final Integer key = keys.nextElement();
                final Integer key2 = this.B.get(key);
                if (this.Z.containsKey(key2) && this.Code(key, false, true)) {
                    z.put(key2, this.Z.get(key2));
                }
            }
            this.Z = z;
        }
    }
    
    final synchronized void b() {
        int ai = 0;
        this.aG = this.ag;
        while (this.aG <= this.ah && ai < this.ai) {
            final int ag = this.aG;
            this.r();
            if (d.Code(this.J(), "menu:")) {
                ai = ag;
            }
        }
        if (ai > 0) {
            this.ai = ai;
            this.B(false);
        }
    }
    
    private int r() {
        if (this.aq >= 13) {
            final int code;
            if ((code = this.Code(this.aG, 't')) != -1) {
                final int ag = this.aG;
                this.aG = code;
                this.c = this.J();
                this.aG = ag;
            }
            ++this.aG;
            this.aG += 10 * this.o();
            return code;
        }
        ++this.aG;
        this.aG += 10 * this.o();
        final int ag2 = this.aG;
        this.c = this.J();
        return ag2;
    }
    
    final int Code() {
        if (this.C == 2) {
            return 4375;
        }
        return this.ar;
    }
    
    final void I(final boolean b) {
        if (b) {
            if (this.Z()) {
                this.w = 256 * this.Code.Code() / this.o;
                this.D = this.v;
                this.E = (int)System.currentTimeMillis();
                g.I = true;
                this.b(0, (this.T >= this.P) ? this.Code(this.T, -this.Code.I() / 2, this.w) : this.t);
            }
            else if (!this.I()) {
                this.w = 256;
                this.e();
            }
        }
        else if (this.I()) {
            this.w = 256;
            this.D = this.v;
            this.E = (int)System.currentTimeMillis();
            g.I = true;
            if (this.T >= this.P) {
                final int code = this.Code.Code();
                final int i = this.Code.I();
                final int code2 = d.Code(this.T - i / 2, this.P, this.p - i);
                this.b(d.Code(this.J(this.Z(this.S, code2), this.S - code / 2), 0, this.o - code), code2);
                this.ab();
            }
        }
        this.C();
    }
    
    private synchronized void Code(final Integer n, final Image value) {
        if (value != null) {
            this.Z.put(n, value);
            return;
        }
        this.J.put(n, n);
    }
    
    private synchronized void V() {
        this.aG = 0;
        this.aq = this.o();
        this.o = this.n();
        this.p = this.k();
        this.o();
        this.o();
        this.o();
        this.n();
        this.I = this.J();
        final int n;
        if ((n = this.n()) > 0) {
            this.Code = new byte[n];
            System.arraycopy(this.I, this.aG, this.Code, 0, n);
            this.aG += n;
        }
        this.b = this.J();
        this.a = this.Code;
        this.Code = this.B();
        final int o = this.o();
        this.c = ((o & 0x1) != 0x0);
        this.a = (o & 0x6) >>> 1;
        final int n2 = o & 0x10;
        this.b = ((n2 | -n2) >>> 31 != 0);
        if (this.Code != null) {
            this.B();
        }
        if (this.aq >= 12) {
            this.Q = this.o();
            this.R = this.k();
        }
        if (!this.c && this.Code.Code != null && this.Code.Code != this.Code.I) {
            final int q = this.Code.Code.q;
            this.s = q;
            this.q = q;
            final int r = this.Code.Code.r;
            this.t = r;
            this.r = r;
            this.S = this.Code.Code.S;
            this.T = this.Code.Code.T;
            this.Code.J = true;
            this.I(false);
        }
        this.Z = null;
        this.I = new Hashtable();
        this.an = this.aG;
        this.X();
    }
    
    final int C() {
        return this.p;
    }
    
    private int Code(final int n, final int n2, final int n3, final int n4, final char c, final int n5, final String s, final String s2, final int n6, int size) {
        this.I.write(70);
        Code(this.I, n, n2, n3, n4);
        this.I.writeInt(size);
        this.I.write(c);
        this.I.write(n5);
        this.I.writeUTF(s);
        this.I.writeUTF(s2);
        d.Code(this.I, n6);
        size = this.Code.size();
        this.Code.write(70);
        Code(this.Code, n, n2, n3, n4);
        this.Code.writeInt(0);
        this.Code.write(c);
        this.Code.write(n5);
        this.Code.writeUTF(s);
        this.Code.writeUTF(s2);
        d.Code(this.Code, n6);
        return size;
    }
    
    final int g() {
        return this.Code.Code();
    }
    
    final int J() {
        return this.m;
    }
    
    final int B() {
        return this.o;
    }
    
    final int c() {
        return this.Z(this.q);
    }
    
    final int h() {
        return this.Code.I() - B.n;
    }
    
    final void B() {
        this.a(7);
        this.T();
    }
    
    private synchronized int I(int i) {
        this.aG = i;
    Label_1082:
        while ((this.aG < this.I.length && this.ao == this.I.length) || this.aG < this.ao - 16) {
            final int ag = this.aG;
            Label_1074: {
                final int o;
                switch (o = this.o()) {
                    case 83: {
                        this.aG += this.k();
                        break;
                    }
                    case 76: {
                        i = this.k();
                        if (this.C() && i > 0) {
                            this.ai = i;
                        }
                        this.ag = this.k();
                        this.ah = this.k();
                        if (this.Code != null && !this.Code.J() && this.a != null && !this.a.equals(d.C)) {
                            this.ai = 0;
                            this.ag = 0;
                            this.ah = 0;
                            break;
                        }
                        break;
                    }
                    case 77: {
                        final int o2 = this.o();
                        int k = this.k();
                        if (this.aG + k > this.ao) {
                            return i;
                        }
                        switch (o2) {
                            case 115: {
                                if (this.aq >= 13) {
                                    i = this.aG + k;
                                    this.Code = this.Code(i);
                                    this.B = this.Code(i);
                                    this.I = this.Code(i);
                                    break Label_1074;
                                }
                                this.Code = this.o();
                                this.I = this.o();
                                break Label_1074;
                            }
                            case 67: {
                                k -= 8;
                                this.N = k / 6;
                                this.C = new int[(this.n() << 1) + this.N * 7];
                                this.O = this.o();
                                this.L = this.n();
                                this.M = this.k();
                                i = 0;
                                if (this.Code != null && this.Code.indexOf(35) != -1) {
                                    i = 1;
                                }
                                if (this.c && !this.Code) {
                                    if (this.I()) {
                                        this.Code(this.L + this.Code.Code() / 2 - this.S, this.M + this.Code.I() / 2 - this.T, true);
                                    }
                                    else if (this.Z() || !d.au || i != 0) {
                                        this.Code(this.L - this.s, this.M - this.t, false, true);
                                    }
                                    this.e();
                                }
                                i = this.N * 6;
                                int j;
                                for (int n = 0, n2 = 0; n2 / 6 < this.N; this.C[n2++] = n, this.C[n2++] = j, this.C[n2++] = i, ++n2, this.C[n2++] = this.o(), ++n2, i += 2 * this.n() + 1, n += j) {
                                    j = this.k();
                                }
                                this.Y();
                                break Label_1074;
                            }
                            case 84: {
                                this.ak = k / 12;
                                this.a = new int[k];
                                for (i = 0; i < this.ak << 2; ++i) {
                                    this.a[i] = this.k();
                                }
                                break Label_1074;
                            }
                            case 83: {
                                this.Code = new String[7];
                                for (i = 0; i < 7; ++i) {
                                    this.Code[i] = this.J();
                                }
                                break Label_1074;
                            }
                            case 80: {
                                this.o();
                                break Label_1074;
                            }
                            case 82: {
                                i = this.o();
                                final int n3 = i & 0x4;
                                this.j = ((n3 | -n3) >>> 31 != 0);
                                if (this.j) {
                                    d.Code = d.Code();
                                }
                                final int n4 = i & 0x2;
                                this.i = ((n4 | -n4) >>> 31 != 0);
                                if ((i & 0x8) != 0x0) {
                                    this.C = true;
                                    break Label_1074;
                                }
                                this.C = false;
                                break Label_1074;
                            }
                            default: {
                                this.aG += k;
                                break Label_1074;
                            }
                        }
                        break;
                    }
                    default: {
                        this.W();
                        this.b(o);
                        if (this.aG <= this.ao) {
                            if (!this.a) {
                                this.e = (short)this.e + this.aE;
                                this.f = (this.f << 8 >> 8) + this.aF;
                                d.Code(this.e, this.I, ag + 1);
                                d.Z(this.f, this.I, ag + 3);
                                this.aE = this.e;
                                this.aF = this.f;
                            }
                            final int n5 = ag;
                            i = this.aG;
                            final int n6 = n5;
                            int l = this.I(this.f, 0);
                            do {
                                int n7;
                                for (n7 = this.C[l * 6 + 2]; this.C[n7 + 2] != 0; n7 += 2) {}
                                if (this.C[n7] == 0) {
                                    this.C[n7] = n6;
                                }
                                else if (this.C[n7 + 1] + this.O < n6) {
                                    n7 += 2;
                                    this.C[n7] = n6;
                                }
                                this.C[n7 + 1] = i;
                            } while (++l < this.N && this.f + this.h > this.C[l * 6]);
                            this.I(this.e, this.f, this.g, this.h);
                            break;
                        }
                        break Label_1082;
                    }
                }
            }
            i = this.aG;
        }
        return i;
    }
    
    private synchronized void a(final boolean b) {
        if (!this.C() || b) {
            return;
        }
        int s = -1;
        int t = -1;
        int n = 0;
        this.aG = this.ai + 1;
        for (int i = this.o(); i > 0; --i) {
            this.W();
            this.f = this.B(this.f);
            final int n2;
            if ((n2 = Math.min(this.f + this.h, this.r + this.Code.I()) - Math.max(this.f, this.r)) > n) {
                n = n2;
                s = this.e + this.g / 2;
                t = this.f + this.h / 2;
            }
        }
        this.S = s;
        this.T = t;
    }
    
    private void T() {
        d.Code((InputStream)this.Code);
        this.Code = null;
    }
    
    final int I() {
        if (this.C == 2) {
            this.aI = Math.min(this.aI + Math.max((this.aH * 10 - this.aI) / 5, 0) + 4, 1000);
            return this.aI + 250;
        }
        return this.ar / 3 + (this.Z() << 1) / 3;
    }
    
    private int n() {
        this.aG += 2;
        return d.I(this.I, this.aG - 2);
    }
    
    private int k() {
        this.aG += 3;
        return d.J(this.I, this.aG - 3);
    }
    
    private static int B(final int n, final int n2) {
        int abs = 0;
        if (n2 != 0) {
            abs = Math.abs((n * 1000 << 1) / n2);
        }
        return abs;
    }
    
    private int o() {
        return this.I[this.aG++] & 0xFF;
    }
    
    private void W() {
        this.e = this.n();
        this.f = this.k();
        this.g = this.n();
        this.h = this.k();
    }
    
    private String J() {
        final String code = d.Code(this.I, this.aG);
        this.aG += this.n();
        return code;
    }
    
    private void Y() {
        int p = 0;
        this.P = 0;
        for (int i = 0; i < this.N; ++i) {
            this.C[i * 6 + 5] = p;
            if ((this.C[i * 6 + 4] & 0x1) != 0x0) {
                p += this.C[i * 6 + 1];
                if ((this.C[i * 6 + 4] & 0x2) == 0x0) {
                    this.P += this.C[i * 6 + 1];
                }
            }
        }
        this.p = p;
    }
    
    private void aa() {
        while (this.aG < this.n() + this.aG) {
            final int o = this.o();
            final int n = this.n();
            this.C[n * 6 + 4] = ((this.C[n * 6 + 4] & 0xFFFFFFFE) | o);
        }
        this.Y();
        this.C();
    }
    
    final void Code(final int n, final int n2) {
        this.e = this.F;
        this.f = this.B(this.G);
        this.g = this.H;
        this.h = this.K;
        if (this.H > 0 && this.K > 0) {
            this.a(n, n2);
            this.f += this.P - this.Z(this.P);
            if (this.f < this.P) {
                this.f = 0;
                this.h += this.P;
                this.g += this.H;
            }
        }
        this.H = 0;
        this.K = 0;
    }
    
    private boolean Code(final Graphics graphics) {
        return d.Code(this.e, this.f, this.g, this.h, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight());
    }
    
    private synchronized void I(int f, final int n, final int h, final int k) {
        if (this.H > 0 && this.K > 0) {
            final int b = this.F + this.H;
            this.F = Math.min(this.F, f);
            this.H = Math.max(f + h, b) - this.F;
            f = this.G + this.K;
            this.G = Math.min(this.G, n);
            this.K = Math.max(n + k, f) - this.G;
            return;
        }
        this.F = f;
        this.G = n;
        this.H = h;
        this.K = k;
    }
    
    private boolean Code(int n, final boolean b, final boolean b2) {
        n &= 0x1FFFFFFF;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int ag = this.aG;
        final int v = this.v;
        final int q = this.q;
        final int r = this.r;
        if (b2) {
            this.v = 256 * this.Code.Code() / this.o;
            this.q = d.Code(this.q, 0, this.o - (this.Code.Code() << 8) / this.v);
            this.r = d.Code(this.r, 0, this.p - (this.Code.I() << 8) / this.v);
        }
        this.aG = n;
        this.W();
        this.f = this.B(this.f);
        boolean code = false;
        if (this.f >= 0) {
            this.a(-this.Z(this.q), -this.Z(this.r));
            if ((code = d.Code(this.e, this.f, this.g, this.h, 0, 0, this.Code.Code(), this.Code.I())) && b) {
                this.aG = n;
                this.W();
                this.I(this.e, this.f, this.g, this.h);
                this.c(1000);
            }
        }
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.aG = ag;
        this.v = v;
        this.q = q;
        this.r = r;
        return code;
    }
    
    final int d() {
        if (this.r < this.P) {
            return this.r;
        }
        return this.Z(this.r - this.P) + this.P;
    }
    
    final void C() {
        this.I(0, 0, Math.max(this.o, this.Code.Code()), Math.max(this.p, this.Code.I()));
    }
    
    final int e() {
        if (this.T < this.P) {
            return this.S - this.c();
        }
        return this.Z(this.S - this.q);
    }
    
    final boolean I() {
        return this.v != 256 && 256 * this.Code.Code() / this.o <= this.v;
    }
    
    final int a() {
        return this.Z(this.o);
    }
    
    final boolean Z() {
        return !this.I() && !this.Code() && this.o != 0 && this.Code.Code() != 0 && 256 * this.Code.Code() / this.o < 128;
    }
    
    final void a() {
        if (!this.Z()) {
            this.w = 256;
            this.e();
            return;
        }
        if (this.v != 256 && 256 * this.Code.Code() / this.o != this.v) {
            this.w = 256 * this.Code.Code() / this.o;
            this.e();
        }
    }
    
    final int b() {
        return this.Z(this.p - this.P) + this.P;
    }
    
    final int f() {
        if (this.T < this.P) {
            return this.T - this.d();
        }
        if (this.r < this.P) {
            return this.Z(this.T - this.P) - this.r + this.P;
        }
        return this.Z(this.T - this.r);
    }
    
    private int B(final int n) {
        final int i = this.I(n, 0);
        if ((this.C[i * 6 + 4] & 0x1) == 0x0) {
            return -1;
        }
        return n - this.C[i * 6] + this.C[i * 6 + 5];
    }
    
    private synchronized int I(int max, final int n) {
        int a = -1;
        int n2 = this.N;
        while (n2 - a > 1) {
            final int n3 = a + n2 >>> 1;
            if (this.C[n3 * 6 + n] > max) {
                n2 = n3;
            }
            else {
                a = n3;
            }
        }
        for (max = Math.max(a, 0); max > 0 && this.C[max * 6 + n] == this.C[(max - 1) * 6 + n]; --max) {}
        if (n == 5) {
            while ((this.C[max * 6 + 4] & 0x1) == 0x0) {
                ++max;
            }
        }
        return max;
    }
    
    private static int Z(int a, final int n, final int n2) {
        a = Math.abs(a) * a / 1200;
        final int n3;
        if ((n3 = n - a) < 0) {
            a = n;
        }
        else if (n3 > n2) {
            a = n - n2;
        }
        return a;
    }
    
    final void g() {
        final int size;
        if ((size = this.B.size()) == 0) {
            return;
        }
        ++this.aO;
        this.aO %= size;
        if (this.aO < 0) {
            return;
        }
        final int[] array;
        final int n = (array = this.B.elementAt(this.aO))[0] + array[2] / 2 + array[4];
        final int n2 = array[1] + array[3] + array[5] - 1;
        if ((this.C[this.I(n2, 0) * 6 + 4] & 0x1) == 0x0) {
            this.ai = this.Code(0, this.B(n2), this.o, 10, this.ai, false);
            if (this.ai != -1 && this.I[this.ai] == 67) {
                this.B(false);
            }
        }
        final int b = this.B(n2);
        final int al = this.al;
        this.al = 0;
        this.Code(n - this.S, b - this.T, true);
        this.al = al;
        if (this.I()) {
            this.I(false);
        }
        this.C();
    }
    
    private int q() {
        while (this.aG <= this.ah) {
            final int ag = this.aG;
            this.o();
            final int o = this.o();
            this.W();
            this.aG += o * 10 - 10;
            this.ac();
            if (this.I[ag] != 105 && (this.C[this.I(this.f, 0) * 6 + 4] & 0x1) != 0x0) {
                return ag;
            }
        }
        return this.aG;
    }
    
    private void I(final Graphics graphics, final int n, int n2, final int n3, final int n4) {
        if (n4 < 0) {
            return;
        }
        n2 += this.Z(this.C[n3 * 6 + 5]);
        d.Code(graphics, n, n2, this.o, this.C[n4 * 6] + this.C[n4 * 6 + 1]);
        n2 -= this.Z(this.C[n3 * 6]);
        this.aG = 0;
        while (true) {
            int code = Integer.MAX_VALUE;
            for (int i = n3; i <= n4; ++i) {
                for (int n5 = this.C[i * 6 + 3]; this.C[n5] != 0; n5 += 2) {
                    this.C[i * 6 + 3] = n5;
                    if (this.C[n5 + 1] > this.aG) {
                        code = d.Code(code, this.aG, this.C[n5]);
                        break;
                    }
                }
            }
            if (code == Integer.MAX_VALUE) {
                break;
            }
            int max = code;
            int j;
            do {
                j = max;
                for (int k = n3; k <= n4; ++k) {
                    for (int n6 = this.C[k * 6 + 3]; this.C[n6] != 0 && this.C[n6] <= max + this.O; max = Math.max(max, this.C[n6 + 1]), n6 += 2) {
                        this.C[k * 6 + 3] = n6;
                    }
                }
            } while (j != max);
            this.Z(graphics, n, n2, code, max);
        }
        d.Z(graphics);
    }
    
    final synchronized void Z(final Graphics graphics, final int n, int n2) {
        this.as = (int)System.currentTimeMillis();
        this.Code = System.currentTimeMillis();
        if (this.P > 0) {
            final boolean k = d.k;
            d.k = true;
            final int v = this.v;
            this.v = 256;
            final int min = Math.min(graphics.getClipY() - n2, this.p - 1);
            this.Code(graphics, n, n2, min, Math.min(min + graphics.getClipHeight() - 1, this.P - 1));
            this.v = v;
            n2 += this.P - this.Z(this.P);
            d.k = k;
        }
        final int min2 = Math.min(Math.max(this.P, this.J(graphics.getClipY() - n2)), this.p - 1);
        this.Code(graphics, n, n2, min2, Math.min(min2 + this.J(graphics.getClipHeight() - 1), this.p - 1));
    }
    
    private synchronized int C(int i) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max = 0;
        int max2 = 0;
        this.aG = i;
        this.o();
        for (i = this.o(); i > 0; --i) {
            this.W();
            min = Math.min(min, this.e);
            min2 = Math.min(min2, this.f);
            max = Math.max(max, this.e + this.g);
            max2 = Math.max(max2, this.f + this.h);
        }
        this.ac();
        this.e = min;
        this.f = this.B(min2);
        this.g = max - min;
        this.h = max2 - min2;
        return this.aG;
    }
    
    final void I(final Graphics graphics, final int n, final int n2) {
        int n18;
        if (this.J()) {
            final int code = this.Code.Code();
            final int i = this.Code.I();
            final int code2 = d.Code(this.T - i / 2, this.P, this.p - i);
            final int n3 = n + this.Z(d.Code(this.J(this.Z(this.S, code2), this.S - code / 2), 0, this.o - code));
            int n4;
            if (this.r < this.P) {
                n4 = n2 + this.Z(code2 - this.P) - this.r + this.P;
            }
            else {
                n4 = n2 + this.Z(code2 - this.r);
            }
            final int n5 = this.Z(code) - 1;
            final int n6 = this.Z(i) - 1;
            if (d.s && B.Code[5] != null) {
                final int n7 = n3;
                final int n8 = n4;
                final int n9 = n7;
                final int z = this.Z(this.Code.Code());
                final int z2 = this.Z(this.Code.I());
                final int n10 = (z > 9) ? (z - 9) : 1;
                final int n11 = (z2 > 9) ? (z2 - 9) : 1;
                final int n12 = (z > 9) ? 30 : (z + 21);
                final int n13 = (z2 > 9) ? 30 : (z2 + 21);
                d.Code(graphics, n9 - 21, n8 - 21, n12, n13);
                graphics.drawImage(B.Code[5], n9 - 21, n8 - 21, 0);
                d.Z(graphics);
                d.Code(graphics, n9 + n10, n8 - 21, 30, n13);
                graphics.drawImage(B.Code[5], n9 + z - 59, n8 - 21, 0);
                d.Z(graphics);
                d.Code(graphics, n9 - 21, n8 + n11, n12, 30);
                graphics.drawImage(B.Code[5], n9 - 21, n8 + z2 - 63, 0);
                d.Z(graphics);
                d.Code(graphics, n9 + n10, n8 + n11, 30, 30);
                graphics.drawImage(B.Code[5], n9 + z - 59, n8 + z2 - 63, 0);
                d.Z(graphics);
                if (n10 > 1) {
                    final int n14;
                    if ((n14 = (z - 18) / 19) > 0) {
                        for (int j = 0; j < n14; ++j) {
                            d.Code(graphics, n9 + 9 + j * 19, n8 - 21, 19, 30);
                            graphics.drawImage(B.Code[5], n9 - 21 + j * 19, n8 - 21, 0);
                            d.Z(graphics);
                            d.Code(graphics, n9 + 9 + j * 19, n8 + z2 - 9, 19, 30);
                            graphics.drawImage(B.Code[5], n9 - 21 + j * 19, n8 + z2 - 63, 0);
                            d.Z(graphics);
                        }
                    }
                    final int n15;
                    if ((n15 = z - 18 - n14 * 19) > 0) {
                        d.Code(graphics, n9 + 9 + n14 * 19, n8 - 21, n15, 30);
                        graphics.drawImage(B.Code[5], n9 - 21 + n14 * 19, n8 - 21, 0);
                        d.Z(graphics);
                        d.Code(graphics, n9 + 9 + n14 * 19, n8 + z2 - 9, n15, 30);
                        graphics.drawImage(B.Code[5], n9 - 21 + n14 * 19, n8 + z2 - 63, 0);
                        d.Z(graphics);
                    }
                }
                if (n11 > 1) {
                    final int n16;
                    if ((n16 = (z2 - 18) / 24) > 0) {
                        for (int k = 0; k < n16; ++k) {
                            d.Code(graphics, n9 - 21, n8 + 9 + k * 24, 30, 24);
                            graphics.drawImage(B.Code[5], n9 - 21, n8 - 22 + k * 24, 0);
                            d.Z(graphics);
                            d.Code(graphics, n9 + z - 9, n8 + 9 + k * 24, 30, 24);
                            graphics.drawImage(B.Code[5], n9 + z - 59, n8 - 22 + k * 24, 0);
                            d.Z(graphics);
                        }
                    }
                    final int n17;
                    if ((n17 = z2 - 18 - n16 * 24) > 0) {
                        d.Code(graphics, n9 - 21, n8 + 9 + n16 * 24, 30, n17);
                        graphics.drawImage(B.Code[5], n9 - 21, n8 - 22 + n16 * 24, 0);
                        d.Z(graphics);
                        d.Code(graphics, n9 + z - 9, n8 + 9 + n16 * 24, 30, n17);
                        graphics.drawImage(B.Code[5], n9 + z - 59, n8 - 22 + n16 * 24, 0);
                        d.Z(graphics);
                    }
                }
                if (d.E) {
                    graphics.setColor(0);
                    graphics.drawRect(n9, n8, z - 1, z2 - 1);
                    graphics.setColor(16777215);
                    graphics.drawRect(n9 + 1, n8 + 1, z - 3, z2 - 3);
                }
                n18 = 2;
            }
            else {
                graphics.setColor(0);
                graphics.drawRect(n3, n4, n5, n6);
                graphics.setColor(16777215);
                graphics.drawRect(n3 + 1, n4 + 1, n5 - 2, n6 - 2);
                n18 = 2;
            }
        }
        else {
            if (this.C()) {
                d.Z(graphics);
                return;
            }
            final B code3;
            n18 = ((((code3 = this.Code.Code()) != null && code3.C < 5) || g.Code) ? ((this.ai > 0) ? 4 : 3) : ((this.ai > 0) ? 1 : 0));
        }
        int n19 = n18;
        d.Z(graphics);
        if (this.Code.C) {
            n19 = 0;
        }
        graphics.drawImage(B.Code[n19], this.Code.C() + n - 5, this.Code.a() + n2 - 3, 20);
    }
    
    private void Code(final Graphics graphics, final int n, final int n2, int n3, final int n4) {
        int i = 0;
    Label_0159:
        for (n3 = (i = this.I(n3, 5)); i != this.N; ++i) {
            this.C[i * 6 + 3] = this.C[i * 6 + 2];
            if ((this.C[i * 6 + 4] & 0x1) == 0x0) {
                this.I(graphics, n, n2, n3, i - 1);
                while (++n3 != this.N) {
                    if ((this.C[n3 * 6 + 4] & 0x1) != 0x0) {
                        i = n3 - 1;
                        continue Label_0159;
                    }
                }
                return;
            }
            if (this.C[i * 6 + 5] > n4) {
                this.I(graphics, n, n2, n3, i - 1);
                return;
            }
        }
        this.I(graphics, n, n2, n3, i - 1);
    }
    
    private void Code(final Graphics graphics, final char[] array, int n, final int color, final int n2, final int n3) {
        int n4;
        int max;
        int i;
        int n5;
        int n6;
        for (n4 = 1, max = Math.max(n3 / d.J(n2), 1), i = 0; i < n && n4 <= max; n4 = n5 + ((n6 | -n6) >>> 31 ^ 0x1), ++i) {
            n5 = n4;
            n6 = array[i] - '\n';
        }
        n = n4;
        if (this.v >= 200) {
            graphics.setColor(color);
        }
        else {
            if (B.b == null || B.b.length < 2 * Code.f) {
                B.c = null;
                B.d = null;
                B.b = null;
                B.d = new int[(B.c = new int[2 * Code.f]).length];
                B.b = new int[B.c.length];
                B.aJ = -1;
                B.aK = -1;
                final Random random = new Random(4711L);
                for (int j = 0; j < B.b.length >> 1; ++j) {
                    B.b[j] = (random.nextInt() & 0x7F);
                    B.b[j + (B.b.length >> 1)] = B.b[j] + 64;
                }
            }
            final int ak;
            if ((ak = (d.Z(n2) ? 1 : 0) << 6) != B.aK || color != B.aJ) {
                for (int k = 0; k < B.d.length; ++k) {
                    B.d[k] = (ak + B.b[k] << 24 | (color & 0xFFFFFF));
                }
                B.aK = ak;
                B.aJ = color;
            }
        }
        while (i > 0) {
            final int n7 = this.f + this.Z(n3 * --n / n4);
            int n8 = 0;
            if (n == 0) {
                n8 = i;
                i = 0;
            }
            else {
                while (i > 0 && array[i - 1] != '\n') {
                    ++n8;
                    --i;
                }
            }
            if (this.v >= 200) {
                d.Code(graphics, n2, array, i, n8, this.e, n7);
            }
            else {
                final int min;
                if ((min = Math.min((B.c.length >> 1) - 1, this.Z(d.Code(n2, array, i, n8)))) <= 0 || n7 < 0) {
                    --i;
                    continue;
                }
                final int max2 = Math.max(min / n8, 1);
                if (d.ag || !d.q || d.t) {
                    graphics.setColor(color);
                    graphics.drawLine(this.e, n7, this.e + min, n7);
                }
                else {
                    final int n9 = (i << 1 | (n8 << 2 ^ min)) % (B.c.length / 2 - min) & 0xFFFFFFFE;
                    for (int l = 0; l < min; ++l) {
                        B.c[l] = B.d[n9 + l];
                        B.c[min + l] = B.d[(B.d.length >> 1) + n9 + l];
                    }
                    for (int n10 = i; n10 < i + n8; ++n10) {
                        if (array[n10] == ' ') {
                            for (int n11 = 0; n11 < max2; ++n11) {
                                final int n12;
                                if ((n12 = (n10 - i) * max2 + n11) < B.c.length) {
                                    B.c[n12] = 0;
                                }
                                final int n13;
                                if ((n13 = (n10 - i) * max2 + min + n11) < B.c.length) {
                                    B.c[n13] = 0;
                                }
                            }
                        }
                    }
                    final int max3 = Math.max(0, -this.e);
                    if (min > max3) {
                        final int[] c = B.c;
                        final int n14 = max3;
                        final int n15 = min - max3;
                        final int n16 = this.e + max3;
                        final int n17 = n7;
                        final int n18 = min - max3;
                        final int n19 = 2;
                        final boolean b = true;
                        try {
                            graphics.drawRGB(c, n14, n15, n16, n17, n18, n19, b);
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {}
                    }
                }
            }
            --i;
        }
    }
    
    private void Z(final Graphics graphics, final int n, final int n2, int i, final int n3) {
        this.aG = i;
        while (this.aG < n3) {
            if ((i = this.o()) == 83 || i == 76 || i == 77) {
                this.b(i);
            }
            else {
                this.W();
                final int h = this.h;
                this.a(n, n2);
                if (this.Code(graphics)) {
                    final int m = this.m();
                    switch (i) {
                        case 66: {
                            d.Code(graphics, this.e, this.f, this.g, this.h, m, false);
                            continue;
                        }
                        case 84: {
                            i = d.I(this.o());
                            final int n4 = this.n();
                            char[] array = B.Code;
                            if (n4 > B.Code.length) {
                                array = new char[n4];
                            }
                            int n5 = d.Code(this.I, this.aG, array, 0, n4);
                            if (this.Code() && array[0] == '\0') {
                                final int n6 = array[1] - ' ';
                                String s = null;
                                if (n6 >= 10000 && n6 < 10000 + d.B.size()) {
                                    final C c = d.B.elementAt(n6 - 10000);
                                    final StringBuffer sb;
                                    d.Code(sb = new StringBuffer(), c.Code, c.I);
                                    s = sb.toString();
                                    final int code = d.Code(i, s);
                                    this.e = this.aw + this.i() - 6 - code;
                                    this.g = code;
                                }
                                if (n6 >= 20000 && n6 < 20000 + d.B.size()) {
                                    final C c2 = d.B.elementAt(n6 - 20000);
                                    if (B.Z == null) {
                                        (B.Z = new String[3])[0] = d.Code(173) + ".";
                                        B.Z[1] = d.Code(173) + "..";
                                        B.Z[2] = d.Code(173) + "...";
                                        B.e = d.Code(i, d.Code(167), this.aw + this.i() - 6 - this.e, null);
                                    }
                                    if (c2.I <= 0 && c2.Code == 0) {
                                        s = B.Z[B.i];
                                    }
                                    else if (c2.Code == 2) {
                                        s = B.e;
                                    }
                                }
                                if (s != null) {
                                    array = s.toCharArray();
                                }
                                else {
                                    array = new char[] { ' ' };
                                }
                                n5 = array.length;
                                final int g = this.g;
                                final int code2 = d.Code(i, array, 0, n5);
                                this.g = code2;
                                if (g != code2) {
                                    this.I[this.aG - 12] = (byte)(this.g >> 8);
                                    this.I[this.aG - 11] = (byte)this.g;
                                }
                            }
                            this.Code(graphics, array, n5, m, i, h);
                            final Integer n7 = new Integer(this.aG - 7);
                            if (this.C != null && this.C.containsKey(n7)) {
                                final int[] array2 = this.C.get(n7);
                                for (int j = 0; j < array2.length; ++j) {
                                    final int n8 = array2[j] - this.aO;
                                    final int n10;
                                    final int n9 = ((n10 = ((n8 | -n8) >>> 31 ^ 0x1)) != 0) ? Code.Code[69] : Code.Code[67];
                                    graphics.setColor((n10 != 0) ? Code.Code[70] : Code.Code[68]);
                                    final int[] array3 = this.B.elementAt(array2[j]);
                                    graphics.fillRect(this.e + array3[0], this.f + array3[1], array3[2], array3[3]);
                                    d.Code(graphics, this.e + array3[0], this.f + array3[1], array3[2], array3[3]);
                                    this.Code(graphics, array, n5, n9, i, h);
                                    d.Z(graphics);
                                }
                            }
                            this.aG += n4;
                        }
                        default: {
                            continue;
                        }
                        case 73: {
                            i = this.e - this.o();
                            int n11 = this.f - this.o();
                            final int o = this.o();
                            int l = this.l();
                            final int n12 = o & ((this.v >= 128) ? 4 : 2);
                            final int n13 = (n12 | -n12) >>> 31 ^ 0x1;
                            final int n14 = o & 0x8;
                            final int n15 = (n14 | -n14) >>> 31;
                            Image code3 = null;
                            if (this.R + l <= -9000 && this.R + l > -9000 - d.B.size()) {
                                final C c3 = d.B.elementAt(-(this.R + l + 9000));
                                if (n13 != 0 && c3.I > 0 && c3.Code != 2) {
                                    i = (int)(this.g * (long)c3.Code / c3.I);
                                    Code.Code.Code(graphics, this.e, this.f, this.g, i);
                                    continue;
                                }
                                continue;
                            }
                            else {
                                if (this.R + l <= -10000 && this.R + l > -10000 - d.B.size()) {
                                    l = -43 - ((C)d.B.elementAt(-(this.R + l + 10000))).Code - this.R;
                                }
                                if (n13 != 0) {
                                    code3 = this.Code(this.R + l, this.aG - 20, o);
                                }
                                if (n13 != 0 && code3 != null) {
                                    d.Code(graphics, this.e, this.f, this.g, this.h);
                                    final int width = code3.getWidth();
                                    final int height = code3.getHeight();
                                    if (i + width < graphics.getClipX()) {
                                        i = graphics.getClipX() - (graphics.getClipX() - i) % width;
                                    }
                                    if (n11 + height < graphics.getClipY()) {
                                        n11 = graphics.getClipY() - (graphics.getClipY() - n11) % height;
                                    }
                                    final int n16 = graphics.getClipX() + graphics.getClipWidth();
                                    final int n17 = graphics.getClipY() + graphics.getClipHeight();
                                    while (i < n16) {
                                        for (int k = n11; k < n17; k += height) {
                                            graphics.drawImage(code3, i, k, 20);
                                        }
                                        i += width;
                                    }
                                    d.Z(graphics);
                                    continue;
                                }
                                if (n13 != 0 || n15 != 0) {
                                    d.Code(graphics, this.e, this.f, this.g, this.h, m | 0xFF000000, false);
                                    continue;
                                }
                                continue;
                            }
                            break;
                        }
                        case 70: {
                            i = this.o();
                            final int o2 = this.o();
                            final String j2 = this.J();
                            final String j3 = this.J();
                            final int k2 = this.k();
                            final String s2;
                            String str;
                            if ((str = (s2 = (String)this.Code.get(j2))) == null) {
                                str = j3;
                            }
                            char[] array4 = null;
                            Image image = null;
                            switch (i) {
                                case 112: {
                                    if (!this.I.contains(j2)) {
                                        this.I.addElement(j2);
                                    }
                                    for (array4 = new char[str.length()], i = 0; i < array4.length; ++i) {
                                        array4[i] = '*';
                                    }
                                    break;
                                }
                                case 97: {
                                    array4 = str.toCharArray();
                                    i = 0;
                                    int n18 = 1;
                                    int n19 = 1;
                                    for (int n20 = 0; n20 < array4.length; ++n20) {
                                        if (array4[n20] == '\n') {
                                            i = 0;
                                        }
                                        else if (array4[n20] == ' ') {
                                            if (n19 != 0) {
                                                n19 = 0;
                                                i = d.Code(0, array4, 0, n20);
                                            }
                                            while (n20 + n18 < array4.length && array4[n20 + n18] != ' ') {
                                                ++n18;
                                            }
                                            final int code4 = d.Code(0, array4, n20, n18);
                                            if (i + code4 > this.g) {
                                                array4[n20] = '\n';
                                                i = 0;
                                            }
                                            i += code4;
                                            n18 = 1;
                                        }
                                    }
                                    break;
                                }
                                case 70: {
                                    if (this.Code()) {
                                        array4 = ((this.d != null) ? this.d : str).toCharArray();
                                        break;
                                    }
                                    break;
                                }
                                case 83:
                                case 85:
                                case 120: {
                                    array4 = str.toCharArray();
                                    if (j2.equals("$")) {
                                        array4 = ((String)((Object[])B.Code.elementAt(B.d + 1))[1]).toCharArray();
                                        break;
                                    }
                                    break;
                                }
                                case 99: {
                                    final boolean b = s2 != null;
                                    final int n21 = o2 & 0x2;
                                    if (((b ? 1 : 0) ^ (n21 | -n21) >>> 31) == 0x0) {
                                        break;
                                    }
                                    if (d.p) {
                                        graphics.setColor(Code.Code[65]);
                                        graphics.drawLine(this.e + 1, this.f + 1, this.e + this.g - 2, this.f + this.h - 2);
                                        graphics.drawLine(this.e + 1, this.f + this.h - 2, this.e + this.g - 2, this.f + 1);
                                        break;
                                    }
                                    if (B.I != null) {
                                        image = B.I[0];
                                        break;
                                    }
                                    break;
                                }
                                case 114: {
                                    if (s2 != null) {
                                        if (!s2.equals(j3)) {
                                            break;
                                        }
                                    }
                                    else if ((o2 & 0x2) == 0x0) {
                                        break;
                                    }
                                    if (d.p) {
                                        graphics.setColor(Code.Code[66]);
                                        graphics.fillArc(this.e + 1, this.f + 1, this.g - 3, this.h - 3, -90, 360);
                                        break;
                                    }
                                    if (B.I != null) {
                                        image = B.I[1];
                                        break;
                                    }
                                    break;
                                }
                                case 115: {
                                    i = this.aG;
                                    this.aG = k2;
                                    int k3 = this.k();
                                    final String string = "\u0000" + str + "\u0000";
                                    final StringBuffer sb2 = new StringBuffer();
                                    while (k3 > 0) {
                                        final String j4 = this.J();
                                        final String j5 = this.J();
                                        final boolean b2 = string.indexOf("\u0000" + j4 + "\u0000") >= 0;
                                        if ((o2 & 0x4) == 0x0) {
                                            if (b2) {
                                                sb2.append(j5).append("\n");
                                                break;
                                            }
                                        }
                                        else {
                                            if (b2) {
                                                sb2.append("*");
                                            }
                                            sb2.append(j5).append("\n");
                                        }
                                        --k3;
                                    }
                                    this.aG = i;
                                    array4 = sb2.toString().toCharArray();
                                    if ((o2 & 0x40) != 0x0 && this.Code()) {
                                        array4 = d.Code(0, sb2.toString(), this.g, "...").toCharArray();
                                        this.e = this.e + this.g - d.Code(0, array4, 0, array4.length);
                                        break;
                                    }
                                    break;
                                }
                                case 102: {
                                    final Object[] array5;
                                    if (this.I != null && (array5 = this.I.get(j2)) != null) {
                                        array4 = (array5[0] + ", " + (int)array5[1] / 1000 + " kB").toCharArray();
                                        break;
                                    }
                                    array4 = d.Code(182).toCharArray();
                                    break;
                                }
                            }
                            if (array4 != null) {
                                d.Code(graphics, this.e, this.f, this.g, this.h);
                                this.Code(graphics, array4, array4.length, m, 0, h);
                                d.Z(graphics);
                            }
                            if (image != null && this.v == 256) {
                                graphics.drawImage(image, this.e + this.g / 2, this.f + this.h / 2, 3);
                                continue;
                            }
                            continue;
                        }
                    }
                }
                else {
                    this.b(i);
                }
            }
        }
    }
    
    private synchronized int Code(int i, final char c) {
        final int ag = this.aG;
        this.aG = i;
        ++this.aG;
        this.aG += 10 * this.o();
        this.aG += this.n();
        i = this.o();
        int ag2 = -1;
        while (i > 0) {
            if (this.o() == c) {
                ag2 = this.aG;
            }
            this.aG += this.n();
            --i;
        }
        this.aG = ag;
        return ag2;
    }
    
    private void Code(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b, final boolean b2) {
        if (this.ai <= 0) {
            return;
        }
        this.aG = this.ai;
        this.o();
        int o = this.o();
        final Vector vector = new Vector<Integer>();
        int i = Integer.MAX_VALUE;
        while (o-- > 0) {
            this.W();
            this.f = this.B(this.f);
            --this.e;
            --this.f;
            ++this.h;
            if (n5 != 0) {
                this.e -= 2;
                this.f -= 2;
                this.g += 4;
                this.h += 3;
            }
            this.a(n, n2);
            i = Math.min(i, this.f);
            int e;
            final int value = (e = this.e) + this.g;
            int n6 = 0;
            while (true) {
                int intValue = 2147483646;
                if (n6 < vector.size()) {
                    intValue = vector.elementAt(n6);
                }
                if (intValue >= e) {
                    vector.insertElementAt(new Integer(e), n6++);
                    vector.insertElementAt(new Integer(this.f), n6++);
                    vector.insertElementAt(new Integer(this.f + this.h), n6++);
                    vector.insertElementAt(new Integer(1), n6++);
                    vector.insertElementAt(new Integer((int)((this.g > 40 && this.h > B.aD && !b) ? 1 : 0)), n6++);
                    e = Integer.MAX_VALUE;
                }
                if (intValue > value) {
                    break;
                }
                n6 += 5;
            }
            vector.insertElementAt(new Integer((this.g > 40 && this.h > B.aD && !b) ? -1 : 0), n6);
            vector.insertElementAt(new Integer(-1), n6);
            vector.insertElementAt(new Integer(this.f + this.h), n6);
            vector.insertElementAt(new Integer(this.f), n6);
            vector.insertElementAt(new Integer(value), n6);
        }
        int n7 = i;
        while (i != Integer.MAX_VALUE) {
            int n8 = Integer.MAX_VALUE;
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            int j = 0;
            while (j < vector.size()) {
                final int n14 = n10;
                final int n15 = n11;
                int n16 = vector.elementAt(j) + 1;
                n12 += n13;
                n13 = 0;
                do {
                    vector.elementAt(j++);
                    final int intValue2 = vector.elementAt(j++);
                    final int intValue3 = vector.elementAt(j++);
                    final int intValue4 = vector.elementAt(j++);
                    final int intValue5 = vector.elementAt(j++);
                    if (intValue2 > i) {
                        n8 = Math.min(n8, intValue2);
                    }
                    if (intValue3 > i) {
                        n8 = Math.min(n8, intValue3);
                    }
                    if (intValue2 < i && intValue3 >= i) {
                        n10 += intValue4;
                        n13 += intValue5;
                    }
                    if (intValue2 <= i && intValue3 > i) {
                        n11 += intValue4;
                    }
                } while (j < vector.size() && vector.elementAt(j) <= n16);
                --n16;
                if (n12 == 0 && n14 > 0) {
                    if (b2) {
                        graphics.setColor(Code.Code[10]);
                        graphics.drawLine(0, n7, this.o - 1, n7);
                        d.Code(graphics, 0, n7 + 1, this.o, i - n7 - 1, n3, n4);
                        graphics.setColor(Code.Code[13]);
                        graphics.drawLine(0, i - 1, this.o - 1, i - 1);
                        graphics.setColor(Code.Code[14]);
                        graphics.drawLine(0, i, this.o - 1, i);
                    }
                    else if (n3 == n4) {
                        d.Code(graphics, n9 + 1, n7 + 1, n16 - n9, i - n7, n3, false);
                    }
                    else {
                        d.Code(graphics, n9 + 1, n7 + 1, n16 - n9, i - n7, n3, n4);
                    }
                    if (b) {
                        if (b2) {
                            this.s = ((Code.Code[36] >> 8 & 0xFF) > 127);
                            d.Code(graphics, n9 + 1, n7 + 1, n16 - n9, i - n7 - 1);
                            this.Z(graphics, n, n2);
                            d.Z(graphics);
                            this.s = false;
                        }
                        else {
                            d.Code(graphics, n9 + 1, n7 + 1, n16 - n9, i - n7);
                            this.Z(graphics, n, n2);
                            d.Z(graphics);
                        }
                    }
                }
                if (!b2) {
                    final int n17 = n14;
                    final int n18 = (n17 | -n17) >>> 31 ^ 0x1;
                    final int n19 = n10;
                    if ((n18 ^ ((n19 | -n19) >>> 31 ^ 0x1)) != 0x0) {
                        d.Code(graphics, n16, n7 + 1, 2, i - n7, n5, false);
                    }
                    final int n20 = n14;
                    final int n21 = (n20 | -n20) >>> 31 ^ 0x1;
                    final int n22 = n15;
                    if ((n21 ^ ((n22 | -n22) >>> 31 ^ 0x1)) != 0x0) {
                        d.Code(graphics, n9 + 1, i, n16 - n9, 2, n5, false);
                    }
                }
                n9 = n16;
            }
            n7 = i;
            i = n8;
        }
    }
    
    final synchronized void Code(int code, final int y, int n) {
        this.ad();
        if (!this.C()) {
            if (n < 5) {
                if (this.I() && this.T >= this.P) {
                    if (this.P > 0 && this.T + y * (44 + (n << 1)) < this.P) {
                        this.S = this.Z(this.S);
                        this.T = this.P - 1;
                        this.Code(code, y, n);
                        return;
                    }
                    this.Code(code * (44 + (n << 1)), y * (44 + (n << 1)), false);
                    this.q = this.s;
                    this.r = this.t;
                }
                else {
                    final int s = this.S;
                    final int t = this.T;
                    if (y != 0) {
                        this.ai = this.Code(this.S - 1, this.T + y, 3, y * 22, this.ai, false);
                    }
                    else {
                        this.ai = this.Code(this.S + code, this.T, code * 22, 1, this.ai, false);
                    }
                    B b = null;
                    int n2 = 0;
                    int n3 = 0;
                    boolean b2 = false;
                    Label_0957: {
                        if (this.T < this.P && this.T + ((this.ai > 0) ? (this.aM - this.T) : (y * 22)) >= this.P) {
                            b = this;
                            n2 = this.J(this.S) - this.S;
                            n3 = this.Code(this.T, 22, this.v) - this.T;
                        }
                        else {
                            if (this.ai > 0) {
                                b = this;
                                n2 = this.aL - this.S;
                                n3 = d.Code(this.aM, this.T - 44, this.T + 44) - this.T;
                                b2 = true;
                                break Label_0957;
                            }
                            b = this;
                            n2 = code * 22;
                            n3 = y * 22;
                            if (n < 5) {
                                b2 = true;
                                break Label_0957;
                            }
                        }
                        b2 = false;
                    }
                    b.Code(n2, n3, b2);
                    if (Math.abs(this.s - this.q) <= Math.abs(s - this.S)) {
                        this.q = this.s;
                    }
                    if (Math.abs(this.t - this.r) <= Math.abs(t - this.T)) {
                        this.r = this.t;
                    }
                }
            }
            else if (n == 5) {
                this.U = (int)System.currentTimeMillis();
                this.V = this.S;
                this.W = this.T;
                this.X = code;
                this.Y = y;
            }
            return;
        }
        if (code != 0) {
            this.Code(0, code * this.h(), false, false);
            return;
        }
        if (n >= 8 && this.t > 0 && this.t < this.p - this.Code.I()) {
            this.Code(0, y * (n + 39), false, false);
            return;
        }
        code = 0;
        if (this.ai > 0) {
            this.C(this.ai);
            code = (d.Code(0, this.f, 1, this.h, 0, this.t, 1, this.Code.I()) ? 1 : 0);
        }
        if ((n = this.ag) > 0) {
            this.aG = n;
            n = this.q();
        }
        int ai;
        int i = ai = n;
        if (n > 0 && n <= this.ah) {
            do {
                final int n4 = ai;
                ai = i;
                this.aG = this.C(i);
                i = this.q();
                this.C(ai);
                if (y < 0) {
                    if (code != 0) {
                        if (ai == this.ai) {
                            break;
                        }
                        if (i == this.ai) {
                            break;
                        }
                        continue;
                    }
                    else {
                        if (this.f + this.h > this.t + this.Code.I()) {
                            ai = n4;
                            this.C(ai);
                            break;
                        }
                        continue;
                    }
                }
                else if (code != 0) {
                    if (ai > this.ai) {
                        break;
                    }
                    continue;
                }
                else {
                    if (this.f < this.t) {
                        continue;
                    }
                    break;
                }
            } while (i <= this.ah);
            this.aG = i;
            final int ai2 = (i > this.ah) ? ai : this.ah;
            int t2 = this.t;
            if (y < 0) {
                if ((ai == n || this.f < t2) && (ai == this.ai || this.f + this.h < t2 + B.n) && t2 > 0) {
                    t2 -= 44;
                }
            }
            else if ((ai == ai2 || this.f + this.h > t2 + this.Code.I()) && (ai == this.ai || this.f > t2 + this.Code.I() - B.n) && t2 + this.Code.I() < this.p) {
                t2 += 44;
            }
            if (this.k) {
                if (y < 0 && this.t == 0 && (code == 0 || this.ai == n)) {
                    t2 = this.p - this.Code.I();
                    ai = (this.ai = ai2);
                }
                if (y > 0 && this.t + this.Code.I() >= this.p && (code == 0 || this.ai == ai2)) {
                    t2 = 0;
                    ai = (this.ai = n);
                }
                this.C(ai);
            }
            if (t2 == this.t) {
                this.ai = ai;
            }
            this.b(this.s, t2);
            return;
        }
        this.b(this.s, this.t + y * 44);
    }
    
    final void J(final boolean b) {
        if (this.w != this.v) {
            this.C();
        }
        this.v = Code.Code(this.v, this.w, this.D, this.E);
        if (d.ag) {
            this.v = this.w;
        }
        if (!this.C() && (this.X != 0 || this.Y != 0)) {
            if (b) {
                final int n = (int)System.currentTimeMillis() - this.U;
                int n2;
                if (Math.abs(n2 = this.V + this.X * this.J(n / 2 + n * n / 5000) - this.S) > this.J(this.Code.Code() / 2)) {
                    n2 = this.X * this.J(this.Code.Code() / 2);
                }
                int n3;
                if (Math.abs(n3 = this.W + this.Y * this.J(n / 2 + n * n / 5000) - this.T) > this.J(this.Code.I() / 2)) {
                    n3 = this.Y * this.J(this.Code.I() / 2);
                }
                if (this.T < this.P && this.T + n3 >= this.P) {
                    this.S = this.J(this.S);
                    this.V = this.S;
                }
                if (this.P > 0 && this.T >= this.P && this.T + n3 < this.P) {
                    this.S = this.Z(this.S);
                    this.V = this.S;
                }
                this.Code(n2, n3, false);
                this.q = this.s;
                this.r = this.t;
                Code.f();
            }
            else {
                this.Code(0, 0, true);
                this.X = 0;
                this.Y = 0;
            }
        }
        this.q = Code.Code(this.q, this.s, this.x, this.y, this.u);
        this.r = Code.Code(this.r, this.t, this.z, this.A, this.u);
        if (this.T < this.P) {
            this.S = Math.min(this.S, this.Z(this.o - 1));
        }
        if (Code.B()) {
            this.Code.Code = System.currentTimeMillis() + 1000L;
            return;
        }
        this.ad();
    }
    
    final void J(final int n, final int n2) {
        if (!this.p) {
            if (this.Code.Code(2)) {
                this.ai = this.Code(n + this.q, n2 + this.r, 1, 1, -1, false);
                if (this.ai > 0 && this.ai != this.af) {
                    Code.Code.Code(this.Code);
                    this.af = this.ai;
                    if (d.Code(this.Code(this.af, 76), "menu:")) {
                        this.B(false);
                        return;
                    }
                }
            }
            else {
                this.c(n, n2);
                if (this.af >= 0 && (Math.abs(this.aa - n) > 6 || Math.abs(this.ab - n2) > 6)) {
                    this.ai = 0;
                    this.af = -1;
                    if (d.o) {
                        this.aa = n;
                        this.ab = n2;
                    }
                    final int s = this.s;
                    this.ad = s;
                    this.ac = s;
                    this.ae = this.ab;
                }
                if (this.af < 0) {
                    final int n3 = this.aa - n;
                    final int code = this.Code(this.t, this.ab - n2, this.v);
                    int n4 = this.s;
                    if (this.ac == this.ad) {
                        if (Math.abs(this.ab - this.ae) > 10) {
                            this.ad = -1;
                        }
                        else if (n3 > 20) {
                            this.ad += this.I(n4, code, this.o - this.Code.Code() - n4);
                        }
                        else if (n3 < -20) {
                            this.ac += this.I(n4, code, -n4);
                        }
                    }
                    if (this.ad < this.ac) {
                        final int n5 = n4 + Math.min(0, 0 * this.Code.Code());
                        final int n6 = (Math.abs(0) + 1) * this.Code.Code();
                        int n7 = -1;
                        int abs = Integer.MAX_VALUE;
                        for (int i = 0; i < this.ak; ++i) {
                            if (d.Code(n5, code + this.am, n6, this.Code.I() - 2 * this.am, this.a[i << 2], this.a[(i << 2) + 1], this.a[(i << 2) + 2] - this.a[i << 2], this.a[(i << 2) + 3] - this.a[(i << 2) + 1]) && Math.abs(this.J(i, n4) - n4) < abs) {
                                n7 = i;
                                abs = Math.abs(this.J(i, n4) - n4);
                            }
                        }
                        final int n8 = (Math.abs(abs) <= this.Code.Code() - this.al) ? n7 : -1;
                        if (Math.abs(n4 - this.J(n8, n4)) < this.Code.Code() / 2) {
                            n4 = this.J(n8, n4);
                        }
                    }
                    if (this.ad > this.ac) {
                        n4 = d.Code(n4 + n3, this.ac, this.ad);
                        this.aa = n;
                    }
                    final int code2 = d.Code(n4, 0, this.o - (this.Code.Code() << 8) / this.w);
                    this.s = code2;
                    this.q = code2;
                    final int code3 = d.Code(code, 0, this.p - (this.Code.I() << 8) / this.w);
                    this.t = code3;
                    this.r = code3;
                    this.ab = n2;
                    this.Code.Code = System.currentTimeMillis() + 1000L;
                }
            }
            this.T = this.Code(this.r, n2, this.v);
            this.S = this.q + ((this.T >= this.P) ? this.J(n) : n);
            d.a();
        }
    }
    
    private synchronized int Code(final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if (this.ag == 0) {
            return 0;
        }
        int n6;
        int n7;
        int n8;
        if (n4 < 0) {
            n6 = n3 + (-n4 - 1 << 1);
            n7 = n2 + n4 - 1;
            n8 = -n4;
        }
        else {
            n6 = n3 + (n4 - 1 << 1);
            n7 = n2;
            n8 = n4;
        }
        this.aL = 0;
        this.aM = 0;
        final int n9 = n + n3 / 2 - n6 / 2;
        int n10 = 0;
        this.aN = Integer.MAX_VALUE;
        this.aG = this.ag;
        while (this.aG <= this.ah) {
            final int n11 = n9;
            final int n12 = n7;
            final int n13 = n6;
            final int n14 = n8;
            final int n15 = n13;
            final int n16 = n12;
            final int n17 = n11;
            int n18 = 0;
            final int ag = this.aG;
            final int o = this.o();
            for (int i = this.o(); i > 0; --i) {
                this.W();
                this.f = this.B(this.f);
                if (this.f >= 0 && d.Code(this.e, this.f, this.g, this.h, n17, n16, n15, n14)) {
                    if (b) {
                        if (o != 105) {
                            continue;
                        }
                    }
                    else if (o == 105) {
                        continue;
                    }
                    int e = n + n3 / 2;
                    if (this.e + this.g <= e) {
                        e = this.e + this.g - 1;
                    }
                    else if (this.e > e) {
                        e = this.e;
                    }
                    int am = -1;
                    if (n4 < 0 && this.f < n16 + this.e + this.g - n17 && this.f < n16 - this.e + n17 + n15) {
                        am = n16;
                        if (this.f + (this.h - 1) / 2 < n2 && ag != n5) {
                            am = this.f + (this.h - 1) / 2;
                        }
                    }
                    if (n4 > 0 && this.f + this.h > n16 - this.e - this.g + n && this.f + this.h > n16 + n14 + this.e - n17 - n15) {
                        am = n2 + n4 - 1;
                        if (this.f + (this.h - 1) / 2 > n2 && ag != n5) {
                            am = this.f + (this.h - 1) / 2;
                        }
                    }
                    final int an;
                    if (am >= 0 && d.Code(this.e, this.f, this.g, this.h, e, am, 1, 1) && (an = (n + n3 / 2 - e) * (n + n3 / 2 - e) + (n2 - am) * (n2 - am)) < this.aN) {
                        this.aN = an;
                        this.aL = e;
                        this.aM = am;
                        n18 = ag;
                    }
                }
            }
            this.ac();
            final int n19;
            if ((n19 = n18) > 0) {
                n10 = n19;
            }
        }
        return n10;
    }
    
    private synchronized int p() {
        if (this.ai <= 0) {
            return 0;
        }
        this.aG = this.ag;
        int n = 0;
        while (this.aG < this.ai) {
            ++n;
            ++this.aG;
            this.aG += 10 * this.o();
            this.ac();
        }
        return n;
    }
    
    private void ac() {
        this.aG += this.n();
        if (this.aq >= 13) {
            for (int i = this.o(); i > 0; --i) {
                ++this.aG;
                this.aG += this.n();
            }
            return;
        }
        this.aG += this.n();
    }
    
    private int I(final int n, final int n2, int n3) {
        final int n4 = n + Math.min(0, n3);
        final int n5 = Math.abs(n3) + this.Code.Code();
        for (int i = 0; i < this.ak; ++i) {
            if (d.Code(n4, n2 + this.am, n5, this.Code.I() - 2 * this.am, this.a[i << 2], this.a[(i << 2) + 1], this.a[(i << 2) + 2] - this.a[i << 2], this.a[(i << 2) + 3] - this.a[(i << 2) + 1])) {
                if (n3 > 0) {
                    if (this.a[(i << 2) + 2] > n + this.Code.Code()) {
                        n3 = Math.min(n3, Math.max(this.a[(i << 2) + 2] - n - this.Code.Code(), this.a[i << 2] - n));
                    }
                }
                else if (this.a[i << 2] < n) {
                    n3 = Math.max(n3, Math.min(this.a[i << 2] - n, this.a[(i << 2) + 2] - n - this.Code.Code()));
                }
            }
        }
        return n3;
    }
    
    private int J(final int n, int n2) {
        if (n >= 0) {
            if (this.a[(n << 2) + 2] > n2 + this.Code.Code() && n2 < this.a[n << 2]) {
                n2 = Math.min(this.a[n << 2], this.a[(n << 2) + 2] - this.Code.Code());
            }
            if (this.a[n << 2] < n2 && n2 + this.Code.Code() > this.a[(n << 2) + 2]) {
                n2 = Math.max(this.a[n << 2], this.a[(n << 2) + 2] - this.Code.Code());
            }
        }
        return n2;
    }
    
    private int Z(final int n, final int n2) {
        for (int i = 0; i < this.ak; ++i) {
            if (d.Code(n, n2 + this.am, 1, this.Code.I() - 2 * this.am, this.a[i << 2], this.a[(i << 2) + 1], this.a[(i << 2) + 2] - this.a[i << 2], this.a[(i << 2) + 3] - this.a[(i << 2) + 1])) {
                return i;
            }
        }
        return -1;
    }
    
    private void Code(int n, int code, final boolean b) {
        this.S = d.Code(this.S + n, 0, this.o - 1);
        this.T = d.Code(this.T + code, 0, this.p - 1);
        this.ab();
        n = this.s;
        code = -1;
        Label_0164: {
            if (b) {
                while (true) {
                    for (int i = 0; i < this.ak; ++i) {
                        if (this.S > this.al + this.a[i << 2] && this.S <= this.a[(i << 2) + 2] - this.al && this.T > 0 + this.a[(i << 2) + 1] && this.T <= this.a[(i << 2) + 3]) {
                            final int n2 = i;
                            code = n2;
                            n = this.J(code, n);
                            break Label_0164;
                        }
                    }
                    final int n2 = -1;
                    continue;
                }
            }
        }
        code = ((code < 0) ? 40 : 0);
        n = d.Code(n, this.S + code - this.Code.Code(), this.S - code);
        code = d.Code(this.t, this.Code(this.T, 50 - this.Code.I(), this.v), this.Code(this.T, -50, this.v));
        this.b(n, code);
    }
    
    final void I(final int aa, final int ab) {
        this.aa = aa;
        this.ab = ab;
        this.T = this.Code(this.r, ab, this.v);
        this.S = this.q + ((this.T >= this.P) ? this.J(aa) : aa);
        this.ai = ((!this.I() || this.T < this.P) ? this.Code(this.S, this.T, 1, 1, -1, false) : 0);
        this.af = this.ai;
        this.n = false;
        this.o = false;
        this.p = false;
        if (this.af > 0 && d.Code(this.Code(this.af, 76), "menu:")) {
            this.B(false);
            return;
        }
        this.I[11] = 0;
        this.Z[11] = 0;
        this.s = this.q;
        this.t = this.r;
        this.c(aa, ab);
        d.a();
    }
    
    final void Code(int i, final int n, final boolean b, final boolean b2) {
        if (this.I() && b) {
            if (this.T >= this.P && this.T + n < this.P) {
                this.S = this.Z(this.S);
            }
            else if (this.T < this.P && this.T + n >= this.P) {
                this.S = this.J(this.S);
            }
            this.Code(i, n, false);
            return;
        }
        if (b2) {
            Code.Code.I(true);
        }
        if (i != 0) {
            i = this.I(this.s, this.t, i);
        }
        this.S -= this.s;
        this.T -= this.t;
        this.b(this.s + i, this.Code(this.t, n, this.v));
        this.S += this.s;
        this.T += this.t;
    }
    
    private void b(int s, int t) {
        final int n = s;
        final int n2 = 0;
        final int o = this.o;
        final int code = this.Code.Code();
        s = this.w;
        s = d.Code(n, n2, o - (code << 8) / s);
        final int n3 = t;
        final int n4 = 0;
        final int p2 = this.p;
        final int i = this.Code.I();
        t = this.w;
        t = d.Code(n3, n4, p2 - (i << 8) / t);
        if (this.s != s) {
            this.q = d.Code(Code.Code(this.q, this.s, this.x, this.y), 0, this.o - this.J(this.Code.Code()));
            this.s = s;
            this.x = this.q;
            this.y = (int)System.currentTimeMillis();
        }
        if (this.t != t) {
            this.r = d.Code(Code.Code(this.r, this.t, this.z, this.A), 0, this.p - this.J(this.Code.I()));
            this.t = t;
            this.z = this.r;
            this.A = (int)System.currentTimeMillis();
        }
        if (this.I()) {
            g.I = true;
        }
        Code.f();
    }
    
    private void ad() {
        if (this.u != 160) {
            this.u = 160;
            this.T = this.Code(this.r, this.Code.I() / 2, this.v);
            this.S = this.q + ((this.T >= this.P) ? this.J(this.i() / 2) : (this.i() / 2));
        }
    }
    
    private static void Code(final int[] array, final int[] array2, final int n, final int n2) {
        if (array[11] > 0) {
            if (n - array[(array[10] + array[11] - 1) % 10] == 0) {
                if (array[11] == 1) {
                    final int n3 = 11;
                    --array[n3];
                }
            }
            else if (array[11] >= 2 && (array[(array[10] + 1) % 10] - array[array[10]]) * (n - array[(array[10] + array[11] - 1) % 10]) < 0) {
                final int n4 = 10;
                array[n4] += array[11] - 1;
                array[11] = 1;
                if (array[10] >= 10) {
                    final int n5 = 10;
                    array[n5] -= 10;
                }
            }
        }
        while (array[11] > 0 && array2[array[10]] + 200 < n2) {
            final int n6 = 11;
            --array[n6];
            final int n7 = 10;
            ++array[n7];
            if (array[10] == 10) {
                array[10] = 0;
            }
        }
        array2[(array[10] + array[11]) % 10] = n2;
        array[(array[10] + array[11]) % 10] = n;
        if (array[11] < 10) {
            final int n8 = 11;
            ++array[n8];
            return;
        }
        final int n9 = 10;
        ++array[n9];
        if (array[10] == 10) {
            array[10] = 0;
        }
    }
    
    private int Code(final int[] array, final int[] array2) {
        if (array[11] < 2) {
            return 0;
        }
        if (array2[(array[10] + array[11] - 1) % 10] - array2[array[10]] == 0) {
            return 0;
        }
        final int n = (array[11] > 3) ? (array[11] - 1) : array[11];
        int a = 0;
        for (int i = 1; i < n; ++i) {
            final int n2 = array[(array[10] + i) % 10] - array[array[10]];
            final int n3;
            if ((n3 = array2[(array[10] + i) % 10] - array2[array[10]]) != 0) {
                final int n4 = n2 * 1000 / n3;
                a = ((a == 0) ? n4 : ((a + n4) / 2));
            }
        }
        if (Math.abs(a) < 50) {
            return 0;
        }
        return this.J(d.Code(a, -4000, 4000));
    }
    
    final void f() {
        if (!this.o && this.af >= 0) {
            this.n = true;
            if (d.o) {
                final boolean code = this.Code(true);
                this.o = code;
                this.p = code;
                this.n = code;
            }
        }
    }
    
    final void Z(final int n, int a) {
        if (!this.o && this.af == this.ai) {
            if (this.n) {
                this.Code(true);
            }
            else if (this.I() && this.T >= this.P) {
                this.I(false);
            }
            else {
                Code.Code.Code(this.Code);
                this.B(this.Code.Code(2) ^ true);
            }
        }
        this.c(n, a);
        if ((a = this.Code(this.Z, this.B)) != 0) {
            final int z = Z(a, this.r, Math.max(0, this.p - this.J(this.Code.I())));
            this.u = B(z, a);
            this.z = this.r;
            this.t = this.r - z;
            this.A = (int)System.currentTimeMillis();
        }
        final int code;
        if ((code = this.Code(this.I, this.J)) != 0 && Math.abs(code) * 100 / (Math.abs(a) + 1) >= 70) {
            a = Z(code, this.q, Math.max(0, this.o - this.J(this.Code.Code())));
            this.u = Math.max(this.u, B(a, code));
            this.x = this.q;
            this.s = this.q - a;
            this.y = (int)System.currentTimeMillis();
        }
        Code.f();
        this.af = 0;
    }
}
