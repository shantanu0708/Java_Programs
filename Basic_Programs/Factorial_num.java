class Factorial_num {
    public static void main(String[] args) {
           for(int num=1;num<12;num++) {
              int temp = 1;
              for(int i=1;i<num;i++) {
                  temp *= i;
              }
              System.out.println("Factorial of " + num + " is " + temp);
           }
    }
}