package String;
import java.util.*;
public class duplicate_characters_string {
    public class Solution{
        static void printDubs(String str){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }
                else map.put(str.charAt(i),1);
            }
            for(Map.Entry<Character,Integer> mapElement : map.entrySet()){
                if(mapElement.getValue()>1){
                    System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
                }
            }
        }
    /* Driver program to test above function*/
    public static void main(String args[])
        {
            String str = "test string";
            printDubs(str);
        }
    }
        
}

