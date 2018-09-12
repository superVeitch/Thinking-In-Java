package chapter.fourteen.eleven.typeInfo.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PartCopy {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> partFactories = new ArrayList<Class<? extends Part>>();
    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
    }

    private static Random rand = new Random(47);
    public static Part createRandom() throws IllegalAccessException, InstantiationException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).newInstance();
    }
}
