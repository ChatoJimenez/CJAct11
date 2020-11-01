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
public class Isosceles extends Triangle {
    
    private double equalSides;
    private double diffSide;
    
    public Isosceles(double equalSides, double diffSide, double height) {
        super(height);
        this.equalSides = equalSides;
        this.diffSide = diffSide;
    }
    
    @Override
    public double getPerimeter(){
        return (this.equalSides*2 + diffSide);
    }
    
    @Override
    public double getArea(){
        double area;
        double sp = (this.getPerimeter()/2);
        if(super.getHeight() == 0){
            area=Math.sqrt((sp*(sp-equalSides)*(sp-equalSides)*(sp-diffSide)));
        } else {
            area = (this.diffSide * super.getHeight())/2;
        }
        return area;
    }
  
}
