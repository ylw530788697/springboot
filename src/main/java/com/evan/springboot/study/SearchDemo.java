package com.evan.springboot.study;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/5/15 下午 6:05
 */
public class SearchDemo {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,8,8,8,9,10};
        int i = searchFirst(nums, 8);
        System.out.println(i);
        int last = searchLast(nums, 8);
        System.out.println(last);
    }

    public static int searchFirst(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while (left<=right){
            mid=(right+left)/2;
            if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid;
            }
            if(right==left){
                break;
            }
        }
        if (nums[left]!=target){
            return -1;
        }else{
            return left;
        }
    }


    public static int searchLast(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while (left<=right){
            mid=(right+left)/2+1;
            if(target>=nums[mid]){
                left=mid;
            }else{
                right=mid-1;
            }
            if(right==left){
                break;
            }
        }
        if (nums[right]!=target){
            return -1;
        }else{
            return right;
        }
    }

}
