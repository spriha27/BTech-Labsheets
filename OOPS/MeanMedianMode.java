import java.util.*;

public class MeanMedianMode{
	public static double findMedian(int[] arr){
		int length = arr.length;
		int[] sorted = new int[length];
		sorted = Arrays.copyOf(arr, length);
		Arrays.sort(sorted);
		if(length%2==0){
			return (sorted[length/2-1]+sorted[length/2])/2;
		}
		else{
			return sorted[length/2];
		}
	}
	public static int findMode(int[] arr){
		int mode=0;
		int modeCount=0;
		int cnt;
		for(int i=0;i<arr.length;i++){
			cnt=0;
			for(int j=0;j<arr.length;j++){
				if (arr[i]==arr[j]){
					cnt++;
				}
				if(cnt>modeCount){
					modeCount=cnt;
					mode=arr[i];
				}
			}
		}
		return mode;
	}
}
