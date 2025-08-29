public class CheckNumber5and7{
    public static void main(String[] args){
        int num=21;
    
    // for(int i=1;i<=10;i++){
    //         System.out.println(num1+" X "+i+" = "+(num1*i));
    //     }

    //     for(int j=1;j<=10;j++){
    //         System.out.println(num2+" X "+j+" = "+(num2*j));
    //    }
    if(num%5==0 && num%7==0){
        System.out.println("Number is divisible By 5 and 7 "+num);
    }
    else{
        System.out.println("NUmber is Not Divisible By 5 and 7 "+num);
    }
    }
}