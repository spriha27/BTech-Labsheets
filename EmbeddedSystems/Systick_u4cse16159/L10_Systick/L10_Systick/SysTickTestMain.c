// SysTickTestMain.c
// Runs on LM4F120/TM4C123
// Test the SysTick functions by activating the PLL, initializing the
// SysTick timer, and flashing an LED at a constant rate.
// Daniel Valvano
// September 12, 2013

/* This example accompanies the books
   "Embedded Systems: Introduction to ARM Cortex M Microcontrollers",
   ISBN: 978-1469998749, Jonathan Valvano, copyright (c) 2013
   Volume 1, Program 4.7

   "Embedded Systems: Real Time Interfacing to Arm Cortex M Microcontrollers",
   ISBN: 978-1463590154, Jonathan Valvano, copyright (c) 2013
   Program 2.11, Section 2.6

 Copyright 2013 by Jonathan W. Valvano, valvano@mail.utexas.edu
    You may use, edit, run or distribute this file
    as long as the above copyright notice remains
 THIS SOFTWARE IS PROVIDED "AS IS".  NO WARRANTIES, WHETHER EXPRESS, IMPLIED
 OR STATUTORY, INCLUDING, BUT NOT LIMITED TO, IMPLIED WARRANTIES OF
 MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE APPLY TO THIS SOFTWARE.
 VALVANO SHALL NOT, IN ANY CIRCUMSTANCES, BE LIABLE FOR SPECIAL, INCIDENTAL,
 OR CONSEQUENTIAL DAMAGES, FOR ANY REASON WHATSOEVER.
 For more information about my classes, my research, and my books, see
 http://users.ece.utexas.edu/~valvano/
 */

// PF2 is an output for debugging

#include "SysTick.h"

#define GPIO_PORTF_DATA_R       (*((volatile unsigned long *)0x400253FC))
#define GPIO_PORTF_DIR_R        (*((volatile unsigned long *)0x40025400))
#define GPIO_PORTF_AFSEL_R      (*((volatile unsigned long *)0x40025420))
#define GPIO_PORTF_DEN_R        (*((volatile unsigned long *)0x4002551C))
#define GPIO_PORTF_AMSEL_R      (*((volatile unsigned long *)0x40025528))
#define GPIO_PORTF_PCTL_R       (*((volatile unsigned long *)0x4002552C))
#define GPIO_PORTF_DATA_R       (*((volatile unsigned long *)0x400253FC))
#define GPIO_PORTF_DIR_R        (*((volatile unsigned long *)0x40025400))
#define GPIO_PORTF_AFSEL_R      (*((volatile unsigned long *)0x40025420))
#define GPIO_PORTF_PUR_R        (*((volatile unsigned long *)0x40025510))
#define GPIO_PORTF_LOCK_R       (*((volatile unsigned long *)0x40025520))
#define GPIO_PORTF_CR_R         (*((volatile unsigned long *)0x40025524))
#define SYSCTL_RCGC2_R          (*((volatile unsigned long *)0x400FE108))
	
unsigned long input;	
unsigned long count;
void PortF_Init(void);
int main(void){
  PortF_Init();
	while(1){
		input = (GPIO_PORTF_DATA_R & 0x10);
		if(!input){
				count = 10;
				while(count--){
					GPIO_PORTF_DATA_R ^= 0x02;
					SysTick_Wait10ms(20);
					GPIO_PORTF_DATA_R ^= 0x02;
					SysTick_Wait10ms(20);
				}
				GPIO_PORTF_DATA_R &= ~(0x02);
				SysTick_Wait10ms(30);
				count = 10;
				while(count--){
					GPIO_PORTF_DATA_R ^= 0x04;
					SysTick_Wait10ms(30);
					GPIO_PORTF_DATA_R ^= 0x04;
					SysTick_Wait10ms(30);
				}
				GPIO_PORTF_DATA_R &= ~(0x04);
				SysTick_Wait10ms(50);
				count = 10;
				while(count--){
					GPIO_PORTF_DATA_R ^= 0x08;
					SysTick_Wait10ms(50);
					GPIO_PORTF_DATA_R ^= 0x08;
					SysTick_Wait10ms(50);
				}
				GPIO_PORTF_DATA_R &= ~0x08;
				SysTick_Wait10ms(100);
		}
	}	
}


void PortF_Init(){
	volatile unsigned long delay;
  SYSCTL_RCGC2_R |= 0x00000020;     // Activate clock for Port F
  delay = SYSCTL_RCGC2_R;           // Allow time for clock to start
  GPIO_PORTF_AMSEL_R = 0x00;        // Disable analog on PF4 and PF2
  GPIO_PORTF_PCTL_R = 0x00000000;   // PCTL GPIO on PF4-0
  GPIO_PORTF_DIR_R &= ~0x10;        //   PF4 input
	GPIO_PORTF_DIR_R |= 0x0E;         //   PF2 output
  GPIO_PORTF_AFSEL_R &= ~0x1E;      // Disable alt funct on PF4 and PF2
  GPIO_PORTF_PUR_R |= 0x10;         // Enable pull-up on PF4
  GPIO_PORTF_DEN_R |= 0x1E;         // Enable digital I/O on PF4 and PF2
}
