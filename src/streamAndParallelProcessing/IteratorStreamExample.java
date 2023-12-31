package streamAndParallelProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바");

        //Iterator 사용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("name = " + name);
        }

        System.out.println();

        // Stream 이용
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println("name = " + name));
    }
}
