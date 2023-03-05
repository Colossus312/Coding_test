class Solution {
    public int romanToInt(String s) {
        String[] arr = s.split("");
        int answer = 0;
        int past = 0;
        for(String a : arr){
            int val = a.equals("I") ? 1 :
                    a.equals("V") ? 5 :
                            a.equals("X") ? 10 :
                                    a.equals("L") ? 50 :
                                            a.equals("C") ? 100 :
                                                    a.equals("D") ? 500 :
                                                            a.equals("M") ? 1000 : 0;

            if(val == 5 || val == 10){
                if(past == 1){
                    answer -= past*2;
                    answer += val;
                }else{
                    answer += val;
                }
            }else if(val == 50 || val == 100){
                if(past == 10){
                    answer -= past*2;
                    answer += val;
                }else{
                    answer += val;
                }
            }else if(val == 500 || val == 1000){
                if(past == 100){
                    answer -= past*2;
                    answer += val;
                }else{
                    answer += val;
                }
            }else{
                answer += val;
            }
            past = val;
        }
        return answer;
    }
}