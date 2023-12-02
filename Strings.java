import java.util.Scanner;

public class Strings {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getShortestpath(String path){
        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String length

        // String fullName = "Aditya Asabe";
        // System.out.println(fullName.length());

        //String Concatenation
        // String firstname = "Aditya";
        // String lastName = "Asabe";
        // String fullName = firstname + " " + lastName;
        // System.out.println(fullName);
        
        // // System.out.println(fullName.charAt(0));
        // printLetters(fullName);

        // String str = "aditya";
        // System.out.println(isPalindrome(str));

        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}
