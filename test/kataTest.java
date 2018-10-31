package test;
import org.junit.*;
import static org.junit.Assert.*;

public class kataTest {


	    @Test
	    public void test1() {
	        String expected = "12";
	        String actual = kataTest.add("2,1\n6|2;1");
	        assertEquals(expected, actual);
	    }
	

    public static String add(String s) {
       if (s.length() == 0){
        return Integer.toString(0);
       }
        String[] arr = s.split(",|\n|;|\\|");
        int sum = 0;
       
       for (String a : arr){
        sum = sum + Integer.parseInt(a);
        if (Integer.parseInt(a) < 0){
            
            }
        }
        
  return Integer.toString(sum);
  }
}


