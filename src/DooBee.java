public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
            //зачем это? зачем x=x+1, а затем что тогда цикл будет бесконечный, прям ДДОС атака какая то.
        }
        if (x == 1) ;
        System.out.print("Do");
    }
    }

