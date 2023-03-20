import java.util.*;
import java.io.*;

class ProductDesk {
   private int[] contents = new int[100];
   private int in = 0;

   public synchronized int get() {
      while (this.in - 1 < 0) {
         try {
            wait();
         } catch (InterruptedException e) {
         }
      }

      notifyAll();
      this.in -= 1;
      return contents[this.in];
   }

   public synchronized void put(int value) {
      while (in >= 100) {
         try {
            wait();
         } catch (InterruptedException e) {
         }
      }
      contents[in] = value;
      notifyAll();
      this.in += 1;
   }
}

class Consumer extends Thread {
   private ProductDesk desk;
   private int number;

   public Consumer(ProductDesk d, int number) {
      this.desk = d;
      this.number = number;
   }

   public void run() {
      int value = 0;
      for (int i = 0; i < 10; i++) {
         value = this.desk.get();
         System.out.println("Consumer #" + this.number + " got: " + value);
         try {
            sleep(5);
         } catch (InterruptedException e) {
         }
      }
   }
}

class Producer extends Thread {
   private ProductDesk desk;
   private int number;

   public Producer(ProductDesk d, int number) {
      desk = d;
      this.number = number;
   }

   public void run() {
      for (int i = 0; i < 50; i++) {
         desk.put(i);
         System.out.println("Producer #" + this.number + " put: " + i);
         try {
            sleep(9);
         } catch (InterruptedException e) {
         }
      }
   }
}

class ProducerConsumerTest {
   public static void main(String[] args) {
      ProductDesk d = new ProductDesk();

      for (int p = 1; p < 3; p++) {
         Producer x = new Producer(d, p);
         x.start();
      }
      for (int c = 1; c < 11; c++) {
         Consumer x = new Consumer(d, c);
         x.start();
      }
   }
}
