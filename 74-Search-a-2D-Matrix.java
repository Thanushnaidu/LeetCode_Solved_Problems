class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int p=0;p<matrix.length;p++){
            int i = 0;
            int j = matrix[0].length-1;
            while(i<=j){
                int mid = (i+j)/2;
                if(matrix[p][mid] == target){
                    return true;
                }
                else if(target<matrix[p][mid]){
                    j = mid-1;
                }
                else{
                    i = mid + 1;
                }
            }
        }
        return false;
    }
}