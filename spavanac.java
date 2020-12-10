import java.util.Scanner;

public class spavanac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute=minute-45;
        if (minute<0){
            hour--;
            minute = minute+60;
        }
        if (hour <0) {
            hour = 23;
        }
        System.out.println(hour +" "+ minute);
    }
}

