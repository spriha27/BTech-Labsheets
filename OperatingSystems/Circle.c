#include <stdio.h>

int main(float r){

	float area;
	float perimeter;
	printf("Enter the radius of the Circle: ");
	scanf("%f",&r);

	area = 3.14*r*r;
	perimeter = 3.14*2*r;
	printf("Circle: \n Area: %f Perimeter: %f \n",area,perimeter); 
}