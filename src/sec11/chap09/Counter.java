package sec11.chap09;

import java.util.HashMap;
import java.util.Map;


public class Counter {
    private int count = 0;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void increase() {
        count++;
    }
}