package javalessons;

public class RunExample implements Runnable{
    @Override
    public void run() {
        SingletonExample.getInstance();
    }
}
