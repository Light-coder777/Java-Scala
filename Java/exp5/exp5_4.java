class MyThread extends Thread {
  int n;
  long start, end;

  MyThread(int n) {
      this.n = n;
  }

  public void run() {
      start = System.currentTimeMillis();
      for (int i = 1; i < 11; i++) {
          System.out.println(n + "*" + i + "=" + (n * i));
      }
      end = System.currentTimeMillis();
      System.out.println("Time of "+this.getName()+" is: "+(end-start)+" milli-sec");
  }
}

class Table {
  public static void main(String[] args) {
      MyThread t1 = new MyThread(5);
      MyThread t2 = new MyThread(7);
      MyThread t3 = new MyThread(13);
      // long start1, start2, start3, end1, end2, end3;
      // start1 = System.currentTimeMillis();
      t1.start();
      // end1 = System.currentTimeMillis();
      t2.start();
      t3.start();
      
  }
}
