public class LinearSearch {
    private int[] array;

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public int search(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}