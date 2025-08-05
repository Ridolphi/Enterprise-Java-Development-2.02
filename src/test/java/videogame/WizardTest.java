package videogame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    void testConvertToElf() {
        Wizard wizard = new Wizard(80, 40, 2, "Fireball");
        Elf elf = wizard.convertToElf();

        assertEquals(80, elf.getHealth());
        assertEquals(40, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(15, elf.getSpeed());
    }
}