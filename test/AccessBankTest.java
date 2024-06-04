import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccessBankTest {
    AccessBank accessBank = new AccessBank("Kingdavies",2323,0_0);
    @Test
    public void testName(){
        AccessBank accessBank = new AccessBank("Kingdavies",2323,0_0);
        AccessBank addcontact;
        accessBank.addContact("oba",2323, 5_000);
        accessBank.addContact("oba");
        assertEquals("Kingdavies",accessBank.getName());


    }


}