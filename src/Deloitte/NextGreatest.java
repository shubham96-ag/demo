package Deloitte;

public class NextGreatest {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 6, 8, 9, 0};
        int next=456666;
        int t=8;
        int i;
        for(i=0;i<a.length;i++){
            if(a[i]<next && a[i]>t){
                next=a[i];
            }
        }
        System.out.println(next);
    }


}
