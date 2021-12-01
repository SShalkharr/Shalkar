package sabak12;
import java.io.IOException;
import java.util.Scanner;
        
public class Sabak12 {
 public static final Colorprinter printer = new Colorprinter();
 public static final Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {
        
        System.out.println(" ************* -> Online Printer <- ****************** ");
        System.out.println(" Kelesi areketterdi tandanyz: (kosu) printerdi kosu, (shygu) shygu areketi ");
        String s = sc.next();
        while(!"shygu".equals(s)){
            if("kosu".equals(s)){
                printer.kosu();
                printer();
                break;
            }
            System.out.println(" !?* (kosu) printerdi kosu, (shygu) shygu areketi ");
            s = sc.next();
        } 
    }
    
    public static void printer(){
        
        System.out.println(" Kelesi areketterdi tandanyz: (shygaru) basyp shygaru, (oshiru) oshiru areketi ");
        String s1 = sc.next();
        
        while(!"oshiru".equals(s1)){
            if("shygaru".equals(s1)){
                System.out.println(" Shygaru tusin tandanyz: 1 - (svetnoi) ulgide, 2 - (cherno-beloe) ulgide ");
                int a = sc.nextInt();
                    switch(a){
                        case 1: printer.shygaru("svetnoi"); break;
                        case 2: printer.shygaru("cherno-beloe"); break;
                        default: printer.texaqau(); break;
                    }
            }
            System.out.println(" !?*- (shygaru) basyp shygaru, (oshiru) oshiru areketi ");
            s1 = sc.next();
        }
        printer.oshiru();
    }
}
    

