package JavaCoding;
interface os{
    void boot();
    void shutdown();


    default void update(){
        System.out.println("The Systrm was updating..");
    }
    public static void PriceIncreased(){
        System.out.println("The Price will be Increased on this OS ");
    }
}



class Mac implements os{
    public void boot(){
        System.out.println("The Mac Is the Booting Up");
    }
    public void shutdown(){
        System.out.println("The Mac Is The Shutdown");
    }


}
class Linux implements os{
     public void boot(){
        System.out.println("The Linux Is the Booting Up");
    }
    public void shutdown(){
        System.out.println("The Linux Is The Shutdown");
    }
}
class Windowws implements os{
      public void boot(){
        System.out.println("The Windowws Is the Booting Up");
    }
    public void shutdown(){
        System.out.println("The Windowws Is The Shutdown");
    }

}

public class defaultInterface {
    public static void main(String[] args) {
        // os os1=new os();
        Mac m1=new Mac();
        os os1=m1;
        os1.boot();
        os1.shutdown();
        os1.update();
        os.PriceIncreased();
        Linux l1=new Linux();
        l1.boot();
        l1.shutdown();
        Windowws w1=new Windowws();
        w1.boot();
        w1.shutdown();
    }
    
}
