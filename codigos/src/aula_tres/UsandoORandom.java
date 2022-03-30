package aula_tres;

import java.util.Random;

import javax.swing.JOptionPane;

public class UsandoORandom {
    public static void main(String[] args) {
        
        // aqui estou instanciando o Random com o nome de "gerador"
        Random gerador = new Random(); 

        //aqui o 6 é o maior número que queremos gerar e o 1 o menor
        int dado6Lados = gerador.nextInt(6) + 1; 
        
        JOptionPane.showMessageDialog(null, dado6Lados);
    }
}
