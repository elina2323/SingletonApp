package javalessons;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final int SIZE = 500;
        Thread thread[] = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++){
            thread[i] = new Thread(new RunExample());
            thread[i].start();

        }
        for (int i = 0; i < SIZE; i++){
            thread[i].join();
        }
        System.out.println(SingletonExample.counter);
    }
}
