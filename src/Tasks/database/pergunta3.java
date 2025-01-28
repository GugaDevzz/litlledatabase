package Tasks.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pergunta3 {

    public String classeaks3() {

        Scanner scanner = new Scanner(System.in);

        String check = "last question answered sucessfully... wait";
        String Age = "How old are you?";
        String error = "type only your age, the chat wait a whole number";
        System.out.println(Age);


        String age = "";
        while (true) {

             age = scanner.nextLine();
            try {
                int numberage = Integer.parseInt(age);
                if (numberage >= 18) {
                    System.out.println("OK, so you are already older!");
                } else {
                    System.out.println("Ok, so you are still younger!");
                }
                System.out.println(check);
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println(error);
                System.out.println(Age);
            }
        }
        return age;
    }



}
