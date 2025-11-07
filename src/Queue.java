public class Queue {
    Node front;
    Node rear;
    int size;

    public Queue () {
        front = rear = null;
        size = 0;

    }
    public void enqueue(int data ) {
        Node newNode = new Node (data);
        if (rear == null ) {
            front = rear = newNode;

        }
        else {
            rear.next = newNode ;
            rear = newNode;

        }
        size ++;


    }
    public int dequeue() {
        if ( front == null) {
            System.out.println("kuyruk boş.");
            return -1;

        }
        int value = front.data;
        front = front.next;
        if (front == null )
            rear = null;
        size--;
        return value;

    }
    public boolean isEmpty() {
        return front == null;

    }
    public void printQueue () {
        Node temp = front;
        while ( temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args){
        Queue q1 = new Queue ();
        Queue q2 = new Queue ();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        q1.printQueue();
        q1.printQueue();

        System.out.println ( " eşit mi ? " + QueueUtils.areEqual ( q1 , q2 ));

        q2.dequeue();
        q2.enqueue(40);

        System.out.println ( " eşit mi ? " + QueueUtils.areEqual ( q1 , q2 ));


    }


}
