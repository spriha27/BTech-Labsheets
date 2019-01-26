/*
 * Line.java
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


public class Line {
	private Point begin;
	private Point end;
	
	public int getBeginX(){
	return begin.getX();}
	public void setBeginX(int a){
	begin.setX(a);}
	public int getBeginY(){
	return begin.getY();}
	public void setBeginY(int a){
	begin.setY(a);}
	public int[] getBeginXY(){
	return begin.getXY();}
	public void setBeginXY(int a, int b){
	begin.setXY(a,b);}
	
	public int getEndX(){
	return end.getX();}
	public void setEndX(int a){
	end.setX(a);}
	public int getEndY(){
	return end.getY();}
	public void setEndY(int a){
	end.setY(a);}
	public int[] getEndXY(){
	return end.getXY();}
	public void setEndXY(int a, int b){
	end.setXY(a,b);}
	
	public Line( int x1, int y1, int x2, int y2){
		begin=new Point(x1,y1);
		end= new Point(x2, y2);
	}
	
	public String toString(){
	return "Begin:" +begin+"End:"+ end;}
	
}

