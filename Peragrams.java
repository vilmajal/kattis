import java.util.Scanner;
import java.util.ArrayList;


public class Peragrams {

    public static void checker(String input){
        ArrayList<Character> peragram = new ArrayList<>(); //tom array
        for (int i=0; i<input.length(); i++){
            if (peragram.contains(input.charAt(i))){ //om bokstaven redan finns i arrayen, ta bort
                char match = input.charAt(i);
                peragram.remove(peragram.indexOf(match));
            }
            else {
                peragram.add(input.charAt(i)); //om bokstaven inte finns i arrayen lägg till
            }
        }
        if (peragram.size() == 0)
            System.out.println("0");
        else
            System.out.println(peragram.size()-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        checker(string);
    }
}