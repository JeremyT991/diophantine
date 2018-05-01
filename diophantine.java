

class diophantine {

  static int d;

  public static void main (String[] args) {
    helper help = new helper();

    System.out.print("a = ");
    int a = helper.input();
    System.out.print("b = ");
    int b = helper.input();

    int[] st = new int[2];
    st = gcd(a, b);

    System.out.println("The GCD of " + a + " and " + b + " is " + d);
    System.out.println("It can be expressed as: " + d + " = " + a + "(" + st[0] + ")" + " + " + b + "(" + st[1] + ")");
  }

  static int[] gcd(int a, int b) {
    /* input: integers a and b to find the gcd of
     * output: integers s and t that solve the relation GCD(a,b) = as + bd
     * algo: a recursive implmentation of the extended euclidean algorithm
     */

    int q;
    int r;
    int s;
    int t;

    if (a != 0) {

      q = b / a;
      r = b % a;

      int[] st = new int[2];
      st = gcd(r, a);
      t = st[0];
      s = st[1] - (q * st[0]);
    } else {
      d = b;
      s = 0;
      t = 1;
    }
    
    return new int[] {s, t};
  }
}
