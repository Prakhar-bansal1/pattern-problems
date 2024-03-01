package patterns;
import java.util.Scanner;
public class hollowrectangle {
    public static void main(String [] args){
      Scanner SC = new Scanner(System.in);
       System.out.println("enter no. of rows");
       int n= SC.nextInt();
      System.out.println("enter no. of columns");
         int m= SC.nextInt();
         if(m>n||m<n){
         
      for(int i=1; i<=n; i++){
        for(int j=1;j<=m; j++){
            if(i==1 || j==1 || i==n || j==m ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");//
            }
        }
        System.out.println();
        }

      }
      else
      System.out.println("enter value for rectangle not for a square");

      SC.close(); 
    }
    
}

 