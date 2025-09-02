import java.util.HashMap;
import java.util.Map;

public class Occur1 {
    public static void main(String[] args) {
    // int a1[]={1,2,3,3,4,5,1,2,4,5,6,6,78,88,9,99,90,10,10,10,90,90,11,5,5};
    String a2[]={"a","b","c","d","e","a","a","e","b"};

//    printOcuur(a1);
   printOcuurString(a2);
        
    }
    private static void printOcuur(int a1[]){

       HashMap<Integer,Integer> map=new HashMap<>();


    for(int i=0;i<a1.length;i++){
        if(map.containsKey(a1[i])){
            int val=map.get(a1[i]);
            map.put(a1[i],val+1);

        }
        else{
            map.put(a1[i],1);
        }
    }
System.out.println(" ");
for(Map.Entry<Integer,Integer> m1:map.entrySet()){
    System.out.println(m1.getKey()+" : "+m1.getValue());
}
 }
 private static void printOcuurString(String []a2){
    HashMap<String,Integer> map=new HashMap<>();

    for(int i=0;i<a2.length;i++){
        
        if(map.containsKey(a2[i])){
               int val=map.get(a2[i]);
               map.put(a2[i],val+1);
        }
        else{
            map.put(a2[i], 1);
        }
    }



    for(Map.Entry<String,Integer> a1234:map.entrySet()){
        System.out.println(a1234.getKey()+" : "+a1234.getValue());
    }
 }
}
    
