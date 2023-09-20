package streamAndParallelProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        /*
        Optional 클래스 : 값을 저장하는 값 기반 클래스, 단순히 집계값만 저장하는 것이 아니라, 집계 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있음
        집계값을 처리하는 Consumer 클래스도 등록 가능
         */

        List<Integer> list = new ArrayList<>();

        /*예외 발생(java.util.NoSuchElementException)
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

         */

        // 방법1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("optional.getAsDouble() = " + optional.getAsDouble());
        } else {
            System.out.println("optional = " + 0);
        }

        //방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("avg = " + avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("a = " + a));
    }
}
