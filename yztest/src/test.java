import java.util.Scanner;

public class test {
    public static void main(String arg[]) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        thread.start();
        new Thread(new RRunnable()).start();
    }
}


class RRunnable implements Runnable {
            @Override
    public void run() {
        System.out.println("2");
    }
}