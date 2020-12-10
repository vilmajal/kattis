import java.util.Scanner;

public class oddities {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i< n+1; i++) {
            int x = sc.nextInt();
            if(x% 2==0){
                System.out.println(x + " is even");
            }
            else{
                System.out.println(x + " is odd");
            }
        }
     }
 }
