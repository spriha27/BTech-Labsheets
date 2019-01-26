int main(){
	int arr[6],i=0,j=i,temp=0;
	arr[0]=6;
	arr[1]=5;
	arr[2]=4;
	arr[3]=3;
	arr[4]=2;
	arr[5]=1;
	while(i<6){
		j=i;
		while(j<6){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		i++;
	}
}