package aula_dois;

public class Variaveis {
    public static void main(String[] args) {
        
        // DECLARANDO A VARIAVEL:
        String nome;

        // INICIALIZANDO A VARIAVEL (DANDO VALOR A ELA):
        nome = "Adalmando";

        // USANDO A VARIAVEL:
        System.out.println(nome);

        // VOCÊ PODE DECLARAR E INICIALIZAR A VARIAVEL EM UMA UNICA LINHA:
        
        String nome2 = " Araújo";
        System.out.println(nome + nome2);


        String nomeDoFilme = "Vingadores";  //%s
        int anoDeLancamento = 2010;         //%d    
        int duracaoDoFilme = 180;           //%d
        float notaCritica = 9.8f;           //%f
        boolean assisti = true;             //%b
        char letraInicial = 'V';            //%c

        System.out.println("O filme " + nomeDoFilme);
        System.out.println("Foi lançado em " + anoDeLancamento);
        System.out.println("Com duração de " + duracaoDoFilme + " minutos");
        System.out.println("E teve uma nota crítica de " +notaCritica);
        System.out.println("Eu assisti? " + assisti);
        System.out.println("Qual a primeira letra do filme? " + letraInicial);

        // ou utilizamos o format em vez do print para mostrar na tela:
        
        System.out.printf("O filme teve nota %.1f e foi lançado no ano de %d.\n", notaCritica, anoDeLancamento);
        String nome3 = String.format("O filme teve nota %.1f e foi lançado no ano de %d.\n", notaCritica, anoDeLancamento);
        System.out.println(nome3);
}
}
