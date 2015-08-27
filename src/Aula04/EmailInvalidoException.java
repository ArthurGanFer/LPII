/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;

/**
 *
 * @author 31338283
 */
public class EmailInvalidoException extends RuntimeException {
    EmailInvalidoException(String message){
        super(message);
    }
}
