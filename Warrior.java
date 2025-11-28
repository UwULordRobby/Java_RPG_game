package Java_RPG_game;

public class Warrior extends Character {
    
    //We use super to use the superclasses constructor
    public Warrior(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attack(Character enemy, int damage) {
        // Creating a variable to store the enemy health
        int enemyHealth = enemy.getHealth();

        // Calculating the damage based on the Character class
        int warriorDamage = (int)(damage * 1.25);
        System.out.println("Your character " + this.name + " swong a big sword and dealt " + warriorDamage + " points of damage");

        // Calculating the new enemy health and storing it in the variable
        enemyHealth = enemyHealth - warriorDamage;
        System.out.println("The enemy health is now " + enemyHealth);
        enemy.setHealth(enemyHealth);
    }

}
