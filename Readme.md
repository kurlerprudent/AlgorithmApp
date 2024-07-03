# Algorithm for the Program




# 1. User Input and Menu:

- The program begins by initializing a `Scanner` object to get user input.
- It enters a loop that continues until the user chooses to quit (option 3).
- Inside the loop, the program presents a menu with three options:
    - Search (option 1)
    - Sort (option 2)
    - Quit (option 3)

**2. Searching:**

- If the user selects Search (option 1), it asks for a sub-option:
    - Linear Search (option 1)
    - Binary Search (option 2)

# 1.1 Linear Search (O(n)):

- The user enters the number of items and their values.
- The `LinearSearch` function iterates through the list and checks if the search value matches any element.
- If found, it returns the index of the element, otherwise -1.

# 1.2 Binary Search O(log n) :

- The user enters the number of elements, their values (which must be sorted beforehand), and the value to search.
- The program first sorts the list using `Arrays.sort`.
- The `binarySearch` function performs a recursive binary search on the sorted list.
- It keeps track of the left and rightmost indexes and compares the search value with the middle element.
- If a match is found, it searches for all occurrences on both sides of the middle element and returns a list of indexes.
- If not found, it adjusts the search range based on the comparison result and continues recursively.

# 2. Sorting:

- If the user selects Sort (option 2), it presents a menu with different sorting algorithms:
    - Bubble Sort (option 1)
    - Merge Sort (option 2)
    - Selection Sort (option 3)
    - Quick Sort (option 4)
    - Insertion Sort (option 5)

# 2.1 Bubble Sort O(n^2):

- The user enters the number of elements and their values.
- The `bubbleSort` function uses nested loops to iterate through the list.
- In the inner loop, it compares adjacent elements and swaps them if they are in the wrong order.
- This process continues for all passes until no swaps are needed, indicating a sorted list.
Running time: 6300 ns

# 2.2 Merge Sort O(n log n):

- The user enters the number of elements and their values.
- The `sortWithMergeSort` function calls the `mergeSort` function recursively to divide the list into halves, sort them, and then merge them back in sorted order.
- The `mergeSort` function finds the middle index, sorts the left and right halves recursively, and then merges them using the `merge` function.
- The `merge` function uses temporary arrays to hold the left and right halves, compares elements, and merges them back into the original array in sorted order.
Runnung time: 14200 nanoseconds


 # 2.3 Selection Sort  O(n^2):

- The user enters the number of elements and their values.
- The `sortWithSelectionSort` function finds the minimum element in the unsorted part of the list and swaps it with the first element.
- This process continues by shrinking the unsorted part by one and finding the minimum element in the remaining unsorted portion.
Running time = 1400 nanoseconds

# 2.4 Quick Sort O(n log n):

- The user enters the number of elements and their values.
- The `quickSort` function uses a recursive approach to divide the list into partitions.
- It chooses a pivot element (usually the first element) and partitions the list around the pivot such that elements less than the pivot are on the left and elements greater than the pivot are on the right.
- It then recursively sorts the left and right partitions.


# 2.5 Insertion Sort O(n^2):

- The user enters the number of elements and their values.
- The `insertionSort` function iterates through the list.
- For each element, it compares it with the elements before it and shifts them one position to the right if they are greater.
- This effectively inserts the current element in its correct sorted position.

# Time Complexity:

- Each sorting function includes comments mentioning its theoretical time complexity (e.g., O(n^2) for Bubble Sort, O(log n) for Binary Search).


