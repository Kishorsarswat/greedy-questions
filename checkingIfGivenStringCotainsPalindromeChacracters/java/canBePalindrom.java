package checkingIfGivenStringCotainsPalindromeChacracters.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class canBePalindrom {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t; //Test Cases
        
        t = Integer.parseInt(br.readLine());

        while(t-->0){
            String s = br.readLine();

            if(hasPalindromPermutation(s)){
                System.out.println("\ntrue");
            }else{
                System.out.println("\nfalse");
            }
        }

        br.close();
    }

    private static boolean hasPalindromPermutation(String s) {
        char[] charArray = s.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        
        for(char a:charArray){
            if(hashMap.containsKey(a)){
                Integer count = (Integer) hashMap.get(a);
                hashMap.put(a, count+1);
            }else{
                hashMap.put(a, 1);
            }
        }

        int middle=0;

        for(Object entry : hashMap.keySet()){
            Integer count = (Integer) hashMap.get(entry);

            if(count==1){
                middle++;
            }else if(count%2!=0){
                return false;
            }

            if(middle>1)    return false;
        }

        return true;
    }
}
