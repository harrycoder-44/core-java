public class Array2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > ans){
                ans = nums[i];
            }

        }
        System.out.println(ans);
    }
}
