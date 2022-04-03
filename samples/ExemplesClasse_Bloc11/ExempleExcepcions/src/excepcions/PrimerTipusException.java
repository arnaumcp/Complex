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
public class PrimerTipusException extends Exception {

    /**
     * Creates a new instance of <code>PrimerTipusException</code> without
     * detail message.
     */
    public PrimerTipusException() {
    }

    /**
     * Constructs an instance of <code>PrimerTipusException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PrimerTipusException(String msg) {
        super(msg);
    }
}
