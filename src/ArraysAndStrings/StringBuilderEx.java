package ArraysAndStrings;

/**
 * In both these cases string append is done in O(n) time
 */
public class StringBuilderEx {

  // not thread safe and suitable only for single threaded application
  public String makeSentenceWithBuilder(String[] words){
    StringBuilder sBuilder = new StringBuilder();
    for (String w : words) sBuilder.append(w);
    return sBuilder.toString();
  }

  // thread safe
  public String makeSentenceWithBuffer(String[] words){
    StringBuffer sentence = new StringBuffer();
    for (String w: words) sentence.append(w);
    return sentence.toString();
  }
}
