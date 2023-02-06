class Solution {
    public String solution(String phone_number) {

        String backFour = phone_number.substring(phone_number.length()-4,phone_number.length());
        String frontNum = phone_number.substring(0,phone_number.length()-4);
        frontNum = frontNum.replaceAll("[0-9]","*");

        return frontNum + backFour;
    }
}