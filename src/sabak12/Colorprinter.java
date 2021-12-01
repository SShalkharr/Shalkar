
package sabak12;

public class Colorprinter extends Printer {
    
    @Override
    public void kosu(){
        System.out.println(" ---------> Printer satti kosyldy!!!\n\n");
    }

    @Override
    public void texaqau() {
        System.out.println(" ---> Tehnikalyk akau!!!\n\n"); 
    }

    @Override
    public void oshiru() {
        System.out.println(" Printer oshirildi! "); 
        System.exit(0);
    }

  
}
