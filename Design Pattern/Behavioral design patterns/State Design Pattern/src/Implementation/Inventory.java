package Implementation;

public class Inventory {
    ItemShelf[] inventory = null;
    public Inventory(int count){
        inventory = new ItemShelf[count];
        initialInventory();
    }
    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initialInventory() {
        int startCode = 100;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf item = new ItemShelf();
            item.setCode(startCode++);
            item.setSoldOut(true);
            inventory[i] = item;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for (ItemShelf items : inventory) {
            if (items.getCode() == codeNumber) {
                if (items.isSoldOut()) {
                    items.setSoldOut(false);
                    items.item = item;
                } else {
                    throw new Exception("Item is already present at this Self");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for (ItemShelf items : inventory) {
            if (items.getCode() == codeNumber) {
                if (items.isSoldOut()) {
                    throw new Exception("No item present at this Self");
                } else {
                    return items.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }


    public void updateSoldItem(int codeNumber) throws Exception {
        for (ItemShelf items : inventory) {
            if (items.getCode() == codeNumber) {
                items.setSoldOut(true);
            }
        }
    }

}
