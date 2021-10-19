package shalkar;
import java.util.Scanner;
import java.util.Random;
public class Shalkar {

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       Random r = new Random();
       int a[]=new int [10];
       int k = 0;
       
    
       for(int i = 0; i <10 ; i++){
           a[i]= r.nextInt(10);
           System.out.print(a[i] + " ");
    }
       System.out.println("");
       System.out.println("Zhai sandar:");
               
       for(int i=0; i < 10; i++){
		 for (int j=2; j <= a[i]/2; j++){
             if (a[i]%j == 0 && a[i] != j){
                a[i] = 0;
                break;
             }
        }
        if (a[i]!= 0 && a[i]>1){
            System.out.print(a[i]+"  ");}	
		}
}
}
         

