 public class IfElseIfLadderStatementExample {

    public static void main(String[] args){

        int x=10;
        int y=15;

        if(y>20){
            System.out.println("Y is Grater than 10 & Y value is --->"+y);
        }
        else if (x>=15){
            System.out.println("X is grater than or equal to 10 & X Value is --->"+x);
        }
        else if (y<x){
            System.out.println("Y is less than X,  X and Y vale is --->"+ x + y);

        }
        else{
            System.out.println("all are not equal");
        }

    }
}
