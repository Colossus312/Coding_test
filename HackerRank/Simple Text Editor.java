import java.io.*;
import java.util.*;

public class Solution {
    public static class Operation{

        String append(String data,String app){
            return data+app;
        }
        String delete(String data,int num){
            return data.substring(0,data.length() - num);
        }
        String print(String data, int num){
            return Character.toString(data.charAt(num-1));
        }

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Operation ops = new Operation();
        int q = Integer.parseInt(scan.nextLine());
        String s = "";
        List<String> undoS = new ArrayList<>();
        for(int i = 0; i < q; i++){
            String[] start = scan.nextLine().split(" ");

            if(start[0].equals("1")){ //문자열 더하기
                undoS.add(s);
                s = ops.append(s,start[1]);
            }else if(start[0].equals("2")){ //특정 문자 지우기
                undoS.add(s);
                s = ops.delete(s,Integer.parseInt(start[1]));
            }else if(start[0].equals("3")){ // 문자열 출력
                System.out.println(ops.print(s,Integer.parseInt(start[1])));
            }else if(start[0].equals("4")){ // 뒤로 돌리기
                s = undoS.get(undoS.size()-1);
                undoS.remove(undoS.size()-1);
            }
        }

    }
}
