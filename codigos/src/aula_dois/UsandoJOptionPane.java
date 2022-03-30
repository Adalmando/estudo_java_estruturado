package aula_dois;

import javax.swing.JOptionPane;

public class UsandoJOptionPane {
    public static void main(String[] args) {
        
        String nome1;
        String nome2;
        String nome3;
        
        // DANDO ENTRADA DE DADOS USANDO O JOPTIONPANE:
        nome1 = JOptionPane.showInputDialog("Qual seu nome?");
        nome2 = JOptionPane.showInputDialog("Qual seu nome2?");
        nome3 = JOptionPane.showInputDialog("Qual seu nome3?");

        System.out.println("O primeiro nome foi " + nome1 + ", o segundo foi " + nome2+ " e o terceiro foi " +nome3);
    }   
}
