package algo.stackImplementList;

class Node{
    int data;   // data
    Node next;  // pointer to the next node

    public Node(int data){
        // set data in the allocated node and return it
        this.data = data;
        this.next = null;
    }

}



public class Queue {

    private static Node rear = null;
    private static Node front = null;
    private static int count = 0;

    // utility function to dequeue the front element
    public static int dequeue(){
        if (front==null){
            System.out.println("\nQueue underflow");
            System.exit(-1);
        }

        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);

        // advance front to the next node
        front = front.next;

        // if the list become empty
        if (front==null){
            rear = null;
        }
        // decrease the nodes count by 1;
        count -=1;

        // return the removed item
        return temp.data;

    }

    // utility function to add an element to the queue
    public static void enqueue(int item){
        // allocate new node in the heap
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);

        // special case; if queue was empty
        if (front==null){
            // initialize both front and rear
            front = node;
            rear = node;
        }else {
            // update rear
            rear.next = node;
            rear = node;
        }

        // increase the node's count by 1
        count +=1;

    }

    // utility function to return the top element in a queue
    public static int peek(){
        // check for empty queue
        if (front == null){
            System.exit(-1);
        }
        return front.data;
    }

    // utility function to check if the queue is empty or not
    public static boolean isEmpty(){
        return rear == null && front == null;
    }

    // Function to return the size of the queue
    private static int size(){
        return count;
    }


}

class Main{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.printf("The front element is %d\n", q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        if (q.isEmpty()){
            System.out.println("The queue is empty");
        }else System.out.println("The queue is not empty");

    }
}
