public class Main {
    public static void main(String[] args) {
        int tab[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int tab3[] = {-50,-4,-4,-50};
        int low = 0;
        int mid = tab3.length/2;
        int high = tab3.length;

        int tab2[] = findMaxCrossingSubarray(tab3,low,mid-1,high);
        System.out.println(tab2[0] + " " + tab2[1] + " " + tab2[2]);

    }

    public static int[] findMaxCrossingSubarray(int tab[], int low, int mid, int high) {
        int leftSum = -100;
        int sum = 0;
        int maxLeft = 0;

        for(int i = mid; i>low; i--) {
            sum = sum + tab[i];
            System.out.println("sum = " +sum);
            if(sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        sum = 0;
        int rightSum = -100;
        int maxRight = 0;

        for(int i = mid +1; i<high; i++) {
            sum = sum + tab[i];
            if(sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }

        int tab2[] = {maxLeft, maxRight, leftSum+rightSum};
        return tab2;
    }
}
