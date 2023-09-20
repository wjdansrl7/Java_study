package streamAndParallelProcessing;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수의 개수" + count);

        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sum = " + sum);

        double avg = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        int max = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();

        System.out.println("max = " + max);

        int min = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();

        System.out.println("min = " + min);

        int first = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("first = " + first);

    }
}
