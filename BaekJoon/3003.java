import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        int[] chess = {1,1,2,2,2,8};
        String[] data = scan.nextLine().split(" ");
        String result = "";

        for(int i = 0; i < data.length; i++){
            result += Integer.toString(chess[i] - Integer.parseInt(data[i]));
            if(i - 1 == data.length){

            }else{
                result += " ";
            }
        }
        System.out.println(result);


    }

}