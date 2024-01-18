class Solution {
    public long solution(int[] sequence) {
        long ms = 0, msm = 0, cs = 0, csm = 0 , flip = 1;

        for (int num : sequence) {
            cs += num * flip;
            csm += num * -flip;

            if (cs < 0) {
                cs = 0;
            }
            if (csm < 0) {
                csm = 0;
            }

            ms = Math.max(ms, cs);
            msm = Math.max(msm, csm);

            flip *= -1;
        }

        return Math.max(ms, msm);
    }
}