// import java.util.*;
import java.util.Vector;
import java.util.Scanner;
class Vecto {
  Vector<String> vect = new Vector<>();

  void addItem(String item)
  {
    this.vect.add(item);
  }
  void addItemAtPos(String item,int ind)
  {
    this.vect.add(ind ,item);
  }
  void deleteItem(int item)
  {
    this.vect.remove(item);
  }
  void printAllItems()
  {
    for(int i=0;i<vect.size();i++)
    {
      System.out.println(this.vect.get(i));
    }
  }
  
  public static void main(String[] args) {
    int t,n,flag=1;
    String item;
    Vecto v = new Vecto();
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("1. Append an item");
      System.out.println("2. Add an item at an position");
      System.out.println("3. Delete an item");
      System.out.println("4. Display all of the items ");
      n = sc.nextInt();
      switch(n)
      {
        case 1:
          System.out.println("Enter the item :");
          item = sc.next();
          v.addItem(item);
          break;
        case 2:
          System.out.println("Enter the item and the position: ");
          t = sc.nextInt();
          System.out.println("Enter the item :");
          item = sc.next();
          v.addItemAtPos(item,t);
          break;
        case 3:
          System.out.println("Enter the item u want to delete");
          t = sc.nextInt();
          v.deleteItem(t);
          break;
        case 4:
          System.out.println("Displaying all elements:");
          v.printAllItems();
          break;
        default:
          System.out.println("Not a valid choice");
          break;
      }
      System.out.println("Add more item or not (1==yes)/(0==no)");
      flag = sc.nextInt();
    }while(flag==1);
    sc.close();
  }
}
