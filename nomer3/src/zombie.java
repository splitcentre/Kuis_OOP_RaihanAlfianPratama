public class zombie extends enemy {
    public zombie(String name, int attackdamage, int hp) {
        super(name, attackdamage, hp);
    }

    public void walk(){
        super.attack();
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
        return "zombie{" +
                "name='" + name + '\'' +
                ", attackdamage=" + attackdamage +
                ", hp=" + hp +
                '}';
    }
}

