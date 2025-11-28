package Java_RPG_game;

// Abstract, we cant create a new Character but only a specific type of one
abstract public class Character {
    
    // Fields ( The healthPoints are protected since it can be changed for each character )
    public String name;
    private int healthPoints;

    // Constructor
    public Character(String name, int hp) {
        this.name = name;
        this.healthPoints = hp;
    }

    // PUBLIC GETTER: anyone can see the health
    public int getHealth() {
        return this.healthPoints;
    }

    // PROTECTED SETTER: modifiable by the subclasses
    // If it were public anyone could reset their health
    protected void setHealth(int hp) {
        this.healthPoints = hp;
    }

    // ABSTRACT METHOD: the child classes have to define their own attack
    // The Character class shouldnt attack, so no body on the method
    public abstract void attack(Character enemy, int damage);
        
}
