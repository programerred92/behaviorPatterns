/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Camilo Castillo
 */
public class FireAttackHandler extends AttackHandler {

     @Override
    public void handleAttack(Attack attack, Hero target) {
        if (attack.getType() == AttackType.FIRE) {
            int newHealth = target.getCurrentHealth() - attack.getDamage();
            target.setCurrentHealth(newHealth);
            System.out.println("Ataque de fuego: La nueva salud del héroe es: " + target.getCurrentHealth());
        } else if (nextHandler != null) {
            nextHandler.handleAttack(attack, target);
        }
    }
}

