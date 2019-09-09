public class BinaryRecursiveSearch implements Practice03Search{

	public String searchName(){
		return("Binary recursive search");
	}

	public int search(int [] arr, int target, int low, int high){
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>target)
			return search(arr,target,low,mid-1);
		else
			return search(arr,target,mid+1,high);
	}


	public int search(int [] arr, int target){
		return(search(arr,target,0,arr.length-1));

	}
}