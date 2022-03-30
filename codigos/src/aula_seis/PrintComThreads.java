package aula_seis;

import java.util.Scanner;

public class PrintComThreads {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.printf("Digite seu nome:\n");

        Scanner leitor = new Scanner(System.in);
        String name = leitor.nextLine();
        
        System.out.printf("Seu nome é: ");
        for(int k = 0; k<name.length(); k++){
              Thread.sleep(150);
              System.out.printf("%s",name.charAt(k));
        }
        Thread.sleep(300);
        System.out.println(" ?");
        Thread.sleep(300);

        leitor.close();
    }
}