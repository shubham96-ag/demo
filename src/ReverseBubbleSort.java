import java.util.Arrays;

public class ReverseBubbleSort {
    public static void main(String[] args) {
        int[] a={4,1,2,7,5,0,37,8,0,0};
        int i,j,n,temp;
        n=a.length;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
       System.out.println(Arrays.toString(a));
    }
}
