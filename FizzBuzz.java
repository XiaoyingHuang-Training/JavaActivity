public class FizzBuzz {

    public static void main (String[] args){
        int maxValue=Integer.parseInt(args[0]);
        if(maxValue>=0){
            for (int i =0; i<maxValue+1;i++){
                if (i%3!=0 && i%5!=0) {
                    System.out.println(i);
                }else if(i%3==0 && i%5!=0){
                    System.out.println("Buzz");
                }else if (i%3!=0 && i%5==0) {
                    System.out.println("Fizz");
                }else if (i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
            }
        }else{
            for (int i =0; i>maxValue-1;i--){
                if (i%3!=0 && i%5!=0) {
                    System.out.println(i);
                }else if(i%3==0 && i%5!=0){
                    System.out.println("Buzz");
                }else if (i%3!=0 && i%5==0) {
                    System.out.println("Fizz");
                }else if (i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
            }
        }

    }
}