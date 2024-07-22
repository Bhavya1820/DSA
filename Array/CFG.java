    // Java program to find number of operations
// to make an array palindrome

class GFG
{
	// Returns minimum number of count operations
	// required to make arr[] palindrome
	public static int mergeOps(int[] arr){
		int ans=0; 
		int n= arr.length;
		for(int i=0, j=n-1; i<=j;){
			if(arr[i] == arr[j]){
				i++;
				j--;
			}else if(arr[i] > arr[j]){
				j--;
				arr[j] += arr[j+1];
				ans++;
			}else{
				i++;
				arr[i] += arr[i-1];
				ans++;
			}
		}
		return ans;
	}

	// Driver method to test the above function
	public static void main(String[] args)
	{
		int arr[] = new int[]{11, 14, 15, 99} ;
		System.out.println("Count of minimum operations is "+
								mergeOps(arr));
	
	}
}


