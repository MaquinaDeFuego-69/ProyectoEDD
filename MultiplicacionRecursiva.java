import javax.swing.*;
public class MultiplicacionRecursiva {
 
   public static String multiplicacion(int f,int NA){
      if(f==1){
         return NA+" X "+1+" = "+NA+"\n";
      }else{
         int e;
         e=f;
         return multiplicacion(f-1,NA)+NA+" X "+e+" = "+(NA*f)+"\n";
      }
   }
   public static void main(String[]args){
      int NA;
      String N;
      N=JOptionPane.showInputDialog("Introduce el número a multiplicar:");
      NA=Integer.parseInt(N);
      JOptionPane.showMessageDialog(null,""+multiplicacion(10,NA),"El resultado de la multiplicación es: ",JOptionPane.INFORMATION_MESSAGE);
      
   }
}