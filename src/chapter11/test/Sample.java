package chapter11.test;
import java.util.Random;
class Sample {
	  public static void main(String args[]) {
	    Random rand = new Random();
	    int num = rand.nextInt(10);
	    System.out.println(num);
	    num = rand.nextInt(20);
	    System.out.println(num);
	    num = rand.nextInt(30);
	    System.out.println(num);
	  }
	}