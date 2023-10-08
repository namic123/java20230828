package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        OptionalInt oi = IntStream.of(3,1,5,6,9,7,8,10).max();
        OptionalInt oi2 = IntStream.of(3,1,5,6,9,7,8,10).min();
        OptionalDouble od3 = IntStream.of(3,1,5,6,9,7,8,10).average();

        System.out.println("oi = " + oi.orElse(0));
        System.out.println("oi = " + oi2.orElse(0));
        System.out.println("oi = " + od3.orElse(0));

    }
}
