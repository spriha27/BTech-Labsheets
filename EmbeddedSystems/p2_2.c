int main(){
	int a = 20, b = 10, c = 0, ch = 2;
	switch(ch){
		case 1: 
			c = a && b;
		break;
		case 2:
			c = a || b;
		break;
		case 3:
			c = !(a || b);
		break;
		case 4:
			c = !(a && b);
		break;
		case 5:
			c = a >> 1;
		break;
		case 6:
			c = a ^ b;
		break;
		default:
			c = 0;
		return 0;
		}
		}