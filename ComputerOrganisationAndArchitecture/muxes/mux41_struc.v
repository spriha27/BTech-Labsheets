module mux41(i0,i1,i2,i3,sel,out);
input i0,i1,i2,i3;
input[1:0]sel;
output out;
wire tmp0,tmp1,tmp2,tmp3,tmp4,tmp5,tmp6,tmp7,tmp8,tmp9;
and(tmp0,~sel[1],~sel[0]);
and(tmp1,~sel[1],sel[0]);
and(tmp2,sel[1],~sel[0]);
and(tmp3,sel[1],sel[0]);
and(tmp4,i0,tmp0);
and(tmp5,i1,tmp1);
and(tmp6,i2,tmp2);
and(tmp7,i3,tmp3);
or(tmp8,tmp6,tmp7);
or(tmp9,tmp4,tmp5);
or(out,tmp2,tmp3);    
endmodule

