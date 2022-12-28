import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String place = "";
            if(s1.length() < 15){
                for(int ii = s1.length(); ii < 15; ii++){
                    place+=" ";
                }
            }
            if(x < 100){
                if(x == 0){
                    System.out.println(s1+place+"00"+x);
                }else{
                    System.out.println(s1+place+"0"+x);
                }

            }else{
                System.out.println(s1+ place + x);
            }
            //Complete this line

        }
        System.out.println("================================");

    }
}



