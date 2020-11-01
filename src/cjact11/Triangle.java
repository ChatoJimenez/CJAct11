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
public class Triangle extends Figure {
    private double height;
    private double side;

    public Triangle(double height, double side) {
        this.height = height;
        this.side = side;
    }
    
    public Triangle (double height){
        this.height = height;
    }
    
    @Override
    public double getPerimeter(){
        return this.side*3;
    }
    
    @Override
    public double getArea(){
        double area;
        double sp =(this.getPerimeter()/2); //Semiperímetro
        if (this.height == 0){
            area = Math.sqrt((sp*(sp-side)*(sp-side)*(sp-side)));
        } else {
            area = (this.side * this.height)/2;
        }
        return area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
