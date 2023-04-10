public class enemy {
    public String name;
    public int attackdamage=0;
    public int hp = 0;



    public enemy(String name, int attackdamage, int hp) {
        this.name = name;
        this.attackdamage = attackdamage;
        this.hp = hp;
    }
    public void attack(){
        this.hp= attackdamage-hp;
    }
    public int getHp() {
        return hp;
    }

    public int getAttackdamage() {
        return attackdamage;
    }

    @Override
    public String toString() {
        return "enemy{" +
                "name='" + name + '\'' +
                ", attackdamage=" + attackdamage +
                ", hp=" + hp +
                '}';
    }
}
