module nand_gate(
    input a,b,    
    output y);

//Above style of declaring ports is ANSI style.Verilog2001 Feature

   assign y = ~(a & b);

endmodule

