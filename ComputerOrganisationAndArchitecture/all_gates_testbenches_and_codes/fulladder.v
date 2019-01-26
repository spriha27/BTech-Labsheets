
module full_adder(
input a,b,c,
output sum,carry);

   assign sum = a^b^c;
   assign carry = a & b & c;

endmodule
