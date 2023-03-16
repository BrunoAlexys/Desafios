public class Desafio3 {
    public static void main(String[] args) {
        // Sequência a)
        int a = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println(a);

        // Sequência b)
        int b = 2;
        for (int i = 0; i < 6; i++) {
            System.out.print(b + " ");
            b *= 2;
        }
        System.out.println();

        // Sequência c)
        int c = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print(c + " ");
            c += i * i;
        }
        System.out.println(c);

        // Sequência d)
        int d = 4;
        for (int i = 0; i < 4; i++) {
            System.out.print(d + " ");
            d += (i + 1) * (i + 1);
        }
        System.out.println(d);

        // Sequência e)
        int e1 = 1, e2 = 1, e3;
        System.out.print(e1 + " " + e2 + " ");
        for (int i = 0; i < 4; i++) {
            e3 = e1 + e2;
            System.out.print(e3 + " ");
            e1 = e2;
            e2 = e3;
        }
        System.out.println();

        // Sequência f)
        int f = 2;
        for (int i = 0; i < 7; i++) {
            System.out.print(f + " ");
            if (i % 2 == 0) {
                f += 2;
            } else {
                f += 4;
            }
        }
        System.out.println();
    }
}
