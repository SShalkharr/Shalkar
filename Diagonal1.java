package diagonal.pkg1;
import java.util.Scanner;
import java.util.Random;

public class Diagonal1 {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
      Random r = new Random();
      System.out.println(" Massiv katar sanyn engiz: ");     
      int n = ar.nextInt();
      System.out.println(" Massiv bagan sanyn engiz: ");
      int s = ar.nextInt();
      
      int [][]san = new int[n][s];
          for(int i = 0; i < n; i++){
              for(int j = 0; j < s; j++){
                  san[i][j] = r.nextInt(20);
                  System.out.print(san[i][j]+"\t");
              }   System.out.println("");
              
          }
          System.out.println("");
          int sum1=0;
          int sum2=0;
          for(int i = 0; i < n; i++){
              for(int j = 0; j < s; j++){
                   if(i>j){
                       sum1+=san[i][j];
                   } 
                   if(i<j){
                       sum2+=san[i][j];
                   }
              } 
          }
          
          if(sum1>sum2){
              System.out.println("asty ulken");
          }
          else{
              System.out.println("usti ulken");
          }        
    }
    
}
