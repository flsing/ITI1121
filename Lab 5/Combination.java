public class Combination implements Comparable<Combination>{
  
  private int first;
  private int second;
  
  public Combination(int first, int second){
    this.first = first;
    this.second = second;
  }
  public int compareTo(Combination other){
    
    int result;
    
    if(first<other.first){
      result=-1;
    }
    else if(first>other.first){
      result=1;
    }
    else if(second<other.second){
      result=-1;
    }
    else if(second>other.second){
      result=1;
    }
    else result=0;
    
    return result;
  }
  public boolean equals(Object obj){
    
    Combination other=(Combination) obj;
    return((other!=null) && (first==other.first) && (second==other.second));
  }
  
  public String toString(){
    return first + ":" + second;
  }
  
}

    
    
    
    
    
    
    
    
    
    
        