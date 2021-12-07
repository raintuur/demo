public class JavaAssignmentOperators {
//todo:         https://www.w3schools.com/java/java_operators.asp

//  Operator	Example	            Same As
//  =	        x = 5               x = 5
//  +=	        x = x + 3           x += 3
//  -=	        x = x - 3           x -= 3
//  *=	        x = x * 3           x *= 3
//  /=	        x = x / 3           x /= 3
//  %=	        x = x % 3           x %= 3
//  &=	        x = x & 3           x &= 3
//  |=	        x = x | 3           x |= 3
//  ^=	        x = x ^ 3           x ^= 3
//  >>=         x = x >> 3 	        x >>= 3
//  <<=         x = x << 3 	        x <<= 3


    public static void main(String[] args) {
        int x = 5;

        System.out.println(x = x + 3);
        System.out.println(x += 3);

        System.out.println(x = x - 3);
        System.out.println(x -= 3);

        System.out.println(x = x * 3);
        System.out.println(x *= 3);

        System.out.println(x = x / 3);
        System.out.println(x /= 3);

    }

}
