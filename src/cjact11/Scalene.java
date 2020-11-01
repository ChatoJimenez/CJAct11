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
public class Scalene extends Triangle{
    private double sideA; //base
    private double sideB;
    private double sideC;

    public Scalene(double sideA, double sideB, double sideC, double height) {
        super(height);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    @Override
    public double getPerimeter(){
        return (this.sideA+this.sideB+this.sideC);
    }
    
    @Override
    public double getArea(){
        double area;
        double sp =(this.getPerimeter()/2);
        if(super.getHeight() == 0){
            area = Math.sqrt((sp*(sp-sideA)*(sp-sideB)*(sp-sideC)));
        } else {
            area = (this.sideA * super.getHeight())/2;
        }
        return area;
    }
}
