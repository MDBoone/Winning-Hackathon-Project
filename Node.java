package Hackathon;

public class Node {
    private Node link;
    private Item item;

    Node() {
        link = null;
        item = new Item();
    }

    Node(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node [Next = " + link + ", Text = " + item + "]";
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node next) {
        this.link = next;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
