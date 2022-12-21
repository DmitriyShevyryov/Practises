package InterfaceRealisation;

import java.util.Scanner;

public class MathFunc implements MathCalculable
{
    private double im;
    private double re;

    public double getIm()
    {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    @Override
    public double ImPI() {
        return Math.PI;
    }

    @Override
    public double ImAbs()
    {
        return Math.sqrt(im*im + re*re);

    }

    @Override
    public void ImPow(double n)
    {
        double fi = Math.acos(im/this.ImAbs());
        this.re = Math.pow(this.ImAbs(),n)*Math.cos(n*fi);
        this.im = Math.pow(this.ImAbs(),n)*Math.sin(n*fi);


    }
    public static void main(String[] args)
    {
        MathFunc obj = new MathFunc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        double r = sc.nextDouble();
        System.out.println(obj.ImPI()*2*r);
        System.out.println("Введите действительную часть комплексного числа: ");
        obj.setRe(sc.nextDouble());
        System.out.println("Введите мнимую часть комплексного числа: ");
        obj.setIm(sc.nextDouble());
        System.out.println("Модуль комплексного числа - "+obj.ImAbs());
        System.out.println("Введите степень для числа: ");
        int n = sc.nextInt();
        obj.ImPow(n);
        System.out.println("Число  в степени "+n+": "+obj.getRe()+" "+obj.getIm()+"i");




    }
}
