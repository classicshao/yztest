import java.io.BufferedInputStream;
import java.util.Scanner;

public class waittestObject {

    Object object = new Object();
    private  static int number = 4;
    private static  int count = 0;
    void enter(String message) {
        System.out.println(message + " enter");
        if("3".equals(message)){
//            synchronized(object) {
//
//                object.notifyAll();
//
//            }
        }
        synchronized (object) {
            try {
                System.out.println(message + " enter synchronized");
                object.wait();
                System.out.println(message + " enter end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
