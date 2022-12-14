/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.Scanner;

public class Test {
    static class Point{
        private static double t1;
        private static double t2;
        private double d1;
        private double d2;

        public Point(){}

        public Point(double a, double b){
            d1 = a;
            d2 = b;
        }

        public static Point nextPoint(Scanner s){
            t1 = s.nextDouble();
            t2 = s.nextDouble();
            return new Point(t1, t2);
        }

        public double getD1(){return d1;}
        public double getD2(){return d2;}
        public void setD1(double a){
            d1 = a;
        }
        public void setD2(double b){
            d2 = b;
        }
    }

    static class Triangle{
        private Point p1;
        private Point p2;
        private Point p3;

        public Triangle(Point a, Point b, Point c){
            p1 = new Point();
            p1.setD1(a.getD1());
            p1.setD2(a.getD2());
            p2 = new Point();
            p2.setD1(b.getD1());
            p2.setD2(b.getD2());
            p3 = new Point();
            p3.setD1(c.getD1());
            p3.setD2(c.getD2());
        }

        public boolean valid(){
            double canh1 = Math.sqrt(Math.pow((p2.getD1() - p1.getD1()),2) + Math.pow((p2.getD2() - p1.getD2()), 2));
            double canh2 = Math.sqrt(Math.pow((p3.getD1() - p1.getD1()),2) + Math.pow((p3.getD2() - p1.getD2()), 2));
            double canh3 = Math.sqrt(Math.pow((p3.getD1() - p2.getD1()),2) + Math.pow((p3.getD2() - p2.getD2()), 2));
            if (canh1+canh2>canh3 && canh1+canh3>canh2 && canh3+canh2>canh1){
                return true;
            }else{
                return false;
            }
        }

        public String getPerimeter(){
            double canh1 = Math.sqrt(Math.pow((p2.getD1() - p1.getD1()),2) + Math.pow((p2.getD2() - p1.getD2()), 2));
            double canh2 = Math.sqrt(Math.pow((p3.getD1() - p1.getD1()),2) + Math.pow((p3.getD2() - p1.getD2()), 2));
            double canh3 = Math.sqrt(Math.pow((p3.getD1() - p2.getD1()),2) + Math.pow((p3.getD2() - p2.getD2()), 2));
            double cv = canh1+canh2+canh3;
            return String.format("%.3f", cv);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    public static void main7244209(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                 System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

