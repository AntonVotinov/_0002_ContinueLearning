import java.util.Arrays;

public class d20220710StepikArraysMergeAndSortTrickyDecision {
    public static void main(String[] args) {
        int[] a1,a2;
        a1= new int[]{1, 22, 3, 44, 5};
        a2= new int[]{111, 5, 9};
        int [] merArr=mergeArrays(a1,a2);
        System.out.println(Arrays.toString(merArr));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int n = a1.length, m = a2.length;
        int i = 0, j = 0;
        int[] array = new int[n + m];

        while (i < n || j < m)
            array[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];

        return array;
    }
}
