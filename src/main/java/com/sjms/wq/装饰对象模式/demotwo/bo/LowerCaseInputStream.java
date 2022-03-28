package com.sjms.wq.装饰对象模式.demotwo.bo;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 世墨
 * @Date: 2022/3/10 19:24
 * @DESCRIPTION
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b,int offset,int len) throws IOException {
        int resuit = super.read(b,offset,len);
        for (int i = offset; i < offset + resuit; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return resuit;
    }
}
