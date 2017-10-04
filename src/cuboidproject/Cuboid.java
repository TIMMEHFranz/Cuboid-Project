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
public class Cuboid<T extends Number>  {
    private T length;
    private T width;
    private T height;
    

    public Cuboid() {
    }

    
    public Cuboid(T length, T width, T height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getLength() {
        return length;  
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }
    
    public void setWidth(T width) {
        this.width = width;
    }
    
    public double getVolume(){
       return length.doubleValue() * width.doubleValue() * height.doubleValue();
        
    }
    
    @Override
    public String toString() {
        return "Cuboid{" + "cubioddimension=" + ", length=" + length + ", width=" + width + ", height=" + height + '}';
    }
    
    
}
