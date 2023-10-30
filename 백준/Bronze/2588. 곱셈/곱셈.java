import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        sc.close();
        int a = B.charAt(0) - '0';
        int b = B.charAt(1) - '0';
        int c = B.charAt(2) - '0';

        System.out.println(A * c );
        System.out.println(A * b );
        System.out.println(A * a );
        System.out.println(A * Integer.parseInt(B));
    }
}