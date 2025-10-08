import java.util.Scanner;
public class LargestOfThreeNumbers {

    static void LargestOfThree(int a,int b,int c){
       if(a>b && a>c){
        System.out.println("a is the Largest "+a);
       }
       else if(b>c && b>a){
        System.out.println("b is the Largest "+b);
       }
       else{
        System.out.println("c is the Largest "+c);
       }
    }

    static void CheckVowel(String str){
        String lower=str.toLowerCase();
        String t="";
        for(int i=0;i<lower.length();i++){
            char ch=lower.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i'|| ch=='o' || ch=='u'){
                t=t+ch;
            }
        }
        System.out.println("Vowels "+t);
    }
    static void checkLeapyear(int num){
        // if(num%4 == 0){
        //     System.out.println("Leap Year");
        // } else if(num%400==0){
        //     System.out.println("leap Leap Year");
        // }
        // else if(num % 100 == 0){
        //     System.out.println("It is Not the Leap Year");
        // }
        if((num % 4 == 0 && num%100 != 0)||(num%400==0)){
            System.out.println("It is the Leap Year");
        }
        else{
            System.out.println("It is not the Leap Year..");
        }
    }


    static void Calculator(int a,int b){
        Scanner scan = new Scanner(System.in);
        System.out.print("+ - / *");
        System.out.println("Enter the Operation You Want to Perform ");
        char Expression=scan.next().charAt(0);

        switch(Expression){
            case'+':
            System.out.println(a+b);
            break;
            case'-':
            System.out.println(a-b);
            break;
            case'*':
            System.out.println(a*b);
            break;
            case'/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }



    public static void main(String[] args) {
        int a=40;
        int b=50;
        int c=30;
        // LargestOfThree(a, b, c);
        String str="Hello world";
        // CheckVowel(str);
        // checkLeapyear(1900);

        Calculator(20,10);

  


    }
    
}
