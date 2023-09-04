class Solution {
    public String[] solution(String myStr) {
        return (myStr = java.util.Arrays.stream(myStr.split("[abc]")).filter(s -> !s.isEmpty()).collect(java.util.stream.Collectors.joining(","))).isEmpty() ? new String[]{"EMPTY"} : myStr.split(",");
    }
}