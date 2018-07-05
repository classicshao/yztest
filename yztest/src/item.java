import java.io.BufferedInputStream;
import java.util.Scanner;

public class item {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            System.out.println(a);
        }
    }
}
