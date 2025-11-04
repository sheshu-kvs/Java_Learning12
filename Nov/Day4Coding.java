package Nov;


public class Day4Coding{
    static  void ReverseString(){
        String str="Hello Java";
        int i=str.length()-1;
        String t="";
        while(i>=0){
            // System.out.println(str.charAt(i));
             t=t+str.charAt(i);
             i--;
        }
        System.out.println("Reversed String "+t);
    }
    static void factNum(int num){
        int fact=1;
        while(num>=0){
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial "+fact);
    }
    static int  factNumUsinRecursion(int num){
        if(num==0){
            return 1;
        }
        return factNumUsinRecursion(num - 1 ) * num; 
    }
    static void  fibonaci(int num){
     int first=0;
     int second=1;
    for(int i=0;i<num;i++){
        System.out.println(first);
       int next=first+second;
       int temp = first ;
      first = second;
      second = next;  
    }
}
    static int fibonaciRecursion(int num){
       if(num==0){
        return 0;
       }
       if(num==1){
        return 1;
       }
       return fibonaciRecursion(num-1) + fibonaciRecursion(num-2);
   
    }
    
    
    public static void main(String[] args) {
        // ReverseString();
        // factNum(3);
        // fibonaci(4);
     
        // int num = 100;
        // for (int i = 0; i < num; i++) {
        //     System.out.println(fibonaciRecursion(i));
        // }
        int res = factNumUsinRecursion(4);
        System.out.println("Factorial Number "+res);
    }
}