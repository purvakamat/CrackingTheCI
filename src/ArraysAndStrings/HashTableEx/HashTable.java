package ArraysAndStrings.HashTableEx;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kamat on 9/25/2016.
 */
public class HashTable {

  public static void main(String[] args){
    Student[] students = new Student[2];
    Scanner scan = new Scanner(System.in);

    for(int i=0;i<2;i++){
      System.out.println("Name: ");
      String name = (String) scan.next();
      System.out.println("Nuid: ");
      int nuID = scan.nextInt();
      System.out.println("subject");
      Subject sub = Subject.values()[scan.nextInt()];
      Student s = new Student(nuID, name, sub);
      students[i] = s;
    }

    HashMap<Integer,Student> map = new HashTable().buildMap(students);
  }

  HashMap<Integer,Student> buildMap(Student[] students){
    HashMap<Integer,Student> map = new HashMap<Integer,Student>();
    for (Student s: students)
      map.put(s.getID(),s);
    return map;
  }
}
