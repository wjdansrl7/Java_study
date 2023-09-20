package streamAndParallelProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "홍길동", "신용권", "감자바",
                "람다식", "박병렬"
        );

        // 순차처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print); // s -> streamAndParallelProcessing.ParallelExample.print(s)와 동일

        System.out.println();

        // 병렬처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    public static void print(String str) {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
