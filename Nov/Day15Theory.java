import java.util.Scanner;

public class Day15Theory {
    static void StringExample(){
        // .equals  compare the same values and the content
        // == it compares the references they both are the same reference are not..
        String str1 ="hello";
        String str2 = "world";
        String str3 = "heell";
        String str4 = new String("Hello");
        String str5 = new String("Hello");

        // if(str4 == str5){
        //     System.out.println("Both the values are the same.. and references also.");
        // }
        // else{
        //     System.out.println("Both the values are not  the same.. and references are also not the same.");
        // }

        // 
         if(str4.equals(str5)){
            System.out.println("Both the values are the same.. and Content also.");
        }
        else{
            System.out.println("Both the values are not  the same.. content was different..");
        }


      
       

    }
    static void ArrayExample(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int num = scan.nextInt();
        int a[] =new int[num];
      
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the Element "+(i+1));
            a[i]=scan.nextInt();
        }
        System.out.println("Elements in the Array ");
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Day15Theory d1 = new Day15Theory();
        // d1.ArrayExample();
        d1.StringExample();
        
    }
    
}
