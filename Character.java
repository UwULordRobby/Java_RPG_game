package RPG_Game;


public class Character {
    
    // Fields ( The healthPoints are protected since it can be changed for each character )
    public String name;
    protected int healthPoints;

    // Constructor
    public Character(String name, int hp) {
        this.name = name;
        this.healthPoints = hp;
    }

    public void attack(Character enemy, int damage) {
        System.out.println("Your character has attacked the enemy and dealt " + damage + " points of damage!");
    }
}
