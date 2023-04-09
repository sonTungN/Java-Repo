package Week3;

import java.util.Date;

public class Ex2 {
    /*
        Design a class named StopWatch. The class contains:
    • Private attributes startTime and endTime with get methods.
    • A no-arg constructor that initializes startTime with the current time.
    • A method start() that resets the startTime to the current time.
    • A method stop() that resets the endTime to the current time.
    • A method getElapsedTime() that returns the elapsed time for the stopwatch in
    milliseconds.
    - Draw a class diagram for this class and then implement the class.
    - Write a test program that measures the execution time of sorting
    100,000 numbers using selection sort.
         */
    public static void main(String[] args) {
        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10001);
        }
        StopWatch sw = new StopWatch();
        selectionSort2(list);
        sw.end();
        System.out.println("The sorting takes: " + sw.getElapsedTime() + " Milliseconds");
    }

    public static void selectionSort1(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public static void selectionSort2(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
