import javax.microedition.io.ContentConnection;
import java.util.Hashtable;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import javax.microedition.io.file.FileSystemRegistry;
import java.io.DataOutputStream;
import javax.microedition.io.Connection;
import java.io.OutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import java.util.Vector;

// 
// Decompiled by Procyon v0.5.36
// 

public final class C
{
    static Object[] Code;
    static String Code;
    static String I;
    static String Z;
    d Code;
    boolean Code;
    private C Code;
    private static Vector Code;
    private static String a;
    byte Code;
    int Code;
    int I;
    String J;
    String B;
    String C;
    
    static int Code(final B b, final String s, final int index, final String s2) {
        FileConnection fileConnection = null;
        DataOutputStream openDataOutputStream = null;
        Label_0348: {
            if (b == null || b.I == null || s == null) {
                break Label_0348;
            }
            int i = 0;
            while (true) {
                ++i;
                final String code = b.Code;
                try {
                    final String string = Integer.toHexString(code.hashCode() ^ new Long(System.currentTimeMillis()).hashCode()) + ".obml";
                    String string2;
                    final FileConnection fileConnection2 = fileConnection = (FileConnection)Connector.open(string2 = "file:///" + s + "/" + string, 2);
                    try {
                        fileConnection2.create();
                    }
                    catch (IOException ex) {
                        ((Connection)fileConnection).close();
                        string2 = null;
                    }
                    if (string2 != null || i >= 5) {
                        (openDataOutputStream = fileConnection.openDataOutputStream()).writeByte(b.I.length >> 16);
                        openDataOutputStream.writeShort(b.I.length);
                        int len;
                        for (i = 0; i < b.I.length; i += len) {
                            final int n;
                            len = (((n = b.I.length - i) >= 16384) ? 16384 : n);
                            openDataOutputStream.write(b.I, i, len);
                        }
                        openDataOutputStream.flush();
                        final Object[] array = { s + "/" + string, (s2 != null) ? s2 : ((b.I != null) ? b.I : ""), (b.Code != null) ? b.Code : new byte[0] };
                        if (index == -1) {
                            d.d.addElement(array);
                        }
                        else {
                            d.d.insertElementAt(array, index);
                        }
                        C.Code = null;
                        d.Code((OutputStream)openDataOutputStream);
                        d.Code((Connection)fileConnection);
                        d.J(false);
                        return 0;
                    }
                    continue;
                }
                finally {
                    d.r = "";
                    final Throwable t2;
                    final Throwable t = t2;
                    try {
                        if (t instanceof SecurityException) {
                            return 2;
                        }
                        return 1;
                    }
                    finally {
                        d.Code((OutputStream)openDataOutputStream);
                        d.Code((Connection)fileConnection);
                        d.J(false);
                    }
                }
            }
        }
    }
    
    static boolean Code(final boolean b) {
        String r = null;
        if (!b && d.r != null && d.r.length() > 0) {
            return true;
        }
        if (b && C.Code != null && C.Code.length() > 0) {
            r = C.Code;
        }
        if (r != null) {
            if (r.startsWith("file:///")) {
                r = r.substring(8);
            }
            if (r.endsWith("/")) {
                r = r.substring(0, r.length() - 1);
            }
            d.r = r;
            d.J(false);
        }
        return d.r.length() > 0;
    }
    
    public final synchronized boolean Code(final Object[] code) {
        if (C.Code != null) {
            return false;
        }
        C.Code = code;
        return true;
    }
    
    static String Code(final boolean b) {
        if (C.Code == null) {
            return null;
        }
        final String s;
        if ((s = (String)C.Code[2]) == null) {
            return null;
        }
        String s2;
        if (s.startsWith("image")) {
            s2 = "photos";
        }
        else if (s.startsWith("video")) {
            s2 = "videos";
        }
        else {
            if (!s.startsWith("audio")) {
                return null;
            }
            s2 = "music";
        }
        String s3;
        if ((s3 = Code(s2, b)) != null && s3.startsWith("file:///")) {
            s3 = s3.substring(8);
        }
        return s3;
    }
    
    static boolean Code() {
        return C.Code == null;
    }
    
    public final synchronized void Code() {
        C.Code = null;
    }
    
    public C() {
    }
    
    public C(final byte b) {
    }
    
    final void I(String string) {
        Object o = null;
        final String s = string;
        final String suffix = "/";
        try {
            if (!s.endsWith(suffix)) {
                string += "/";
            }
            if (!((FileConnection)(o = Connector.open("file:///" + C.Code + string, 3))).exists()) {
                ((FileConnection)o).mkdir();
            }
        }
        catch (Exception ex) {
            this.J();
        }
        finally {
            d.Code((Connection)o);
        }
    }
    
    static void Code(final Vector vector) {
        final String[] array = { "photos", "graphics", "videos", "music", "tones" };
        for (int i = 0; i < array.length; ++i) {
            final String code;
            if ((code = Code(array[i], false)) != null && code.startsWith("file:///")) {
                String s;
                if ((s = Code(array[i], true)) == null || s.length() == 1) {
                    s = code.substring(8);
                }
                final int lastIndex;
                if ((lastIndex = s.lastIndexOf(47, s.length() - 2)) >= 0) {
                    s = s.substring(lastIndex + 1);
                }
                vector.addElement(new Object[] { code.substring(8), new Integer(5), s, null });
            }
        }
        String s2 = System.getProperty("fileconn.dir.roots.names");
        final Enumeration listRoots;
        if (!(listRoots = FileSystemRegistry.listRoots()).hasMoreElements()) {
            throw new IOException(d.Code(163));
        }
        while (listRoots.hasMoreElements()) {
            String substring = listRoots.nextElement();
            if (s2 != null && s2.length() > 0) {
                final int index;
                if ((index = s2.indexOf(59)) != -1) {
                    substring = s2.substring(0, index);
                    s2 = s2.substring(index + 1);
                }
                else {
                    substring = s2;
                }
            }
            vector.addElement(new Object[] { substring, new Integer(5), substring, null });
        }
    }
    
    public final int Code(final String str) {
        Object o = null;
        try {
            return (int)((FileConnection)(o = Connector.open("file:///" + str, 1))).fileSize();
        }
        catch (Exception ex) {
            this.J();
            return -1;
        }
        finally {
            d.Code((Connection)o);
        }
    }
    
    static void J(final String str) {
        Connection connection = null;
        DataInputStream openDataInputStream = null;
        try {
            final Enumeration list = ((FileConnection)(connection = Connector.open("file:///" + str + "/", 1))).list("*.obml", false);
            connection.close();
            d.d.removeAllElements();
            while (list.hasMoreElements()) {
                final String s = list.nextElement();
                final String string = str + "/" + s;
                try {
                    d.Code(openDataInputStream = ((FileConnection)(connection = Connector.open("file:///" + string, 1))).openDataInputStream(), 14L);
                    final String utf = openDataInputStream.readUTF();
                    final short short1;
                    final byte[] b = new byte[short1 = openDataInputStream.readShort()];
                    openDataInputStream.readFully(b, 0, short1);
                    d.d.addElement(new Object[] { str + "/" + s, utf, b });
                }
                finally {
                    d.Code(connection);
                    d.Code((InputStream)openDataInputStream);
                    continue;
                }
                break;
            }
            d.Code(connection);
        }
        finally {
            d.Code(connection);
        }
    }
    
    static void Code(final C c, final Object[] array) {
        c.Code = 0;
        if (array == null || array[4] == null) {
            (c.Code = new d(1, null)).Code(c);
            c.Code.Code(c.J, (String)null, (String)null);
            return;
        }
        I(c, array);
    }
    
    public static String Code() {
        if (C.Code == null) {
            return "/";
        }
        return C.Code;
    }
    
    public final Vector Code(final boolean b) {
        C.Code = new Vector();
        Label_0063: {
            if (C.Code != null) {
                break Label_0063;
            }
            final Vector code = C.Code;
            try {
                Code(code);
                if (C.Code.size() == 1) {
                    C.Code = (C.a = (String)((Object[])C.Code.firstElement())[0]);
                    C.Code = new Vector();
                }
                if (C.Code.size() == 0) {
                    final Connection connection;
                    final Enumeration list = ((FileConnection)(connection = Connector.open("file:///" + C.Code, 1))).list();
                    d.Code(connection);
                    final Vector<Object> code2 = new Vector<Object>();
                    while (list.hasMoreElements()) {
                        final String str = list.nextElement();
                        final int value;
                        if (((value = (0x3 | (str.endsWith("/") ? 1 : 0) << 2)) & 0x4) != 0x0 || !b) {
                            Code(((value & 0x4) == 0x0) ? C.Code : code2, new Object[] { C.Code + str, new Integer(value), str, null });
                        }
                    }
                    for (int i = 0; i < C.Code.size(); ++i) {
                        code2.addElement(C.Code.elementAt(i));
                    }
                    C.Code = code2;
                    if (!Code()) {
                        if (b && !d.Y) {
                            C.Code.insertElementAt(new Object[] { "+", new Integer(5), "<" + d.Code(171) + ">", null }, 0);
                        }
                        if (C.a == null || !C.a.equals(C.Code)) {
                            C.Code.insertElementAt(new Object[] { "..", new Integer(5), "..", null }, 0);
                        }
                    }
                }
                return C.Code;
            }
            catch (Exception ex) {
                this.J();
                return C.Code;
            }
        }
    }
    
    private static void Code(final Vector vector, final Object o) {
        final String lowerCase = ((String)((Object[])o)[2]).toLowerCase();
        int index;
        if ((index = vector.size() - 1) < 0 || lowerCase.compareTo(((String)((Object[])vector.lastElement())[2]).toLowerCase()) >= 0) {
            vector.addElement(o);
            return;
        }
        while (index > 0 && lowerCase.compareTo(((String)((Object[])vector.elementAt(index - 1))[2]).toLowerCase()) < 0) {
            --index;
        }
        vector.insertElementAt(o, index);
    }
    
    private static String Code(final String str, final boolean b) {
        final StringBuffer sb;
        (sb = new StringBuffer("fileconn.dir.")).append(str);
        if (b) {
            sb.append(".name");
        }
        return System.getProperty(sb.toString());
    }
    
    public static void Code(final String code) {
        if ("/".equals(code)) {
            C.Code = null;
            return;
        }
        if (!"..".equals(code)) {
            C.Code = code;
            return;
        }
        final int lastIndex;
        if ((lastIndex = C.Code.lastIndexOf(47, C.Code.length() - 2)) > 0) {
            C.Code = C.Code.substring(0, lastIndex + 1);
            return;
        }
        C.Code = null;
    }
    
    public final InputConnection Code(final String str) {
        try {
            return (InputConnection)Connector.open("file:///" + str, 1);
        }
        catch (Exception ex) {
            this.J();
            return null;
        }
    }
    
    private static HttpConnection Code(String s, final int i) {
        Object o = null;
        String s2 = null;
        Label_0112: {
            try {
                if (d.Code()) {
                    final String[] code;
                    s2 = (code = d.Code(s))[0];
                    s = code[1];
                }
                o = Connector.open(d.Code(s, false));
                if (s2 != null) {
                    ((HttpConnection)o).setRequestProperty("X-Online-Host", s2);
                }
                if (i != 0) {
                    ((HttpConnection)o).setRequestProperty("Range", "bytes=" + i + "-");
                }
                final int responseCode = ((HttpConnection)o).getResponseCode();
                if (i == 0) {
                    if (responseCode != 200) {
                        break Label_0112;
                    }
                }
                else if (responseCode != 206) {
                    break Label_0112;
                }
                return (HttpConnection)o;
            }
            catch (Exception ex) {}
        }
        d.Code((Connection)o);
        return null;
    }
    
    private void I(final C c) {
        if (this.Code == c && this.Code != null) {
            if (!this.Code.Code) {
                Code.Code.I(this.Code);
                this.Code.Code.J = true;
                this.Code.Code.Code(true, false, null);
            }
            this.Code = null;
            this.Code = null;
        }
    }
    
    public final void Code(final String str, String b, final d code) {
        if (C.Code == null) {
            return;
        }
        if (b == null) {
            b = (String)C.Code[0];
        }
        if (b == null || b.length() == 0) {
            b = "unnamed";
        }
        final C code2;
        (code2 = new C()).Code = 0;
        code2.I = -1;
        if (C.Code[1] != null) {
            code2.I = (int)C.Code[1];
        }
        code2.J = (String)C.Code[3];
        code2.B = b;
        code2.C = "file:///" + str;
        this.Code = code;
        this.Code = code2;
        this.Code.Code.e = true;
        d.Code(new g(44));
    }
    
    final void J() {
        final d code;
        if ((code = Code.Code(8)) != null) {
            Code.Code.I(code);
        }
        Code.Code(d.Code(152));
        C.Code = null;
        this.Code();
    }
    
    final void I() {
        if (this.Code != null) {
            this.Code.Code.e = false;
        }
        this.Code = null;
        this.Code = null;
    }
    
    final void Code(final boolean b) {
        FileConnection fileConnection = null;
        long availableSize;
        try {
            fileConnection = (FileConnection)Connector.open(this.Code.C + this.Code.B, 3);
            if (b) {
                fileConnection.delete();
            }
            availableSize = fileConnection.availableSize();
            fileConnection.exists();
            d.Code((Connection)fileConnection);
        }
        finally {
            try {
                this.I();
                this.J();
                return;
            }
            finally {
                d.Code((Connection)fileConnection);
            }
        }
        if (b) {
            Code.Code().Code("overlay:" + d.I(155), (String)null, (String)null);
            return;
        }
        if (availableSize >= 0L && availableSize < this.Code.I) {
            final StringBuffer sb;
            d.Code(sb = new StringBuffer("a="), (int)availableSize, (int)availableSize, true);
            sb.append("&r=");
            d.Code(sb, this.Code.I, this.Code.I, true);
            Code.Code().Code("overlay:" + d.I(153), (String)null, sb.toString());
            return;
        }
        this.Z();
    }
    
    final void Z() {
        Code(this.Code, C.Code);
        this.Code();
    }
    
    static void I(final C code, final Object[] code2) {
        final g target;
        (target = new g(46)).Code = code;
        target.Code = code2;
        final Thread thread;
        (thread = new Thread(target)).setPriority(1);
        thread.start();
    }
    
    final void Z(final C c, final Object[] array) {
        final String s = (String)array[4];
        // monitorenter(c)
        d.g = "-";
        InputStream openInputStream = null;
        Object o = null;
        OutputStream openOutputStream = null;
        Object code = null;
        boolean b = false;
        final String c2 = c.C;
        final String b2 = c.B;
        Label_0505: {
            OutputStream outputStream;
            try {
                if (!c2.endsWith(b2)) {
                    c.C += c.B;
                    ((FileConnection)(o = Connector.open(c.C, 3))).create();
                    // monitorenter(b3 = d.B)
                    Label_0112: {
                        if (!d.aA) {
                            break Label_0112;
                        }
                        final Vector c3 = d.C;
                        try {
                            c3.addElement(c);
                            d.B.insertElementAt(c, 0);
                            d.m();
                            b = true;
                        }
                        finally {
                        }
                        // monitorexit(b3)
                    }
                    this.I(c);
                }
                else {
                    b = true;
                    o = Connector.open(c.C, 3);
                }
                if (!((FileConnection)o).exists()) {
                    ((FileConnection)o).create();
                }
                c.Code = (int)((FileConnection)o).fileSize();
                openOutputStream = ((FileConnection)o).openOutputStream((long)c.Code);
                boolean b4 = false;
                int i = -1;
                d.g = "NB";
                if ((code = Code(s, c.Code)) == null) {
                    b4 = true;
                }
                else {
                    openInputStream = ((InputConnection)code).openInputStream();
                    final long length;
                    if ((length = ((ContentConnection)code).getLength()) != -1L) {
                        i = c.Code + (int)length;
                    }
                }
                if (c.I == -1) {
                    c.I = i;
                }
                else if (i != -1 && c.I != i) {
                    b4 = true;
                }
                final byte[] array2 = new byte[512];
                int read;
                while (!b4 && !c.Code && (read = openInputStream.read(array2)) != -1) {
                    d.B += read;
                    d.C += read;
                    c.Code += read;
                    openOutputStream.write(array2, 0, read);
                    Thread.yield();
                }
                if (!b4) {
                    if (c.Code) {
                        c.Code = 3;
                    }
                    else if (c.Code >= c.I) {
                        c.Code = 2;
                    }
                }
                outputStream = openOutputStream;
                d.Code(outputStream);
                final FileConnection fileConnection = (FileConnection)o;
                d.Code((Connection)fileConnection);
                final InputStream inputStream = openInputStream;
                d.Code(inputStream);
                final ContentConnection contentConnection = (ContentConnection)code;
                d.Code((Connection)contentConnection);
                final C c4 = this;
                final C c5 = c;
                c4.I(c5);
                break Label_0505;
            }
            catch (Exception ex) {
                d.Code(openOutputStream);
                d.Code((Connection)o);
                d.Code(openInputStream);
                d.Code((Connection)code);
                this.I(c);
                break Label_0505;
            }
            finally {
                d.Code(openOutputStream);
                d.Code((Connection)o);
                d.Code(openInputStream);
                d.Code((Connection)code);
                this.I(c);
            }
            try {
                d.Code(outputStream);
                final FileConnection fileConnection = (FileConnection)o;
                d.Code((Connection)fileConnection);
                final InputStream inputStream = openInputStream;
                d.Code(inputStream);
                final ContentConnection contentConnection = (ContentConnection)code;
                d.Code((Connection)contentConnection);
                final C c4 = this;
                final C c5 = c;
                c4.I(c5);
                c.Code = false;
                if (c.Code == 0) {
                    c.Code = 1;
                    if (!b) {
                        Code.Code(d.Code(152));
                    }
                }
                if (d.C.contains(c) && !d.aA) {
                    final g g;
                    (g = new g(45)).Code = c;
                    Browser.Code.callSerially((Runnable)g);
                }
                d.m();
            }
            finally {
            }
            // monitorexit(c)
        }
    }
    
    static void Code(final C c) {
        if (c.C == null) {
            return;
        }
        // monitorenter(c)
        final String c2 = c.C;
        try {
            Z(c2);
        }
        finally {
        }
        // monitorexit(c)
    }
    
    static void Z(final String s) {
        Object o = null;
        final int n = 2;
        try {
            ((FileConnection)(o = Connector.open(s, n))).delete();
            d.Code((Connection)o);
        }
        finally {
            d.Code((Connection)o);
        }
    }
}
