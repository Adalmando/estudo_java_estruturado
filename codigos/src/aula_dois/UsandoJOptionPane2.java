package aula_dois;

import javax.swing.JOptionPane;

public class UsandoJOptionPane2 {
    public static void main(String[] args) {
        
        int numero1, numero2;

        // FAZENDO ENTRADA DE DADOS COM O JOPTIONPANE:
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 numero", "Digite o numero 1", -1));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero", "Digite o numero 1", -1));
        
        // FAZENDO UMA SAIDA DE DADOS COM O JOPTIONPANE:
        JOptionPane.showMessageDialog(null, numero1 + numero2, "Resultado da soma", -1);
    }
}
