1. make產生檔案
2. java -cp antlr-3.5.2-complete-no-st3.jar:. myInterp_test [testfile]
3. make clean清除檔案

功能
(1) integer data type: int
(2) Statements for arithmetic computation. (ex: a = b+2*(100-1))
(3) Comparison expression. (ex: a > b)
(4) if-then-else program construct.
(5) printf() function with one/two parameters. (supported type: %d)
(6) scanf() function. (supported type: %d)
------------------------------------------
(7) 支援 shift 運算(>>,<<,>>=,<<=)
(8) 支援 %,*=,/=,%=,+=,-= 運算

test1.c : (1),(2),(5)
test2.c : (1),(3),(4),(5),(6)
test3.c : (1),(5),(7),(8)
test4.c : (1),(2),(3),(4),(5),(6),(7)
test5.c : project 3 中的範例


其他事項
1.變數在宣告和運算時會印出該變數的值
2.假設有一變數宣告int a = 10,則會輸出a = 0,才輸出a = 10
3.compare expression 會根據結果輸出 True 或 False
4.遇到 scanf 要手動輸入數字
