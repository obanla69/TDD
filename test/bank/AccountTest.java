package bank;

import account.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    public void setUp(){
        account = new Account();
    }

      @Test
    public void testOnDeposit(){
//          Account account = new Account();
//          account.deposit(1_000);
//          assertEquals(1_000,account.getBalance());
      }

      @Test
      public void testOnDoubleDeposit(){

//          Account account = new Account();
         account.deposit(1_000);
          assertEquals(1_000, account.getBalance());
          account.deposit(1_000);
          assertEquals(2_000,account.getBalance());
      }

      @Test
    public void testCannotDepositNegativeNumber(){
//          Account account = new Account();
           account.deposit(-1_000);
          assertEquals(0, account.getBalance());
      }
    @Test
    public void testOnWithdraw(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());

        account.withdraw(1_000);


    }

    @Test
    public void testDoubleWithdraw(){
        account.deposit(5_000);
        assertEquals(5_000,account.getBalance());

        account.withdraw(1_000);
        assertEquals(4_000,account.getBalance());
        account.withdraw(2_000);
        assertEquals(2_000, account.getBalance());

    }

    @Test
    public void testCannotWithdrawNegativeAmount(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());

        account.withdraw(-1_000);
        assertEquals(2_000, account.getBalance());

    }
        @Test
    public void testThatCannotBeGreaterThanTheBalance(){
        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

        account.withdraw(6_000);
        assertEquals(5_000,account.getBalance());

        }





}
