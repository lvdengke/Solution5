import org.junit.Test;

import java.nio.file.ClosedWatchServiceException;

/**
 * 测试类
 */



public class Solution5Test {
    @Test //测试方法
    public void testBinarySearch() {
    Solution5 solution5 = new Solution5();
    int[] nums={3,3,6};
    int target=6;
    int low = solution5.binarySearch(nums, target);
    System.out.println(low);
    }
   @Test
    public void testPretreatment(){
        Solution5 solution5 = new Solution5();
        solution5.pretreatment();
        int[] f=new int[100];
        System.out.println(f[0]);
    }

    @Test
    public  void  testNumSubseq(){
        Solution5 solution5 = new Solution5();
        int[] nums={2,3,3};
        int target=12;
        int ans = solution5.numSubseq(nums, target);
        System.out.println(ans);
    }

}
