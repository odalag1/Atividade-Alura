public class musica {

    String titulo;
    String artista;
    int anoDeLancamento2;
    double somaDasAvaliacoes;
    int numeroDeAvaliacao;

    void fichaDemusica(){
        System.out.println("Titulo da musica é " + titulo );
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento2);
    }


    void  avalia(double nota) {
        somaDasAvaliacoes += nota;
        numeroDeAvaliacao++;
    }
    double pegaMedia() {
        return somaDasAvaliacoes / numeroDeAvaliacao;
    }

   
}
