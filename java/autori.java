import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String answer = string.replaceAll("[a-z]|-", "");
        System.out.println(answer);
    }

}
