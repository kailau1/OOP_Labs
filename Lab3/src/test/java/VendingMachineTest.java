import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    private VendingMachine machine;

    @BeforeEach
    void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0, machine.getBalance());
    }

    @Test
    public void testInitialRevenue() {
        assertEquals(0,machine.getRevenue());
    }

    @Test
    public void testInsertCoins() {
        machine.insertCoin();
        assertEquals(1, machine.getBalance(), 0);
    }
    @Test
    public void testRefund() {
        machine.refund();
        assertEquals(0, machine.getBalance(), 0);
    }
    @Test
    public void testVendFailure() {
        assertEquals(false, machine.vendCandyBar());
    }
    @Test
    public void testVendSuccess() {
        machine.insertCoin();
        machine.insertCoin();
        machine.insertCoin();
        assertEquals(true, machine.vendCandyBar());

    }
}
