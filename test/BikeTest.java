import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void testThatTheBikeIsOn() {
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatTheBikeIsOff() {
        assertFalse(bike.isOn());
        bike.turnOff();
        assertFalse(bike.isOn());
        bike.turnOff();
        assertFalse(bike.isOn());

    }

    @Test
    public void testThatBikeCanAccelerate_1() {
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int move = 1; move <= 19; move++)
            bike.accelerate();

        assertEquals(19, bike.getAutomaticSpeed());
        assertEquals(1, bike.getAutomaticGear());
            }
    @Test
    public void testThatBikCanAccelerate_2(){
        bike.turnOn();
        assertTrue(bike.isOn());
        for(int move = 1; move <= 22;move++ )
            bike.accelerate();

        assertEquals(24,bike.getAutomaticSpeed());
        assertEquals(2,bike.getAutomaticGear());

    }
    @Test
    public void testThatBikeCanAccelerate_3(){
        bike.turnOn();
        assertTrue(bike.isOn());
        for(int move = 1; move <= 28;move++)
            bike.accelerate();

        assertEquals(39,bike.getAutomaticSpeed());
        assertEquals(3,bike.getAutomaticGear());
    }
    @Test
    public void testThatBikeCanAccelerate_4(){
        bike.turnOn();
        assertTrue(bike.isOn());
        for(int move = 1; move <= 29; move++)
            bike.accelerate();

        assertEquals(42,bike.getAutomaticSpeed());
        assertEquals(4,bike.getAutomaticGear());
    }

    @Test
    public void testThatBikeCanDecelerate_1(){
        bike.turnOn();
        assertTrue(bike.isOn());
        for(int move = 1; move < 20; move++)
            bike.accelerate();

        assertEquals(19,bike.getAutomaticSpeed());
        assertEquals(1,bike.getAutomaticGear());

        for(int move = 1; move < 20; move--)
            bike.decelerate();

        assertEquals(0,bike.getAutomaticSpeed());
        assertEquals(1,bike.getAutomaticGear());

    }
    @Test
    public void testThatBikCanDecelerate_2() {
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int move = 1; move <= 22; move++)
            bike.accelerate();

        assertEquals(24, bike.getAutomaticSpeed());
        assertEquals(2, bike.getAutomaticGear());

        for (int move = 15; move >= 1; move--)
            bike.decelerate();
        System.out.println(bike.getAutomaticSpeed());
        assertEquals(6, bike.getAutomaticSpeed());
        assertEquals(1, bike.getAutomaticGear());

    }
    @Test
    public void testThatBikeCanDecelerate_3(){

    }





    }






