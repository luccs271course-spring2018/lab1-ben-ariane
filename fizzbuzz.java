public class fizzbuzz{

    public void static( string[] args)
    int n = 17;
          for( i = 0; i < n; i++) {

        if (i % 3 == 0) {
            System.out.print("fizz");
        }

        elseif (i % 5 == 0) {
            System.out.print("buzz");
        }

        elseif (i % 15 == 0) {
            System.out.print("fizzbuzz");
        }
             else {
            System.out.print(i);
        }

    }


}