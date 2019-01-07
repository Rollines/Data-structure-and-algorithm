package com.charscter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chenjunlin
 * @date 2019-01-04
 */

/**
 * 如何输出字符串中的重复字符？
 */
public class FindDuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combinateion");
        printDuplicateCharacters("Java");
    }
    public static void printDuplicateCharacters(String word){
        char[] characters = word.toCharArray();

        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch:characters){
            if (charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }else {
                charMap.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
        System.out.printf("list of '%s' %n",word);
        for (Map.Entry<Character,Integer> entry:entrySet){
            if (entry.getValue()>1){
                System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
            }
        }


    }
}
