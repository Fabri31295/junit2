package test;

import org.junit.jupiter.api.Test;

import main.Polygon;

import static org.junit.jupiter.api.Assertions.*;

	public class PolygonTest {
	    private Polygon polygon = new Polygon();

	    @Test
	    public void squareAreaTest(){
	        float result = polygon.squareArea(10);
	        assertEquals(result, 108);
	    }

	    @Test
	    public void triangleAreaTest(){
	        float result = polygon.triangleArea(50, 30);
	        assertEquals(result, 750);
	    }

	    @Test
	    public void rectangleAreaTest(){
	        float result = polygon.rectangleArea(50,30);
	        assertEquals(result, 1500);
	    }

	    @Test
	    public void isFourSidedPolygonTest(){
	        boolean result = polygon.isFourSidePolygon(4);
	        assertTrue(result);
	    }

	    @Test
	    public void isNotFourSidedPolygonTest(){
	        boolean result = polygon.isFourSidePolygon(3);
	        assertFalse(result);
	    }
}

