/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjact11;

/**
 *
 * @author jesgu
 */
public class Figure implements Shape {
    
    private double side;
    
    @Override
    public double getPerimeter(){
        return this.side*4;
    }
    @Override
    public double getArea(){
        return Math.pow(this.side, 2);
    }
    
}
