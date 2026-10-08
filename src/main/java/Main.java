record SquareStatus(int whenLimit, int sum) {
}

public class Main {
    public static SquareStatus selfSquare(int byLimitValue) {
        if (byLimitValue <= 0) {
            throw new IllegalArgumentException("byLimitValueは1以上の整数ですが、" + byLimitValue + "を受け取りました。");
        }
        int jijowa = 0;
        int m = 0;

        while (jijowa <= byLimitValue) {
            m++;
            jijowa += m * m;
        }

        return new SquareStatus(m - 1, jijowa - (m * m));
    }

    public static void main(String[] args) {
        SquareStatus val = Main.selfSquare(100000);
        System.out.println("１からｍまでの整数値（自然数）のおのおのの二乗を、すべて足した値が、１０万以内に収まるようなｍの値は" + val.whenLimit());
        System.out.println("その和は" + val.sum());
    }
}
