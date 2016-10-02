package ArraysAndStrings;

import java.util.ArrayList;

/**
 * Created by kamat on 9/25/2016.
 */
public class ArrayListEx {

  public ArrayList<String> merge(String[] words, String[] more){
    ArrayList<String> sentence = new ArrayList<String>();
    for (String s : words) sentence.add(s);
    for (String s : more) sentence.add(s);
    return sentence;
  }
}
