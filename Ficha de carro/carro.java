public class carro {
    String modelo;
    int ano;
    String cor;

    void fichatecnicaCarro(){
        System.out.println("Modelo do carro é: " + modelo);
        System.out.println("Ano do carro do carro é: " + ano +"\n" + "Cor: " + cor + "\n" + "Idade do carro: " + idadeCarro() + " anos");
    }

    int idadeCarro (){
        return 2024-ano;
    }
}
