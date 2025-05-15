public class Exam03 {
    public static void main(String[] args) {
        int[] nums = {1,3,7,1,4,7,3,1,9,0,7,3};
        int biggest = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>biggest){
                biggest = nums[i];
            }
        }
        System.out.println("출력결과 : "+ biggest + "입나다.");
    }
}
