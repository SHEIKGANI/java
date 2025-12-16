import java.util.*;

// Create a class that extends Thread
class MultiCalc extends Thread{
    private int num1;
    private int num2;


    public MultiCalc(int num1, int num2){
    this.num1 = num1;
    this.num2 = num2;
 }

 // Override the run() method to perform multiplication
public void run(){
    int res = num1 * num2;
    System.out.println(res);
}
}

 
public class Multithread{
public static void main(String[] args) {

    // creating thread objects
    MultiCalc thread1 = new MultiCalc(5, 10);
    MultiCalc thread2 = new MultiCalc(20, 30);

    thread1.start(); // Start the first thread
    thread2.start(); // Start the second thread
}
}
