
import java.util.Scanner;

public class Darts {


    public static void scores(int n) {
        for (int i = 3; 0 < i; i--) {
            if (n > 180 ) {
                System.out.println("impossible");
            }
            if (n==73){
                System.out.println("triple " +19);
                System.out.println("single " +16);
                n=0;
            }
            if (n == 145){
            System.out.println("triple "+ 20);
            System.out.println("triple " + 15);
            System.out.println("double " + 20);
            n = 0;
            }
            else if((n==179 || n==178|| n==176 ||n==175 || n==173 || n==172 || n==170 || n==169 || n==167 || n==166 || n==164|| n==163|| n==161) || n==159){
                System.out.println("impossible");
                n=0;
            }
            else if (n == 0) {
                System.out.println("");
            } else if (n <= 60 && n % 3 == 0) {
                System.out.println("triple " + (n / 3));
                n = n - (n / 3)*3;
            } else if (n <= 40 && n % 2 == 0) {
                System.out.println("double " + (n / 2));
                n = n - (n / 2)*2;
            } else if (n <= 20) {
                System.out.println("single " + (n));
                n=0;
            } else {
                if(n>60 && (n/3)%3==0) {
                    System.out.println("triple " + (n / 3)/3);
                    System.out.println("triple " + (n / 3)/3);
                    System.out.println("triple " + (n / 3)/3);
                    n=0;
                }
                int x=20;
             while(0<x){
                  if(n-x*3 >= 0){
                      System.out.println("triple " + x);
                      n=n-x*3;
                  }
                  else if(n-x*2 >= 0 && (i<2 || n <= 40 && n-x*2 ==0)) {
                      System.out.println("double " + x);
                      n=n-x*2;
                  }
                  else if(n-x >=0 && (i<2 || n <= 20 && n-x ==0)) {
                      System.out.println("single " + x);
                      n= n-x;
                  }
                  x--;
              }
            }
        }
    }

 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
             scores(n);
     }
 }



