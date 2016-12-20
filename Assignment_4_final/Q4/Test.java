public class Test {


    public static void main( String[] args ) {
      
      StudentInfo.display();
      //creates a SinglyLinkedList fof Integer type
      SinglyLinkedList<Integer> a = new SinglyLinkedList<Integer>();
      a.addFirst(8);
      a.addFirst(3);
      a.addFirst(5);
      a.addFirst(6);
      a.addFirst(9);
      
       System.out.println(a.take(4)); // calls public mathod take and passes parameter int n
       
       //creates a SinglyLinkedList for String type
       SinglyLinkedList<String> b = new SinglyLinkedList<String>();
      b.addFirst("one");
      b.addFirst("two");
      b.addFirst("three");
      b.addFirst("four");
      b.addFirst("five");
      
       System.out.println(b.take(2)); // calls public mathod take and passes parameter int n
       
       //creates a SinglyLinkedList for Double type
        SinglyLinkedList<Double> c = new SinglyLinkedList<Double>();
      c.addFirst(10.4);
      c.addFirst(5.0);
      c.addFirst(1.0);
      c.addFirst(14.7);
      c.addFirst(435.63);
      
       System.out.println(c.take(4));// calls public mathod take and passes parameter int n
       
      
        System.out.println(c.take(0)); // calls public mathod take and passes parameter int n being 
        
        /* calls public method a with parameter -13
         * throws an UnsupportedOperationException exception 
         * because -13 does not exist
        System.out.println(c.take(-13)); 
        */
        
        /*calls public method a with parameter 10
         * throws an UnsupportedOperationException exception 
         * because the list does not contain 10 elements
          System.out.println(c.take(10));
          */
          
          SinglyLinkedList<Double> d = new SinglyLinkedList<Double>();
          
           /*calls public method a with parameter 3
            * throws an UnsupportedOperationException exception 
            * because the list is empty 
            *  System.out.println(d.take(3));
            */
    }
}