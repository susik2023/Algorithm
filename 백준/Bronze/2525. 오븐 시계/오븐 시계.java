import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int x = A * 60 +B;
        int y = x+C;

        int H = (y/60)%24;
        int M = y%60;

        System.out.println(H + " " + M );
    }
}
