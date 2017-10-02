import java.util.Scanner;

public class no9 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int val=scn.nextInt();
        System.out.println(Math.round(val/600f*10f)/10f+"\n");
    }
}
