class Solution {
    public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // [expiryDay, count]
        int day = 0, eaten = 0;
        while (day < apples.length || !pq.isEmpty()) {
            // add new apples
            if (day < apples.length && apples[day] > 0) {
                pq.add(new int[]{day + days[day], apples[day]});
            }
            // remove rotten apples
            while (!pq.isEmpty() && pq.peek()[0] <= day) { //example= exp=2 and curr day=3, =expired apple
                pq.poll(); //remove
            }
            // eat one apple
            if (!pq.isEmpty()) {
                int[] batch = pq.peek();
                batch[1]--;
                eaten++;
                if (batch[1] == 0) pq.poll();
            }
            day++;
        }
        return eaten;
    }
}