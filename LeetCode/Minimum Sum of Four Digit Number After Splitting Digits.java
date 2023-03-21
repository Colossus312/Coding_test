class Solution {
    public int minimumSum(int num) {
        String number = Integer.toString(num);
        String[] arr = number.split("");
        int[] numArr = new int[4];
        for(int i = 0; i < arr.length; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numArr);
        int a = Integer.parseInt(Integer.toString(numArr[0])+Integer.toString(numArr[2]));
        int b = Integer.parseInt(Integer.toString(numArr[1])+Integer.toString(numArr[3]));
        return a+b;
    }
}