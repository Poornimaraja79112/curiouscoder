import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();      // Read integer
        sc.nextLine();             // Consume the leftover newline without this it appears enmpty string
        
        String s = sc.nextLine();  // Read the full string
        char c = sc.next().charAt(0); // Read character
        
        System.out.println(n);
        System.out.println(s);
        System.out.println(c);
    }
}
🔍 Example Input:
2
Name
y
✅ Output:
2
Name
y
✅ Java Code (Single Line Input Version):
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();           // Read integer
        String s = sc.next();           // Read string
        char c = sc.next().charAt(0);   // Read character
        
        System.out.println(n);
        System.out.println(s);
        System.out.println(c);
    }
}
🧪 Input:
2 Name y
✅ Output:
2
Name
y
-------------
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int s=sc.nextInt();
	    if(n+m+s==180){
	        System.out.println("Triangle is formed");
	    }
	    else{
	        System.out.println("Triangle is not formed");
	    }
	   
}
}
--------------------
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    if(m>=90){
	        System.out.println("Grade A");
	    }
	    else if(m>=80){
	        System.out.println("Grade B");
	    }
	    else if(m>=60){
	        System.out.println("Grade C");
	    }
	    else if(m>=35){
	        System.out.println("Grade D");
	    }
	    else if(m<35){
	        System.out.println("Fail");
	    }
	   
}
}
--------------
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    switch(m){
	        case 29:
	            System.out.println("Small");
	            break;
	        case 30:
	            System.out.println("Medium");
	            break;
	       case 38:
	            System.out.println("Large");
	            break; 
	       case 42:
	            System.out.println("Xlarge");
	            break;  
	       default:
	         
	         System.out.println("invalid input");
	         
	    }
	   
}
}
------------------
Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i=2;
	    for(int l=0;l<3;l++){
	        System.out.println(i);
	    }
	    
	   
}
}
output:
2
2
2
----------------
Write a program to take x and print multiples of x till 1000.

Input:

100

Expected Output:

100

200

300

400

500

600

700

800

900

1000
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i=100;
	    for(int l=1;l<11;l++){
	        System.out.println(i*l);
	    }
	    
	   
}
}
-----------------
Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next(); // reads first word
        String s2 = sc.next(); // reads second word
        
        for (int l = 1; l <6; l++) {  // loop from 1 to 5
            System.out.println(s1 + s2);
        }
    }
}
-------------------------
