package television;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    @Test
    public void testToTheTelevision_toCheckMayBeIsOn() {
        Television television = new Television();
        television.setOn();
        assertTrue(television.isOn());
    }

    @Test
    public void testToTheTelevision_toCheckMayBeIsOff() {
        Television television = new Television();
        television.setOff();
        assertFalse(television.isOn());
    }

    @Test
    public void testToCheckOnBrand() {
        Television television = new Television();
        television.setBrand("CHINKO");
        assertEquals("CHINKO", television.getBrand());
    }

    @Test
    public void testToIncreaseVolume() {
        Television television = new Television();
        television.setVolume(3);
        assertEquals(3, television.getVolume());
    }

    @Test
    public void testOnSetProgram() {
        Television television = new Television();
        television.setProgram(32);
        assertEquals(32,television.getProgram());
    }

    @Test
     public void testToIncreaseBeyond120_increase_120() {
        Television television = new Television();
        television.setOn();
        for(int count = 0; count < 120; count++){
            television.increaseTelevision();
        }
        assertEquals(100,television.getProgram());
    }
    @Test
    public void testToDecreaseBeyondTo0_decrease_0(){
        Television television = new Television();
        television.setOn();
        for(int count = 0; count < 120; count ++ ){
            television.decreaseTelevision();
        }
        assertEquals(0,television.getProgram());

    }

}

