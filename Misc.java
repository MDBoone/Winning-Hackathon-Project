package Hackathon;

public class Misc extends Item {

    Misc(){
       setDescription("");
       setName("");
       setTypeOfItem("");
       setItemIndex(-1);

    }
    Misc(int index, String typeOfItem, String name, String description){
        setItemIndex(index);
        setTypeOfItem(typeOfItem);
        setDescription(description);
        setName(name);
    }

    @Override
    public String toString() {
        return "Index: " + getItemIndex() + ", Type Of item: " + getTypeOfItem() + ", Name: " + getName() + ", Description: " + getDescription();
    }
}
