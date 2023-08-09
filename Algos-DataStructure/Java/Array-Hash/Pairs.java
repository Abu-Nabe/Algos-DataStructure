    static int pairs(int k, int[] arr) {
        Map<Integer, Integer> pair = new HashMap<>();
        int count = 0;
        
        for (int num : arr) {
            pair.put(num, num);
        }
        
        for (int num : arr) {
            int target = pair.get(num) - k;
            if (pair.containsKey(target)) {
                count++;
            }
        }
        
        return count;
    }