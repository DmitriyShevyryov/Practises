package Matrix;

import java.util.Scanner;

public class Matrix {
    private double[][] array = new double[100][100];
    private int str;
    private int stb;

    public Matrix(int str, int stb)
    {
        this.str = str;
        this.stb = stb;

    }

    public Matrix sum( Matrix b)
    {
        if((this.stb != b.stb) && (this.str != b.str))
        {
            return null;
        }
        else {
            Matrix sum = new Matrix(this.str,this.stb);
            for (int i = 0; i < this.str; i++) {
                for (int j = 0; j < this.stb; j++) {
                    sum.array[i][j] = this.array[i][j] + b.array[i][j];
                }
            }
            return sum;
        }
    }
    public Matrix multiplyDouble( double x)
    {
        Matrix mul = new Matrix(this.str,this.stb);
        for (int i = 0; i < this.str; i++) {
            for (int j = 0; j < this.stb; j++) {
                mul.array[i][j] = this.array[i][j] * x;
            }
        }
        return mul;
    }
    public Matrix multiplyMatrix( Matrix b) {
        if ((this.stb != b.str) && (this.str != b.stb)) {
            return null;
        } else {
            Matrix c = new Matrix(this.str, b.stb);
            for (int i = 0; i < this.str; i++) {
                for (int j = 0; j < b.stb; j++) {
                    for (int k = 0; k < this.stb; k++) {
                        c.array[i][j] += this.array[i][k] * b.array[k][j];
                    }
                }
            }
            return c;
        }
    }
    public void output()
    {
        for (int i = 0; i < this.str; i++)
        {
            for (int j = 0; j < this.stb; j++)
            {
                System.out.print(this.array[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.str; i++)
        {
            for (int j = 0; j < this.stb; j++)
            {
                this.array[i][j] = sc.nextDouble();
            }

        }
    }
    public static void main(String [] args)
    {
        Matrix a = new Matrix(2,3);
        Matrix b = new Matrix(3,2);
        Matrix c = new Matrix(2,3);
        a.input();
        b.input();
        c.input();
        System.out.println("A*B:");
        a.multiplyMatrix(b).output();
        System.out.println("A*7:");
        a.multiplyDouble(7).output();
        System.out.println("A+C:");
        a.sum(c).output();




    }




}
