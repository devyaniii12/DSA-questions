import java.util.*;

class TimeMap {

    private Map<String, List<Pair>> map;

    private class Pair {
        int timestamp;
        String value;
        
        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>()); 
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return ""; 
        }

        List<Pair> pairs = map.get(key);
        int low = 0, high = pairs.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (pairs.get(mid).timestamp == timestamp) {
                return pairs.get(mid).value;
            } else if (pairs.get(mid).timestamp < timestamp) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high >= 0 ? pairs.get(high).value : "";
    }
}
