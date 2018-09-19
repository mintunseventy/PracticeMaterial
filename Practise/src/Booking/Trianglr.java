package Booking;

public class Trianglr {

static int triangle(int a, int b, int c) {

        if(a<0||b<0||c<0)
            return 0;
        if(a==b && b==c)
            return 1;
        if(a+b>c && a+c>b && b+c>a)
            return 2;
        return 0;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
