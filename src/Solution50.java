class Solution50 {
  public double myPow(double x, int n) {
    if(x == 0) {
      return 0;
    }
    if(n == 0) {
      return 1;
    }
    long nL = n;
    if(n < 0) {
      x = 1/x;
      nL = -1*nL;
    }
    if(n % 2 == 0){
      return myPow(x*x, (int)(nL/2));
    }
    return x * myPow(x, (int) (nL-1));
  }
}