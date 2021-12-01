
package sabak12;
public abstract class Printer implements Printer_interface {
        
    @Override
    public String shygaru(String s) {
        
        if("svetnoi".equals(s)){
            System.out.println(" ---------------> Turli-tusti ulgide satti shygaryldy!\n\n");
        }
        else{
            if("cherno-beloe".equals(s)){
            System.out.println(" ---------------> Ak-kara ulgide satti shygaryldy!\n\n");
            }
            else{
                texaqau();
            }
        }
        
        return "";
    }

}
