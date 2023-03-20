class MarksOutOfBoundException extends Exception {
  public MarksOutOfBoundException(String s) {
      super(s);
  }
}

class Result {

  static void validate(int marks) throws MarksOutOfBoundException {
      if (marks < 0 || marks > 100) {
          throw new MarksOutOfBoundException("Invalid Marks");
      } else {
          System.out.println("Valid Marks");
      }
  }

  public static void main(String[] args) {
      try {
          validate(105);
      } catch (MarksOutOfBoundException e) {
          // TODO: handle exception
          System.out.println("Caught!!!");
          System.out.println("Caught Exception: " + e);
      }
  }
}
