You don't need to read any input. Your task is to complete the function printHelloWorld() which does not take any input and prints 'Hello World'.
class Solution{
    static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void main(String args[]){
     printHelloWorld();   
        
    }
}
----------------------------
Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'lesser'.
class Solution {
    public static String compareNM(int n, int m) {
        if(n<m){
            return "lesser";
        }
        else if(n>m){
            return "greater";
        }
        else{
           return "equal";
        }
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(compareNM(n,m));
    }
}
-------------------------------------
