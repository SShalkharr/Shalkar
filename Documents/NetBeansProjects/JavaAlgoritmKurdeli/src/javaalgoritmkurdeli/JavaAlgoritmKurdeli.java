package javaalgoritmkurdeli;
import java.util.Scanner;
import java.util.Random;
public class JavaAlgoritmKurdeli {

    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
      
      System.out.print(" Massiv katar sanyn engiz: ");     
      int n = ar.nextInt();
      System.out.print(" Massiv bagan sanyn engiz: ");
      int s = ar.nextInt();
      
        int [][]san = new int[n][s];
        Random_Sandar(san,n,s);
          
          
        System.out.println("\n\n");
        System.out.println("Shakerli sorttau natigesi: ");
      
        Retteu(san,n,s);
        Kaita_shygaru(san,n,s);
    }
    
    static void Random_Sandar(int san[][], int n, int s){
        Random r = new Random();
         for(int i = 0; i < n; i++){
              for(int j = 0; j < s; j++){
                  san[i][j] = r.nextInt(25)-10;
                  System.out.print(san[i][j]+"\t");
              }   System.out.println("");             
          }
    }
     
    static void Retteu(int san[][], int n, int s){
         for(int k = 0; k < n; k++){    
          for(int i = 0; i < n; i++){
              for(int j = 0; j < s - 1; j++){
                if(san[i][j]>san[i][j+1]){
                    int temp = san[i][j];
                    san[i][j]=san[i][j+1];
                    san[i][j+1]=temp;
                }   
              }                
          }
      }
    }
    static void Kaita_shygaru(int san[][],int n,int s){
        for(int i = 0; i < n; i++){
              for(int j = 0; j < s; j++){
                 
                  System.out.print(san[i][j]+"\t");
              }   System.out.println("");             
          }
    }
}
