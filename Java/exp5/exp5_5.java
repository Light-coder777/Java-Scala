class MyThread extends Thread {
  int available = 1;

  synchronized public void run() {
      if (available > 0) {
          System.out.println(this.getName() + " has Booked ticket");
          available -= 1;
      } else {
          System.out.println("Houseful!");
      }
  }
}

class Synchronized {
  public static void main(String[] args) {
      MyThread t1 = new MyThread();
      Thread t2 = new Thread(t1);
      Thread t3 = new Thread(t1);
      t2.start();
      t3.start();
  }
}
