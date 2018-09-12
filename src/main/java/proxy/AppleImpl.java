package proxy;

public class AppleImpl implements Apple {
    @Override
    public void add() {
        System.out.println("this is add");
    }

    @Override
    public void edit() {
        System.out.println("this is edit");
    }
}
