package Tasks.database;

import java.util.Scanner;

public class pergunta2 {

    public String classeaks2 () {

        Scanner scanner = new Scanner(System.in);

        String check = "Checked!";

        String pergutuntaname = "What's your name?";
        System.out.println(pergutuntaname);

        String nome = "";
        while (true) {
             nome = scanner.nextLine();
            if (nome.length() > 10 || nome.contains(" ") || nome.length() < 3) {
                nome = pergutuntaname;
                System.out.println("(Error 1050)..Write again just your first name pls!");
                try {
                    Thread.sleep(2500);  // Pausa por 5000 milissegundos (5 segundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();  // Em caso de erro na pausa, imprima a pilha de erros
                }
                System.out.println(pergutuntaname);
            } else {
                System.out.println(check);
                break;
            }
        }
        return nome;
    }
}
