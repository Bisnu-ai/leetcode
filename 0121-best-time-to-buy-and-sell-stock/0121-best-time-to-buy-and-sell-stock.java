class Solution {
	public int maxProfit(int[] arr) {
		int min = arr[0];
		int res=0;
		int resmax=0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}else{
			    resmax=res;
			    if(resmax<arr[i]-min){
			    res=arr[i]-min;   
			    }
			}
		}
	return	res;
	}
}
