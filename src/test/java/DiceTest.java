import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceTest {
    @Test
    void tossAndSumTest() {
        Dice dice = new Dice(1);
        int value = dice.tossAndSum();
        boolean min = (value >= 1), max = (value <= 6);
        assertTrue(min && max);
    }

    @Test
    void tossAndSumTest1() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }

    @Test
    void tossAndSumTest3() {
        Dice dice = new Dice(1);
        int value = dice.tossAndSum();
        boolean min = (value >= 1), max = (value <= 6);
        assertTrue(min && max);
    }

    @Test
    void tossAndSumTest4() {
        Dice dice = new Dice(1);
        int value = dice.tossAndSum();
        boolean min = (value >= 1), max = (value <= 6);
        assertTrue(min && max);
    }

    @Test
    void tossAndSumTest5() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }
    @Test
    void tossAndSumTest6() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }
    @Test
    void tossAndSumTest7() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }
    @Test
    void tossAndSumTest8() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }
    @Test
    void tossAndSumTest9() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }
    @Test
    void tossAndSumTest10() {
        Dice dice = new Dice(2);
        int value = dice.tossAndSum();
        boolean min = (value >= 2), max = (value <= 12);
        assertTrue(min && max);
    }
}