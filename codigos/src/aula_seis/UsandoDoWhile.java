package aula_seis;

//NO DO WHILE, DIFERENTE DO WHILE, ELE EXECUTA O CODIGO PELO MENOS UMA VEZ, E SÓ NO FINAL ELE CONFERE A CONDIÇÃO
//MESMO SE A CONDIÇÃO NÃO TIVER INDICANDO QUE O CODIGO DEVE CONTINUAR REPETINDO, ELE VAI EXECUTAR PELO MENOS UMA
//VEZ!

//do {
// <codigo>
//} while(<condicao>); 

public class UsandoDoWhile {
    public static void main(String[] args) {
        
        int cont = 0;
        
        // DO = FAÇA:
        do{
            System.out.println(cont);
            cont++;
        // WHILE = ENQUANTO:
        }while(cont <= 5);
    }
}
