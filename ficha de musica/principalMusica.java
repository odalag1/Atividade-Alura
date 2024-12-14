import java.util.Scanner;

public class principalMusica {
public static void main(String[] args) {
    Scanner leitorScanner = new Scanner(System.in);
    musica leitorMusica = new musica();
    System.out.println("Por favor, digite o título da música: ");
    leitorMusica.titulo = leitorScanner.nextLine();
    System.out.println("Agora, digite o nome do artista ou banda: ");
    leitorMusica.artista = leitorScanner.nextLine();
    System.out.println("Por último, informe o ano de lançamento da música: ");
    leitorMusica.anoDeLancamento2 = leitorScanner.nextInt();
    leitorMusica.fichaDemusica();
    int parada = 0;
        while (parada != -1) {
            System.out.println("Digite a sua avaliação (0 a 5).\nPara parar de avaliar, digite -1:");
            parada = leitorScanner.nextInt(); 

            if (parada == -1) {
                break; 
            } else if (parada >= 0 && parada <= 5) {
                leitorMusica.avalia(parada); 
            } else {
                System.out.println("Avaliação inválida! Digite um valor entre 0 e 5 ou -1 para sair.");
            }
        }
        if (leitorMusica.numeroDeAvaliacao > 0) {
            double mediaDeAvaliacao = leitorMusica.pegaMedia();
            System.out.println("A média de avaliação é: " + mediaDeAvaliacao);
        } else {
            System.out.println("Nenhuma avaliação foi registrada.");
        }
    leitorScanner.close();
}
}
