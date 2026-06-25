class Solution {
    class Fenwick {
        long[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new long[n + 1];
        }

        void add(int idx, long val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        long sum(int idx) {
            long res = 0;
            while (idx > 0) {
                res += bit[idx];
                idx -= idx & -idx;
            }
            return res;
        }
    }

    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        // Prefix sums are in [-n, n]
        int offset = n + 2;
        Fenwick fw = new Fenwick(2 * n + 5);

        long ans = 0;
        int prefix = 0;

        // Insert prefix sum 0
        fw.add(offset, 1);

        for (int x : nums) {
            prefix += (x == target ? 1 : -1);

            int idx = prefix + offset;

            // Count previous prefix sums smaller than current prefix
            ans += fw.sum(idx - 1);

            fw.add(idx, 1);
        }

        return (int) ans;
    }
}
