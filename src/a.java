import java.io.DataInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class a
{
    private short[] J;
    private int r;
    private int[] C;
    private int[] e;
    private int[] B;
    private int J;
    public int Code;
    public int I;
    private int[] I;
    private static short[] Code;
    private static short[] I;
    private static short[] Z;
    private static int[] Z;
    private short[][] Code;
    private static int[] J;
    private byte[] Code;
    private int B;
    private int C;
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] a;
    private int e;
    private int f;
    private int[] f;
    private int s;
    private int g;
    private int h;
    private int[] b;
    private int i;
    private int[] c;
    private int j;
    private int k;
    private int l;
    private int m;
    private int[] d;
    private int n;
    private int o;
    private byte[][] Code;
    private int p;
    int[] Code;
    private int q;
    int Z;
    private int[][] Code;
    private int[][] I;
    private byte[][] I;
    private byte[][] Z;
    private int[][] Z;
    private int t;
    private int u;
    
    public final int Code(final byte[] code, int i, int j, int k, final boolean b) {
        this.Code = code;
        this.B = i;
        this.C = j;
        this.J = k;
        int l = 0;
        while (l == 0) {
            while (this.b > 0) {
                if (this.b >= this.C) {
                    this.b -= this.C;
                    return 0;
                }
                this.B += this.b;
                this.C -= this.b;
                this.b = 0;
            }
            switch (this.a) {
                case 4: {
                    l = this.Code();
                    continue;
                }
                case 5: {
                    while (this.a == 5) {
                        if (this.C < 2) {
                            return this.C;
                        }
                        if ((this.Code[this.B] & 0xFF) == 0xFF && this.Code[this.B + 1] != 0) {
                            if ((this.Code[this.B + 1] & 0xFF) >= 208 && (this.Code[this.B + 1] & 0xFF) <= 215) {
                                this.a = 4;
                                this.B += 2;
                                this.C -= 2;
                            }
                            else {
                                this.a = 2;
                            }
                        }
                        else {
                            ++this.B;
                            --this.C;
                        }
                    }
                }
                default: {
                    continue;
                }
                case 1:
                case 2: {
                    if (this.C < 2) {
                        return this.C;
                    }
                    while (this.C >= 2 && l == 0 && this.b == 0 && (this.a == 1 || this.a == 2)) {
                        if ((this.Code[this.B] & 0xFF) != 0xFF) {
                            ++this.B;
                            --this.C;
                        }
                        else {
                            switch (this.Code[this.B + 1] & 0xFF) {
                                case 192:
                                case 193: {
                                    if (this.C < 4) {
                                        return this.C;
                                    }
                                    this.c = ((this.Code[this.B + 2] & 0xFF) << 8 | (this.Code[this.B + 3] & 0xFF));
                                    if (this.C < 10) {
                                        return this.C;
                                    }
                                    this.B += 4;
                                    this.C -= 4;
                                    this.c -= 2;
                                    this.q = ((this.Code[this.B + 3] & 0xFF) << 8 | (this.Code[this.B + 4] & 0xFF));
                                    this.Z = ((this.Code[this.B + 1] & 0xFF) << 8 | (this.Code[this.B + 2] & 0xFF));
                                    if (b) {
                                        this.a = 0;
                                        return this.q << 16 | this.Z;
                                    }
                                    this.Code = this.q >> this.J;
                                    this.I = this.Z >> this.J;
                                    this.Code = new int[this.Code * this.I];
                                    this.d = (this.Code[this.B + 5] & 0xFF);
                                    for (j = 0; j < 3; ++j) {
                                        this.e[j << 1] = 0;
                                        this.e[(j << 1) + 1] = 4;
                                    }
                                    this.Z();
                                    this.B += 6;
                                    this.C -= 6;
                                    this.c -= 6;
                                    this.a = 3;
                                    continue;
                                }
                                case 218: {
                                    if (this.C < 4) {
                                        return this.C;
                                    }
                                    this.c = ((this.Code[this.B + 2] & 0xFF) << 8 | (this.Code[this.B + 3] & 0xFF));
                                    if (this.C < this.c + 2) {
                                        return this.C;
                                    }
                                    this.i = (this.Code[this.B + 4] & 0xFF);
                                    this.B += 5;
                                    this.C -= 5;
                                    this.c -= 3;
                                    for (i = 0; i < this.i; ++i) {
                                        j = (this.Code[this.B] & 0xFF);
                                        this.c[i] = i;
                                        for (k = 0; k < this.d; ++k) {
                                            if (j == this.B[k]) {
                                                this.c[i] = k;
                                                k = this.d;
                                            }
                                        }
                                        j = (this.Code[this.B + 1] & 0xFF);
                                        this.e[this.c[i] << 1] = j >> 4;
                                        this.e[(this.c[i] << 1) + 1] = 4 + (j & 0xF);
                                        this.B += 2;
                                        this.C -= 2;
                                        this.c -= 2;
                                    }
                                    this.Z();
                                    this.k = 0;
                                    this.j = 0;
                                    this.l = 0;
                                    this.p = 0;
                                    this.I();
                                    this.B += this.c;
                                    this.C -= this.c;
                                    this.a = 4;
                                    continue;
                                }
                                case 196: {
                                    l = this.I();
                                    continue;
                                }
                                case 219: {
                                    l = this.Z();
                                    continue;
                                }
                                case 221: {
                                    if (this.C < 4) {
                                        return this.C;
                                    }
                                    this.b = ((this.Code[this.B + 2] & 0xFF) << 8 | (this.Code[this.B + 3] & 0xFF));
                                    if (this.C < 6) {
                                        return this.C;
                                    }
                                    this.m = ((this.Code[this.B + 4] & 0xFF) << 8 | (this.Code[this.B + 5] & 0xFF));
                                    this.l = 0;
                                    this.B += 6;
                                    this.C -= 6;
                                    this.b -= 4;
                                    continue;
                                }
                                case 217: {
                                    this.B += 2;
                                    this.C -= 2;
                                    this.a = 6;
                                    continue;
                                }
                                case 0:
                                case 255: {
                                    ++this.B;
                                    --this.C;
                                    continue;
                                }
                                default: {
                                    if (this.C < 4) {
                                        return this.C;
                                    }
                                    this.b = ((this.Code[this.B + 2] & 0xFF) << 8 | (this.Code[this.B + 3] & 0xFF));
                                    this.B += 4;
                                    this.C -= 4;
                                    this.b -= 2;
                                    continue;
                                }
                            }
                        }
                    }
                    continue;
                }
                case 3: {
                    if (this.C < this.d * 3) {
                        return this.C;
                    }
                    for (i = 0; i < this.d; ++i) {
                        this.B[i] = (this.Code[this.B] & 0xFF);
                        k = ((j = (this.Code[this.B + 1] & 0xFF)) & 0xF);
                        if ((j >>>= 4) > this.f) {
                            this.f = j;
                        }
                        if (k > this.e) {
                            this.e = k;
                        }
                        this.a[i] = j;
                        this.C[i] = k;
                        this.f[i] = (this.Code[this.B + 2] & 0xFF);
                        this.B += 3;
                        this.C -= 3;
                        this.c -= 3;
                    }
                    if (this.c > 0) {
                        this.b = this.c;
                    }
                    for (i = 0; i < this.d; ++i) {
                        this.b[i] = ((this.q * this.a[i] + this.f - 1) / this.f + 7) / 8;
                        if (this.J == 0) {
                            this.Code[i] = new byte[64 * this.b[i] * this.C[i]];
                        }
                        else {
                            this.Code[i] = new byte[64 * this.C[i] * this.a[i]];
                        }
                    }
                    this.p = 0;
                    if (this.d > 1) {
                        this.g = (this.f << 3) * ((this.q + 8 * this.f - 1) / (this.f << 3));
                        this.h = (this.e << 3) * ((this.Z + 8 * this.e - 1) / (this.e << 3));
                    }
                    this.a = 2;
                    continue;
                }
                case 6: {
                    return 0;
                }
                case 0: {
                    if (this.C < 2) {
                        return this.C;
                    }
                    this.B += 2;
                    this.C -= 2;
                    this.a = 1;
                    continue;
                }
            }
        }
        if (l == -2) {
            return this.C;
        }
        return l;
    }
    
    private void J() {
        while (this.s <= 24 && this.C > 0) {
            final int n;
            if ((n = (this.Code[this.B] & 0xFF)) == 255) {
                if (this.C < 2 || this.Code[this.B + 1] != 0) {
                    return;
                }
                ++this.B;
                --this.C;
            }
            ++this.B;
            --this.C;
            this.r |= n << 24 - this.s;
            this.s += 8;
        }
    }
    
    private void Code(final boolean b) {
        final int n2;
        final int n = (n2 = this.e << 3) * this.p;
        final int[] array = new int[3];
        final int[] array2 = new int[3];
        final int[] array3 = new int[3];
        final int[] array4 = new int[3];
        if (this.d == 3) {
            array2[array[0] = 0] = (this.C[0] << 11) / this.e;
            array4[0] = (this.a[0] << 11) / this.f;
            array[1] = 0;
            array2[1] = (this.C[1] << 11) / this.e;
            array4[1] = (this.a[1] << 11) / this.f;
            array[2] = 0;
            array2[2] = (this.C[2] << 11) / this.e;
            array4[2] = (this.a[2] << 11) / this.f;
        }
        if (!b) {
            this.u = this.q;
        }
        else {
            this.u = ((this.n == 0) ? (this.q % (this.f << 3)) : (this.f << 3));
            if (this.u == 0) {
                this.u = this.f << 3;
            }
        }
        final int[] array5 = b ? this.I : this.Code;
        for (int i = 0; i < n2; ++i) {
            if (n + i < this.Z && this.d == 3) {
                int n3 = (n + i) * this.q;
                if (b) {
                    final int t = n3 + (((this.b[0] + 1 & 0xFFFFFFFE) << 3) - ((this.n / this.o + 1) * this.f << 3));
                    if (this.t == -1) {
                        this.t = t;
                    }
                    n3 = i * this.f << 3;
                }
                final int n4 = array[0] >> 11;
                int[] array6;
                int n5;
                if (b) {
                    array6 = this.a;
                    n5 = 0;
                }
                else {
                    array6 = this.b;
                    n5 = 0;
                }
                final int n6 = n4 * (array6[n5] << 3);
                final int[] array7 = array;
                final int n7 = 0;
                array7[n7] += array2[0];
                array3[0] = 0;
                final int n8 = array[1] >> 11;
                int[] array8;
                int n9;
                if (b) {
                    array8 = this.a;
                    n9 = 1;
                }
                else {
                    array8 = this.b;
                    n9 = 1;
                }
                final int n10 = n8 * (array8[n9] << 3);
                final int[] array9 = array;
                final int n11 = 1;
                array9[n11] += array2[1];
                array3[1] = 0;
                final int n12 = array[2] >> 11;
                int[] array10;
                int n13;
                if (b) {
                    array10 = this.a;
                    n13 = 2;
                }
                else {
                    array10 = this.b;
                    n13 = 2;
                }
                final int n14 = n12 * (array10[n13] << 3);
                final int[] array11 = array;
                final int n15 = 2;
                array11[n15] += array2[2];
                array3[2] = 0;
                if (this.a[0] == 2 && this.a[1] == 1 && this.a[2] == 1) {
                    for (int j = 0; j < this.u >> 1; ++j) {
                        final int n16 = this.Code[0][n6 + (j << 1)] & 0xFF;
                        int n17 = this.Code[1][n10 + j] & 0xFF;
                        int n18 = this.Code[2][n14 + j] & 0xFF;
                        final short n19 = a.I[n18];
                        final short n20 = a.Z[n17];
                        n17 -= 128;
                        n18 -= 128;
                        final int n21 = n17 * 705 + n18 * 1463 + 1024 >> 11;
                        array5[n3++] = (a.Code[n16 + n19 + 256] << 16 | a.Code[n16 - n21 + 256] << 8 | a.Code[n16 + n20 + 256]);
                        final int n22 = this.Code[0][n6 + (j << 1) + 1] & 0xFF;
                        array5[n3++] = (a.Code[n22 + n19 + 256] << 16 | a.Code[n22 - n21 + 256] << 8 | a.Code[n22 + n20 + 256]);
                    }
                    if ((this.q & 0x1) != 0x0 && this.n == 0) {
                        final int n23 = b ? (8 * this.f) : this.q;
                        final int n24 = this.Code[0][n6 + n23 - 1] & 0xFF;
                        int n25 = this.Code[1][n10 + (n23 - 1 >> 1)] & 0xFF;
                        int n26 = this.Code[2][n14 + (n23 - 1 >> 1)] & 0xFF;
                        final short n27 = a.Code[n24 + a.Z[n25] + 256];
                        n25 -= 128;
                        n26 -= 128;
                        array5[n3] = (a.Code[n24 + a.I[n26 + 128] + 256] << 16 | a.Code[n24 - (n25 * 705 + n26 * 1463 + 1024 >> 11) + 256] << 8 | n27);
                    }
                }
            }
        }
    }
    
    public a() {
        this.B = new int[3];
        this.C = new int[3];
        this.a = new int[3];
        this.b = new int[3];
        this.c = new int[3];
        this.d = new int[3];
        this.Code = new byte[3][];
        this.e = new int[6];
        this.Code = new int[16][];
        this.I = new int[16][];
        this.Code = new short[16][];
        this.I = new byte[16][];
        this.Z = new byte[16][];
        this.J = new short[3];
        this.f = new int[3];
        this.Z = new int[4][];
        this.t = -1;
        Code();
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.m = 0;
        for (int i = 0; i < 3; ++i) {
            this.Code[i] = null;
            this.Code[i] = null;
            this.I[i] = null;
            this.Code[i] = null;
            this.I[i] = null;
            this.Z[i] = null;
        }
    }
    
    private void I() {
        if (this.i == 1) {
            this.n = ((this.a[this.c[this.j]] * this.q + this.f - 1) / this.f + 7) / 8;
            this.d[this.c[this.j]] = 0;
            return;
        }
        this.n = 0;
        for (int i = 0; i < this.i; ++i) {
            this.n += this.C[this.c[i]] * this.a[this.c[i]];
            this.d[this.c[i]] = 0;
        }
        this.o = this.n;
        this.n *= this.g / (8 * this.f);
    }
    
    private void Z() {
        for (int i = 0; i < 3; ++i) {
            this.J[i] = 0;
        }
        this.r = 0;
        this.s = 0;
    }
    
    private static synchronized void Code() {
        if (a.Code == null) {
            DataInputStream code = null;
            final int n = 1;
            try {
                code = d.Code(n);
                a.Code = new short[768];
                a.I = new short[256];
                a.Z = new short[256];
                a.Z = new int[64];
                a.J = new int[64];
                short n2 = 0;
                for (int i = 0; i < 768; ++i) {
                    n2 = (a.Code[i] = (short)(n2 + code.readShort()));
                }
                short n3 = 0;
                for (int j = 0; j < 256; ++j) {
                    n3 = (a.I[j] = (short)(n3 + code.readShort()));
                }
                short n4 = 0;
                for (int k = 0; k < 256; ++k) {
                    n4 = (a.Z[k] = (short)(n4 + code.readShort()));
                }
                int n5 = 0;
                for (int l = 0; l < 64; ++l) {
                    n5 = (a.Z[l] = (short)(n5 + code.readShort()));
                }
                int n6 = 0;
                for (int n7 = 0; n7 < 64; ++n7) {
                    n6 = (a.J[n7] = (short)(n6 + code.readShort()));
                }
            }
            finally {
                d.Code((InputStream)code);
            }
        }
    }
    
    private int Z() {
        if (this.C < 4) {
            return -2;
        }
        int i = (this.Code[this.B + 2] & 0xFF) << 8 | (this.Code[this.B + 3] & 0xFF);
        if (this.C < i + 2) {
            return -2;
        }
        this.B += 4;
        this.C -= 4;
        i -= 2;
        while (i > 0) {
            final int n = this.Code[this.B] & 0xF0;
            final int n2 = (n | -n) >>> 31;
            final int n3 = this.Code[this.B] & 0xF;
            ++this.B;
            --this.C;
            --i;
            this.Z[n3] = new int[64];
            if (n2 != 0) {
                for (int j = 0; j < 64; ++j) {
                    final int n4 = a.Z[j];
                    this.Z[n3][j] = ((this.Code[this.B + (n4 << 1)] & 0xFF) << 8 | (this.Code[this.B + (n4 << 1) + 1] & 0xFF)) * a.J[j];
                }
                this.B += 128;
                this.C -= 128;
                i -= 128;
            }
            else {
                for (int k = 0; k < 64; ++k) {
                    this.Z[n3][k] = (this.Code[this.B + a.Z[k]] & 0xFF) * a.J[k];
                }
                this.B += 64;
                this.C -= 64;
                i -= 64;
            }
        }
        return 0;
    }
    
    private int I(final int n, int code) {
        int n2 = code - 1;
        if ((code = this.Code(code)) < 0) {
            return code;
        }
        while (n2 < 16 && code > this.Code[n][n2]) {
            ++n2;
            final int code2;
            if ((code2 = this.Code(1)) < 0) {
                return code2;
            }
            code = (code << 1 | code2);
        }
        code = this.Code[n][n2] + (code - this.I[n][n2]);
        return this.I[n][code] & 0xFF;
    }
    
    private int I() {
        if (this.C < 4) {
            return -2;
        }
        int i = (this.Code[this.B + 2] & 0xFF) << 8 | (this.Code[this.B + 3] & 0xFF);
        if (this.C < i + 2) {
            return -2;
        }
        i -= 2;
        this.B += 4;
        this.C -= 4;
        while (i > 0) {
            final int n = (this.Code[this.B] & 0xF) | (this.Code[this.B] & 0x10) >> 2;
            ++this.B;
            --this.C;
            --i;
            int n2 = 0;
            final short[] array = new short[16];
            int n3 = 0;
            for (int j = 0; j < 16; ++j) {
                array[j] = (short)(this.Code[this.B + j] & 0xFF);
                n3 += array[j];
            }
            final int[] array2 = new int[n3 + 1];
            final int[] array3 = new int[n3];
            for (int k = 0; k < 16; ++k) {
                for (short n4 = 1; n4 <= array[k]; ++n4, ++n2) {
                    array2[n2] = k + 1;
                }
            }
            array2[n2] = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = array2[0];
            while (array2[n5] != 0) {
                while (array2[n5] == n7) {
                    array3[n5] = n6;
                    ++n6;
                    ++n5;
                }
                if (array2[n5] != 0) {
                    while (array2[n5] != n7) {
                        n6 <<= 1;
                        ++n7;
                    }
                }
            }
            this.I[n] = new int[16];
            this.Code[n] = new int[16];
            this.Code[n] = new short[16];
            int n8 = 0;
            for (int l = 0; l < 16; ++l) {
                if (array[l] == 0) {
                    this.Code[n][l] = -1;
                }
                else {
                    this.Code[n][l] = (short)n8;
                    this.I[n][l] = array3[n8];
                    n8 += array[l] - 1;
                    this.Code[n][l] = array3[n8];
                    ++n8;
                }
            }
            this.B += 16;
            this.C -= 16;
            i -= 16;
            this.I[n] = new byte[n2];
            for (int n9 = 0; n9 < n2; ++n9) {
                this.I[n][n9] = this.Code[this.B + n9];
            }
            this.B += n2;
            this.C -= n2;
            i -= n2;
            this.Z[n] = new byte[512];
            for (int n10 = 0; n10 < 256; ++n10) {
                this.Z[n][n10] = 9;
            }
            int n11 = 0;
            for (int n12 = 1; n12 <= 8; ++n12) {
                for (short n13 = 0; n13 < array[n12 - 1]; ++n13) {
                    final int n14 = array3[n11] << 8 - n12;
                    for (int n15 = 0; n15 < 1 << 8 - n12; ++n15) {
                        this.Z[n][n14 | n15] = (byte)n12;
                        this.Z[n][256 + (n14 | n15)] = this.I[n][n11];
                    }
                    ++n11;
                }
            }
        }
        return 0;
    }
    
    private int Code() {
        final short[] array = new short[64];
        if (this.J != 0 && this.I == null) {
            this.I = new int[this.e * this.f << 6];
        }
        do {
            final int n = this.c[this.j];
            for (int i = 0; i < 64; ++i) {
                array[i] = 0;
            }
            final short[] array2 = array;
            final int c = this.C;
            final int r = this.r;
            final int s = this.s;
            int n3 = 0;
            int n2 = 0;
            Label_0459: {
                final int j;
                if ((j = this.I(this.e[n << 1])) < 0) {
                    this.B -= c - this.C;
                    this.C = c;
                    this.r = r;
                    this.s = s;
                    n2 = (n3 = j);
                }
                else {
                    final int code;
                    if ((code = this.Code(j)) < 0) {
                        this.B -= c - this.C;
                        this.C = c;
                        this.r = r;
                        this.s = s;
                        n2 = (n3 = code);
                    }
                    else {
                        array2[0] = (short)(Code(j, code) + this.J[n]);
                        final int n4 = this.e[(n << 1) + 1];
                        for (int k = 1; k < 64; ++k) {
                            final int l;
                            if ((l = this.I(n4)) < 0) {
                                this.B -= c - this.C;
                                this.C = c;
                                this.r = r;
                                this.s = s;
                                n2 = (n3 = l);
                                break Label_0459;
                            }
                            final int n5 = l & 0xF;
                            final int n6 = l >> 4;
                            if (n5 == 0) {
                                if (n6 != 15) {
                                    break;
                                }
                                k += n6;
                            }
                            else {
                                final int code2;
                                if ((code2 = this.Code(n5)) < 0) {
                                    this.B -= c - this.C;
                                    this.C = c;
                                    this.r = r;
                                    this.s = s;
                                    n2 = (n3 = code2);
                                    break Label_0459;
                                }
                                if ((k += n6) >= 64) {
                                    k = 63;
                                }
                                array2[k] = (short)Code(n5, code2);
                            }
                        }
                        this.J[n] = array2[0];
                        n2 = (n3 = 0);
                    }
                }
            }
            final int n7 = n3;
            if (n2 != 0) {
                return n7;
            }
            final int n8 = this.d[n] / (this.C[n] * this.a[n]);
            final int n9 = this.d[n] % (this.C[n] * this.a[n]);
            final int n10;
            if ((n10 = this.a[n] * n8 + n9 % this.a[n]) < this.b[n]) {
                if (this.J == 0) {
                    this.Code(n, array, this.Code[n], n10 + (n9 / this.a[n] * this.b[n] << 3) << 3, this.b[n] << 3);
                }
                else {
                    this.Code(n, array, this.Code[n], n9 / this.a[n] * (this.a[n] << 6) + (n9 % this.a[n] << 3), this.a[n] << 3);
                }
            }
            final int[] d = this.d;
            final int n11 = n;
            ++d[n11];
            --this.n;
            if (this.n % this.o == 0 && this.J != 0) {
                this.Code(true);
                final int n13;
                int n12 = (n13 = this.t / this.q >> this.J) * this.Code + (this.t % this.q >> this.J);
                int n14 = 0;
                for (int n15 = 0; n15 < this.e << 3 >> this.J && n15 + n13 < this.I; ++n15) {
                    for (int n16 = 0; n16 < this.u >> this.J; ++n16) {
                        this.Code[n12 + n16] = this.I[n14 + (n16 << this.J)];
                    }
                    n12 += this.Code;
                    n14 += this.f << 3 << this.J;
                }
                this.t = -1;
            }
            if (this.n == 0) {
                if (this.J == 0) {
                    this.Code(false);
                }
                ++this.p;
                if ((this.i > 1 && this.p >= this.h / (8 * this.e)) || (this.i == 1 && this.p >= ((this.C[n] * this.Z + this.e - 1) / this.e + 7) / 8)) {
                    this.a = 2;
                    return 0;
                }
                this.I();
            }
            ++this.k;
            if (this.k < this.C[n] * this.a[n] && this.i != 1) {
                continue;
            }
            this.k = 0;
            ++this.j;
            if (this.j < this.i) {
                continue;
            }
            this.j = 0;
            ++this.l;
        } while (this.l != this.m || this.m <= 0);
        this.l = 0;
        this.Z();
        this.a = 5;
        return 0;
    }
    
    private int Code(final int n) {
        if (n == 0) {
            return 0;
        }
        if (this.s < n) {
            this.J();
            if (this.s < n) {
                return -2;
            }
        }
        final int n2 = this.r >>> 32 - n;
        this.r <<= n;
        this.s -= n;
        return n2;
    }
    
    private static int Code(final int n, final int n2) {
        if (n2 < 1 << n - 1) {
            return n2 + (-1 << n) + 1;
        }
        return n2;
    }
    
    private int I(final int n) {
        if (this.s < 8) {
            this.J();
            if (this.s < 8) {
                return this.I(n, 1);
            }
        }
        final int n2 = this.r >>> 24;
        final byte b;
        if ((b = this.Z[n][n2]) <= 8) {
            this.r <<= b;
            this.s -= b;
            return this.Z[n][n2 + 256] & 0xFF;
        }
        return this.I(n, 9);
    }
    
    private void Code(int i, final short[] array, final byte[] array2, int n, final int n2) {
        final int[] array3 = new int[64];
        for (int j = 0; j < 8; ++j) {
            if (array[a.Z[j + 8]] == 0 && array[a.Z[j + 16]] == 0 && array[a.Z[j + 24]] == 0 && array[a.Z[j + 32]] == 0 && array[a.Z[j + 40]] == 0 && array[a.Z[j + 48]] == 0 && array[a.Z[j + 56]] == 0) {
                final int n3 = array[a.Z[j]] * this.Z[this.f[i]][j];
                array3[j + 8] = (array3[j] = n3);
                array3[j + 24] = (array3[j + 16] = n3);
                array3[j + 40] = (array3[j + 32] = n3);
                array3[j + 56] = (array3[j + 48] = n3);
            }
            else {
                array3[j] = array[a.Z[j]] * this.Z[this.f[i]][j];
                array3[j + 8] = array[a.Z[j + 8]] * this.Z[this.f[i]][j + 8];
                array3[j + 16] = array[a.Z[j + 16]] * this.Z[this.f[i]][j + 16];
                array3[j + 24] = array[a.Z[j + 24]] * this.Z[this.f[i]][j + 24];
                array3[j + 32] = array[a.Z[j + 32]] * this.Z[this.f[i]][j + 32];
                array3[j + 40] = array[a.Z[j + 40]] * this.Z[this.f[i]][j + 40];
                array3[j + 48] = array[a.Z[j + 48]] * this.Z[this.f[i]][j + 48];
                array3[j + 56] = array[a.Z[j + 56]] * this.Z[this.f[i]][j + 56];
                final int n4 = array3[j];
                final int n5 = array3[j + 32];
                final int n6 = array3[j + 16] - array3[j + 48];
                final int n7 = array3[j + 16] + array3[j + 48];
                final int n8 = n4 - n5;
                final int n9 = (n6 >> 8) * 362 - n7;
                final int n10 = n8 - n9;
                final int n11 = n8 + n9;
                final int n13;
                final int n12 = (n13 = n4 + n5) - n7;
                final int n14 = n13 + n7;
                final int n15 = array3[j + 40] - array3[j + 24];
                final int n16 = array3[j + 8] + array3[j + 56];
                final int n17 = array3[j + 24] + array3[j + 40];
                final int n18 = n16 + n17;
                final int n19 = (n16 - n17 >> 8) * 362;
                final int n20 = array3[j + 8] - array3[j + 56];
                final int n21 = (n15 + n20 >> 8) * 196;
                final int n22 = (-n15 >> 8) * 277 - n21;
                final int n24;
                final int n23 = (n24 = (n20 >> 8) * 669 - n21 - n18) - n19;
                final int n25 = n22 - n23;
                array3[j] = n14 + n18;
                array3[j + 8] = n11 + n24;
                array3[j + 16] = n10 - n23;
                array3[j + 24] = n12 - n25;
                array3[j + 32] = n12 + n25;
                array3[j + 40] = n10 + n23;
                array3[j + 48] = n11 - n24;
                array3[j + 56] = n14 - n18;
            }
        }
        byte b;
        int n26;
        int n27;
        int n28;
        int n29;
        int n30;
        int n31;
        int n32;
        int n33;
        int n35;
        int n34;
        int n36;
        int n37;
        int n38;
        int n39;
        int n40;
        int n41;
        int n42;
        int n43;
        int n44;
        int n46;
        int n45;
        int n47;
        for (i = 0; i < 64; i += 8) {
            if (array3[i + 1] == 0 && array3[i + 2] == 0 && array3[i + 3] == 0 && array3[i + 4] == 0 && array3[i + 5] == 0 && array3[i + 6] == 0 && array3[i + 7] == 0) {
                b = (byte)a.Code[(array3[i] + 1024 >> 11) + 128 + 256];
                array2[n + 1] = (array2[n] = b);
                array2[n + 3] = (array2[n + 2] = b);
                array2[n + 5] = (array2[n + 4] = b);
                array2[n + 7] = (array2[n + 6] = b);
            }
            else {
                n26 = array3[i];
                n27 = array3[i + 4];
                n28 = array3[i + 2] - array3[i + 6];
                n29 = array3[i + 2] + array3[i + 6];
                n30 = n26 - n27;
                n31 = (n28 >> 8) * 362 - n29;
                n32 = n30 - n31;
                n33 = n30 + n31;
                n34 = (n35 = n26 + n27) - n29;
                n36 = n35 + n29;
                n37 = array3[i + 5] - array3[i + 3];
                n38 = array3[i + 1] + array3[i + 7];
                n39 = array3[i + 3] + array3[i + 5];
                n40 = n38 + n39;
                n41 = (n38 - n39 >> 8) * 362;
                n42 = array3[i + 1] - array3[i + 7];
                n43 = (n37 + n42 >> 8) * 196;
                n44 = (-n37 >> 8) * 277 - n43;
                n45 = (n46 = (n42 >> 8) * 669 - n43 - n40) - n41;
                n47 = n44 - n45;
                array2[n] = (byte)a.Code[(n36 + n40 + 1024 >> 11) + 128 + 256];
                array2[n + 1] = (byte)a.Code[(n33 + n46 + 1024 >> 11) + 128 + 256];
                array2[n + 2] = (byte)a.Code[(n32 - n45 + 1024 >> 11) + 128 + 256];
                array2[n + 3] = (byte)a.Code[(n34 - n47 + 1024 >> 11) + 128 + 256];
                array2[n + 4] = (byte)a.Code[(n34 + n47 + 1024 >> 11) + 128 + 256];
                array2[n + 5] = (byte)a.Code[(n32 + n45 + 1024 >> 11) + 128 + 256];
                array2[n + 6] = (byte)a.Code[(n33 - n46 + 1024 >> 11) + 128 + 256];
                array2[n + 7] = (byte)a.Code[(n36 - n40 + 1024 >> 11) + 128 + 256];
            }
            n += n2;
        }
    }
}
