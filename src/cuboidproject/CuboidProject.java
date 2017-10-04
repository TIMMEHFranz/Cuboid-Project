/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidproject;

/**
 *
 * @author tfranz
 */
public class CuboidProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuboid <Double> cube1 = new Cuboid<>();
        Cuboid <Double> cube2 = new Cuboid<>(10.0,11.0,12.0);
        
        cube1.getHeight();
        cube1.getLength();
        cube1.getWidth();
        cube1.setHeight(7.0);
        cube1.setLength(8.0);
        cube1.setWidth(9.0);
        System.out.println(cube1.toString());
        System.out.println(cube2.toString());
        System.out.println("The volume of cube 1 is " + cube1.getVolume());
        System.out.println("The volume of cube 2 is " + cube2.getVolume());
        
        
        
        
    }
    
}
