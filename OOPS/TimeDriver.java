/*
 * TimeDriver.java
 * 
 * Copyright 2017 sprea <sprea@sprea-HP-Pavilion-x360-Convertible>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class TimeDriver {
	
	public static void main (String args[]) {
		Time t1= new Time();
		Scanner s= new Scanner(System.in);
		int h=0, m=0, secs=0;
		h= s.nextInt();
		m= s.nextInt();
		secs=s.nextInt();
		if(h<0 || h>23 || m<0 || m>60 ||secs<0 || secs>60){
		System.out.println("Please input correct numbers.");
	}
	
	else{
		if(secs==60)
		{
			secs=0;
			m=m+1;
		}
		if(m==60)
		{
			m=0;
			h=h+1;
		}
		if(h>24){
			h=h-24;
		}
		t1.setHours(h);
		t1.setMinutes(m);
		t1.setSeconds(secs);
		System.out.println(t1);
	}
}
}

