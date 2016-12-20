/**
 * Test class in order to test the method count. The method
 * returns the number of elements in the tree that are greater than 
 * or equal to low and smaller then or equal to high. 
 *
 */

public class Test {


    public static void main( String[] args ) {

     //call to display StudentInfo
     StudentInfo.display();
     
     
    //First test class. using integers. 
     BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
     
     //adding elements to BST
     t.add(1);
     t.add(2);
     
     t.add(3);
     t.add(4);
     t.add(5);
     t.add(6);
     t.add(7);
     t.add(8);
     
     t.toString();
     //System.out.println(t);
     
     //test method
     System.out.println(t.count( 3, 6));
     
     //test empty BST
     //BinarySearchTree<Integer> b = new BinarySearchTree<Integer>();
     //System.out.println(b.count(0, 0));
     
     //next test, with strings. 
    BinarySearchTree<String> a = new BinarySearchTree<String>();
     
     a.add("A");
     a.add("B");
     a.add("C");
     a.add("D");
     a.add("E");
     a.add("F");
     a.add("G");
     a.add("H");
     
     a.toString();
     //System.out.println(a);
     System.out.println(a.count( "D", "F"));
     
     //next test, the count variable are not there. 
    BinarySearchTree<String> b = new BinarySearchTree<String>();
     
     b.add("A");
     b.add("B");
     b.add("C");
     b.add("D");
     b.add("E");
     b.add("F");
     b.add("G");
     b.add("H");
     
     b.toString();
     //System.out.println(b);
     System.out.println(b.count( "W", "Z"));
     
     //next test, goes from largest to smallest 
    BinarySearchTree<String> c = new BinarySearchTree<String>();
     
     c.add("A");
     c.add("B");
     c.add("C");
     c.add("D");
     c.add("E");
     c.add("F");
     c.add("G");
     c.add("H");
     
     c.toString();
     //System.out.println(c);
     System.out.println(c.count( "F", "D"));
     
     //next test, should return only 1 element
    BinarySearchTree<String> d = new BinarySearchTree<String>();
     
     d.add("A");
     d.add("B");
     d.add("C");
     d.add("D");
     d.add("E");
     d.add("F");
    
     d.toString();
     //System.out.println(d);
     System.out.println(d.count( "A", "A"));
     
    
    }
}