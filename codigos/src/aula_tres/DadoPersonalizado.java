package aula_tres;

import java.util.Random;

import javax.swing.JOptionPane;

public class DadoPersonalizado {
    public static void main(String[] args) {
        
        // TRANSFORMANDO O GERADOR EM UMA INSTANCIA DE RANDOM:
        Random gerador = new Random(); 

        // FAZENDO ENTRADA DE DADOS COM O JOPTIONPANE:
        int lados = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos lados tem o dado?"));
        
        //aqui o "lados" é o maior número que queremos gerar e o 1 o menor
        int resultado = gerador.nextInt(lados) + 1;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
