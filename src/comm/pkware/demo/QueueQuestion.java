package comm.pkware.demo;
import java.util.*;
class QueueQuestion {
   Queue q = new LinkedList();
   void push(int value) {
      int size = q.size();
      q.add(value);
      for (int i = 0; i < size; i++) {
         q.add(q.remove());
      }
   }
   public void pop() {
      System.out.println("An element removed from a stack is: " + q.remove());
   }
   public static void main(String[] args) {
      QueueQuestion ob = new QueueQuestion();
      ob.push(10);
      ob.push(20);
      ob.push(30);
      ob.push(40);
      System.out.println(ob.q);
      ob.pop();
      System.out.println(ob.q);
   }
}