import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int weeks = sc.nextInt();
        int total = data * (weeks + 1);
        for (int i = 0; i < weeks ; i++) {
            total= total- sc.nextInt();
        }
        System.out.println(total);

    }
}
