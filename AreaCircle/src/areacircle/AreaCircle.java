/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacircle;

/**
 *
 * @author Tyler
 */
public class AreaCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double area;
            int radius;
            
            radius = 15;
            area = Math.pow(radius, 2.0) * 3.14159;
            System.out.println(area + " square feet.");
        }
    }
    
