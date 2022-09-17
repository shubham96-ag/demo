import java.util.ArrayList;

public class PairSumBinary {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int i=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(i=0;i<a.length;i++){
            if(PairSumBinary.binSer(a,7-a[i])){
                al.add(a[i]);
                al.add(7-a[i]);
            }
        }
        System.out.println(al);
    }

    public static boolean binSer(int[] a,int key){
        int l=0;
        int r=a.length-1;
        int mid;
        while(l<r){
            mid=(l+r)/2;
            if(key<a[mid]){
                r=mid-1;
            }
            if(key>a[mid]){
                l=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
