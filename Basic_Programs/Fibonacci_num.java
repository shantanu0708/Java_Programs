class Fibonacci_num {
      public static void main(String[] args) {
             int num;
             int temp1 = 0, temp2 = 1;
             System.out.println(temp1 + "\n" + temp2);
             do{
                num = temp1 + temp2;
                System.out.println(num);
                temp1 = temp2;
                temp2 = num;
             }while(num < 100);
      }
}
