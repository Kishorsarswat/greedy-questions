import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inPlaceSwappingOfString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = swap(s);
        System.out.println(s);
        br.close();
    }

    private static String swap(String s) {

        for(int i=0;i<s.length()/2;i++){
            char f = s.charAt(i);
            char l = s.charAt(s.length()-i-1);
            s = (i==0?"":s.substring(0, i))+l+(s.substring(i+1,s.length()-i-1))+f+(i==0?"":s.substring(s.length()-i));
        }

        return s;
    }

}
