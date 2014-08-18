package _0000_RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s=new Solution();
		s.removeDuplicates(new int[]{});
	}
	
	public int removeDuplicates(int[] A) {
        int ret=0;
        int len=A.length;
   
        for(int i=len-1;i>0;i--)
        {
        	if(A[i-1]==A[i])
        	{
        		for(int ii=i;ii+1<len;ii++)
        		{
        			A[ii]=A[ii+1];
        		}
        		len--;
        	}
        }
        for(int i=0;i<len;i++) System.out.print(A[i]+" ");
        System.out.println();
        System.out.println(len);
        return ret=len;
    }
}
