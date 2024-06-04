package airConditioner;

import AirCondtioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {


    @Test
    public void testOnTheAcToCheckMayBeIsOn() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

    }

    @Test
    public void testOnAcToCheckThatIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void testToIncreaseTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
        airConditioner.increaseAc();
        assertEquals(17, airConditioner.getTemperature());
    }
    @Test
    public void testToDecreaseTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
        airConditioner.increaseAc();
        airConditioner.increaseAc();
        assertEquals(18, airConditioner.getTemperature());
        airConditioner.decreaseAc();
        airConditioner.decreaseAc();
        assertEquals(16, airConditioner.getTemperature());
    }


    @Test
    public void testToIncreaseTemperatureBeyond_30__temperature_30() {

        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        for (int count = 0; count < 20; count++) {
               airConditioner.increaseAc();
        }
        assertEquals(30, airConditioner.getTemperature());
    }
        @Test
    public void testToDecreaseTemperatureBeyond_16_temperature_16(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
            for (int count = 0; count < 20; count++) {
                airConditioner.increaseAc();
            }
            assertEquals(30,airConditioner.getTemperature());
        for(int count = 0; count < 20; count++){
            airConditioner.decreaseAc();
        }

       assertEquals(16,airConditioner.getTemperature());
        }
}