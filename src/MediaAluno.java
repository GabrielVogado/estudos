import java.util.Scanner;

public class MediaAluno {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int media;

        System.out.println("nota 1:");
        nota1 = entrada.nextInt();

        System.out.println("nota 2:");
        nota2 = entrada.nextInt();

        System.out.println("nota 3:");
        nota3 = entrada.nextInt();

        System.out.print("media: ");

        System.out.println(media = (nota1 + nota2 + nota3) / 3);
        if (media >= 6) {
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
