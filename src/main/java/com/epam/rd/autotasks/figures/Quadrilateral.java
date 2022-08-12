package com.epam.rd.autotasks.figures;

import java.util.Locale;

class Quadrilateral extends Figure {
    public Quadrilateral(Point firstSide, Point secondSide, Point thirdSide, Point fourthSide) {
        super();
        first = firstSide;
        second = secondSide;
        third = thirdSide;
        fourth = fourthSide;

        ax = firstSide.getX();
        ay = firstSide.getY();
        bx = secondSide.getX();
        by = secondSide.getY();
        cx = thirdSide.getX();
        cy = thirdSide.getY();
        dx = fourthSide.getX();
        dy = fourthSide.getY();
    }
    @Override
    public double area() {
        double firstTriangle = Math.abs((ax * (by - dy) + bx * (dy - ay) + dx * (ay - by)) / 2);
        double secondTriangle = Math.abs((dx * (by - cy) + bx * (cy - dy) + cx * (dy - by)) / 2);

        return firstTriangle + secondTriangle;
    }

    @Override
    public String pointsToString() {
        return String.format(Locale.CANADA, "(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)",
                ax, ay, bx, by, cx, cy, dx, dy);
    }

    @Override
    public Point leftmostPoint() {
        Point leftPoint;
        if (bx <= ax && bx <= cx && bx <= dx) {
            leftPoint = second;
        } else if (cx <= ax && cx <= bx && cx <= dx) {
            leftPoint = third;
        } else if (dx <= ax && dx <= bx && dx <= cx) {
            leftPoint = fourth;
        } else {
            leftPoint = first;
        }
        return leftPoint;
    }

    Point first, second, third, fourth;
    double ax, ay, bx, by, cx, cy, dx, dy;
}
