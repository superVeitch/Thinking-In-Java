package stream;

import java.util.stream.Stream;

public class IterateStream {

    // 斐波纳契数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...数列中开始的两个数字是0和1，后续的每个数字都是前两个数字之和。
    public static void iterate(){
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
    }

    public static void main(String[] args) {
        iterate();
    }
}
