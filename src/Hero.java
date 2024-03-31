public class Hero {
    private int heal;
    private int damage;
    private String superAbility;

    public Hero(int heal,int damage,String superAbility) {
        this.heal = heal;
        this.damage = damage;
        this.superAbility = superAbility;


    }

    public Hero(int damage,int heal) {
        this.damage = damage;
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
