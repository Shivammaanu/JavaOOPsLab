// NumberTable class jo ek table print karega numbers ke square aur cube ke saath
class NumberTable {
    
    void printTable() {
        
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Cube"); //%-10s ka matlab string k baad 10 char ka space
        for (int i = 0; i <= 10; i++) { 
            
            System.out.printf("%-10d%-10d%-10d%n", i, i * i, i * i * i);
        }
        System.out.println();
    }
}

public class TableApp {
    public static void main(String[] args) {
        
        NumberTable table = new NumberTable();
        table.printTable(); // Table ko print karne ka method call
    }
}
