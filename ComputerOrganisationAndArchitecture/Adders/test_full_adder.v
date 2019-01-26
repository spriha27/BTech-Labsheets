module tb_full_adder;

    reg A,B,C;
    wire SUM,CARRY;
    
    full_adder HA (.a(A) ,.b(B),.c(C),.sum(SUM),.carry(CARRY));
    
    initial begin
        A =1'b0;
        B= 1'b0;
	C= 1'b0;
        #45000 $finish;
    end
    
    always #6 A =~A;
    always #3 B =~B;
    always #1 C=~C;
    
    
endmodule;