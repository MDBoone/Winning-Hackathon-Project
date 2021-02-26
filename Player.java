package Hackathon;

public class Player {
    int armorProtectionPoints;
    int weaponAttackPoints;
    String name;
    ItemList inventory;

    Player(){
        name = "";
        armorProtectionPoints = -1;
        weaponAttackPoints = -1;
        inventory = new ItemList();
    }

    Player(String name){
        this.name = name;
        armorProtectionPoints = -1;
        weaponAttackPoints = -1;
        inventory = new ItemList();
    }

    public int getArmorProtectionPoints() {
        armorProtectionPoints = inventory.getProtectionPoints();
        return armorProtectionPoints;
    }

    public int getWeaponAttackPoints(){
        weaponAttackPoints = inventory.getAttackPoints();
        return weaponAttackPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

