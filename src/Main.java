import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(25);
        boss.setHeal(32);
        boss.setDefence("Magical");
        System.out.println("Boss defence: " + boss.getDefence() + " Boss damage: " +  boss.getDamage() + " Boss health: " + boss.getHeal());
        Hero[] hero = createHero();
        for (int i = 0; i < createHero().length; i++) {
            System.out.println("Health: " + hero[i].getHeal());
            System.out.println("Damage: " + hero[i].getDamage());
            System.out.println("Super Power: " + hero[i].getSuperAbility());
        }
    }

    public static Hero[] createHero(){
        Hero hero1 = new Hero(12, 70);
        Hero hero2 = new Hero(12, 78, "Jump");
        Hero hero3 = new Hero(22, 60);
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}