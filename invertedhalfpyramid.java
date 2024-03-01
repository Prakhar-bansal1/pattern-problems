package patterns;

public class invertedhalfpyramid {
    public static void main(String [] args){
        for(int i=1; i<=4; i++){
            //j<=4-i+1  == j starts from 1 and runs till 4-i+1 means 4-1+1=4 second time 4-2+1=3 and then 
            // 4-3+1=2 and than 4-4+1=4 and this j prints *
            for(int j=1; j<=4-i+1; j++){      
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
