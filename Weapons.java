package Hackathon;

public class Weapons extends Item {
    int attack;

    Weapons(){
        setDescription("");
        setName("");
        setTypeOfItem("");
        setItemIndex(-1);
        attack = -1;
    }

    Weapons(int index, String typeOfItem, String name, String description, int attack){
        setItemIndex(index);
        setTypeOfItem(typeOfItem);
        setName(name);
        setDescription(description);
       setAttack(attack);
    }

    @Override
    public String toString() {
        return "Index: " + getItemIndex() + ", Type Of item: " + getTypeOfItem() + ", Name: " + getName() + ", Description: " + getDescription() + ", Attack: " + getAttack();
    }
}
