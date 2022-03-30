package aula_um;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {
        
        //variaveis que guardam numeros inteiros:

        // variaveis do tipo byte, armazenam numeros pequenos, como -228 até 227
        byte numeroPequeno = 20;
        //variavies do tipo short, armazenam numeros um pouco maiores que os byte, tipo 20000
        short numeroMedio = 23243;
        // variaveis inteiras, armazenam numeros grandes, quase que o necessario em todos os códigos
        int numeroGrande = 20393129;
        // variaveis long, armazenam numeros quase infinitos, pouco usada por nao ser necessaria em muitos codigos
        long numeroEnorme = 29124924993293l;

        // variaveis do tipo ponto flutuante (float) :

        //float, armazena numeros com virgulas, precisa ter o f no final pra dizer que não é um double e sim um float
        float numeroFlutuante = 2.22333333333333333333332f;
        // double, armazena numeros com virgulas, porem numeros com muitas casas depois da virgula, tipo pi, nao precisa
        //do f no final, pois é o double e nao float
        double pi = 3.1499293923929392392323;

        //variaveis do tipo caractér

        // variavel char, guarda apenas um caracter, seja letra ou simbolo ou numero, e a letra deve estar dentro de aspas 
        //simples e nao aspas duplas:
        char a = 'a';
       
       
        // variavel String, não é uma variavel como as outras, do tipo primitivo, ela não tem limite, cabe o que
        // voce digitar 
        // ela armazena nomes ou texto ou numeros, e deve ficar entre aspas duplas:
        String nome = "Adalmando12";


        // variavel do tipo boolean, armazena valores boleanos, tipo verdadeiro ou falso:
        boolean fuiaEscola = true;


        System.out.println("Número pequeno (byte): "+ numeroPequeno);
        System.out.println("Número médio (short): "+ numeroMedio);
        System.out.println("Número grande (int): "+ numeroGrande);
        System.out.println("Número enorme (long): "+ numeroEnorme);
        System.out.println("Número ponto flutuante (float): "+ numeroFlutuante);
        System.out.println("Número flutuante de pí (double): "+ pi);
        System.out.println("Caractére (char): "+ a);
        System.out.println("Caracteres juntas (String): "+ nome);
        System.out.println("Valor booleano (bolean): "+ fuiaEscola);

    }
}