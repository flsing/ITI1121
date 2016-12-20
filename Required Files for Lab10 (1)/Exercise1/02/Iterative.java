public class Iterative {
  
    public static BitList complement( BitList in ) {

      BitList result;
      result= new BitList();
      
      Iterator i= in.iterator();
      Iterator j =result.iterator();
      
      if(!i.hasNext()){
        j.add(BitList.ONE);
      }
      else{
        j.add(BitList.ZERO);
      }
      
      while(i.hasNext()){
        int bit = i.next();
        
        if(bit==BitList.ONE){
          j.add(BitList.ZERO);
        }
        else{
          j.add(BitList.ONE);
        }
      }
        return result;
        
      }
    
      
    

    public static BitList or( BitList a, BitList b ) {

      
      BitList result = new BitList();
      
      Iterator i = a.iterator();
      Iterator j= b.iterator();
      Iterator k=result.iterator();
      
      if(!i.hasNext()){
        throw new IllegalArgumentException("A is empty");
      }
      if(!j.hasNext()){
        throw new IllegalArgumentException("B is empty");
      }
      
      while(i.hasNext()){
        
        if(!j.hasNext()){
          throw new IllegalArgumentException("B is smaller than A");
        }
        
        int iBit= i.next();
        int jBit= j.next();
        
        if(iBit==BitList.ONE || jBit==BitList.ONE){
          k.add(BitList.ONE);
        }
        else{
          k.add(BitList.ZERO);
        }
      }
      
      if(j.hasNext()){
        throw new IllegalArgumentException("B is Longer than A");
     //a = 011 b = 01010
      }
      
      return result;
      
    }

    public static void main(String[] args ){

        BitList a, b;

        for ( int i=0; i<args.length; i++ ) {

            a = new BitList( args[i] );
            System.out.println( "> " + a );
            System.out.println( "< " + complement( a ) );
            System.out.println();

        }

       a = new BitList( "10001" );
       b = new BitList( "00011" );

       System.out.println( "a = " + a );
       System.out.println( "b = " + b );
       System.out.println( "a or b = " + or( a, b ) );

    }
    
}

// > java Iterative 1011 "" 01 0000111
//
// > 1011
// < 0100
// 
// > 0
// < 1
// 
// > 01
// < 10
// 
// > 0000111
// < 1111000
//run Iterative 1011 01 0000111