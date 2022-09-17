package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n=4,i=0,j=0;
        for(i=0;i<2*n;i++) {
            if (i <= n) {
                for (j = 0; j <i; j++) {
                    System.out.print("*");
                }
            } else {
                for (j = 2*n-i; j > 0; j--)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
