package com.fetch.pyramid.pyramidApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word {
    String word;
    boolean isPyramidWord ;

    Word(String word){
        this.word = word;
        isPyramidWord = checkPyramidWord(word) ;
    }


    //check if all numbers sequentially present from 1 to n
    public boolean checkPyramidWord(String word){
        if (!isStringAlphabet(word)){
            return false;
        }

        int[] wordarr = new int[26];
        int totalCount = 0;

        for(int i=0; i<word.length();i++ ){
            wordarr[ word.charAt(i)-'a'] +=1;
        }

        Arrays.sort(wordarr);
        List<Integer> intList = new ArrayList<Integer>(wordarr.length);
        for (int i : wordarr)
        {
            if(i != 0 ) intList.add(i);
        }

        int previousNumber = intList.get(0);
        if(previousNumber != 1 ) return false;
        totalCount = 1;
        for (int i =1; i< intList.size() ; i++){
            int currentNumber = intList.get(i);
            if( previousNumber+1 != currentNumber ){
                return false;
            }
            totalCount += currentNumber;
            previousNumber = currentNumber;
        }

        return totalCount == word.length()?true : false;
    }

    public boolean isStringAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isPyramidWord() {
        return isPyramidWord;
    }

    public void setPyramidWord(boolean isPyramidWord) {
        this.isPyramidWord = isPyramidWord;
    }
}
