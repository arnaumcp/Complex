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
public class QualitatServeiInvalidaException extends Exception {

    /**
     * Creates a new instance of <code>QualitatServeiInvalidaException</code>
     * without detail message.
     */
    public QualitatServeiInvalidaException() {
    }

    /**
     * Constructs an instance of <code>QualitatServeiInvalidaException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public QualitatServeiInvalidaException(String msg) {
        super(msg);
    }
}
