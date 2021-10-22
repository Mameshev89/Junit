import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shoulCalculateUnderLimet() {
        BonusService run = new BonusService();
        long amount=1000_60;
        boolean registed=true;
        long expected=30;
        long actual = run.calculate(amount,registed);
        assertEquals(expected, actual);
    }
    @Test
    void shoulCalculateOverLimet() {
        BonusService run = new BonusService();
        long amount=1000_000_60;
        boolean registed=true;
        long expected=500;
        long actual = run.calculate(amount,registed);
        assertEquals(expected, actual);
    }
    @Test
    void shoulCalculateIsnotRegisted() {
        BonusService run = new BonusService();
        long amount=1000_60;
        boolean registed=false;
        long expected=10;
        long actual = run.calculate(amount,registed);
        assertEquals(expected, actual);
    }
    @Test
    void shoulCalculateIsnotRegiOverLimet() {
        BonusService run = new BonusService();
        long amount=1000_000_60;
        boolean registed=false;
        long expected=500;
        long actual = run.calculate(amount,registed);
        assertEquals(expected, actual);
    }
}