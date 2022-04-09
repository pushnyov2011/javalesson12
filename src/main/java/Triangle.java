public class Triangle {

        public void main(String[] Args)
        {

            int a, b,c ;
            a = b=c = 5;
            double result  =  ploshad(a, b, c);
            System.out.println(result);

        }

        public double ploshad (int a, int b ,int c)
        {
            double p = (a+b+c) / 2.0;
            double s = Math.sqrt(p * (p-a) * (p-b) * (p-c) );
            return s;

        }
        public static void ploshad2 (int a, int b ,int c)
        {
            double p = (a+b+c) / 2.0;
            double s = Math.sqrt(p * (p-a) * (p-b) * (p-c) );
            System.out.println(s);


        }


}
