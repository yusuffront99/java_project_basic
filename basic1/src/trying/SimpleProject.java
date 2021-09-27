/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying;

/**
 *
 * @author myusu
 */
public class SimpleProject {
    private double oil = 0.0;
    
    public void addOil(double e){
        this.oil += e;
    }
    
    public void minOil(double e){
        this.oil -= e;
    }
    
    public double checkOil(){
       return oil;
    }

    public static void main(String[] args) {
        SimpleProject obj = new SimpleProject();
        System.out.println("Oil bike is remaind = "+obj.checkOil());
        obj.addOil(3.5);
        System.out.println("now fill oil bike is "+obj.checkOil());
        System.out.println("after more driving, its oil act decrease use oil");
        obj.minOil(1.85);
        System.out.println("as much "+obj.checkOil());
    }
    
}


