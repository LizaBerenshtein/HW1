public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");
        long last = 0;
        long current = 1;
        long num = 1;

        // TODO: Replace this code with the correct Fibonacci sequence
        int numOdd = 0; 
        for( int i = 0 ; i < x ; i++){
            System.out.print( num );

            if (i < x - 1){ 
                System.out.print(" ");
            }

            if( num % 2 != 0){
                numOdd += 1;
            }

            num = last + current;
            last= current;
            current = num;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
