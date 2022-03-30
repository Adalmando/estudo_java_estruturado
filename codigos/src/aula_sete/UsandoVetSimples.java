package aula_sete;

import javax.swing.JOptionPane;

class UsandoVetSimples{
    public static void main(String[] args) {
        
        String[] opcoesAssistir = new String[]{
            "Filme Os Incríveis"
            , "Série O justiceiro"
            , "Anime Naruto"
            , "Sair"
        };
    
// AQUI COM A JOPTIONPANE OPTIONDIALOG EU POSSO PASSAR MINHA LISTA DE OPCOES NO CAMPO "OPTIONS" E O PROPRIO METODO
// DIVIDE AS OPÇOES DE ACORDO COM OS INDICES QUE TEM NO VETOR, SE EU CLICAR NA OPÇÃO DO INDICE 2, A VARIAVEL OPCAOESCLHIDA
// RECEBE O NUMERO 2.
     
int opcaEscolhida = 0;
        while(opcaEscolhida != 3){
            opcaEscolhida = JOptionPane.showOptionDialog(
            null, 
            "O que deseja assistir?", 
            "Opções Netflix", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE,
            null, 
            opcoesAssistir, 
            0);
        }
    }
}