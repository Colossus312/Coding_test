class Solution {
    public int subtractProductAndSum(int n) {
        int num1 = 1;
        int num2 = 0;
        String[] numArr = Integer.toString(n).split("");
        for(String a : numArr){
            int i = Integer.parseInt(a);

            num1 = num1 * i;

            if(num2 == 0){
                num2 = i;
            }else{
                num2 = num2 + i;
            }
        }

        return num1 - num2;
    }
}