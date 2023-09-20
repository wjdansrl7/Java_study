package streamAndParallelProcessing;

import java.util.Arrays;

public class MatchExample {
    public static void main(String[] args) {
        /*
        allMatch(): 모든 요소들이 주어진 Predicate의 조건을 만족하는가?
        anyMatch(): 최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는가?
        noneMatch(): 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지
         */
        int[] intArr = {1, 2, 3, 4, 5};

        boolean result = Arrays.stream(intArr)
                .allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수인가? " + result);

        result = Arrays.stream(intArr)
                .anyMatch(a -> a % 3 == 0);
        System.out.println("하나라도 3의 배수인가? " + result);

        result = Arrays.stream(intArr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없는가? " + result);


    }
}
