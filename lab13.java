import java.util.*;
public class lab13
{                //Program by Pranay Bokde
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hexadecimal number:");
       String a=sc.nextLine();   
                            // input as hexadecimal number
        int b=Integer.parseInt(a,16);  
                       //converting base 16 value into decimal base
       String c=Integer.toBinaryString(b);  
               //now from base of decimal to binary number
        System.out.print("Binary numbers:"+c);
 
    }
}
        
