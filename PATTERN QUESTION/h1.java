/**
 * HollowRectangle
 */
public class h1 {

    public static void main(String[] args) {
        int n=5;
        int m=6;
//OUTER LOOP
        for(int i=1;i<=n;i++){
            // INNER LOOP
            for(int j=1;j<=m;j++){
                //PRINT * ON GIVEN ROW AND SPACE 
                if(i == 1 || j == 1 || i == n || j == m ){
                    System.out.print("*");
        
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}