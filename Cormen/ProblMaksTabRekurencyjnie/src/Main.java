public class Main {
    public static void main(String[] args) {
        int tab[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int low = 0;
        int high = tab.length;
    }

    public static int[] findMaximumSubarray(int tab[], int low, int high){
        int tab2[] = new int[3];
        int mid = 0;
        if (high == low) {
            tab2[0] = low; tab2[1] = high; tab2[2] = tab[low];
            return tab2;
        } else {
            mid = high/2;
        }


        return tab2;
    }
}
