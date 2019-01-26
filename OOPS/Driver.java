/*
 * Driver.java
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
public class Driver {
	
	public static void main (String[] args) {
		int a=0,b=0;
		Scanner s=new Scanner(System.in);
		Point p1=new Point();//default
		Point p2=new Point(2,3);
		System.out.println("Enter x");
		a=s.nextInt();
		System.out.println("Enter y");
		b=s.nextInt();
		p1.setX(a);
		p1.setY(b);
		int k,l;
		k=p1.getX();
		l=p1.getY();
		System.out.println(k);
		System.out.println(l);
		System.out.println(p1);
		}
}

