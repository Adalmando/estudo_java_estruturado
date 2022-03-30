package aula_sete;
/* ARRAY: ARMAZENA VARIOS ELEMENTOS DO MESMO TIPO
COMO INICIAR UM ARRAY? 
SEMPRE QUE INICIAR UM VETOR, VOCE TEM QUE PASSAR O TAMANHO DELE OU OS ELEMENTOS QUE ELE GUARDA.
<tipo>[] <nomeDoArray> = new <tipo>[tamanhoDoArray];
A PRIMEIRA POSIÇÃO DO ARRAY É 0 E A ULTIMA É A QUE VOCÊ COLOCAR NA HORA DE INICIAR -1.
*/

public class VetorSimples {
    public static void main(String[] args) {
        
       // String[] nomes = new String[5];
       // nomes[0] = "Adalmando";
       // nomes[1] = "João";
       // nomes[2] = "Maria";
       // nomes[3] = "Pedro";
       // nomes[4] = "Carlos";

        /**
         OUTRA FORMA DE PASSAR OS ELEMENTOS PRO ARRAY LOGO QUANDO CRIAMOS ELE É:
         */

         String[] nomesDois = new String[] {"adalmando", "maria", "Pedro"};
         
         for(int posicao = 0; posicao < nomesDois.length; posicao++){
             System.out.print(nomesDois[posicao] + ", ");
         }

           
    }
}

