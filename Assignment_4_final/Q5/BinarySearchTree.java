public class BinarySearchTree<E extends Comparable<E>> {

    private static class Node<T> {

        private final T value;
        private Node<T> left;
        private Node<T> right;

        private Node(T value) {
            this.value = value;
            
        }
        
    }

    private Node<E> root;

    /**
     * Inserts an object into this BinarySearchTree.
     *
     * @param obj item to be added
     * @return true if the object has been added and false otherwise
     */

    public boolean add(E obj) {

        // pre-condtion:
        if (obj == null) {
            throw new NullPointerException("Illegal Argument");
        }

        // special case:
        if (root == null) {
            root = new Node<E>(obj);
            return true;
        }

        // general case:
        return add(obj, root);
    }

    private boolean add(E obj, Node<E> current) {

        boolean result;
        int test = obj.compareTo(current.value);

        if (test == 0) {
            result = false; // already exists, not added
        } else if (test < 0) {
            if (current.left == null) {
                current.left = new Node<E>(obj);
                result = true;
            } else {
                result = add(obj, current.left);
            }
        } else {
            if (current.right == null) {
                current.right = new Node<E>(obj);
                result = true;
            } else {
                result = add(obj, current.right);
            }
        }
        return result;
    }
 /**
  * count method in order to count and return  the number of elements 
  * in the tree that are greater than 
  * or equal to low and smaller then or equal to high. 
  *    
  *    
  * @param low the lowest element to start counting from 
  * @param high the highest element to start counting from 
  * 
  * @return The number of elements from high to low inclusive. 
  */
    public int count(E low, E high) {
     
     int testa = low.compareTo(high);
     
     int answer = 0;
     int answerleft=0;
     int answerright=0;
     
     boolean flag = false;
     Node <E> current = root;
     Node<E> left = current.left;
     Node<E> right = current.right;
     
     //if list is empty its not possible. 
     if (root == null){
      throw new UnsupportedOperationException("The list is empty");
      
     }
     //if its high to low its not possible
     if(testa == 1){
      throw new UnsupportedOperationException("NOT POSSIBLE, must be low to high");
     }
     
     //if both high and low are the same then it should only return 1.
     if(testa == 0){
      answer = 1;
     }
     // if its low then high and the object is in the list then we can start a search
     if(testa == -1){
      flag = true;
     }

     while(flag == true && (!left.equals(low))){
      //Node<E> low = left;
      answerleft++;
     }
     while(flag == true && (!right.equals(high))){
      //Node<E> high = right;
      answerright++;
     }
     answer = answerleft + answerright;
     
     
     //return answer
     return answer;
     }
       
    
    
    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node<E> p) {
        if (p == null) {
            return "null";
        } else {
            return "(" + toString(p.left) + "," + p.value + "," + toString(p.right) + ")";
        }
    }


}