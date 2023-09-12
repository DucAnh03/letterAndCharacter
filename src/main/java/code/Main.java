
package code;
import code.Counter;


public class Main {

    public static void main(String[] args) {
        Counter couter = new Counter();
        String t = couter.inputData();
        couter.exCharCount(t);
        couter.exWordCount(t);
        couter.display();
        
    }
}
