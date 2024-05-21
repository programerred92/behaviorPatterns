
import static java.lang.ProcessHandle.current;
import static java.util.concurrent.ThreadLocalRandom.current;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Camilo Castillo
 */
public class Main {
    public static void main(String[] args) {
          // Crear héroes
        Hero hero1 = new Hero(100);
        Hero hero2 = new Hero(100);

        // Crear manejadores de ataques
        AttackHandler normalHandler = new NormalAttackHandler();
        AttackHandler fireHandler = new FireAttackHandler();
        AttackHandler iceHandler = new IceAttackHandler();
        AttackHandler earthHandler = new EarthAttackHandler();

        // Configurar la cadena de responsabilidad
        normalHandler.setNextHandler(fireHandler);
        fireHandler.setNextHandler(iceHandler);
        iceHandler.setNextHandler(earthHandler);

        // Crear ataques
        Attack normalAttack = new Attack(10, AttackType.NORMAL);
        Attack fireAttack = new Attack(15, AttackType.FIRE);
        Attack iceAttack = new Attack(20, AttackType.ICE);
        Attack earthAttack = new Attack(25, AttackType.EARTH);

        // Ejecutar ataques
        System.out.println("Ataque al Héroe numero 2");
        normalHandler.handleAttack(normalAttack, hero2);
        normalHandler.handleAttack(fireAttack, hero2);
        normalHandler.handleAttack(iceAttack, hero2);
        normalHandler.handleAttack(earthAttack, hero2);
    }
}
