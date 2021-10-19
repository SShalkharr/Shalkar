package pkg2_max_tabu;
import java.util.Scanner;
import java.util.Random;
public class Main {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        Random r = new Random();
		System.out.print(" Massivtegi elementter sanyn engiz: ");
                int n = scn.nextInt();
 
		int a[] = new int[n];
                
		for (int i = 0; i < a.length; i++)
		{
			a[i] = r.nextInt(20);
                        System.out.print(a[i]+" ");
		}
 
		int a1, a2;
 
		a1 = a[0];
		a2 = a[1];
 
		if (a1 < a2)
		{
			 int temp = a1;
			a1 = a2;
			a2 = temp;
		}
 
		for (int i = 2; i <a.length; i++)
		{
			if (a[i] > a1)
			{
				
				a1 = a[i];
			}
			else if (a[i] > a2 && a[i] != a1)
			{
				a2 = a[i];
			}
		}
 
		System.out.println (" Birinshi max: " + a1);
		System.out.println (" Ekinshi max: " + a2);
    }
    
}
