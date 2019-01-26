/*
 * Time.java
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


public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	Time(){
		hours= minutes= seconds=0;
	}
	
	Time(int a, int b, int c){
		hours=a;
		minutes=b;
		seconds=c;
	}
	public void setHours(int a){
		if(h>23)
		System.out.println("wrong input");
		else
		hours=a;
	}
	public void setMinutes(int a){
		minutes=a;
	}
	public void setSeconds(int a){
		seconds=a;
	}
	
	public int getHours(){
		return hours;
	}
	public int getMinutes(){
		return minutes;
	}
	public int getSeconds(){
		return seconds;
	}
	public String toString(){
		return ("Time: "+hours+":"+minutes+":"+seconds);
	}
}

