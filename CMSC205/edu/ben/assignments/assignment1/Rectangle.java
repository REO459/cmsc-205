package edu.ben.assignments.assignment1;

/**
 * This is my rectangle class
 * 
 * @author omerb
 * @version 1.0
 */
public class Rectangle {

	// the width and length variables
	private float width, length;

	/**	Gets the width and the length of the triangle
	 * 
	 * 
	 * @param width The width of the rectangle
	 * @param length The length of the rectangle
	 */
	public Rectangle(float width, float length) {
		// sets the width and length
		this.width = width;
		this.length = length;
	}

	/**
	 * Computes the area of the rectangle
	 * 
	 * @param w the width of the rectangle
	 * @param l the length of the rectangle
	 * @return (w * l) the area of the rectangle
	 */
	public float computeArea(float w, float l) {
		// computes the area
		return (w * l);
	}

	/**
	 * Finds the perimeter of the rectangle
	 * 
	 * @param w the width of the rectangle
	 * @param l the length of the rectangle
	 * @return (2 * w + 2 * l) the perimeter of the rectangle
	 */
	public float computePerimeter(float w, float l) {
		// computes the perimeter
		return (2 * w + 2 * l);
	}

	/**
	 * Increase the dimensions of the width and length
	 * 
	 * @param newWidth dimensions of the width
	 * @param newLength dimensions of the length
	 */
	public void increaseDimensions(int newWidth, int newLength) {
		// checks if the new width and length is not below or zero
		if (newWidth <= 0 || newLength <= 0) {
			// throws illegal argument if the new width is lower than 0
			throw new IllegalArgumentException();
		}
		// adds up the old width with the new width
		width += newWidth;
		length += newLength;
	}

	/**
	 * Computes the diagonal of the rectangle
	 * 
	 * @param w the width of the rectangle
	 * @param l the length of the rectangle
	 * @return (Math.sqrt(w * w + l * l)) the diagonal of the rectangle
	 */
	public float computeDiagonal(float w, float l) {
		// computes the diagonal
		return (float) (Math.sqrt(w * w + l * l));
	}

	/**
	 * Finds the greater dimension of the rectangle
	 * 
	 * @param w the width of the rectangle
	 * @param l the length of the rectangle
	 */
	public void findGreaterDimension(float w, float l) {
		// if width is greater than length, prints out width is greater
		if (w > l) {
			System.out.println("Width is greater");
		// if length is greater than width, prints out length is greater
		} else if (w < l) {
			System.out.println("Length is greater");
		// if both are equal, prints out width and length are equal
		} else {
			System.out.println("Width and length are equal");
		}
	}

	/**
	 * Checks if the shape is the square
	 * 
	 * @return (length == width) if it is a square
	 */
	public boolean isSquare() {
		// checks if the rectangle is a square
		return (length == width);
	}

	/**
	 * Gets the width of the rectangle 
	 * 
	 * @return width of the rectangle
	 */
	public float getWidth() {
		// gets the width
		return width;
	}

	/**
	 * Gets the length of the rectangle
	 * 
	 * @return length of the rectangle
	 */
	public float getLength() {
		// gets the length
		return length;
	}

}