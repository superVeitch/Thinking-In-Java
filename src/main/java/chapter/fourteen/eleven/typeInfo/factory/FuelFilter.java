package chapter.fourteen.eleven.typeInfo.factory;


public class FuelFilter extends Filter {

    public static class Factory implements chapter.fourteen.eleven.typeInfo.factory.Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
