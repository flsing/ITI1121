public class LinkedListQueues {
 public static void main(String[] args) {

  QueueLL<Integer> myqueue= new QueueLL<Integer>(); 

  myqueue.enqueue(55);
  myqueue.enqueue(44);  
  myqueue.enqueue(33);  
  myqueue.enqueue(22);  
  myqueue.enqueue(11);  

  System.out.println("Initially MyQueue -->" + myqueue.toString());

  myqueue.dequeue();

  System.out.println("After Dequeuing MyQueue -->" + myqueue.toString());

  myqueue.enqueue(99);

  System.out.println("After Enqueuing MyQueue -->" + myqueue.toString());

 }
}
