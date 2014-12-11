public void Quicksort(int[] arr,int low,int high){//基础
	int l=low;
	int h=high;
	int privot=arr[low];
	while (l<h) {
		while (l<h&&arr[h]>=privot) {
			h--;
		}
		if (l<h) {
			int temp=arr[h];
			arr[h]=arr[l];
			arr[l]=temp;
			l++;
		}
		while (l<h&&arr[l]<=privot) {
			l++;
		}
		if (l<h) {
        		int temp=arr[h];
	        	arr[h]=arr[l];
			arr[l]=temp;
			h--;
		}
			
		if (l>low) {
			sort(arr, low, h-1);
		}
		if (h<high) {
			sort(arr, l+1, high);
		}
	}
}

public void quickSort(int[] arr,int start,int end){//改良，减少了交换次数
	int i=start;
	int j=end;
	int key=arr[start];
	while (i<j) {
		while (j>i&&arr[j]>key) {
			j--;
		}
		if (i<j) {
			arr[i]=arr[j];
		}
		while (i<j&&arr[i]<=key) {
			i++;
		}
		if (i<j) {
			arr[j]=arr[i];
		}
	}
	arr[i]=key;
	if (i-start>1) {
		quickSort(arr, start, i-1);
	}
	if (end-j>1) {
	        quickSort(arr, j+1, end);
	}
}
