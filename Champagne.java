/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler40java;

/**
 *
 * @author gabriel
 */
public class Champagne {

    int [] ar = new int[6];
    StringBuilder builder = new StringBuilder();
        
    Champagne(){
        makeBuilder();
        popArray();
        multiply();
    }
    
    public void makeBuilder(){
        for(int i = 0; i < Math.pow(10,6); ++i){
            builder.append(i);
        }
    }    
    
    public void popArray(){ 
        for(int i = 0; i < 6;++i){
            int u = builder.charAt((int)Math.pow(10, i)) - 48;
            ar[i] = u; 
        }
    }    
    
    public void displayArray(){
        for(int i = 0; i < ar.length;i++){
            System.out.println("ar at " + i + " " + ar[i]);
        }
    }
    
    public void multiply(){
        int prod = 1;
        for(int i = 0; i < 6; i++){
            prod*=ar[i];
        }
        System.out.println("prod: " + prod);
    }
}
