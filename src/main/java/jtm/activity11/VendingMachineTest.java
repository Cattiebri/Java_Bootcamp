package jtm.activity11;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine machine;

    @Before
    public void setUp() {
        // TODO initialize Vending Machine object
        machine = new VendingMachine();
    }

    @Test
    public void testInitialBalance(){
        String result = machine.balance();
        assertEquals("Balance expected to be 0.00$","0.00$", result) ;
    }

    @Test
    public void testDepositAndBalance(){
        machine.depositCoins(7.63);
        String result = machine.balance();
        assertEquals("Balance expected to be 7.63$","7.63$", result) ;

    }

    @Test
    public void testEjectCoinsBack(){
       double result = machine.ejectCoinsBack();
       assertEquals(0.00, result,0.01);
    }

    @Test
    public void testProductNotEnoughBalance(){
        machine.addProducts("snicker", 0.75);
        String result = machine.chooseProduct("snicker");
        assertEquals("Balance not enough", result);
    }

    @Test
    public void testNonExistantProduct() {
        machine.addProducts("snicker", 0.75);
        machine.depositCoins(1000.00);
        String result = machine.chooseProduct("twix");
        assertEquals("Product not found", result);
    }

    @Test
    public void testNonCaseSensitive() {
        machine.addProducts("snicker", 0.75);
        machine.depositCoins(1.00);
        String result = machine.chooseProduct("SNICKER");
        assertEquals("snicker", result);
    }

    @Test
    public void testMoneyNotReduced(){
        machine.addProducts("snicker", 0.75);
        machine.depositCoins(1.00);
        machine.chooseProduct("snicker");
        double result = machine.ejectCoinsBack();

        assertEquals(0.25,result,0.01);
    }

    @Test
    public void testMultipleProductsToBuy(){
        machine.addProducts("snicker", 0.75);
        machine.addProducts("twix", 0.65);
        machine.depositCoins(4.00);
        machine.chooseProduct("snicker");
        machine.chooseProduct("twix");
       double result = machine.ejectCoinsBack();

       assertEquals(2.6,result,0.01);
    }

    @Test
    public void testEjectMoney(){
        machine.depositCoins(1.00);
        double result = machine.ejectCoinsBack();

        assertEquals(1.00,result,0.01);
    }
}
