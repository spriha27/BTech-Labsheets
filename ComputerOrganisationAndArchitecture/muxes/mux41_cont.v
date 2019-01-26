
module mux_dataflow(i0,i1,i2,i3,sel,out);
input i0,i1,i2,i3;
input [1:0]sel;
output out;
assign out=i0&(~sel[1]&~sel[0])| i1 & (~sel[1]&sel[0])| i2 & (sel[1]&~sel[0])| i3 & (sel[1]&sel[0]);
endmodule

