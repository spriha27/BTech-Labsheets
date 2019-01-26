
module mux21_cont(
input a,b,sel,
output y);

    assign y = sel ?b:a;

endmodule
