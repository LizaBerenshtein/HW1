public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for (String arr : args){
            if(!arr.isEmpty()){
                if ((arr.charAt(0) % 5) == 0){
                   System.out.println(arr.charAt(0));
                }
            }
        }
    }
}

