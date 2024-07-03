public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}