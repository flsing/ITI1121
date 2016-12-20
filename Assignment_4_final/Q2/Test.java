/**
 * Test class in order to test the method insertAfter. The method
 * to insert an LinkedList inside another LinkedList after the first
 * occurence of an object. The other LinkedList is then empty.  
 *
 */ 

public class Test {


    public static void main( String[] args ) {

      //call to display StudentInfo
     StudentInfo.display();
     
     //Create the two LinkedLists
     LinkedList<String> xs = new LinkedList<String>();
     LinkedList<String> ys = new LinkedList<String>();
     
     //adding elements to the xs list
     xs.addLast("a");
     xs.addLast("b");
     xs.addLast("c");
     xs.addLast("f");
     
     //adding elements to the ys list
     ys.addLast("d");
     ys.addLast("e");
     
     //System.out.println(ys);
     //call to the insert after method
     xs.insertAfter("c",ys);
     
     //print the two lists
     System.out.println(xs.toString());
     //System.out.println(ys);
     
     /*
      * other test programs follow
      */
     
     //integer linked list
     LinkedList<Integer> a = new LinkedList<Integer>();
     LinkedList<Integer> b = new LinkedList<Integer>();
          
     a.addLast(1);
     a.addLast(2);
     a.addLast(3);
     a.addLast(6);
     
     
     b.addLast(4);
     b.addLast(5);
     
     //System.out.println(b);
     a.insertAfter(3,b);
     
     //print the two lists
     System.out.println(a.toString());
     //System.out.println(b);
     
          //integer linked list where there are many obj
     LinkedList<Integer> c = new LinkedList<Integer>();
     LinkedList<Integer> d = new LinkedList<Integer>();
          
     c.addLast(1);
     c.addLast(2);
     c.addLast(3);
     c.addLast(6);
     c.addLast(3);
     
     
     d.addLast(4);
     d.addLast(5);
     d.addLast(19);
     
     //System.out.println(d);
     c.insertAfter(3,d);
     
     //print the two lists
     System.out.println(c.toString());
     //System.out.println(d);
     
     //Integer linked list where the obj doesnt exist in the list
     LinkedList<Integer> e = new LinkedList<Integer>();
     LinkedList<Integer> f = new LinkedList<Integer>();
          
     e.addLast(1);
     e.addLast(2);
     e.addLast(3);
     e.addLast(6);
     e.addLast(3);
     
     
     f.addLast(4);
     f.addLast(5);
     
     
     //System.out.println(f);
     c.insertAfter(10,f);
     
     //print the two lists
     System.out.println(e.toString());
     //System.out.println(f);
     
     
      //Integer linked list in which the first one is empty
     LinkedList<Integer> g = new LinkedList<Integer>();
     LinkedList<Integer> h = new LinkedList<Integer>();
   
     h.addLast(4);
     h.addLast(5);
     
     
     //System.out.println(h);
     g.insertAfter(10,h);
     
     //print the two lists
     System.out.println(g.toString());
     //System.out.println(h);
     
     
     
      //Integer linked list in which the second one is empty
     LinkedList<Integer> i = new LinkedList<Integer>();
     LinkedList<Integer> j = new LinkedList<Integer>();
   
     i.addLast(1);
     i.addLast(2);
     i.addLast(3);
     i.addLast(6);
     i.addLast(3);
     

     
     //System.out.println(j);
     i.insertAfter(3,j);
     
     //print the two lists
     System.out.println(i.toString());
     //System.out.println(j);
    }
}
