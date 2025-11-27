package RPG_Game;

public class Main {
    public static void main(String[] args) {
        Warrior Leroy = new Warrior("Leroy", 100);
        Mage Rudeus = new Mage("Rudeus", 100);

        System.out.println("OUR FIGHTERS ARE HERE!!! \nEVERYBODY MAKE SOME NOISE FOR OUR WARRIOR " + Leroy.name + " AND OUR MAGNIFICENT MAGE " + Rudeus.name);
        System.out.println("THE WARRIOR STARTS THE FIGHT WITH A BIG HIT!");
        Leroy.attack(Rudeus, 50);
        Rudeus.heal();
        System.out.println("THE MAGE TAKES THE HIT BUT CASTS HEAL RIGHT AWAY! AMAZING SHOW OF SKILL BY BOTH OUR FIGHTERS");
        Rudeus.attack(Leroy,100);
        System.out.println("AND THE MAGE TAKES THE WIN WITH A BEAUTIFUL COUNTER HIT THAT PUT THE WARRIOR ON THE GROUND, WHAT A BEAUTIFUL FIGHT");
    }
}
