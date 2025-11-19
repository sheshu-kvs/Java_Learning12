public class Day19Coding {
    static void CountLettars(){
        String str="Hariyana";
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch+ " " +(count++));
        }
    }

    static void  CountNumbers(){
        int num = 4567;
        int count = 0;
        while(num>0){
            int rem = num%10;
            count++;
            num  = num/10;
        } 
        System.out.println("The numbers Count "+count);
    }

    static void sumofNumbers(){
        int num = 4567;
        int sum  = 0;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            num=num/10;
        }
        System.out.println("The Sum OF the Numbetr "+sum);
    }
    static void printPatternNumber(){
    // System.out.println();
    for(int i=1;i<=5;i++){
        
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }

    static void printAllSubarray(){
        int a[]={1,2,3,4,5};
        int size = 2;
        int max =0;
        int maxStartIDX=0;

        for(int i=0;i<=a.length-size;i++){
            int sum = 0;
          for(int j=i;j<i+size;j++){
            // System.out.print(a[j]+" ");
            sum=sum+a[j];
          }
        //   System.out.println("sum "+sum);
          if(sum>max){
            max=sum;
            maxStartIDX=i;
          }
        }
        for(int i=maxStartIDX;i<maxStartIDX+size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //  System.out.println("Max val "+max);
    }
    public static void main(String[] args) {
        //   CountLettars();
        //   CountNumbers();
        //   sumofNumbers();
        // printSubArrays();
        // printPatternNumber();
      printAllSubarray();
    }
    
}
