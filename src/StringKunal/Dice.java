package StringKunal;
//you are given n number of dices in how many ways can you form target.
public class Dice {
    public static void main(String[] args) {
        dice("",10);
    }

    public static void dice(String p, int target){
        if(target<=0){
            System.out.println(p);
            return;
        }
        int i;
        //i is going from 1 to 6 as dice has 6 faces and i<=target as we cannnot form 4 from 5 so its useless to include
        for(i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
}
