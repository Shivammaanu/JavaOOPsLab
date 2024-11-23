
public class ThreeDMatrix {

    // Ye method kisi specific position pe value set karta hai
    public static void setValue(int value, int indexX, int indexY, int indexZ, int[] array, int X, int Y, int Z) {
    
        // Formula for calculating the index based on 3D position
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        array[index] = value;
    }

    // Ye method kisi specific position se value get karta hai
    public static int getValue(int indexX, int indexY, int indexZ, int[] array, int X, int Y, int Z) {

        // Formula for calculating the index based on 3D position
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        return array[index]; // Array se value return karo
    }

    public static void main(String[] args) {
        // 3D array ka size define karo (3x3x3)
        int X = 3, Y = 3, Z = 3;
        int[] array = new int[X * Y * Z]; // Array ko size ke according initialize karo

        // Kuch values set karo specific positions pe
        setValue(22, 0, 0, 0, array, X, Y, Z);
        setValue(12, 1, 1, 1, array, X, Y, Z);
        setValue(18, 2, 2, 2, array, X, Y, Z);

        // Set ki gayi values ko print karo
        System.out.println("Value at (0, 0, 0): " + getValue(0, 0, 0, array, X, Y, Z));
        System.out.println("Value at (1, 1, 1): " + getValue(1, 1, 1, array, X, Y, Z));
        System.out.println("Value at (2, 2, 2): " + getValue(2, 2, 2, array, X, Y, Z));
    }
}
