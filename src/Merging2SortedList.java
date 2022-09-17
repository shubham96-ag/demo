import java.util.Arrays;

public class Merging2SortedList {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 89};
        int[] b = {4, 7, 77, 60};
        int size = a.length + b.length;
        int[] c=new int[size];
        int i=0, j=0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }

        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }

        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(c));
    }
}
