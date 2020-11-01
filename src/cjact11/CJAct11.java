/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjact11;
import java.util.Scanner;
/**
 *
 * @author jesgu
 */
public class CJAct11 {
    //Colores para la consola
    public static String red="\033[31m"; 
    public static String green="\033[32m";  
    public static String blue="\033[34m"; 
    public static String purple="\033[35m";  
    public static String reset="\u001B[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char opMenu;
        boolean pEnd = false;      
        while (!pEnd){
            boolean sEnd = false;
            System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s","======= MENÚ =======", 
                (blue+"a. Crear Círculo"+reset),(blue+"b. Crear Rectángulo"+reset),
                (blue+"c. Crear Triángulo"+reset),(blue+"d. Salir"+reset),
                        "¿Qué deseas hacer? ");
            opMenu = s.next().charAt(0);
            System.out.println("====================");
            switch (opMenu){
                case 'a':                    
                    System.out.println(blue+"\nCírculo"+reset);
                    System.out.print("Ingresa el radio del Círculo: ");
                    Circle circle = new Circle(s.nextDouble());
                    System.out.println("¡Tu Círculo ha sido creado!");
                    handleFigure(circle,"Círculo");
                    break;
                case 'b':
                    System.out.println(blue+"\nRectángulo"+reset);
                    System.out.print("Ingresa la base del Rectángulo: ");
                    double base = s.nextDouble();
                    System.out.print("Ingresa la altura del Rectángulo: ");
                    double alturaR = s.nextDouble();
                    Rectangle rectangle = new Rectangle(alturaR, base);
                    handleFigure(rectangle,"Rectángulo");                    
                    break;
                case 'c':
                    
                    double alturaT;
                    boolean tEnd = false;
                    while (!tEnd){
                        System.out.println(blue+"\nTriángulo"+reset);
                        System.out.printf("%s\n%s\n%s\n%s\n%s",  
                                (purple+"a. Equilátero"+reset),
                                (purple+"b. Isósceles"+reset),
                                (purple+"c. Escaleno"+reset),
                                (purple+"d. Ninguno"+reset), 
                                "¿Qué tipo de Triángulo deseas crear? ");
                        opMenu = s.next().charAt(0);
                        switch (opMenu){
                            case 'a':
                                System.out.print(purple+"\nTriángulo Equilátero"
                                        +reset);
                                System.out.print("\nIngresa la medida de los "
                                        + "lados: ");
                                double lados = s.nextDouble();
                                System.out.print("Ingresa la altura, si no "
                                        + "la conocces, digita 0: ");
                                alturaT = s.nextDouble();
                                Triangle triangle = new Triangle (alturaT, lados);
                                System.out.println("¡Tu Triángulo Equilátero"
                                        + " ha sido creado!");
                                handleFigure(triangle, "Triángulo Equilátero");
                                break;
                            case 'b':
                                System.out.print(purple+"\nTriángulo Isósceles"
                                +reset);
                                System.out.print("\nIngresa la medida de los "
                                        + "lados iguales: ");
                                double ladosIguales = s.nextDouble();
                                System.out.print("Ingresa la medida del lado"
                                        + " diferente: ");
                                double ladoDiferente = s.nextDouble();
                                System.out.print("Ingresa la altura, si no "
                                        + "la conocces, digita 0: ");
                                alturaT = s.nextDouble();
                                Isosceles isosceles = new Isosceles(ladosIguales,
                                        ladoDiferente, alturaT);
                                System.out.println("¡Tu Triángulo Isósceles"
                                        + " ha sido creado!");
                                handleFigure(isosceles, "Triángulo Isóceles");
                                break;
                            case 'c':
                                System.out.print(purple+"\nTriángulo Escaleno"
                                        +reset);
                                System.out.print("\nIngresa la medida del lado "
                                        + "A (base): ");
                                double ladoA = s.nextDouble();
                                System.out.print("Ingresa la medida del lado "
                                        + "B: ");
                                double ladoB = s.nextDouble();
                                System.out.print("Ingresa la medida del lado "
                                        + "C: ");
                                double ladoC = s.nextDouble();
                                System.out.print("Ingresa la altura, si no "
                                        + "la conocces, digita 0: ");
                                alturaT = s.nextDouble();
                                Scalene scalene = new Scalene(ladoA, ladoB,
                                        ladoC, alturaT);
                                System.out.println("¡Tu Triángulo Escaleno"
                                        + " ha sido creado!");
                                handleFigure(scalene, "Triángulo Escaleno");
                                break;
                            case 'd':
                                tEnd = true;
                                break;
                            default:
                                System.out.println(red+"Selecciona una "
                                        +"opción válida"+reset);
                                break;
                        }
                    }
                    break;
                case 'd':
                    System.out.println(blue+"\nAdiós"+reset);
                    pEnd = true;
                    break;
                default:
                    System.out.println(red+"Selecciona una opción válida"+reset);
                    break;
            }
        }
    }
    
    public static void handleFigure(Figure figure, String name){
        Scanner s = new Scanner(System.in);
        boolean sEnd = false;
        char opMenu;
        while (!sEnd) {
            System.out.printf("\n%s%s\n%s\n%s\n%s\n%s\n\n%s", 
                (blue+"Cálculo de "+reset), (blue+name+reset),
                "¿Qué deseas hacer con él?", "a. Calcular perímetro",
                "b. Calcular área", 
                "c. Nada", "Ingresa tu respuesta: ");
            opMenu = s.next().charAt(0);
            switch (opMenu){
                case 'a': 
                    System.out.println(green+"Perímetro: "+reset+
                            figure.getPerimeter());
                    break;
                case 'b': 
                    System.out.println(green+"Área: "+reset+figure.getArea());
                    break;
                case 'c':
                    sEnd = true;
                    break;
                default: 
                    System.out.println(red+"Selecciona una opción válida"+reset);
                    break;
            }
        }
    }
}
