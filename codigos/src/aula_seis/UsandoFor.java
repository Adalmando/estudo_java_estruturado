package aula_seis;

/* USANDO O FOR, E COMO ELE FUNCIONA:
DIFERENTE DO WHILE E DO DO WHILE, NO FOR VC DEFINE QUANTAS VEZES ELE IRÁ REPETIR.
for(<valorInicial>;<condição>;<contador++>){
    <codigo>;
}
*/
public class UsandoFor {
    public static void main(String[] args) {
        
        //ESSE LAÇO NÃO TEM COMO FAZER LOOPING INFINITO, POIS ELE É PROGRAMADO COM BASE
        //EM UMA QUANTIDADE DE REPETIÇÕES:

        for(int contador = 100;contador >= 1;contador--){
            System.out.println(contador);
        }       
    }
}
