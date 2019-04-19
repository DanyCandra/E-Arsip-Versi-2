package com.bpd.arsip.exception;

/**
 *
 * @author Dany Candra
 */
public class ArsipException extends Exception {

    /**
     * Creates a new instance of <code>ArsipException</code> without detail
     * message.
     */
    public ArsipException() {
    }

    /**
     * Constructs an instance of <code>ArsipException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ArsipException(String msg) {
        super(msg);
    }
}
