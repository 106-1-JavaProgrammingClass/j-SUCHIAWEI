import java.util.Scanner;

public class no12 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        double d = scn.nextDouble();
        int a = scn.nextInt();
        System.out.println(Math.round(d*Math.pow(10,a))/Math.pow(10,a));


}}
