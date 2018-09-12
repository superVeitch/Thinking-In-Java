import proxy.HiddenClass;
import proxy.HiddenImplementation;

public class HiddenCallDemo {
    public static void main(String[] args) throws Exception{
        HiddenClass h = new HiddenClass();
        HiddenImplementation.callHiddenMedthod(h, "f");
        HiddenImplementation.callHiddenMedthod(h, "o");
    }
}
