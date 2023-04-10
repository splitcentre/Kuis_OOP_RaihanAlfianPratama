public class pocong extends enemy {
    public pocong(String name, int attackdamage, int hp) {
        super(name, attackdamage, hp);
    }
    public void jump(){

    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public int getAttackdamage() {
        return super.getAttackdamage();
    }

    @Override
    public String toString() {
        return "pocong{" +
                "name='" + name + '\'' +
                ", attackdamage=" + attackdamage +
                ", hp=" + hp +
                '}';
    }
}
