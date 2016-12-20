/**
 * ITI 1521. Introduction à l'informatique II
 * ITI 1121. Introduction to Computer Science II 
 *
 * @author Marcel Turcotte, Université d'Ottawa/University of Ottawa
 */

public class StackMain {

    public static void main( String[] args ) {

        Stack<Integer> s;
        s = new ArrayStack<Integer>(10);

       

        s.push( new Integer(8));
        s.push( new Integer(6));
        Integer num = s.pop();
        s.push( new Integer(3));
        s.push( new Integer(4));
        s.push( new Integer(15));
        s.push( new Integer(12));
        s.pop();
        s.pop();
        s.pop();
        s.push( new Integer(19));
        
        System.out.println("the stack is" + s.toString());
    }
}
        