import java.io.*;
import java.util.*;

public class Solution {
    public static class quts{ //큐 클래스 생성
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int num){ //스택 1에 값 추가
            stack1.push(num);
        }

        public void dequeue(){
            if(stack2.size() == 0){ // 스택 2가 비어있으면 스택 1의 값 전부 옮기기
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                if(stack2.size() == 0){

                }else{
                    stack2.pop();
                }
            }else{
                stack2.pop();
            }
        }
        public int print(){
            if(stack2.size() == 0){ // 스택 2가 비어있으면 스택 1의 값 전부 옮기기
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                return stack2.peek();
            }else{
                return stack2.peek();
            }
        }


    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        quts q = new quts();
        for(int i = 0; i < k; i++){
            int num = scan.nextInt();
            if(num == 1){
                int func = scan.nextInt();
                q.enqueue(func);
            }else if(num == 2){
                q.dequeue();
            }else if(num == 3){
                System.out.println(q.print());
            }
        }

    }
}
