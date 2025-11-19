// class product{
//     private String pname;
//     private int price;
// /*An Encapsulaion is the Each and every object was very important part that is the data to provied the data to the securitywe are 
// using the privte keyword controlled access through the setters and the getters..
//   */

//     public void setpname(String pname){
//             this.pname = pname;
//     }
//     public void setprice(int price){
//         if(price>0){
//           this.price = price;
//         }
//         else{
//             System.out.println(" ");
//             System.out.println("Please enter the Valid Price..");
//         }
        
//     }


//     public String getpname(){
//         return pname;
//     }

//     public int getprice(){
//         return price;
//     }

// }

class Employee{
    public void details(String name, float salary){
        System.out.println("hi");
    } 
}

class developer extends Employee{
    public void details(String name,float salary){
        System.out.println("hi hlo "+name+" and salary was the "+salary);
    } 
}


public class Day19Theory {
    public static void main(String[] args) {
        /*Encapsulation Example.. */
        //  product p = new product();
        //  p.setpname("nirma");
        //  p.setprice(-1);
        //  System.out.println(p.getpname());   
        //  System.out.println(p.getprice()); 
        
        developer d1 = new developer();
        d1.details("harsh", 35000);
    }
    
}
