package aula_dois;

//IMPORTANDO A BIBLIOTECA DO JAVA CHAMADA SCANNER, SÓ ASSIM POSSO USÁ-LO.
import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        
        // CRIANDO UMA INSTÂNCIA DE SCANNER CHAMADA "LEITOR";
        Scanner leitor = new Scanner(System.in);

        // CRIANDO UMA VARIAVEL DO TIPO STRING SEM INICIALIZÁ-LA:
        String nome;

        // PASSANDO VALOR PARA A VARIÁVEL NOME USANDO O MÉTODO NEXTLINE DO SCANNER:
        nome = leitor.nextLine();

        // FECHANDO O SCANNER DEPOIS DE USÁ-LO (ISSO DEVE SER FEITO SEMPRE QUE TERMINAR DE USAR O SCANNER):
        leitor.close();

        System.out.println("Seu nome é " + nome);
        

    }    
}