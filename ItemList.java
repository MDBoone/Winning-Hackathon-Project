package Hackathon;

public class ItemList implements LinkedList{
    private Node head;
    private Node tail;

    ItemList() {
        head = null;
        tail = null;
    }

    ItemList(Item item) {
        head = new Node(item);
        tail = new Node(item);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public void addItem(Item item) {
        Node newNode = new Node(item);
        tail = head;
        if (head == null) {
            head = newNode;
        } else {
            while (tail.getLink() != null) {
                tail = tail.getLink();
            }
            tail.setLink(newNode);
        }
    }

    @Override
    public void printLinkedList() {
        Node newNode;
        newNode = this.getHead();
        while (newNode != null) {
            System.out.println(newNode.getItem());
            newNode = newNode.getLink();
        }

    }
    @Override			// Prints The Name Of Cards
    public void displayInventory() {
        int index = 0;
        Node newNode;
        newNode = this.getHead();
        while (newNode != null) {
            index++;
            System.out.print("(" + index  + ") " +  newNode.getItem().getName() + " ");
            newNode = newNode.getLink();
        }
        System.out.print("\n");
    }

    @Override 			// Removes Card From One List And Adds To Another
    public void removeItem(int cardIndex) {
        Node current = head;

        if (cardIndex == 1) {
            head = current.getLink();
            current.setLink(null);
            return;
        }

        for (int i = 0; i < cardIndex - 2; i++) {
            current = current.getLink();
        }

        Node next = current.getLink().getLink();
        current.setLink(next);
    }
    @Override
    public int getProtectionPoints() {
        int protectionPoints = 0;
        Node newNode;
        newNode = this.getHead();
        while (newNode != null) {
            protectionPoints = protectionPoints + newNode.getItem().getProtection();
            newNode = newNode.getLink();
        }
        return protectionPoints;
    }

    @Override
    public int getAttackPoints() {
        int attackPoints = 0;
        Node newNode;
        newNode = this.getHead();
        while (newNode != null) {
            attackPoints = attackPoints + newNode.getItem().getAttack();
            newNode = newNode.getLink();
        }
        return attackPoints;
    }

    @Override
    public int getNumOfItems() {
        int numOfItems = 0;
        Node newNode;
        newNode = this.getHead();
        while (newNode != null) {
            numOfItems++;
            newNode = newNode.getLink();
        }
        return numOfItems;
    }
    @Override
    public int findGameInventoryIndex(String nameOfItem, Item[] gameInventory){
        int index = -1;
        for (int i = 0; i < gameInventory.length; i++) {
            if (nameOfItem.toLowerCase().equalsIgnoreCase(gameInventory[i].getName())) {
                index = gameInventory[i].getItemIndex();
                return index-1;
            }

        }
        return index;

     }
    }




