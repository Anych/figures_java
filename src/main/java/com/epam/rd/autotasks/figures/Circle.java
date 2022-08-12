package com.epam.rd.autotasks.figures;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Circle extends Figure {

    public Circle(Point center, double radius) {
        super();
        c = center;
        x = center.getX();
        y = center.getY();
        r = radius;
    }
    @Override
    public double area() {
        return 3.141592653589793 * Math.pow(r, 2);
    }

    @Override
    public String pointsToString() {
        return String.format(Locale.CANADA, "(%.1f,%.1f)", x, y);
    }

    @Override
    public String toString() {
        DecimalFormatSymbols locale = new DecimalFormatSymbols(Locale.CANADA);
        DecimalFormat df = new DecimalFormat("#0.0###", locale);
        return this.getClass().getSimpleName() + "[" + pointsToString() + df.format(r) + "]";
    }

    @Override
    public Point leftmostPoint() {
        x -= r;
        c.setX(x);
        return c;
    }
    double x, y, r;
    Point c;
}
