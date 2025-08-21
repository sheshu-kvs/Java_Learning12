package RealProbelmsonHashes1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class InsertValuesArray {
    private static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(3);
        // a1.add(1);
        // a1.add(2);
        // System.out.println(a1);
        boolean running=true;
        while(running){
       System.out.println(">");
        String inp=scan.nextLine();
        String[] command=inp.split(" ");
        switch(command[0].toLowerCase()){
            case"insert":
                  int num=Integer.parseInt(command[1].replace("\"", ""));
                  a1.add(num);
                  break;
            case"delete":
            int deleteId=Integer.parseInt(command[1].replace("\"",""));
            
            // Iterator<Integer> iter=a1.iterator();
            // while(iter.hasNext()){
            //     int id=iter.next();
            //     if(id==deleteId){
            //         found1=true;
            //        iter.remove();
            //     }  
            try{
                a1.remove(deleteId);
            }
            catch(IndexOutOfBoundsException e1){
                System.out.println("Enterd Index Was not Present");

            }
            break;
            case"get":
            if(command.length<2){
                 String t="""
                       Hey User Please Follow the Format
                      >get 2
                      """;
                      System.out.println(t);
                      break;
                   }
                boolean found=true;
                int id=Integer.parseInt(command[1].replace("\"",""));
                try{
                    System.out.println( a1.get(id));
                }
                catch(IndexOutOfBoundsException e1){
                    System.out.println("Entered Index Was not present");
                    // e1.printStackTrace();
                }
            break;
          

            default:
            System.out.println("Invalid Can check Once!!");
        }
        System.out.println(a1);
    }

        




        
    }
    
}
