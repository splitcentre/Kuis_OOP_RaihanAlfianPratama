public class Main {
    public static void main(String[] args) {
        zombie z=new zombie("bigboy",90,200);
        pocong p=new pocong("jefri",10,10);
        burung b=new burung("rusdi",20,30);
        z.walk();
        p.jump();
        b.fly();
        b.walk();
        System.out.println(z.toString());
        System.out.println(p.toString());
        System.out.println(b.toString());

    }
}