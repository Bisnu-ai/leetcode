class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();

            // First element is always 1
            row.add(1);

            // Middle elements from prev 
            for (int j = 1; j < i; j++) {
                List<Integer> prev = result.get(i - 1);
                row.add(prev.get(j - 1) + prev.get(j));
            }

            // Last element is 1 except 1st row
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
        
    }
}