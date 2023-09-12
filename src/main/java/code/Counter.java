
package code;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Scanner;



public class Counter {

    
    public Map<Character , Integer> countChar = new HashMap<Character, Integer>();
    
    public Map<String, Integer> countWord = new HashMap<String,Integer>();
    
    public void display(){
        System.err.println(countChar);
        System.err.println(countWord);
    }
     
    public String inputData(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter String here");
        String text = sc.nextLine();
        return text;
    }
    public void exCharCount(String text){
        for(char ch : text.toCharArray()){
            if(Character.isSpaceChar(ch)) continue;
            if(!countChar.containsKey(ch)){
                countChar.put(ch, 1);
            }else{
                countChar.put(ch,(int) countChar.get(ch) + 1);
            }
        }
    }
    public void exWordCount(String text){
        StringTokenizer strT = new StringTokenizer(text);
        while(strT.hasMoreTokens()){
            String to = strT.nextToken();
            if(!countWord.containsKey(to)){
                countWord.put(to,1);
            }else{
                countWord.put(to , ((int)countWord.get(to)) + 1);
            }
        }
    }
    
    
}
