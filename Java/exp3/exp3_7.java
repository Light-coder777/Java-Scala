import java.util.Scanner;

class Count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    int alpha = 0, digit = 0, sp = 0, blank = 0, words = 0, flag = 0;
    System.out.print("Enter a string: ");
    str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
      if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
          (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
        alpha++;
      } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        digit++;
      } else if (str.charAt(i) == 32) {
        blank++;
        words++;
        if (i + 1 < str.length()) {
          flag = 1;
        } else {
          flag = 0;
        }
      } else {
        sp++;
      }
    }
    if (flag == 1) {
      words++;
    }
    System.out.println("Alphabets: " + alpha);
    System.out.println("Digits: " + digit);
    System.out.println("Spaces: " + blank);
    System.out.println("Words: " + words);
    sc.close();
  }
}
