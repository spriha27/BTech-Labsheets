module full_adder(
input a,b,c,
wire t0,t1,
output reg sum,carry);
   always @(a,b,c)
   begin
   t0 = a ^ b;
   sum = t0 ^ c;
   always @(a,b,c);
   t1 = a & b;
   carry = t1 & c;
   end
endmodule 