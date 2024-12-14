import java.util.Scanner;

public class principalCarro {
    public static void main(String[] args) {
        Scanner scannerCarro = new Scanner(System.in);
        carro leitorCarro = new carro();
        System.out.print("Digite o modelo do carro: ");
        leitorCarro.modelo = scannerCarro.nextLine();
        System.out.print("Agora, digite o ano do carro: ");
        leitorCarro.ano = scannerCarro.nextInt();
        scannerCarro.nextLine();
        System.out.print("Por fim digite a cor do seu carro: ");
        leitorCarro.cor = scannerCarro.nextLine();
        leitorCarro.fichatecnicaCarro();
        scannerCarro.close();
    }
}
