
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLooping = true;

        while (continueLooping) {
            System.out.println("Choose an option: 1.Brute force Algorithm   2.Exhuastion  Algorithm   3.Quit");

            int choice = scanner.nextInt();

            if (choice==3) {
                continueLooping = false;
            }
//Brute Force Algorithm options
            if (choice==1) {
                System.out.println("Select a Brute force Algorithm option");
                System.out.println("1.Brute force Bubble sort algorithm   2.Brute force Selection sort algorithm   3.Brute force String Matching   4.Brute force Plynoial Evaluation    5.Closest-Ponits Brute force");

                int bruteForceChoice = scanner.nextInt();

                switch (bruteForceChoice) {
                    case 1:
//The sorting Algorithm program goes here

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
 //Selection sort Program                        
                case 2: 
                        sortWithSelectionSort(scanner);
                    break;
//String matching program
                    case 3:
                    System.out.print("Enter the text to search: ");
                    String textString = scanner.nextLine();
                    
                    System.out.println("Enter the pattern to search for: ");
                    String pattern = scanner.nextLine();
                    
                     startTime = System.nanoTime();
                    int result = bruteForceSearch(textString, pattern);
                    endTime = System.nanoTime();
                    System.out.println("Running time: " + (endTime - startTime) + " ns");
                    if (result == -1) {
                        System.out.printf("The pattern '%s' was not found in the text.\n", pattern);
                    } else {
                        System.out.printf("The pattern '%s' was found at index %d.\n", pattern, result);
                    }
                    System.out.println("Time complexity: O(n)");
                       break;   

 //Polynomial Evaluation                   
                    case 4:

                    System.out.print("Enter the degree of the polynomial: ");
                    int degree = scanner.nextInt();
            
                    // Get the coefficients of the polynomial from the user
                    double[] coefficients = new double[degree + 1];
                    System.out.println("Enter the coefficients (starting from the highest degree):");
                    for (int i = 0; i <= degree; i++) {
                        System.out.print("Coefficient for x^" + (degree - i) + ": ");
                        coefficients[i] = scanner.nextDouble();
                    }
            
                    // Get the value to evaluate the polynomial at from the user
                    System.out.print("Enter the value to evaluate the polynomial at: ");
                    double x = scanner.nextDouble();
            
                    // Evaluate the polynomial using the brute force method
                    double finalResult = evaluatePolynomial(coefficients, x);
            
                    // Print the result
                    System.out.println("The value of the polynomial is: " + finalResult);
                        break;
                         

 //Closest -Pair program                       
                    case 5:

                    System.out.print("Enter the number of points: ");
                     n = scanner.nextInt();
            
                    double[][] points = new double[n][2];
            
                    System.out.println("Enter the coordinates of the points (x y):");
                    for (int i = 0; i < n; i++) {
                        points[i][0] = scanner.nextDouble(); // x-coordinate
                        points[i][1] = scanner.nextDouble(); // y-coordinate
                    }
            
                    double[] closestPair = findClosestPair(points);
            
                    System.out.println("The closest pair of points is: (" + closestPair[0] + ", " + closestPair[1] + ") and (" + closestPair[2] + ", " + closestPair[3] + ")");
                    System.out.println("The distance between them is: " + closestPair[4]);
                        break;    
            
                    default:
                    System.out.println("Error, Enter a valid option");
                        break;

                    
                
            }
            }


            if (choice == 2) {
                System.out.println("Exhaustive Search Program, Select an option: ");
                System.out.println("1.Backtracking(N-Queen's Problem)   2.Branch and Bound(Knapsack Problem)   3.Divide and Conquer(Fibonacci sequence)");
                int exhaustiveSearchChoice = scanner.nextInt();


                switch (exhaustiveSearchChoice) {

 //Backtracking Program                   
                    case 1:
                    System.out.print("Enter the number of queens: ");
                    int n = scanner.nextInt();
                    int[][] board = new int[n][n];
                    if (solveNQueens(board, 0)) {
                        System.out.println("Solution found:");
                        printBoard(board);
                    } else {
                        System.out.println("No solution found.");
                    }
                        break;

//Branch and Bound Program
                    case 2:

                    System.out.print("Enter the number of items: ");
                     n = scanner.nextInt();
                    int[] weights = new int[n];
                    int[] values = new int[n];
                    System.out.println("Enter the weights and values of the items:");
                    for (int i = 0; i < n; i++) {
                        weights[i] = scanner.nextInt();
                        values[i] = scanner.nextInt();
                    }
                    System.out.print("Enter the knapsack capacity: ");
                    int capacity = scanner.nextInt();
                    int maxValue = knapSack(weights, values, capacity, n);
                    System.out.println("The maximum value that can be put in the knapsack is: " + maxValue);
                        break;    
                
//Divide and conquer
                    case 3:

                    System.out.print("Enter the index of the Fibonacci number: ");
                     n = scanner.nextInt();
                    int fibNumber = fibonacci(n);
                    System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);
                        break;    
                    default:
                        break;
                }
            }
        }

    }
//For Bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

    //For String matching

  
        public static int bruteForceSearch(String text, String pattern) {
            int n = text.length();
            int m = pattern.length();
            
            for (int i = 0; i <= n - m; i++) {
                if (text.substring(i, i + m).equals(pattern)) {
                    return i;
                }
            }
            
            return -1;
        }

        //For Polynomial Evaluation

        private static double evaluatePolynomial(double[] coefficients, double x) {
            int degree = coefficients.length - 1;
            double result = 0;
    
            for (int i = 0; i <= degree; i++) {
                result += coefficients[i] * Math.pow(x, degree - i);
            }
    
            return result;
        }
    

    // For Closest Points
    
    
    public static double[] findClosestPair(double[][] points) {
        double minDistance = Double.MAX_VALUE;
        double[] closestPair = new double[5];

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = calculateDistance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPair[0] = points[i][0];
                    closestPair[1] = points[i][1];
                    closestPair[2] = points[j][0];
                    closestPair[3] = points[j][1];
                    closestPair[4] = distance;
                }
            }
        }

        return closestPair;
    }

    public static double calculateDistance(double[] point1, double[] point2) {
        double dx = point1[0] - point2[0];
        double dy = point1[1] - point2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }

    //For Backtracking

    public static boolean solveNQueens(int[][] board, int row) {
        int n = board.length;
        if (row == n) {
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (solveNQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        // Check this row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Check lower diagonal on the left side
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    //For Branch and Bound

    public static int knapSack(int[] weights, int[] values, int capacity, int n) {
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }


    //For Divide and conquer
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}