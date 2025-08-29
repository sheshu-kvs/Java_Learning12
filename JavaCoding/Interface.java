package JavaCoding;


// an interface is the collection of the pure abstract methods..
// An interface contains the method signature withoud the method body...
// 


// java 8 features
/*| Feature     | Default Method                                   | Static Method                                    |
| ----------- | ------------------------------------------------ | ------------------------------------------------ |
| Belongs to  | Object (instance)                                | Interface itself                                 |
| Inheritance | Yes (class can override it)                      | No (cannot override, only hidden if re-declared) |
| Call Syntax | `obj.method()`                                   | `InterfaceName.method()`                         |
| Purpose     | Extend interfaces without breaking existing code | Utility/helper methods related to interface      |
 */
interface Airtmatic{
    void add();
    void dif();
  
    default void mul(){
          int a=20;
          int b=30;
        System.out.println("New Feature: "+a*b);
    }
}

class developer1 implements Airtmatic{
    int a=10;
    int b=30;
    public void add(){
        System.out.println("Developer1 Addition"+(a+b));
    }
    public void dif(){
        System.out.println("Developer1 Substraction"+(a-b));
    }
     public void div(){
        System.out.println("Developer1 division"+(a/b));
    }
}

class developer2 implements Airtmatic{
    int a=20;
    int b=30;
    public void add(){
        System.out.println("Developer2 Addition"+(a+b));
    }
    public void dif(){
        System.out.println("Developer2 Substraction"+(a-b));
    }
}
class developer3 implements Airtmatic{
    int a=100;
    int b=300;
    public void add(){
        System.out.println("Developer3 Addition"+(a+b));
    }
    public void dif(){
        System.out.println("Developer3 Substraction"+(a-b));
    }
}



public class Interface {
    public static void main(String[] args) {
        // Airtmatic a=new developer1();
        // Airtmatic b=new developer2();
        // Airtmatic c=new developer3();
        // a.add();
        // a.dif();
        // a.mul();
        // a.div();
        // ((Airtmatic)a).div();
        
        // b.add();
        // b.dif();

        // c.add();
        // c.dif();
        developer1 d1=new developer1();
        developer2 d2=new developer2();
        developer3 d3=new developer3();

        d1.add();
        d1.dif();
        d1.div();

    }
    
}
