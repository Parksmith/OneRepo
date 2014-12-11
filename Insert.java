public void Insertsort(int[] a){//插入排序
    int i,j;
	for (i = 1; i < a.length; i++) {
	  if (a[i]<a[i-1]) {
			int temp=a[i];
			for (j = i-1; j >=0 && a[j]>temp; j--) {
			  a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
	}
}
