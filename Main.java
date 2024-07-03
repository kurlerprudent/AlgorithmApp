import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLooping = true;
        while (continueLooping) {
            System.out.println("Please Choose an option(Enter a number): 1.Search Algorithm     2.Sort Algorithm 3.Exit");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Please choose a search algorithm method to use: 1.Linear Search     2.Binary Search     3.Previous");
                String searchOption = scanner.nextLine().toLowerCase();

                if (searchOption.equals("linear search") || searchOption.equals("1")) {
                    System.out.println("Linear Search Algorithm...");
                    
                    // This is the code for Linear Search
                    System.out.print("Enter the size of the array for Linear Search: ");
                    int linearSize = scanner.nextInt();
                    int[] linearArray = new int[linearSize];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < linearSize; i++) {
                        linearArray[i] = scanner.nextInt();
                    }

                    System.out.print("Enter the element to search for: ");
                    int linearElement = scanner.nextInt();
                    LinearSearch linearSearch = new LinearSearch(linearArray);
                    int linearResult = linearSearch.search(linearElement);
                    System.out.println("Linear Search Result: " + linearResult);
       
                }else if (searchOption.equals("binary search") || searchOption.equals("2")) {
                     // Binary Search
                    System.out.print("Enter the size of the array for Binary Search: ");
                    int binarySize = scanner.nextInt();
                    int[] binaryArray = new int[binarySize];
                    System.out.println("Enter the elements of the array (in sorted order):");
                    for (int i = 0; i < binarySize; i++) {
                    binaryArray[i] = scanner.nextInt();
                    }
                    System.out.print("Enter the element to search for: ");
                    int binaryElement = scanner.nextInt();
                    BinarySearch binarySearch = new BinarySearch(binaryArray);
                    int binaryResult = binarySearch.search(binaryElement);
                    System.out.println("Binary Search Result: " + binaryResult);

       
                }else if(searchOption.equals("previous") || searchOption.equals("3")){
                    System.out.println("Going back to the main menu....");
                    continue;
                }
                
                else{
                    System.out.println("Please enter a valid option");
                }
                }else if (choice.equals("2")) {
                    System.out.println("Sorting Algorithm...");
                    System.out.println("Please select a sort algorith:  1.Quick Sort   	2.Bubble Sort    3.Selection Sort    4.Insertion Sort    5.Merge Sort   6.Previous");
                    String sortOption = scanner.nextLine().toLowerCase();
                    switch (sortOption) {

                        case "1":
                            System.out.println("Bubble Sorting...");
                             // Code for Quick Sort
                            System.out.print("Enter the size of the array for Quick Sort: ");
                            int quickSize = scanner.nextInt();
                            int[] quickArray = new int[quickSize];
                            System.out.println("Enter the elements of the array:");
                            for (int i = 0; i < quickSize; i++) {
                                quickArray[i] = scanner.nextInt();
                            }
                            QuickSort quickSort = new QuickSort(quickArray);
                            quickSort.sort();
                            System.out.println("Quick Sort Result: ");
                            quickSort.printArray();
                            break;
                        case "2":
                            System.out.println("Bubble Sorting....");

                            // Bubble Sort
                            System.out.print("Enter the size of the array for Bubble Sort: ");
                            int bubbleSize = scanner.nextInt();
                            int[] bubbleArray = new int[bubbleSize];
                            System.out.println("Enter the elements of the array:");
                            for (int i = 0; i < bubbleSize; i++) {
                                bubbleArray[i] = scanner.nextInt();
                            }
                            BubbleSort bubbleSort = new BubbleSort(bubbleArray);
                            bubbleSort.sort();
                            System.out.println("Bubble Sort Result: ");
                            bubbleSort.printArray();

                            break;

                        case "3":
                            System.out.println("Selection Sorting...");    
                              // Here is the code for Selection Sort
                            System.out.print("Enter the size of the array for Selection Sort: ");
                            int selectionSize = scanner.nextInt();
                            int[] selectionArray = new int[selectionSize];
                            System.out.println("Enter the elements of the array:");
                            for (int i = 0; i < selectionSize; i++) {
                                selectionArray[i] = scanner.nextInt();
                            }
                            SelectionSort selectionSort = new SelectionSort(selectionArray);
                            selectionSort.sort();
                            System.out.println("Selection Sort Result: ");
                            selectionSort.printArray();
                            break;

                        case "4":
                            System.out.println("Insertion Sorting...");
                             // Insertion Sort
                            System.out.print("Enter the size of the array for Insertion Sort: ");
                            int insertionSize = scanner.nextInt();
                            int[] insertionArray = new int[insertionSize];
                            System.out.println("Enter the elements of the array:");
                            for (int i = 0; i < insertionSize; i++) {
                                insertionArray[i] = scanner.nextInt();
                            }
                            InsertionSort insertionSort = new InsertionSort(insertionArray);
                            insertionSort.sort();
                            System.out.println("Insertion Sort Result: ");
                            insertionSort.printArray();  
                            break;
                            
                        case "5":
                            System.out.println("Merge Sorting... ");    
                            MergeSort mergeSortOOP = new MergeSort();
                            mergeSortOOP.run();
                            break;
                        case "6":
                            System.out.println("Going to the previous menu...");   
                            break; 
                        default:
                            System.out.println("Please enter a valid option");
                            break;
                    }
                }else if (choice.equals("3") || choice.equals("exit")) {
                    System.out.println("Program exiting....");
                    continueLooping = false;
                }else{
                    System.out.println("Please Enter a valid input!");
                }
           
                
            } 
                
            }       

       
        
    
}