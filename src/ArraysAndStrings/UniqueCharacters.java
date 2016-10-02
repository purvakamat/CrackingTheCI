package ArraysAndStrings;

/**
 * Created by kamat on 9/25/2016.
 */
public class UniqueCharacters {

  public boolean isUnique(String s){
    boolean[] char_set = new boolean[256];

    for (int i=0;i<s.length();i++){
      int c = s.charAt(i);
      if (char_set[c]) return false;
      char_set[c] = true;
    }
    return true;
  }


  public boolean isUnique2(String s){
    int checker = 0;
    for (int i=0; i< s.length(); i++){
      int val = s.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) return false;
      checker |= (1 << val);
    }
    return true;
  }


  public static void main(String[] args){
    System.out.println(new UniqueCharacters().isUnique("apurva"));
    System.out.println(new UniqueCharacters().isUnique2("purva"));
  }
}
