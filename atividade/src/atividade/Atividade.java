package atividade;

import javax.swing.JOptionPane;
public class Atividade {

    public static void main(String[] args) {
       String primeironumero =
        JOptionPane.showInputDialog(" Digite o primeiro número :"); 
       String segundonumero =
        JOptionPane.showInputDialog(" Digite o segundo número :");       
       int numero1 = Integer.parseInt(primeironumero);
       int numero2 = Integer.parseInt(segundonumero);    
       int soma = numero1 + numero2 ;
       JOptionPane.showMessageDialog(null,"A soma é :"+soma ," soma de dois numeros inteiros",JOptionPane.PLAIN_MESSAGE);
       
       
    }
    
}
