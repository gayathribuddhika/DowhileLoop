public class DowhileLoop {

    
    public static void main(String[] args) {
        int x = 1;
        while(x <=0){
            System.out.println(x);
            x++;//x=x+1
        }
        System.out.println("...................");
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }
        while(b<=0);//in Do while loop first run the statement and then check the condition.
        //while loop checks the condition first and then run the statement.
    }
    
}