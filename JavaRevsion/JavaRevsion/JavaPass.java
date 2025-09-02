package JavaRevsion;

class car{
    String Name;
    float Cost;
    String Color;

void start(){
    System.out.println("The Car is Started");
}
void accelarate(){
    System.out.println("The Man Accelarating the Car...");
}
void stop(){
    System.out.println("The Car is Stopped...");
}

}
public class JavaPass {
       public static void main(String[] args) {
        car c1=new car();
        car c2=new car();
      
        c1.Name="Hundai";
        c1.Color="Blue";
        c1.Cost=1231232.23f;

        System.out.println(c1.Name);
        System.out.println(c1.Color);
        System.out.println(c1.Cost);
        
        c2=c1;
        c2.Name="Maruti";
        c2.Color="White";
        c2.Cost=123123123.123f;
        
        System.out.println(c2.Name);
        System.out.println(c2.Color);
        System.out.println(c2.Cost);

    }
    
}
