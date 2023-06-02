import java.util.Arrays;

public class mergeArray {
	public static void main(String[] args) {

		int[] nums1 = { 0 }; //6
		int[] nums2 = { 1 }; //3
		int m=0;
		int n=1;
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&& j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k--]=nums2[j--];
            }
            else{
                nums1[k--]=nums1[i--];
            }
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0){
            nums2[k--]=nums2[j--];
    }
        for(int z=0;z<nums1.length;z++) {
        	System.out.print(nums1[z]+"\t");
        }
		
		
		
		
		
		
		
//		for(int i=0;i<len1;i++) {
//			res[i]=nums1[i];
//		}
//		for(int i=0;i<len2;i++) {
//			res[len1+i]=nums2[i];
//		}
//		int j=0;
//		for(int i=0;i<res.length-1;i++) {
//			if(res[i]==0) {
//				j++;				
//			}
//			
//		}
	
//		Arrays.sort(res);
//		for (int i=j;i<res.length;i++) {
//			System.out.print(res[i]);
//		}
	}
}
