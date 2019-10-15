package String;
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class Test {
    public static void main(String args[] ) throws Exception {
       String str="The cool is the cool when he is not cool.";
       String word="cool";
       int f=str.indexOf(word);
     
      while(f!=-1)
       {
           System.out.println(f);
           f=str.indexOf("cool",f+word.length());
         
      }

   
    }
}
