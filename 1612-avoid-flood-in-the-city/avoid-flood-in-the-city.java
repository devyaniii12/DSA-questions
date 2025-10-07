class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> lastRain = new HashMap<>(); // lake -> last day index it rained
        List<Integer> dryDays = new ArrayList<>();        // indices of days with rains[i] == 0

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;
            } else {
                int lake = rains[i];
                ans[i] = -1;

                if (lastRain.containsKey(lake)) {
                    int last = lastRain.get(lake);
                    int chosenDryIndexInList = -1;
                    int chosenDryDay = -1;
                    for (int j = 0; j < dryDays.size(); j++) {
                        int d = dryDays.get(j);
                        if (d > last) {
                            chosenDryIndexInList = j;
                            chosenDryDay = d;
                            break; // earliest one found, break
                        }
                    }
                    if (chosenDryIndexInList == -1) {
                        return new int[0];
                    }
                    ans[chosenDryDay] = lake;
                    dryDays.remove(chosenDryIndexInList);
                }
                lastRain.put(lake, i);
            }
        }
        return ans;
    }
}