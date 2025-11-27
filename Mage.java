package RPG_Game;

public class Mage extends Character{

    //We use super to use the superclasses constructor
    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attack(Character enemy, int damage) {
        int mageDamage = (int)(damage * 1.50);
        System.out.println("Your character " + name + " cast his strongest spell and dealt " + mageDamage + " points of damage");
        enemy.healthPoints = enemy.healthPoints - mageDamage;
        System.out.println("The enemy health is now " + enemy.healthPoints);
    }

    public void heal() {
        healthPoints = healthPoints + 10;
        System.out.println("You character healed 10 health points, his current hp is now: " + healthPoints);
    }
}
