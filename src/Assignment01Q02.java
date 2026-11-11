public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        boolean sign = true;
        int num = 1;
        double cnt = 0;

        // TODO: Fill in the Pi approxiamtion here
        int limit = Integer.parseInt(args[0]);
        for( int i=0 ; i < limit ; i++){
            if (sign == true){
                cnt += (1.0 /num);
                num += 2;
                sign = false;
            }
            else{
                cnt -= (1.0 /num);
                num+= 2;
                sign = true;
            }
        }
        approxPi = 4 * cnt;

        System.out.println(approxPi + " " + actualPi);
    }
}
