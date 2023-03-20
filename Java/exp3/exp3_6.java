import java.util.*;
class Metaa {
  public static void main(String[] args) {
    Vector<String> vect = new Vector<>();
    Scanner sc = new Scanner(System.in);
    String txt;
    int flag = 0;
    System.out.println("Enter the txt u want to check for Meta : ");
    txt = sc.next();
    vect.add(txt);
    System.out.println("Enter the second txt u want to check for Meta : ");
    txt = sc.next();
    vect.add(txt);

    txt = vect.get(1);
    char[] text = new char[txt.length()];
    char[] text2 = new char[txt.length()];
    String txt2;
    char temp;

    for(int i=0;i<txt.length();i++) 
    {
      text[i] = txt.charAt(i);
      text2[i] = txt.charAt(i);
    }
    int z = txt.length() -1;
    // System.out.println(txt.length());
    for(int i=0;i<z;i++) 
    {
      for(int j=i+1;j<z;j++)
      {
        txt2 = "";
        temp = text[i];
        text[i] = text[j];
        text[j] = temp;
        for(int k=0;k<z;k++)
        {
          txt2 += text[i];
        }
        if(txt2 == txt)
        {
          System.out.println("The given string is META string");
          flag = 1;
          break;
        }                
        for(i=0;i<z;i++) 
        {
          text[i] = text2[i];
        }
      }
    }
    if(flag==0)
    {
      System.out.println("The given string is not a META string");
    }
  }
}