/**
 * ITI 1121. Introduction à l'informatique II (Hiver 2008).
 * ITI 1521. Introduction to Computer Science II (Winter 2008).
 *
 * @author Marcel Turcotte, Université d'Ottawa/University of Ottawa
 */

public class Balanced {

    public static boolean algo1( String s ) {

        int curly = 0;
        int square = 0;
        int round = 0;

        for ( int i=0; i<s.length(); i++ ) {

            char c = s.charAt( i );

            switch ( c ) {
            case '{':
                curly++;
                break;
            case '}':
                curly--;
                break;
            case '[':
                square++;
                break;
            case ']':
                square--;
                break;
            case '(':
                round++;
                break;
            case ')':
                round--;
            }
        }
        return curly == 0 && square == 0 && round == 0;
    }
    
 public static boolean algo2(String s){
      
     // important 
      Stack<Character> brackets;
      brackets =  new ArrayStack<Character>(100);
      
      for (int i = 0; i <s.length(); i++){
        
     // charAt returns character value from string s
        char c = s.charAt(i);
        
        if (c == '(' || c == '[' || c == '{')
          brackets.push(new Character(c));
    
          else if (c== ')' || c=='}' || c== '}'){
          
            if (brackets.isEmpty())  return false;
            
            char top = ((Character) brackets.pop()).charValue();
          
            if (( c== ')' && top !='(') || (c==']' && top!='[') || (c=='}' && top!='{' ))
              return false;
          }
      }
          return brackets.isEmpty();
      }
      
      
        
      
    
    
    

    public static void main( String[] args ) {
        for ( int i=0; i<args.length; i++ ) {
            System.out.println( "algo1( \"" + args[ i ] + "\" ) -> " + algo1( args[ i ] ) );
        }
    }
}

