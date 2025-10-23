public class OCT22 {
static void HallowPyramid(){
    for(int i=0;i<5;i++){
        for(int k=0;k<(5-i+1);k++){
            System.out.print("  ");
        }
        for(int j=0;j<(2*i+1);j++){
           if(j==0|| j== (2*i-2) ||i==4){
             System.out.print("* ");
           }
           else{
            System.out.print("  ");
           }
        }
        System.out.println();
    }
}

static void ReverseHallow(){
    for(int i=4;i>0;i--){
        for(int k= (4-i);k>=0;k--){
            System.out.print("  ");
        }
        for(int j = (2*i-1);j>0;j--){
         System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void main(String[] args){
        HallowPyramid();
        // ReverseHallow();
    }
}
