class Solution {
    public int solution(int num) {
        int answer = 0;

        while(num != 1){
            num = collatz(num);
            answer++;
            if(answer == 500){
                return -1;
            }
        }

        return answer;
    }
    public int collatz(int num){
        if(num%2 == 1){
            return (num*3) + 1;
        }else{
            return num/2;
        }
    }
}


