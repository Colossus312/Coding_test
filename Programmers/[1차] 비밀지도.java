import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i = 0 ; i<arr1.length;i++){
            String[] ar1 = BinaryFunction(arr1[i],arr1.length).split("");
            String[] ar2 = BinaryFunction(arr2[i],arr2.length).split("");
            StringBuilder map = new StringBuilder();

            for(int j = 0; j < ar1.length; j++){
                if(ar1[j].equals("1") || ar2[j].equals("1")){
                    map.append("#");
                }else{
                    map.append(" ");
                }
            }
            answer[i] = map.toString();
        }


        return answer;
    }
    public String BinaryFunction(int num, int length){
        StringBuilder result = new StringBuilder();
        for(int i = length; i > 0; i--){
            if(num - (int) Math.pow(2,i-1) < 0){
                result.append("0");
            }else{
                num = num - (int) Math.pow(2,i-1);
                result.append("1");
            }
        }
        return result.toString();
    }
}