import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        return Arrays.asList(str_list).indexOf("l") == -1 && Arrays.asList(str_list).indexOf("r") == -1 ? new String[]{} :
                (Arrays.asList(str_list).indexOf("l") != -1 && (Arrays.asList(str_list).indexOf("r") == -1 || Arrays.asList(str_list).indexOf("l") < Arrays.asList(str_list).indexOf("r"))) ?
                        Arrays.copyOfRange(str_list, 0, Arrays.asList(str_list).indexOf("l")) :
                        Arrays.copyOfRange(str_list, Arrays.asList(str_list).indexOf("r") + 1, str_list.length);
    }
}