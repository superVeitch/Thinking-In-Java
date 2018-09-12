package chapter.Eight.exercise.two;


import java.util.UUID;



public class Circle extends Shap {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle rease");
    }

    public static void main(String[] args) {
//        Shap shap = new Shap();
//        shap.draw();
//        System.out.println(ThreadLocalRandom.current().nextInt(100));
        UUID i = UUID.randomUUID();
        System.out.println(i);
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
    }
}
