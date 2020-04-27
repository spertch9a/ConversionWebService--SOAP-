/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class maintesting {
    public static void main(String[] args) {
        double courss = 0.0075;
        double da = 0;
           System.out.println("Le cours actuel est a "+ courss );
         System.out.println("Entrez le montant que vous voulez convertir ");
         Scanner sc= new Scanner(System.in);
         da  = sc.nextDouble();
         
        client.Conversionwebservice_Service service = new client.Conversionwebservice_Service();
        client.Conversionwebservice port = service.getConversionwebservicePort();
       System.out.println(da + " dinars vous donne " +  port.conversion(da, courss) + " euros");
    }

 
    
}
