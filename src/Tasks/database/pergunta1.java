package Tasks.database;

import java.util.Scanner;

public class pergunta1 {
    
    public String classeask1 () {

        Scanner scanner = new Scanner(System.in);

        String pergunta = "Are you men or woman?";
        String corretomen = "men";
        String corretowoman = "woman";
        String check = "Checked!";

        System.out.println(pergunta);

        String sex = "";
        while (true) {
            sex = scanner.nextLine();
            if (sex.equals(corretomen) || (sex.equals(corretowoman))) {
                System.out.println("Reloading in the database...Wait a minute");
                try {
                    Thread.sleep(2500);  // Pausa por 5000 milissegundos (5 segundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();  // Em caso de erro na pausa, imprima a pilha de erros
                }
                System.out.println(check);
                break;
            } else {
                System.out.println("try again");
                System.out.println(pergunta);
            }
        }
        return sex;
    }
    
}
