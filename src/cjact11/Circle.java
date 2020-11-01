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
public class Circle extends Figure{
    
    private double radius;
    private double diameter;
    
    public Circle (double radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }

    @Override
    public double getPerimeter(){
        return (this.diameter * Math.PI);
    }
    
    @Override
    public double getArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }  
}
