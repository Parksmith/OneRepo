public class HeapSort {
	
	public static int[] sort=new int[]{1,0,10,20,3,5,6,4,9,8,12,17,34,11};
	
	public static void main(String[] args) {
		buildMaxHeapify(sort);
		heapSort(sort);
		print(sort);
	}
	
	public static void buildMaxHeapify(int[] data){
		int startIndex=getParentIndex(data.length-1);
		for (int i = startIndex; i >=0; i--) {
			maxHeapify(data,data.length,i);
		}
	}
	
	public static void maxHeapify(int[] data,int heapSize,int index){
		int left=getChildLeftIndex(index);
		int right=getChildRightIndex(index);
		
		int largest=index;
		if (left<heapSize&&data[index]<data[left]) {
			largest=left;
		}
		if (right<heapSize&&data[largest]<data[right]) {
			largest=right;
		}
		
		if (largest!=index) {
			int temp=data[index];
			data[index]=data[largest];
			data[largest]=temp;
			maxHeapify(data,heapSize,largest);
		}
	}
	
	public static void heapSort(int[] data){
		for (int i = data.length-1; i >0; i--) {
			int temp=data[0];
			data[0]=data[i];
			data[i]=temp;
			maxHeapify(data,i,0);
		}
	}
	
	public static int getParentIndex(int current){
		return (current-1)>>1;
	}
	
	public static int getChildLeftIndex(int current){
		return (current<<1)+1;
	}
	
	public static int getChildRightIndex(int current){
		return (current<<1)+2;
	}
	
	public static void print(int[] data){
		int pre=2;
		for (int i = 0; i < data.length; i++) {
			if (pre<(int)getLog(i+1)) {
				pre=(int)getLog(i+1);
			}
			System.out.print(data[i]+"|");
		}
	}
	
	public static double getLog(double param){
		return Math.log(param)/Math.log(2);
	}
	
}
