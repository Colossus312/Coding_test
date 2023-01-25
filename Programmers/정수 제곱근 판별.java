class Solution {
    public long solution(long n) {
        double nn = Math.sqrt(n);
        if((nn == Math.floor(nn)) && !Double.isInfinite(nn)) {
            return (long) Math.pow(nn+1,2);
        }else{
            return -1;
        }
    }
}