/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacap14lang;

/**
 *
 * @author aluno
 */
public class JavaCap14lang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1,x2;
        int y1,y2;
        double aux1,aux2;
        double resposta;
        double pMediox,pMedioy;
        x1 = 0;
        x2 = 3;
        y1 = 0;
        y2 = 4;
        
        aux1 =  Math.pow((x2-x1),2);
        aux2 =  Math.pow(y2-y1,2);
        resposta = Math.sqrt(aux1+aux2);
        
        pMediox = (x1+x2)/2;
        pMedioy = (y1+y2)/2;
        
        System.out.println(resposta);
        System.out.println("("+pMediox+","+pMedioy+")");
    }
    
}
