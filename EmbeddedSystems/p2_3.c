int main(){
	int stu[6] = {3, 4, 5, 6, 7, 8};
	int i, j, temp;
	for(i = 0; i < 5; i++){
		for(j = 1; j < 5 - i - 1; j++){
			if(stu[j] < stu[j -1 ]){
				temp = stu[j - 1];
				stu[j - 1] = stu[j];
				stu[j] = temp;
			}
		}
	}
	return 0;
}