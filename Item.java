package Hackathon;

public class Item {
    private String description;
    private String name;
    private String typeOfItem;
    int itemIndex;
    int protection;
    int attack;

    Item() {
        description = "";
        name = "";
        typeOfItem = "";
        itemIndex = -1;
        protection = 0;
        attack = 0;
    }

    Item(int index, String typeOfItem, String name, String description){
        itemIndex = index;
        this.typeOfItem = typeOfItem;
        this.name = name;
        this.description = description;
        protection = 0;
        attack = 0;
    }

    public int getItemIndex(){
        return itemIndex;
    }

    public void setItemIndex(int itemIndex) {
        this.itemIndex = itemIndex;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfItem(){
        return typeOfItem;
    }

    public void setTypeOfItem(String typeOfItem) {
        this.typeOfItem = typeOfItem;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "Index: " + getItemIndex() + " Type Of item: " + getTypeOfItem() + "Name: " + getName() + "Desciption: " + getDescription();
    }
}
