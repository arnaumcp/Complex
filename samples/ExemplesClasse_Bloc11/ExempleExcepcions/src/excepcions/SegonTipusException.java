/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcions;

/**
 *
 * @author user
 */
public class SegonTipusException extends Exception {

    /**
     * Creates a new instance of <code>SegonTipusException</code> without detail
     * message.
     */
    public SegonTipusException() {
    }

    /**
     * Constructs an instance of <code>SegonTipusException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SegonTipusException(String msg) {
        super(msg);
    }
}
