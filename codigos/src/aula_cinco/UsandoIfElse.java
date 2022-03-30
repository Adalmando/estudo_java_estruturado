package aula_cinco;

import javax.swing.JOptionPane;

public class UsandoIfElse {
    // AQUI É MOSTRADO COM UTILIZAR O IF, ELSE IF E O ELSE:
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));

        if(idade >= 18)                                                                         
            JOptionPane.showMessageDialog(null, "Você é maior de idade!");
        else if(idade < 18 && idade > 16)
            JOptionPane.showMessageDialog(null, "Você é quase maior de idade!");
        else 
            JOptionPane.showMessageDialog(null, "Você ainda é muito novo!");
    }
}
