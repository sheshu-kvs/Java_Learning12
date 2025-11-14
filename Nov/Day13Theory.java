public class  Day13Theory {
    int a;
    String name;
    boolean val;
    float d;


    static void TypeCasting(){
         // implicitTypeCasting
        //converting the smaller dt to the larger dt
        // byte->short->int->long->float->double
            // char
            //this is the example of the implicit type casting
            //converting smaller data type to the larger datatype..
            byte a=127;
            short b=a;

            //this is the explict type casting
            // converting the larger data type to the smaller datatype
            long c = 123123123;
            int d = (int)c;
            System.out.println(d);
    }
    static void variableExample(){
        // instance variable
        // An instanse Varible are used to the declared inside the class..
        // in this instanse variable jvm  will provide the default values..
        // in this data are store in the heap segement..
        // An local variable are used to the declared inside the method..
        // in the local variable jvm will not provide the default values..
        // in this data are stored in the stack  segements 
        // 
    }
    public static void main(String[] args) {
       TypeCasting();
       Day13Theory d12 = new Day13Theory();
    System.out.println(d12.a);
    System.out.println(d12.name);
    System.out.println(d12.val);
    System.out.println(d12.d);

    }
}
