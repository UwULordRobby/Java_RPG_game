package RPG_Game;

public class Warrior extends Character {
    
    //We use super to use the superclasses constructor
    public Warrior(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attack(Character enemy, int damage) {
        int warriorDamage = (int)(damage * 1.25);
        System.out.println("Your character " + name + " swong a big sword and dealt " + warriorDamage + " points of damage");
        enemy.healthPoints = enemy.healthPoints - warriorDamage;
        System.out.println("The enemy health is now " + enemy.healthPoints);
    }

}
