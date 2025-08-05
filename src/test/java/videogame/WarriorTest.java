package videogame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void testConvertToElf() {
        Warrior warrior = new Warrior(100, 50, 3, 10);
        Elf elf = warrior.convertToElf();

        assertEquals(100, elf.getHealth());
        assertEquals(50, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(10, elf.getSpeed());
    }
}