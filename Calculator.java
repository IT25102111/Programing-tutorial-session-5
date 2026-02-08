public class Calculator{

   public static int add(int num1 , int num2){
   return num1 + num2;
   }

   public static int multiply(int num1 ,int  num2){
   return num1 * num2;
   }

   public static int square(int num){
   return num  * num;
   }

   public static void main(String[] args){

    //calculate result 1
    int result1 = square(add(multiply(3,4) , multiply(5,7)));

   System.out.println("The result 1 is " + result1);

   //calculate result 2
    int result2 = add (square(add(4,7)) , square(add(8,3)));

   System.out.println("The result 2 is " + result2);

   

   
  }
}