import java.util.ArrayList;

public class PairSumTwoPointer {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        System.out.println(isPairSum(a,7));
    }

    static ArrayList<Integer> isPairSum(int[] a,int sum){
        int i=0;
        int j=a.length-1;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(i<j){
            if(a[i]+a[j]==sum){
                al.add(a[i]);
                al.add(a[j]);
                i++;
                j--;
            }
            else  if(a[i]+a[j]<sum)
                i++;
            else
                j--;
        }
        return al;
    }
}
