package LinkedLists;
import LinkedLists.LinkedList;
import java.util.Scanner;

/**
 * Created by kamat on 10/1/2016.
 */
public class ReverseAdd {

  private int convertToNum(LinkedList l){
    int num = 0;
    int i = 0;
    Node h = l.getHead();
    while(h != null){
      num += Math.pow(10,i++) * h.data;
      h = h.getNext();
    }
    return num;
  }

  public int add(LinkedList l1, LinkedList l2){
    return convertToNum(l1) + convertToNum(l2);
  }

  public LinkedList readLink(Scanner scan){
    int n = Integer.parseInt(scan.nextLine());
    LinkedList l = new LinkedList();
    for (int i=0; i<n; i++) {
      l.appendToTail(scan.nextInt());
    }
    scan.nextLine();
    return l;
  }

  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    ReverseAdd rev = new ReverseAdd();
    LinkedList l1 = rev.readLink(scan);
    LinkedList l2 = rev.readLink(scan);
  	System.out.println("sum: " + rev.add(l1, l2));
  }
}
