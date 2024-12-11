public class Main {
    public static void main(String[] args) {
        int x;
        String y;
        Sign signOne = new Sign("ABC123", 3);
        x = signOne.numberOfLines();
        y = signOne.getLines();
        System.out.println(x);
        System.out.println(y);

        int q;
        String w;
        Sign signTwo = new Sign("ABCD", 10);
        q = signTwo.numberOfLines();
        w = signTwo.getLines();
        System.out.println(q);
        System.out.println(w);

        int e;
        String r;
        Sign signThree = new Sign("ABCDEF", 6);
        e = signThree.numberOfLines();
        r = signThree.getLines();
        System.out.println(e);
        System.out.println(r);

        int t;
        String u;
        Sign signFour = new Sign("", 4);
        t = signFour.numberOfLines();
        u = signFour.getLines();
        System.out.println(t);
        System.out.println(u);

        int i;
        String p;
        Sign signFive = new Sign("AB_CD_EF", 2);
        i = signFive.numberOfLines();
        p = signFive.getLines();
        System.out.println(i);
        System.out.println(p);
    }
}
