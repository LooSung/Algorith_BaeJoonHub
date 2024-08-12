class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] numbers = s.split(" ");
        
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        
        for (String num : numbers) {
            int n = Integer.parseInt(num);

            if (n < min) {
                min = n;
            }
            
            if (n > max) {
                max = n;
            }
        }
        
        return min + " " + max;
        
    }
}