class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, bottom = matrix.length-1, right = matrix[0].length-1;
        List<Integer> numbers = new ArrayList<>();
        while(top <= bottom && left <= right) {
            //top
            for(int i = left; i<=right; i++) {
                numbers.add(matrix[top][i]);
            }
            //right
            top++;
            for(int i = top; i<=bottom; i++) {
                numbers.add(matrix[i][right]);
            }
            //bottom
            right--;
            if(top <= bottom) {
                for(int i = right; i>=left; i--) {
                    numbers.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //left
            if(left <= right) {
                for(int i = bottom; i>=top; i--) {
                    numbers.add(matrix[i][left]);
                }
                left++;
            }
        }
        return numbers;
    }
}