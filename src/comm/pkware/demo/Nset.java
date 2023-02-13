package comm.pkware.demo;
import java.util.*;
import java.io.*;
public class Nset {

	public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        NavigableSet<Integer> temp=new TreeSet<>();
        temp.addAll(numbers);
        System.out.println("NavigableSet: " + numbers);


        int firstElement = numbers.first();
        System.out.println(firstElement);

        int lastElement = numbers.last();
        System.out.println(lastElement);
        
        int number1 = numbers.pollFirst();
        System.out.println("Removed 1st Element: " + number1);

        int number2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + number2);
        System.out.println("final list"+numbers);
        System.out.println("Number lower than 3: "+ numbers.floor(3));
        
        NavigableSet<Integer> rns=temp.descendingSet();
        System.out.println(temp);
        System.out.println(rns);


	}

}


