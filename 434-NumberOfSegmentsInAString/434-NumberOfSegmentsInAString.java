// Last updated: 7/14/2026, 2:16:01 PM
class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty()) {
            return 0;
        }

        return s.trim().split("\\s+").length;
    }
}