import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlgorithmApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        boolean continueLooping = true;

        while (continueLooping) {
            System.out.println("Select an option: 1.Searching  2.Sorting  3. Quit");
            int choice = scanner.nextInt();

            //terminate the loop
            if (choice == 3) {
                continueLooping = false;

//Search program
            }else if (choice == 1) {
                System.out.print("Use 1.Linear search  2.Binary search");
                int searchOption = scanner.nextInt();
               switch (searchOption) {

//Linearsearch program
                case 1:
                    
                    System.out.println("Please enter number of items: ");
                    int numOfItems = scanner.nextInt();

                    int[] listOfItems = new int[numOfItems];

                    System.out.println("Enter the list of items: ");
                    for (int i=0; i<numOfItems;i++){
                        listOfItems[i] = scanner.nextInt();

                    }

                    System.out.println("Enter the value to search");
                    int SearchValue =  scanner.nextInt();

                    int finalValue = LinearSearch(listOfItems, SearchValue);

                    if(finalValue == -1){
                        System.out.println("The ite is not in the list");
                    }else {
                        finalValue = finalValue + 1;
                        System.out.println("The item is at the " + finalValue + " position");
                    }

                    System.out.println(finalValue);
                    break;
                

                case 2:
                    
                                    // Input the list of items
                        System.out.println("Enter the number of elements in the list:");
                        int n = scanner.nextInt();
                        int[] list = new int[n];

                        System.out.println("Enter the elements of the list:");
                        for (int i = 0; i < n; i++) {
                            list[i] = scanner.nextInt();
                        }

                        // Sort the list before performing binary search
                        Arrays.sort(list);

                        // Display the sorted list to the user
                        System.out.println("The sorted list is: " + Arrays.toString(list));

                        boolean found = false;
                        int value = 0;

                        // Loop until a valid value is found or user exits
                        while (!found && scanner.hasNext()) {
                            // Request the value to search
                            System.out.println("Enter the value to search or type 'exit' to quit:");
                            String input = scanner.next();

                            if (input.equalsIgnoreCase("exit")) { // Handle exit case (case-insensitive)
                                System.out.println("Exiting the search.");
                                break;
                            } else if (scanner.hasNextInt()) {
                                value = scanner.nextInt();

                                // Perform binary search and compute the running time
                                long startTime = System.nanoTime();
                                List<Integer> results = binarySearch(list, value);
                                long endTime = System.nanoTime();

                                if (!results.isEmpty()) {
                                    found = true;
                                    // Display the search result
                                    displaySearchResult(results, endTime - startTime);
                                } else {
                                    System.out.println("Element not found. Please try again.");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter a number or type 'exit' to quit.");
                                scanner.next(); // Clear invalid input
                            }
                        }

                        // Display the time complexity
                        System.out.println("Theoretical Time Complexity of Binary Search: O(log n)");

                       
                        break;
                    
                default:
                System.out.println("Enter a valid option");
                    break;

               }
               continue;

//The sorting options     

            }else if (choice == 2) {
                System.out.println("Select a sorting option: 1.Bubble sort 2.Merge sort 3. Selectionsort 4.Quick sort 5.Insertion sort");
                int sortingOptions = scanner.nextInt();

                switch (sortingOptions) {
                    case 1:

                    
                        // Prompt user to enter the number of elements
                        System.out.println("Enter the number of elements:");
                        int n = scanner.nextInt();
                        
                        // Create an array to store the elements
                        int[] list = new int[n];
                        
                        // Prompt user to enter the elements
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            list[i] = scanner.nextInt();
                        }
                        
                        // Record the start time
                        long startTime = System.nanoTime();
                        
                        // Perform bubble sort
                        bubbleSort(list);
                        
                        // Record the end time
                        long endTime = System.nanoTime();
                        
                        // Display the sorted list
                        System.out.println("Sorted list: ");
                        for (int element : list) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                        
                        // Display the running time
                        System.out.println("Running time: " + (endTime - startTime) + " ns");
                        
                        // Display the time complexity
                        System.out.println("Time complexity: O(n^2)");
                        
                        
                        
                        break;

                    case 2:
                    System.out.println("Merge sort");
                    //Merge sort program starts here
                    System.out.println("Welcome to Merge Sort!");
                    sortWithMergeSort(scanner);
                        break;

//Selection sort Program                        
                    case 3: 
                    
                    sortWithSelectionSort(scanner);
                        break;

                    
                        case 4:
//Quick sort program      
                            
                            System.out.print("Enter the number of elements to sort: ");
                            int numElements = scanner.nextInt();
                            int[] inputArray = new int[numElements];

                            System.out.println("Enter the elements:");
                            for (int i = 0; i < numElements; i++) {
                                inputArray[i] = scanner.nextInt();
                            }

                            // Sort the input array using quick sort
                            quickSort(inputArray, 0, numElements - 1);

                            // Print the sorted array
                            System.out.print("Sorted array: ");
                            for (int element : inputArray) {
                                System.out.print(element + " ");
                            }
                            System.out.println();

                        break;   
                        
                        case 5:
//For Insertion sort               
                            System.out.print("Enter the number of elements: ");
                             numElements = scanner.nextInt();

                             inputArray = new int[numElements];

                            System.out.println("Enter the elements:");
                            for (int i = 0; i < numElements; i++) {
                            inputArray[i] = scanner.nextInt();
                            }

                            insertionSort (inputArray);

                            System.out.println("Sorted inputArrayay: ");
                            for (int num : inputArray) {
                                System.out.print(num + " ");
                            }

System.out.println("\nBig O Notation: O(n^2)");
                            break;

                    default:
                        break;
                }

                continue;
            }
        }
        
    }



    //For Linear search 

    public static int LinearSearch( int[] arr, int SearchValue) {

        for (int k =0; k < arr.length; k++) {
            if (arr[k] == SearchValue) {
                return k;
            }

        }return -1;
    }

    //For Binary search

     public static List<Integer> binarySearch(int[] array, int value) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;

        // First binary search to find one occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                // Find all occurrences on the left side
                int temp = mid;
                while (temp >= 0 && array[temp] == value) {
                    result.add(temp);
                    temp--;
                }
                // Find all occurrences on the right side
                temp = mid + 1;
                while (temp < array.length && array[temp] == value) {
                    result.add(temp);
                    temp++;
                }
                break;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void displaySearchResult(List<Integer> results, long timeElapsed) {
        System.out.println("Element found at indexes: " + results);
        System.out.println("Time elapsed (nanoseconds): " + timeElapsed);
    }

    //For Bubble sort

    public static void bubbleSort(int[] list) {
        int n = list.length;
        // Outer loop to iterate over the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element is greater than the next element
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }


    //For Merge sort

    private static void sortWithMergeSort(Scanner scanner) {
        System.out.println("\nEnter the number of elements in the list:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
    
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
          arr[i] = scanner.nextInt();
        }
    
        long startTime = System.nanoTime();
        mergeSort(arr, 0, n - 1);
        long endTime = System.nanoTime();
    
        System.out.println("Sorted list:");
        for (int num : arr) {
          System.out.print(num + " ");
        }
        System.out.println("\nTime taken for sorting: " + (endTime - startTime) + " nanoseconds");
      }
    
      // 204 MERGE SORT
      public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
          // Find the middle point of the array
          int mid = left + (right - left) / 2;
    
          // Sort the first and second halves of the array
          mergeSort(arr, left, mid);
          mergeSort(arr, mid + 1, right);
    
          // Merge the sorted halves back together
          merge(arr, left, mid, right);
        }
      }
    
      private static void merge(int[] arr, int left, int mid, int right) {
        // Create temporary arrays to hold left and right halves
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
    
        // Copy data to temporary arrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);
    
        // Merge the temporary arrays back into arr[left..right]
    
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
          if (leftArr[i] <= rightArr[j]) {
            arr[k] = leftArr[i];
            i++;
          } else {
            arr[k] = rightArr[j];
            j++;
          }
          k++;
        }
    
        // Copy the remaining elements of leftArr, if there are any
        while (i < n1) {
          arr[k] = leftArr[i];
          i++;
          k++;
        }
    
        // Copy the remaining elements of rightArr, if there are any
        while (j < n2) {
          arr[k] = rightArr[j];
          j++;
          k++;
        }
      }

      //For Selection sort

      private static void sortWithSelectionSort(Scanner scanner) {
        System.out.println("\nEnter the number of elements in the list:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        long endTime = System.nanoTime();
        System.out.println("Sorted list:");
        for (int num : arr) {
            System.out.print(num + " ");
        }  
        System.out.println("\nTime taken for sorting: " + (endTime - startTime) + " nanoseconds");
    }

    //For Quick sort

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] < pivot) {
                i++;
            }
            while (j > low && arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        swap(arr, low, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //For Insertion sort

    public static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int key = inputArray[i];
            int j = i - 1;

            while (j >= 0 && inputArray[j] > key) {
             inputArray[j + 1] = inputArray[j];
                j--;
            }

         inputArray[j + 1] = key;
        }
    }
}
