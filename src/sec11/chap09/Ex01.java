package sec11.chap09;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    //    - 요소는 10,000개 존재하지만, `size` 필드값을 올리는 과정에서 문제
//    - 둘 이상의 쓰레드가 동시에 올려버리므로
//    - **Thread-safe** 하지 않음
    public static void main(String[] args) {
        //  3개의 쓰레드에서 한 해시맵에 10000개의 데이터를 주입
        Map<String, Integer> hashMap = new HashMap<>();

        Runnable toHashMap = () -> {
            for (int i = 0; i < 10000; i++) {
                hashMap.put("key" + i, i);
            }
        };

        Thread t1 = new Thread(toHashMap);
        Thread t2 = new Thread(toHashMap);
        Thread t3 = new Thread(toHashMap);

        t1.start(); t2.start(); t3.start();

        try {
            t1.join(); t2.join(); t3.join();
        } catch (InterruptedException e) {}
    }
}
