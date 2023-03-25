class Solution {
    public String interpret(String command) {
        return command.replaceAll("\\(al\\)","al").replaceAll("\\(\\)","o");
    }
}