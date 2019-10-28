//n的乘階
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        long h = scn.nextLong();
//        long a = 1l;
//        for (long i = 1 ; i <= h;i++){
//            a *= i ;
//        }
//        System.out.printf("%d\n",a);
//    }
//}
//1/[(2n-1)*(2n)]總和
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum = 0;
        for (int i = 1;i <=n; i++) {
            sum = sum + 1.0 /((2*i-1)*2*i);
        }
        System.out.println(sum);
    }
}
//正因數
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for (int i=1;i<=n;i++) {
//            if (n%i==0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//實心正方形
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        char c = scn.next().charAt(0);
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print(c);
//            }
//            System.out.println();
//        }
//    }
//}
//計算2n總和
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int sum = 0;
//        for (int i = 1;i<=n;i++) {
//            sum = sum +(int)Math.pow(2,i);
//        }
//        System.out.println(sum);
//    }
//}