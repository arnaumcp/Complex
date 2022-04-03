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
public class CuaBuidaException extends Exception {

    /**
     * Creates a new instance of <code>CuaBuidaException</code> without detail
     * message.
     */
    public CuaBuidaException() {
    }

    /**
     * Constructs an instance of <code>CuaBuidaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CuaBuidaException(String msg) {
        super(msg);
    }
}
