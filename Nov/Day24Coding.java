public class Day24Coding {
    static void fibonacii(){
        int num = 7;
        int first=0;
        int second=1;
        System.out.println();
        for(int i=0;i<num;i++){
            System.out.println(first);
            int temp = first + second;
            first = second;
            second = temp;
        }
    }

    static void FirstRepeatingChar(){
        String str="Hello World";
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            System.out.println("Index Of "+str.indexOf(ch));
            System.out.println(); 
            System.out.print("Last Index Of "+str.lastIndexOf(ch));
            // if(!(str.indexOf(ch) == str.lastIndexOf(i))){
                // System.out.println(ch);
            // }
        }
    }
    public static void main(String[] args) {
        // fibonacii();
        FirstRepeatingChar();
    }
    
}
