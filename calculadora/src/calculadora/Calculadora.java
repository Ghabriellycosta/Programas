package calculadora;
 import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
       
        String x = JOptionPane.showInputDialog (" Digite o Primerio número, para começar a operação :");
        String y = JOptionPane.showInputDialog (" Digite o Segundo número :");
        String resposta = JOptionPane.showInputDialog (" Escolha qual operação deseja fazer :\n 1- Soma \n 2- Subtraçao \n 3- Multiplicaçao \n 4- Divisao:");
         
        int x1 = Integer.parseInt(x);
        int y1 = Integer.parseInt(y);
        int resp = Integer.parseInt(resposta);
        
        if(resp == 1){
            {
            int soma = x1 = y1;
            JOptionPane.showMessageDialog(null," A Soma é igual à: "+soma,"De dois números inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if(resp ==2){
            int subtracao = x1 -y1;
            JOptionPane.showMessageDialog(null," A Subtração é igual à : "+subtracao,"De dois números inteiros", JOptionPane.PLAIN_MESSAGE);
        }
       if(resp == 3){
           int mult = x1*y1;
            JOptionPane.showMessageDialog(null," A Multiplicação é igual à : "+mult,"De dois números inteiros", JOptionPane.PLAIN_MESSAGE);
           
       }
       if(resp ==4){
           int divisao = x1/y1;
            JOptionPane.showMessageDialog(null," A Divisão é igual à : "+divisao,"De dois números inteiros", JOptionPane.PLAIN_MESSAGE);
           
       }
    }else{
           JOptionPane.showMessageDialog(null," Desculpe , número inválido..."," ERRO", JOptionPane.PLAIN_MESSAGE);
       }
        
        
                
                
                
    }
    
}
