public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}