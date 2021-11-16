package polimarfizm;

import java.util.Scanner;
public class Chislo {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        
       Drob t = new Drob(a, b);
       System.out.println("Ekranga shygaru: "+t);
       
       Drob g = new Drob(a, b);

    Drob kosu = Drob.kosu(g, t);
    System.out.println(" Kosu amaly: " + t.toString() + " + " + g.toString() + " = " + kosu.toString());
    
    Drob alu = Drob.alu(g, t);
    System.out.println(" Alu amaly: " + t.toString() + " - " + g.toString() + " = " + alu.toString());
    
    Drob kobeitu = Drob.kobeitu(g, t);
    System.out.println(" Kobeitu amaly: " + t.toString() + " * " + g.toString() + " = " + kobeitu.toString());
    
    Drob bolu = Drob.bolu(g, t);
    System.out.println(" Bolu amaly: " + t.toString() + " / " + g.toString() + " = " + bolu.toString()); 
    
    }

}
