package streamAndParallelProcessing;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinedListExample {
    /*
    멀티쓰레드: 동시성과 병렬성
    동시성과 병렬성의 공통점: 멀티 스레드의 동작 방식
    동시성: 멀티 작업을 위해 멀티 스레드가 번갈아가며 실행하는 성질을 말함.
    병렬성: 멀티 작업을 위해 멀티 코어를 이용해서 동시에 실행하는 성질을 말한다.
    병렬성 : 데이터 병렬성, 작업 병렬성
    데이터 병렬성: 데이터를 서브 데이터들로 만들고 병렬 처리해서 빠르게 끝내는 것.
    작업 병렬성: 서로 다른 작업을 병렬 처리하는 것을 말한다. 작업 병렬성의 대표적인 예는 웹 서버이다.
     */

    // 요소 처리
    public static void work(int value) {

    }

    // 병렬 처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach((a) -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linedList = new LinkedList<Integer>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linedList.add(i);
        }

        // 워밍업
        long arrayListListParallel = testParallel(arrayList);
        long linkedListListParallel = testParallel(linedList);

        // 병렬 처리 시간 구하기
        arrayListListParallel = testParallel(arrayList);
        linkedListListParallel = testParallel(linedList);

        if (arrayListListParallel < linkedListListParallel) {
            System.out.println("성능 테스트 결과: ArrayList 처리가 더 빠름");
        } else {
            System.out.println("성능 테스트 결과: linkedList 처리가 더 빠름");
        }
    }
}
