module full_adder(
input a,b,c,
wire t0,t1,
output sum,carry);
xor(t0,a,b);
xor(sum,t0,c);
and(t1,a,b);
and(carry,t1,c);

endmodule