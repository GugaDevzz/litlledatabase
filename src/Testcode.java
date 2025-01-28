import java.util.Scanner;

public class Testcode {
    public static void testcode (){

    Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
    String nome =scanner.nextLine();
        System.out.println("Reloading in the database...Wait a minute");
        try {
        Thread.sleep(4000);  // Pausa por 5000 milissegundos (5 segundos)
    } catch (InterruptedException e) {
        e.printStackTrace();  // Em caso de erro na pausa, imprima a pilha de erros
    }

        System.out.println("How old are you?");
    var idade = scanner.nextLine();
        System.out.println("We are prepering everything for you. It's almost there!");
        try {
        Thread.sleep(4000);  // Pausa por 5000 milissegundos (5 segundos)
    } catch (InterruptedException e) {
        e.printStackTrace();  // Em caso de erro na pausa, imprima a pilha de erros
    }

        System.out.println("Hey!" + " " + nome+"," + " " + "good news, we get to organize all ready for you");
        System.out.println("SEX:" + " " + "oi");
        System.out.println("NAME:" + " " + nome);
        System.out.println("AGE:" + " " + idade);
    }
}
