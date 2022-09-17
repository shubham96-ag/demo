package Deloitte;

public class SecondLargest {
    public static void main(String[] args) {
        int [] a={8,8,8,8,8};
        int i;
        int max=a[0];
        int maxsec=a[0];
        for(i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]>maxsec && a[i]<max)
                maxsec=a[i];
        }
        System.out.println(maxsec);
    }
}
