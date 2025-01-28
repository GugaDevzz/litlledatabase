import Tasks.database.pergunta1;
import Tasks.database.pergunta2;
import Tasks.database.pergunta3;


public class Main {


    public static void main(String[] args) {

        pergunta1 pergunta1 = new pergunta1();
        pergunta2 pergunta2 = new pergunta2();
        pergunta3 pergunta3 = new pergunta3();

        String sex = pergunta1.classeask1();
       String nome = pergunta2.classeaks2();
        String age = pergunta3.classeaks3();



        String data = "We are getting your data...";

        System.out.println(data);
        try {
            Thread.sleep(2500);  // Pausa por 5000 milissegundos (5 segundos)
        } catch (InterruptedException e) {
            e.printStackTrace();  // Em caso de erro na pausa, imprima a pilha de erros
        }
        System.out.println("Finished! Look at down page");

        System.out.println();
        System.out.println("Your data:");
        System.out.println("SEX: " + sex);
        System.out.println("NAME: " + nome);
        System.out.println("AGE: " + age);



    }
}
