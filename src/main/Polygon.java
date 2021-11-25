package main;

public class Polygon {
	
    public float squareArea(float l){
        return l*l;
    }

    public float triangleArea(float b, float h){
        return (b*h)/2;
    }

    public float rectangleArea(float b, float h){
        return b*h;
    }

    public boolean isFourSidePolygon(int n){
        if (n==4){
            return true;
        }else {
            return false;
        }
    }
}