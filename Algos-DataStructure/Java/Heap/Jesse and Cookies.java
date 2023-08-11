public static int cookies(int k, List<Integer> A) {
        // Write your code here
        // wants me to make sure all arrays are over the letter k
        // and how many iterations it'll take to be over the letter k
        // Asking me to first to the smallest values, that are lower than k
        // PrioQ auto sorts int array
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(A);

        int count = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            int leastSweet = pq.poll();
            int secondLeastSweet = pq.poll();
            int newSweetness = leastSweet + 2 * secondLeastSweet;
            pq.offer(newSweetness);
            count++;
        }

        return pq.peek() >= k ? count : -1;

}
