package Java_RPG_game;

public class Mage extends Character{

    //We use super to use the superclasses constructor
    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attack(Character enemy, int damage) {
        // Creating a variable to store the enemy health
        int enemyHealth = enemy.getHealth();

        // Calculating the damage based on the Character class
        int mageDamage = (int)(damage * 1.50);
        System.out.println("Your character " + this.name + " cast a powerful spell and dealt " + mageDamage + " points of damage");

        // Calculating the new enemy health and storing it in the variable
        enemyHealth = enemyHealth - mageDamage;
        System.out.println("The enemy health is now " + enemyHealth);
        enemy.setHealth(enemyHealth);
    }

    public void heal() {
        int currentHealth = this.getHealth();
        int newHp = currentHealth + 10;
        System.out.println("You character healed 10 health points, his current hp is now: " + newHp);
        setHealth(newHp);
    }
}
