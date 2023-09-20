package streamAndParallelProcessing;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        /*
        루핑(Looping)은 요소 전체를 반복 -> 중간 처리
        forEach() -> 최종 처리
        중간 처리는 최종 처리가 없을 시 지연 로딩이기 때문에 실행이 되지 않는다.
        그리고 최종 처리 메소드는 딱 1개만 넣을 수 있다.
        최종 처리와 중간 처리의 구별은 반환 타입이다.
        최종 처리는 기본 타입이거나 OptionalXXX
        중간 처리는 Stream 타입
         */

        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println("peek()를 마지막에 호출한 경우");
//        Arrays.stream(intArr)
//                .filter(a -> a % 2 == 0)
//                .peek(n -> System.out.println(n)); //  동작하지 않음

        System.out.println("최종 처리 메소드를 마지막에 호출한 경우");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("total = " + total);

        System.out.println("forEach()를 마지막에 호출한 경우");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);


    }
}
