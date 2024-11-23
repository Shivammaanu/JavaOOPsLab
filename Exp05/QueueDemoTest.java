

interface QueueImpl {
    void insert(int value) throws Exception; // Element ko queue mein insert karne ke liye
    void delete() throws Exception;          // Queue se element delete karne ke liye
    void display();                          // Queue ko display karne ke liye
}

class QueueDemo implements QueueImpl {
    private int[] queueArray;       // Queue ko store karne ke liye array
    private int front, rear, size;  // Queue ke pointers aur size
    private static final int MAX_CAPACITY = 10; // Queue ka maximum size

    // Constructor to initialize the queue
    public QueueDemo() {
        queueArray = new int[MAX_CAPACITY];
        front = -1;
        rear = -1;
        size = 0;
    }

    @Override
    public void insert(int value) throws Exception {
        
        if (size == MAX_CAPACITY) {
            throw new Exception("Queue Overflow! Can't insert more element.");
        }

        // Rear ko circularly adjust karo agar limit cross kare
        if (rear == MAX_CAPACITY - 1) {
            rear = -1;
        }

        queueArray[++rear] = value; // Rear ko increment karke value store 
        size++; // Queue ka size badhao
        System.out.println(value + " add in Queue.");
    }

    @Override
    public void delete() throws Exception {
        
        if (size == 0) {
            throw new Exception("Queue Underflow! No Element in Queue.");
        }

        // Front se element delete karo
        int deletedValue = queueArray[++front];  
        if (front == MAX_CAPACITY - 1) {
            front = -1; // Circularly adjust karo agar end pe ho
        }
        size--; // Queue ka size kam karo
        System.out.println(deletedValue + " Deleted from queue.");
    }

    @Override
    public void display() {
        // Queue empty condition check
        if (size == 0) {
            System.out.println("Queue is Empty Now.");
            return;
        }

        System.out.print("Current queue: ");
        int count = 0;
        for (int i = front + 1; count < size; i = (i + 1) % MAX_CAPACITY) {
            System.out.print(queueArray[i] + " ");
            count++;
        }
        System.out.println();
    }
}

public class QueueDemoTest {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo(); 
        
        try {
            // Queue mein elements add karo
            queue.insert(5);
            queue.insert(10);
            queue.insert(15);
            queue.insert(20);
            queue.insert(25);

            System.out.println();
            
            queue.display(); // Queue ka state 
            System.out.println();
            
            queue.delete(); 
            queue.delete(); 

            System.out.println();  
            queue.display(); // Queue ka updated state
            System.out.println();
            
            queue.insert(30);
            queue.insert(35);
            
            System.out.println();

            queue.display(); // Queue ka final state 
            
            System.out.println();
           
            queue.delete();
            queue.delete(); 
            queue.delete(); 
            queue.delete(); 
            queue.delete(); 
            queue.delete(); 

            
        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception: " + e.getMessage()); // Exception message print karo
        }
    }
}
