public class burung extends enemy{
    public burung(String name, int attackdamage, int hp) {
        super(name, attackdamage, hp);
    }
    public void fly(){

    }
    public void walk(){

    }

    @Override
    public int getAttackdamage() {
        return super.getAttackdamage();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public String toString() {
        return "burung{" +
                "name='" + name + '\'' +
                ", attackdamage=" + attackdamage +
                ", hp=" + hp +
                '}';
    }
}
