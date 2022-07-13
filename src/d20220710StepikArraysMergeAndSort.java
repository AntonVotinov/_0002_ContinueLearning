import java.util.Arrays;

public class d20220710StepikArraysMergeAndSort {
    public static void main(String[] args) {
        int [] a,b;
        a = new int[]{1,55,7,99};
        b = new int[]{11,22,3,44};
        int lengthOfMergedArray = a.length+b.length;
        int [] mergedArray = new int[lengthOfMergedArray];
        int pos=0;
        for (int element:a){
            mergedArray[pos]=element;
            pos++;
        }
        for (int element:b) {
            mergedArray[pos] = element;
            pos++;
        }
/*        Arrays.sort(mergedArray);
for (int i=0;i<mergedArray.length;i++){
    System.out.println(mergedArray[i]);
}*/
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int lenOfMerAr=a1.length+a2.length;
        int [] mergeArrays=new int[lenOfMerAr];
        int pos=0;
        for (int element:a1){
            mergeArrays[pos]=element;
            pos++;
        }
        for (int element:a2){
            mergeArrays[pos]=element;
            pos++;
        }
        Arrays.sort(mergeArrays);
        return mergeArrays; // your implementation here
    }
}