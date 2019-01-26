
module mux21_struc (A, B, Sel, Out);	
input A, B, Sel;
output Out;
wire tmp1, tmp0;
and (tmp1, B, Sel);
not (selbar, Sel); 
and (tmp0, A, selbar); 
or (out, tmp0, tmp1);
endmodule
