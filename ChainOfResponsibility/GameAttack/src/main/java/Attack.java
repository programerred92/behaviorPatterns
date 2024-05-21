/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Camilo Castillo
 */
public class Attack {
     private int damage;
    private AttackType type;

    public Attack(int damage, AttackType type) {
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public AttackType getType() {
        return type;
    }
}

