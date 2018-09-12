package chapter.seven.exercise.sixteen;

public class Frog extends Amphibian{

    public void print(String f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.am(frog);
        frog.print(12);
        System.out.println();
        frog.print("ww");
        System.out.println(3);
    }
}
