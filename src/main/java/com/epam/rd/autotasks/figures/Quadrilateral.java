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
        return 0;
    }

    @Override
    public String pointsToString() {
        return String.format(Locale.CANADA, "(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)",
                ax, ay, bx, by, cx, cy, dx, dy);
    }

    @Override
    public Point leftmostPoint() {
        return null;
    }

    Point first, second, third, fourth;
    double ax, ay, bx, by, cx, cy, dx, dy;
}
