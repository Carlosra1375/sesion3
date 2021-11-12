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
    @Override
    public void setUp() {
         _12345 = new Account(50.00);
         _67890 = new Account(0.00);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        Double money = 100.00;
        Account instance = new Account(100.00);
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
        Double money = 100.00;
        Account instance = new Account(100.00);
        assertEquals(200.00, instance.deposit(money));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testTDD14() throws Exception {
        System.out.println("TDD14");
             
        _12345.withdraw(200.00);
        _67890.withdraw(350.00);
        
        _12345.deposit(100.00);
        _67890.withdraw(200.00);
        
        _67890.withdraw(150.00);
        _12345.withdraw(200.00);
        
        _67890.deposit(50.00);
        _67890.withdraw(100.00);
        
        assertEquals(-250.00,_12345.balance);     
        assertEquals(-450.00,_67890.balance);
    }
    
}
