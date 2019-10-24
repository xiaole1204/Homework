//n的乘階
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long h = scn.nextLong();
        long a = 1l;
        for (long i = 1 ; i <= h;i++){
            a *= i ;
        }
        System.out.printf("%d\n",a);
    }
}
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n =scn.nextInt();
//
//    }
//}