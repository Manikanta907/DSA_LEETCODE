class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();


for (int num : nums) {
    if (freq.containsKey(num)) {
        freq.put(num, freq.get(num) + 1);
    } else {
        freq.put(num, 1);
    }
}

int maxFreq = 0;
int maxElement = 0;

for (int num : freq.keySet()) {
    if (freq.get(num) > maxFreq) {
        maxFreq = freq.get(num);
        maxElement = num;
    }
}

return maxElement;
      
        
    }
}