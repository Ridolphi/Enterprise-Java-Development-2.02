package videogame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testPlayerCreation() {
        Player player = new Warrior(100, 50, 3, 10);
        assertEquals(100, player.getHealth());
        assertEquals(50, player.getStrength());
        assertEquals(3, player.getLives());
    }

    @Test
    void testAttack() {
        Warrior attacker = new Warrior(100, 20, 3, 10);
        Elf defender = new Elf(80, 15, 2, 10);

        attacker.attack(defender);
        assertEquals(60, defender.getHealth());
    }

    @Test
    void testDecrementLive() {
        Player player = new Warrior(100, 50, 1, 10);
        player.setHealth(0);
        player.checkHealth();
        assertEquals(0, player.getLives());
        assertEquals(100, player.getHealth());
    }
}