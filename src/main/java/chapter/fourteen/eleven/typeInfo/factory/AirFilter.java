package chapter.fourteen.eleven.typeInfo.factory;

public class AirFilter extends Filter {
    public static class Factory implements chapter.fourteen.eleven.typeInfo.factory.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
