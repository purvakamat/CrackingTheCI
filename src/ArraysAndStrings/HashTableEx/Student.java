package ArraysAndStrings.HashTableEx;

/**
 * Created by kamat on 9/25/2016.
 */
public class Student {
  private int nuID;
  private String name;
  private Subject sub;

  Student(){}

  Student(int nuid, String n, Subject s){
    this.nuID = nuid;
    this.name = n;
    this.sub = s;
  }

  int getID(){
    return nuID;
  }
}
