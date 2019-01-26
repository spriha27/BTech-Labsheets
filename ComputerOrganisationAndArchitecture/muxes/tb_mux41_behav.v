module tb_mux_behav;
	reg a,b,c,d,s0,s1;
	wire y;
	mux_behaviour MUX(.a(a),.b(b),.c(c),.d(d),.s0(s0),.s1(s1),.y(y));
	initial begin
		a=1'b0;
		b=1'b0;
		c=1'b0;
		d=1'b0;
		s0=1'b0;
		s1=1'b1;
		#45 $finish;
	end
	always #2 a=~a;
	always #4 b=~b;
	always #6 c=~b;
	always #8 d=~b;
	always #3 s0=~s0;
	always #3 s1=~s1;
endmodule

	
