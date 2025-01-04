package StateImplementation;

import Implementation.Coin;
import Implementation.Item;
import Implementation.VendingMachine;

import java.util.List;

public class DispenseState implements State{

    public DispenseState(VendingMachine machine,int codeNumber){
        System.out.println("Currently Vending Machine is in Dispense State");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You can't Insert coin in dispense mode");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("You can't Select Product in dispense mode");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can't Insert coin in dispense mode");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber)throws Exception {
        throw new Exception("You can't choose product in dispense mode");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can't get change in dispense mode");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber)throws Exception {
        System.out.println("Item is dispensed");
        Item item=machine.getInventory().getItem(codeNumber);
        machine.getInventory().getItem(codeNumber);
        machine.setVendingMachineState(new IdleState());
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine)throws Exception {
        throw new Exception("Refund Can't happen in dispense mode in dispense mode");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
