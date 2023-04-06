class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int answer = 0;
        for(List<String> list : items) {
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) answer++;
            else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) answer++;
            else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) answer++;
        }
        return answer;
    }
}