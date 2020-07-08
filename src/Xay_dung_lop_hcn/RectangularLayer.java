package Xay_dung_lop_hcn;

public class RectangularLayer {
    double width, height;

    public RectangularLayer() {

    }

    public RectangularLayer(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return " Rectangle {" + " width = " + width + ", height = " + height + "}";
    }
}
