package patterns ;
           public class invertedfloydstriangle {
    public static void main(String [] args) {
        int n=4;
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i+2; j++){      
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
