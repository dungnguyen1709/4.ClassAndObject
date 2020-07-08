package xay_dung_lop_StopWatch;

import java.util.Arrays;

public class Time {
    public static void main(String[] args) {
        double starTime = System.currentTimeMillis();

        StopWatch stopWatch = new StopWatch(starTime);

        stopWatch.setStarTime();

        Time.setArray(100000);

        stopWatch.setStarTime();

        System.out.println(stopWatch.getElapsedTime());
    }

    public static void setArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        Arrays.sort(array);
    }
}
