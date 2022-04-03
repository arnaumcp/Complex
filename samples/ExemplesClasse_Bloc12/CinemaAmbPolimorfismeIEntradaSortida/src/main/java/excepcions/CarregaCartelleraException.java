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
public class CarregaCartelleraException extends Exception {

    /**
     * Creates a new instance of <code>CarregaCartelleraException</code> without
     * detail message.
     */
    public CarregaCartelleraException() {
    }

    /**
     * Constructs an instance of <code>CarregaCartelleraException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CarregaCartelleraException(String msg) {
        super(msg);
    }
}
