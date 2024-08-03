import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) throws Exception {
    	HashMap<Integer, Integer> numeros = new HashMap<>();
    	
        for (int i = 0; i < nums.length; i ++) {   
            int resta = target - nums[i];

            if (numeros.containsKey(resta)) {
            	int[] res = {numeros.get(resta), i};
            	
            	System.out.println(res[0]);
            	System.out.println(res[1]);
            	return res;
            }
            
            numeros.put(nums[i], i);
        }
        

        throw new Exception("No funsiona io");
    }
}