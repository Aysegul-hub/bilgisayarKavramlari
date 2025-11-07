public class QueueUtils {
    public static boolean areEqual(Queue q1, Queue q2){
        if (q1.size != q2.size )
            return false;

        Node n1 = q1.front;
        Node n2 = q2.front;

        while ( n1 != null && n2 != null ) {
            if ( n1.data != n2.data)
                return false;
            n1 = n1.next;
            n2 = n2.next;

        }
        return true;

    }
}
