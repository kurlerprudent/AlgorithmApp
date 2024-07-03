public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
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