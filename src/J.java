import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

final class J extends ByteArrayOutputStream
{
    final void Code(final int count) {
        super.count = count;
    }
    
    J() {
    }
    
    J(final int size) {
        super(size);
    }
    
    final byte[] Code() {
        return super.buf;
    }
}
