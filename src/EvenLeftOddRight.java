import java.util.Arrays;

public class EvenLeftOddRight {
    public static void main(String[] args) {
        int[] a= {12, 34, 45, 9, 8, 90, 3};
        int left=0;
        int right=a.length-1;
        int temp;
        while(left<right){
            while(a[left]%2==0 && left<right)
                left++;
            while(a[right]%2==1 && left<right)
                right--;
            if(left<right){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
