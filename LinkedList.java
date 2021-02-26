package Hackathon;

public interface LinkedList {
    public void printLinkedList();
    public void addItem(Item item);
    public void removeItem(int index);
    public void displayInventory();
    public int getProtectionPoints();
    public int getAttackPoints();
    public int getNumOfItems();
    public int findGameInventoryIndex(String nameOfItem, Item[] gameInventory);
}
