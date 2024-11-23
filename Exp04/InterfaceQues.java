

interface Function {
    public int evaluate(int param);
}

// Half class jo Function ko implement karti hai
class Half implements Function {
    // Half ka logic implement kiya
    public int evaluate(int param) {
        return param / 2; 
    }
}

public class InterfaceQues {
    // Method to calculate half of all elements in the array
    public static int[] calculateHalfArray(int[] inputArray) {
        int arrayLength = inputArray.length; 
        int[] resultArray = new int[arrayLength]; // Result store karne ke liye array

        Half halfFunction = new Half();

        // Har element ka half calculate karo
        for (int i = 0; i < arrayLength; i++) {
            resultArray[i] = halfFunction.evaluate(inputArray[i]);
        }

        return resultArray; 
    }

    public static void main(String[] args) {
    
        int[] inputArray = {8, 9, 3, 5, 12, 4, 18, 22};

        // Half values calculate karo
        int[] halfArrayResult = calculateHalfArray(inputArray);

        
        System.out.println("Original Array:");
        for (int value : inputArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        
        System.out.println("Half Array:");
        for (int value : halfArrayResult) {
            System.out.print(value + " ");
        }
    }
}
