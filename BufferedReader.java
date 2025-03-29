import java.io.*; 
 
public class A 
{ 
    public static void main(String[] args) throws IOException  
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
 
        System.out.print("Enter your name: "); 
        String name = br.readLine(); 
 
        System.out.print("Enter your age: "); 
        int age = Integer.parseInt(br.readLine()); 
 
        System.out.println("Your name is " + name + " and your age is " + age + "."); 
 
        // Close the br to avoid resource leaks 
        br.close(); 
    } 
}