1. make 產生檔案
2. make test0 產生並執行test0.ll，其他檔案以此類推
3. make clean 清除檔案

功能
(1) Integer data types: int
(2) Statements for arithmetic computation. (e.g., a=b+2*(100-1);)
(3) Comparison expression. (ex: a > b)
(4) if-then program construct
(5) if-then-else program construct
(6) printf() function with one/two parameters. (supported type: %d)
---------------------------------------------------------------------------
(7) Float data types: float
(8) printf() function with one/two parameters. (supported type: %f)
(9) while program construct
(10) for program construct


test0.c : (1),(3),(5),(6)
test1.c : (1),(2),(6)
test2.c : (2),(3),(5),(7),(8)
test3.c : (1),(2),(3),(4),(6),(8)
test4.c : (1),(3),(4),(6),(9)
test5.c : (1),(3),(4),(6),(10)
