package Logica;

import javax.swing.JOptionPane;

public class logica {

    public static void in(int[] a, int[] b) {

        int i=0,j=0,num;

        while((i<10)||(j<10)){
            num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar numero para llenar vector"));

            if (num>20 && i<10) {
                a[i]=num;
                i++;
                if (i==10) {
                    JOptionPane.showMessageDialog(null, "A lleno");

                    
                }
 
            }else if (num<20 && j<10) {
                b[j]=num;
                j++;
                if (j==10) {
                    JOptionPane.showMessageDialog(null, "B lleno ");

                }
                
            }
        }

        
    }

    public static void out(int[] a) {
        int i=0;
        String str="";
        
        for ( i= 0;i<10;i++) {
            str=str+a[i]+" "+" ";
        }
        JOptionPane.showMessageDialog(null, str);
    }
    
    
}
