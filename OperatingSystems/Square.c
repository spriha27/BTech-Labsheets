#include <stdio.h>
int main(float length){
    float area;
	float perimeter;
	printf("Enter the length of the Square: ");
	scanf("%f",&length);

	area = length*length;
	perimeter = 4*length;
	printf("Square: \n Area: %f Perimeter: %f \n",area,perimeter); 
}