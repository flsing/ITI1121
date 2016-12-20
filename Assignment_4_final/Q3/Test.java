/*
 * Test class in order to test the mothod indexOfAll
 * 
 */ 

public class Test {


    public static void main( String[] args ) {
      
       //Call to display StudentInfo
     StudentInfo.display();
      /**
       * Create a LinkedList object, this is the first of many.
       * 
       */
       LinkedList<String> list = new LinkedList<String>();
       
       /**
        * the first case tests Strings
        */
       list.addLast("A");
       list.addLast("B");
       list.addLast("A");
       list.addLast("A");
       list.addLast("C");
       list.addLast("D");
       list.addLast("7");
       
       System.out.println(ListUtil.indexOfAll(list, "A"));
       
        LinkedList<Integer> a = new LinkedList<Integer>();
       /**
        * the next case tests Integers
        */
       a.addLast(78);
       a.addLast(5);
       a.addLast(5);
       a.addLast(100);
       a.addLast(3);
       a.addLast(67);
       a.addLast(8);
       
       System.out.println(ListUtil.indexOfAll(a, 5));
       
        LinkedList<Double> b = new LinkedList<Double>();
       /**
        * the next case tests doubles and a case where you search for something that
        * is not in the LinkedList
        */
       b.addLast(1.0);
       b.addLast(2.09);
       b.addLast(19.4);
       b.addLast(9.0);
       b.addLast(19.4);
       b.addLast(4.7);
       b.addLast(6.5);
       
       System.out.println(ListUtil.indexOfAll(b, 10.4));
       
        LinkedList<Character> c = new LinkedList<Character>();
       /**
        * the next case tests Characters
        */
       c.addLast('b');
       c.addLast('d');
       c.addLast('2');
       c.addLast('g');
       c.addLast('l');
       c.addLast('l');
       c.addLast('l');
       
       System.out.println(ListUtil.indexOfAll(c, '2'));
       
               LinkedList<Character> d = new LinkedList<Character>();
       /**
        * the next case tests again for something that is not in the list. 
        */
       d.addLast('b');
       d.addLast('d');
       d.addLast('2');
       d.addLast('g');
       d.addLast('l');
       d.addLast('l');
       d.addLast('l');
       
       System.out.println(ListUtil.indexOfAll(d, '0'));
       
                   LinkedList<Character> e = new LinkedList<Character>();
       /**
        * the next case tests for an empty list.  
        */
       
       
       System.out.println(ListUtil.indexOfAll(e, '0'));
               LinkedList<Integer> z = new LinkedList<Integer>();
       /**
        * the final case tests a large list
        */
       z.addLast(78);
       z.addLast(5);
       z.addLast(5);
       z.addLast(100);
       z.addLast(3);
       z.addLast(67);
       z.addLast(8);
       z.addLast(5);
       z.addLast(100);
       z.addLast(3);
       z.addLast(67);
       z.addLast(8);
       z.addLast(5);
       z.addLast(78);
       z.addLast(5);
       z.addLast(5);
       z.addLast(100);
       z.addLast(3);
       z.addLast(67);
       z.addLast(8);
       z.addLast(5);
       z.addLast(100);
       z.addLast(3);
       z.addLast(67);
       z.addLast(8);
       z.addLast(5);
       
       System.out.println(ListUtil.indexOfAll(z, 5));
      
    }
}