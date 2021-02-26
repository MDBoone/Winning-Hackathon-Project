package Hackathon;

public class Armor extends Item {
    int protection;

    Armor(){
        setDescription("");
        setName("");
        setItemIndex(-1);
        setTypeOfItem("");
        setProtection(0);
    }

    Armor(int index, String typeOfItem, String name, String description, int protection){
        setItemIndex(index);
        setTypeOfItem(typeOfItem);
        setName(name);
        setDescription(description);
        setProtection(protection);
    }

    @Override
    public String toString() {
        return "Index: " + getItemIndex() + ", Type Of item: " + getTypeOfItem() + ", Name: " + getName() + ", Description: " + getDescription() + ", Protection Number: " + getProtection();
    }
}
