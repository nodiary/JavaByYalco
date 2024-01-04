package sec11.chap06.ex02;

import java.util.concurrent.*;
import java.util.*;
import java.util.stream.IntStream;

public class TryFuture {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);

        List<Future<Integer>> futureList = new ArrayList<>();
        IntStream.range(0,10)
                .forEach(i -> {
                    futureList.add(
                            es.submit(new RollDiceCall())
                    );
                });
        es.shutdown();  // 💡 제거하면 프로그램이 끝나지 않음

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(Future<Integer> future : futureList) {
            try {
                integerArrayList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {}
        }

        System.out.println(String.join(
                ",",
                integerArrayList.stream().map(String::valueOf).toArray(String[]::new)
        ));
    }
}
