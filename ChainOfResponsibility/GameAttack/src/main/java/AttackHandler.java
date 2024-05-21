/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Camilo Castillo
 */
public abstract class AttackHandler {
    protected AttackHandler nextHandler;

    public void setNextHandler(AttackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleAttack(Attack attack, Hero target);
}
