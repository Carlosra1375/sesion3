/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bankaccount;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlo
 */
public class AccountTest extends TestCase{
    Account _12345;
    Account _67890;
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         _12345 = new Account(50);
         _67890 = new Account(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double money = 100;
        Account instance = new Account(100);
        assertEquals(true, instance.withdraw(money));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double money = 100;
        Account instance = new Account(100);
        assertEquals(200, instance.deposit(money));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testTDD14() {
        System.out.println("TDD14");
             
        _12345.withdraw(200);
        _67890.withdraw(350);
        
        _12345.deposit(100);
        _67890.withdraw(200);
        
        _67890.withdraw(150);
        _12345.withdraw(200);
        
        _67890.deposit(50);
        _67890.withdraw(100);
        
        assertEquals(-250,_12345.balance);     
        assertEquals(-500,_67890.balance);
    }
    
}
