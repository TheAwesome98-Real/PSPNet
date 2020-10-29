import java.io.IOException;
import java.util.Hashtable;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

final class f extends InputStream
{
    private byte[] Code;
    private boolean Code;
    private d Code;
    private f Code;
    private Object[] Code;
    private int[] Code;
    private Hashtable Code;
    private int Code;
    private int I;
    private boolean I;
    private int Z;
    private int J;
    private int B;
    private int C;
    private int a;
    private int b;
    private byte[] I;
    
    final boolean Code(final String s) {
        if (this.b >= 3) {
            return false;
        }
        ++this.b;
        this.a = d.Code(s, (String)null);
        this.Code = null;
        if (this.b == 1) {
            this.Code[90] = this.Code[53];
        }
        this.Code[53] = s;
        this.Code[46] = 0;
        return true;
    }
    
    final void I() {
        this.Code = null;
        this.Code = null;
    }
    
    public final void close() {
        d.Code(this, false);
    }
    
    f() {
        this.b = 0;
        this.I = new byte[1];
    }
    
    public final boolean Z() {
        return this.Code;
    }
    
    f(final Object[] code, final int[] code2, final int a) {
        this.b = 0;
        this.I = new byte[1];
        this.Code = code;
        this.Code = code2;
        this.a = a;
        code2[46] = 0;
        this.Code = (Hashtable)code[9];
        code[9] = null;
    }
    
    final void J(final int n) {
        this.C += n;
    }
    
    final int Code() {
        return this.a;
    }
    
    final d Code() {
        return this.Code;
    }
    
    final void Code(final d code, final int code2) {
        this.Code = code;
        this.Code = code2;
    }
    
    final void Code() {
        this.Code = null;
    }
    
    final void Code(final f code) {
        this.Code = code;
    }
    
    final int J() {
        return this.B;
    }
    
    final f Code() {
        return this.Code;
    }
    
    final f Code(f code) {
        if (code == this) {
            code = this.Code;
            this.Code = null;
            return code;
        }
        for (f code2 = this; code2.Code != null; code2 = code2.Code) {
            if (code2.Code == code) {
                code2.Code = code.Code;
                code.Code = null;
                break;
            }
        }
        return this;
    }
    
    final int I() {
        return this.Code;
    }
    
    final Object[] Code() {
        return this.Code;
    }
    
    final int[] Code() {
        return this.Code;
    }
    
    final Hashtable Code(final boolean b) {
        final Hashtable code = this.Code;
        if (b) {
            this.Code = null;
        }
        return code;
    }
    
    final byte[] Code() {
        return this.Code;
    }
    
    final int Z() {
        return this.J;
    }
    
    final boolean Code() {
        return this.Code == null;
    }
    
    final boolean I() {
        return this.Code[46] != 0;
    }
    
    final void Z() {
        this.Code[46] = 1;
    }
    
    public final int read(final byte[] code, final int j, final int b) {
    Label_0000:
        while (true) {
            this.J = j;
            this.B = b;
            this.Code = code;
            d.Code((Object)this);
            while (!this.Code) {
                final d code2;
                if ((code2 = this.Code) != null) {
                    code2.Code(this);
                }
                if (this.Code == null) {
                    if (this.B != 0) {
                        return this.B;
                    }
                    continue Label_0000;
                }
                else {
                    d.Code((Object)this, 1000);
                }
            }
            if (this.I) {
                return -1;
            }
            throw new IOException();
        }
    }
    
    final synchronized void Code(final int b) {
        this.B = b;
        this.Code = null;
        this.notifyAll();
    }
    
    final void J() {
        this.I = true;
        d.Code((Object)this);
    }
    
    public final int read() {
        if (this.read(this.I, 0, 1) < 0) {
            return -1;
        }
        return this.I[0] & 0xFF;
    }
    
    final void I(final int z) {
        this.Code = true;
        this.Z = z;
        d.Code((Object)this);
    }
    
    final void Z(final int i) {
        this.I = i;
    }
    
    final int B() {
        return this.I;
    }
    
    public final int C() {
        return this.Z;
    }
    
    public final int a() {
        return this.C;
    }
    
    public final boolean J() {
        return this.Code != null && this.Code.I();
    }
    
    final d I() {
        return this.Code.Code();
    }
}
