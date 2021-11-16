package polimarfizm;
public class Drob extends Chislo  {

    public double c = 0;
    public double z = 0;

    public Drob(int c, int z){
    this.c = c;
    this.z = z;
    }
    
     public String toString(){
    return  "(" + c + "/" + z + ")";
}
      
   public static Drob kosu (Drob a, Drob b){
        Drob t = new Drob(1, 1);
        t.c = (a.c * b.z + a.z * b.c);
        t.z = a.z + b.z;
        return t;
} 
       public static Drob alu (Drob a, Drob b){
        Drob t = new Drob(1, 1);
        t.c = (a.c * b.z - a.z * b.c);
        t.z = a.z * b.z;
        return t;
}
       public static Drob kobeitu(Drob a, Drob b){
        Drob t = new Drob(1, 1);
        t.c = (a.c * b.c);
        t.z = a.z * b.z;
        return t;
}
       public static Drob bolu(Drob a, Drob b){
        Drob t = new Drob(1, 1);
        t.c = (a.c / b.c);
        t.z = a.z / b.z;
        return t;
        } 
}
   
 

