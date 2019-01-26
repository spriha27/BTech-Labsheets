 module tb_half_adder;

    reg A,B;
    wire SUM,CARRY;
    
    half_adder HA (.a(A) ,.b(B),.sum(SUM),.carry(CARRY))
    
    initial begin
        A =1'b0;
        B= 1'b0;
        #45 $finish;
    end
    
    always #6 A =~A;
    always #3 B =~B;
    
    
endmodule
