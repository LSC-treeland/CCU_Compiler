void main()
{
   int a;
   int b;
   float c;
   float d;

   a = 1;
   b = 1;
   c = 2.0;
   d = 2.0;

   if(c == d){
       a = a + b - 10;
       c = c + d - 10.0;
       printf("%d\n",a);
       printf("%f\n",c);
   }
}
