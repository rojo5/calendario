/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

/**
 *
 * @author Usuario
 */
public class Calendario {

    static String  [] dias = {"XX","01","02","03","04","05","06","07","08","09","10",
                      "11","12","13","14","15","16","17","18","19","20",
                      "21","22","23","24","25","26","27","28","29","30",
                      "31"};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        imprimeMes(0);
        
    }
    
    public static void imprimeMes(int diaSemana){
        int chivato=0;
        System.out.println("L  M  X  J  V  S  D");
        for(int u=diaSemana;u>0;u--){
             System.out.print(dias[0]+ " ");
             chivato++;
             if(chivato ==7){
                    System.out.println("");
                    chivato=0;
                }
        }
        for(int i =1; i <dias.length;i++){
                System.out.print(dias[i]+ " ");
                chivato++;
                if(chivato ==7){
                    System.out.println("");
                    chivato=0;
                }
            
        }
        for(int u=chivato;u<7;u++){
             System.out.print(dias[0]+ " ");
             chivato++;
            
        }
        
    }
    
    
}
