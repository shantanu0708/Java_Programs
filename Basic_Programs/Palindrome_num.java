class Palindrome_num {
      public static void main(String[] args) {
             int temp;
             for(int num=0;num<1000;num++) {
                int rev = 0;
                for(temp = num;temp!=0;temp /= 10) {
                   int rem = temp % 10;
                   rev = rev*10 + rem;
                }
                if(rev == num) {
                  System.out.println(num);
                }
             }
      }
}
