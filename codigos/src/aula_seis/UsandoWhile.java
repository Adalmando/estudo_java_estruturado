package aula_seis;

import javax.swing.JOptionPane;

public class UsandoWhile {

    /* NO WHILE, PRIMEIRO ELE OLHA SE A CONDIÇÃO ESTÁ DE ACORDO, PARA DEPOIS EXECUTAR O CODIGO PASSADO 
    CASO A CONDIÇÃO NÃO ESTEJA COMO ELE QUER, ELE NEM SE QUER EXECUTA A PRIMEIRA VEZ O CÓDIGO PASSADO.
    
    Estruturas de repetição:
     Primeira: While (enquanto)
    While (<condição>){codigo que se repitirá ou não}
    */
    public static void main(String[] args) {
      
        String usuario = "adalmando";
        int senha = 1234;

        boolean loginCorreto = false;

        while(loginCorreto == false){
            
            String usuarioDigitado = JOptionPane.showInputDialog(null, "Digite seu usuário:");
            int senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha (int):"));

            if(usuario.equals(usuarioDigitado) && senha == senhaDigitada){
                JOptionPane.showMessageDialog(null, "Login realizado, bem vindo!");
                loginCorreto = true;
            }
            else if(!usuario.equals(usuarioDigitado)){    
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
            }
            else if(usuario.equals(usuarioDigitado) && senha != senhaDigitada){
                JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
            }
        }
    }
}

