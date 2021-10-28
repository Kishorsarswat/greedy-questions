package inPlaceSwappingOfWordsInString.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inPlaceSwappingOfWords {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        //Another Approach

        // int spaceCount = s.split(" ").length;
        // int[] spaceIndex = new int[spaceCount];
        // spaceCount=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         spaceIndex[spaceCount++]=i;
        //     }
        // }
        
        // for(int i=(spaceCount-1)/2;i>=0;i--){
        //     int first = Math.min(i, spaceCount-i-1);
        //     int last = spaceCount-first-1;
            
        //     String f = i==0? s.substring(0, spaceIndex[first]):s.substring(spaceIndex[first-1]+1,spaceIndex[first]);
        //     String l = i==0? s.substring(spaceIndex[last]+1):s.substring(spaceIndex[last]+1, spaceIndex[last+1]);
        //     // System.out.println(f+" "+l+" "+first+" "+last );
        //     String start = s.split(f)[0];
        //     String mid = s.split(f)[1].split(l)[0];
        //     String end = s.endsWith(l)?"":s.split(l)[1];
        //     s = start+l+mid+f+end;
        //     // System.out.println(s);
        // }


        String[] array = s.split(" ");
        StringBuilder string = new StringBuilder();

        int i;

        for(i=array.length-1;i>=0;i--){
            string.append(array[i]);
            if(i!=0)    string.append(" ");
        }



        s=string.toString();

        for(i=0;i<s.length()/2;i++){
            char f = s.charAt(i);
            char l = s.charAt(s.length()-i-1);
            s = (i==0?"":s.substring(0, i))+l+(s.substring(i+1,s.length()-i-1))+f+(i==0?"":s.substring(s.length()-i));
        }

        System.out.println(s);
    }
}
