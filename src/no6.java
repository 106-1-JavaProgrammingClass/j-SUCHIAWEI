import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        char ch =scr.next().charAt(0);
        System.out.println(str.replace(ch,'\n')+'\n');
}}
