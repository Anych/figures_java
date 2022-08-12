package com.epam.rd.autotasks.figures;

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
        dx = thirdSide.getX();
        dy = thirdSide.getY();
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public String pointsToString() {
        return null;
    }

    @Override
    public Point leftmostPoint() {
        return null;
    }

    Point first, second, third, fourth;
    double ax, ay, bx, by, cx, cy, dx, dy;
}
