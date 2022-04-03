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
public class CuaPlenaException extends Exception {

    /**
     * Creates a new instance of <code>CuaPlenaException</code> without detail
     * message.
     */
    public CuaPlenaException() {
    }

    /**
     * Constructs an instance of <code>CuaPlenaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CuaPlenaException(String msg) {
        super(msg);
    }
}
