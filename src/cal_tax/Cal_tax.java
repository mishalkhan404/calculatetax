/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_tax;

/**
 *
 * @author 4star
 */
public class Cal_tax {

     public static double getTax(String status, double income){
        double total = 0.0;
 
        if(status.equalsIgnoreCase("M")){
            if(income <= 21450 ){
                total = (income)*0.05;
            }else if(income <= 51900){
                total = (income)*0.08;
                
            }else if(income > 51900){
                total = (income)*0.10;
                
                 }
        }else if(status.equalsIgnoreCase("S")){
                if(income <= 35800){
                    total = income*0.03;
                }else if(income <= 81500){
                    total = income*0.08;
                   
                }else if(income > 81500){
                    total = income*0.09;
                    
                }
        }
        return total;
    }
    
}
