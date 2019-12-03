package shop.shoes.model.dto;

public class GoodsDetailDTO {

	private String name;
	private String imgPath;
	private String sumNailPath;
	private int price;
	private String color; //�ڵ�� ���� �ϼ̴µ� �׳� ����� �ϴ°�..?
	private int size;
	
	public GoodsDetailDTO() {}
	public GoodsDetailDTO(String name, String imgPath, String sumNailPath, int price, String color, int size) {
		super();
		this.name = name;
		this.imgPath = imgPath;
		this.sumNailPath = sumNailPath;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getSumNailPath() {
		return sumNailPath;
	}
	public void setSumNailPath(String sumNailPath) {
		this.sumNailPath = sumNailPath;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
