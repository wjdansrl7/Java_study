package streamAndParallelProcessing;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    // reduce(): 집계 결과물을 만들 수 있고, 스트림에 요소가 없을 경우 디폴트 값인 identity 매개값이 리턴된다.
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce((a, b) -> a + b)
                .get();

        int sum3 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);


    }
}
