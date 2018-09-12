package chapter.fourteen.eleven.typeInfo.factory;

public class RegisteredFactories {
//    public static void main(String[] args) {
//        for (int i = 0; i< 2; i++) {
//            System.out.println(Part.createRandom());
//        }
//    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        for(int i = 0; i < 10; i++)
            System.out.println(PartCopy.createRandom());
    }
}
