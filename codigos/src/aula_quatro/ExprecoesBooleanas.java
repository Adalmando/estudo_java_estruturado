package aula_quatro;

import javax.swing.JOptionPane;

public class ExprecoesBooleanas {
    // IMPORTANTE!
    // && -> AND 
    // || -> OR
    // !  -> NOT
    public static void main(String[] args) {
        
        // NESSE CÓDIGO EU SIMULO UMA TENTATIVA DE LOGIN QUE RETORNA UM BOOLEANO, CASO A SENHA E USUARIO ESTEJAM CERTAS.
        String usuario = "adalmando", senha = "adal";
        String usuarioDigitado = "adalmando", senhaDigitada = "adal";

        //O RESULTADO DE LOGIN VAI DEPENDER DA COMPATIBILIDADE DO USUARIO E SENHA:
        boolean login = usuario == usuarioDigitado && senha == senhaDigitada;
        JOptionPane.showMessageDialog(null, login); 
    }
}
