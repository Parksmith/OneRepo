public class MergeSort {
	public void mergeArray(int[] a,int first,int mid,int last,int[] temp){
		int i=first;
		int j=mid+1;
		int m=mid;
		int n=last;
		int k=0;
		
		while (i<=m&&j<=n) {
			if (a[i]<=a[j]) {
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		
		while (i<=m) {
			temp[k++]=a[i++];
		}
		while (j<=n) {
			temp[k++]=a[j++];
		}
		
		for (int k2 = 0; k2 < k; k2++) {
			a[first+k2]=temp[k2];
		}
	}
	
	public void mergeSort(int[] a,int first,int last,int temp[]){
		if (first<last) {
			int mid=(first+last)/2;
			mergeSort(a, first, mid, temp);
			mergeSort(a, mid+1, last, temp);
			mergeArray(a, first, mid, last, temp);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a={3,4,2,6,1,5};
		int[] temp=new int[a.length];
		MergeSort ms=new MergeSort();
		ms.mergeSort(a, 0, a.length-1, temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
