import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if (A*-1<0 && B*-1<0){
            System.out.println(1);
        }else if (A*-1>0 && B*-1<0){
            System.out.println(2);
        }else if(A*-1>0 && B*-1>0){
            System.out.println(3);
        }else if(A*-1<0 && B*-1>0){
            System.out.println(4);
        }
    }
}
