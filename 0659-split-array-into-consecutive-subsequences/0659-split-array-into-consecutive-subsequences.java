class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mn = nums[0], mx = nums[0];

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            mn = Math.min(mn, x);
            mx = Math.max(mx, x);
        }

        int a = 0, b = 0, c = 0;

        for (int i = mn; i <= mx + 1; i++) {
            int f = freq.getOrDefault(i, 0);
            if (f < a + b) return false;
            int old = a;
            a = Math.max(0, f - a - b - c);
            b = old;
            c = f - a - b;
        }

        return true;
    }
}