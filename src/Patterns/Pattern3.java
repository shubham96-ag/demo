package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        for (i = 0; i < 4; i++) {
            for (j = 4 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
