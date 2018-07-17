import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class waittest {
    public static void main(String[] args) {
        waittestObject w = new waittestObject();
        for (int i = 0; i < 4; ++i) {
            System.out.println(i + " 开始调用");
            String message = i+ "";
            new Thread(){
                @Override
                public void run() {
                    w.enter(message);
                }
            }.start();
            System.out.println(i + " 结束调用");
        }
        System.out.println("fin");
//        w.notifyAll();
//        String[] sz = {"1","2","3"};
//        List list = Arrays.asList(sz);
//        list.forEach(x-> System.out.println(x));
        Integer[] sz = {1,2,3};
        List<Integer> list = Arrays.asList(sz);
        List newList = list.stream().filter(x->x != 2).collect(Collectors.toList());
        newList.forEach(x-> System.out.println(x));
    }
}
