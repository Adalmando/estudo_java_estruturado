package aula_quatro;

import javax.swing.JOptionPane;

public class ExprecoesBooleanas2 {
    public static void main(String[] args) {
        
        int idade = 19;
        // O && SIGNIFICA "E"
        boolean resultado = idade > 18 && idade < 20; // NESSA EXPRESSÃO BOOLEANA, 
        //A GENTE TA FAZENDO ALGO PARECIDO COM O IF, PORÉM DE UM JEITO DIFERENTE
        JOptionPane.showMessageDialog(null, resultado);
    }
}

