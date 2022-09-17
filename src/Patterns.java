public class Patterns {
    public static void main(String[] args) {
        int i=0,j=0,ct=1;
        for(i=0;i<4;i++){
            for(j=i+1;j>0;j--){
                System.out.print(ct);
                ct++;
            }
            System.out.println();
            ct=1;
        }
    }
}
