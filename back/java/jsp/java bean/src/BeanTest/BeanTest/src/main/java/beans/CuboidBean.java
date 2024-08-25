package beans;

public class CuboidBean {
	private double width; // 长方体宽度
	private double height; // 长方体高度
	private double length; // 长方体的长度
	private double area; // 面积
	private double perimeter; // 周长
	private double volume; // 体积
	private boolean cuboid;

	public boolean isCuboid() {
		return width > 0 && height > 0 && length > 0;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void setCuboid(boolean cuboid) {
		this.cuboid = cuboid;
	}

}
