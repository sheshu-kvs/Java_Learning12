package JavaRevsion;

public class Fib {
    static void  leapYear(int num){
        if(num%4==0){
            System.out.println("It is the Leap Year!!");
        }
        else if(num%400==0){
            System.out.println("It is a Leap Year");
        }
        else if(num%100!=0){
            System.out.println("It is not the Leap Year");
        }
    }

    static void centuryYear(int year){
        if(year%100==0){
            System.out.println("Entered year was the Century Year "+year);
        }
        else{
            System.out.println("Entered year was not the CenturyYear "+year);
        }
    }
    public static void main(String[] args) {
        int num=7;

        int year=2025;
        int yearCen=1900;
        // int first=0,second=1;
        // for(int i=0;i<num;i++){
        //     System.out.println(first);
        //     int next=first+second;
        //     first=second;
        //     second=next;
        // }
        centuryYear(yearCen);
        leapYear(year);

    }
}
