package hw;

public class Main {

    public static void main(String[] args) {

        int nrmax = Integer.MAX_VALUE;
        int add = 100,res;
        res=nrmax+add;
        System.out.println(res);// after adding a number to max integer, it will
        //overflow and go to negative part
        int nrmin = Integer.MIN_VALUE;
        int sub = 100,ret;
        ret=nrmin-sub;
        System.out.println(ret);
        float nrF = -25.5f;
        int zero=0;
        System.out.println(nrF/zero);
        float nrFPlus = 25.5f;
        int zero1=0;
        System.out.println(nrFPlus/zero1);
        double inf = Double.POSITIVE_INFINITY;
        double inf1 = Double.POSITIVE_INFINITY;
        double inf2 = Double.NEGATIVE_INFINITY;
        System.out.println(inf-inf1);
        System.out.println(inf*inf2);
