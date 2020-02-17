package jtm.activity11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineVerify {

    VendingMachine vendingMachine;

    @Before
    public void setUp() {
        vendingMachine = new VendingMachine();
    }

    @Test
    public void verify() {

        double initial = 10.0;
        double coke = 0.49;
        double snickers = 0.69;
        double orange = 0.15;
        double banana = 0.55;

        vendingMachine.addProducts("coke", coke);
        vendingMachine.addProducts("snickers", snickers);
        vendingMachine.addProducts("banana", banana);
        vendingMachine.addProducts("orange", orange);

        vendingMachine.depositCoins(initial);

        assertEquals("coke", vendingMachine.chooseProduct("coke").toLowerCase());
        assertEquals("snickers", vendingMachine.chooseProduct("snickers").toLowerCase());
        assertEquals("banana", vendingMachine.chooseProduct("banana").toLowerCase());
        assertEquals("orange", vendingMachine.chooseProduct("orange").toLowerCase());

        double expBalance = initial - coke - snickers - orange - banana;

        assertEquals(expBalance + "$", vendingMachine.balance());
        assertEquals(initial - coke - snickers - banana - orange, vendingMachine.ejectCoinsBack(), 0.2);

        assertEquals("balance not enough", vendingMachine.chooseProduct("coke").toLowerCase());

        vendingMachine.depositCoins(1.00);
        assertEquals("1.00$", vendingMachine.balance());

        assertEquals(1.00, vendingMachine.ejectCoinsBack(), 0.001);

        vendingMachine.addProducts("BTC", 10359.50);

        assertEquals("balance not enough", vendingMachine.chooseProduct("BTC").toLowerCase());

        vendingMachine.depositCoins(11000.0);

        assertEquals("btc", vendingMachine.chooseProduct("btc").toLowerCase());

        assertEquals(640.50, vendingMachine.ejectCoinsBack(), 0.5);

    }
}
