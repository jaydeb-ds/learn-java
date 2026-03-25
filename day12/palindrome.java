class pali {
    int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        return rev;
    }
}

public class palindrome {
    public static void main(String[] args) {

        pali p = new pali();
        int org = 121;
        if (org == p.reverse(org)) {
            System.out.println(org + " is a palindrome Number");
        } else {
            System.out.println(org + " is a not a palindrome Number");
        }
        // System.out.println(p.reverse(org));
    }
}
