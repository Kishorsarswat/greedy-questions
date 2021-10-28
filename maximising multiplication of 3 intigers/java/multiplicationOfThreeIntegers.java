import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicationOfThreeIntegers{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h1=0,h2=0,h3=0;
        int l1=0,l2=0;

        //  l2<l1<h3<h2<h1

        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            int num = Integer.parseInt(br.readLine());
            if(num>=0){
                if(num>h1){
                    h3=h2;
                    h2=h1;
                    h1=num;
                }
                else if(num>h2){
                    h3=h2;
                    h2=num;
                } 
                else if(num>h3) h3=num;    
            }else{
                if(num<l2){
                    l1=l2;
                    l2=num;
                }  
                else if(num<l1) l1=num;
            }
        }

        int h = h2*h3;
        int l = l1*l2;

        System.out.println(h1*(h>l?h:l));
        br.close();
    }
}