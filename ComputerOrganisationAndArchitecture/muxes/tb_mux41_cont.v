module mux_dataflow_tb;

   reg I0,I1,I2,I3;
   wire Y;
   reg[1:0]sel;
   mux_dataflow MUX (.i0(I0),.i1(I1),.i2(I2),.i3(I3),.sel(sel),.out(Y));
   
   initial begin
       I0 =1'b0;
       I1= 1'b0;
       I2 =1'b0;
       I3 =1'b0;
       sel = 2'b0;
       #45 $finish;
   end
   
   always #2 I0 = ~I0;
   always #4 I1 =~I1;
   always #6 I2 =~I2;
   always #8 I3 =~I3;
   always #3 sel[0]= ~sel[0];
   always #6 sel[1] = ~sel[1];
      
endmodule




