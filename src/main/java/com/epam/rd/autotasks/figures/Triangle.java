package com.epam.rd.autotasks.figures;

import java.util.Locale;

class Triangle extends Figure{
    public Triangle(Point firstSide, Point secondSide, Point thirdSide) {
        super();
        ax = firstSide.getX();
        ay = firstSide.getY();
        bx = secondSide.getX();
        by = secondSide.getY();
        cx = thirdSide.getX();
        cy = thirdSide.getY();
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String pointsToString() {
        return String.format(Locale.CANADA, "(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)", ax, ay, bx, by, cx, cy);
    }

    @Override
    public Point leftmostPoint() {
        return null;
    }

    double ax, ay, bx, by, cx, cy;
}
