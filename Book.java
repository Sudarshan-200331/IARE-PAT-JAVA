//Book.java
class Book{
	 private int bookid;
	 private String bookName;
	 private String author;
	 private double price;
	
	Book() {}
	Book(int id, String name,String author,double price) {
		bookid=id;
		bookName=name;
		this.author=author;
		this.price=price;
	}
	public void setBookid(int id){
		bookid=id;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookName(String name){
		bookName=name;
	}
	public String  getBookName() {
		return bookName;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setPrice(double id){
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	public String toString() {
		return bookid+" "+bookName+" "+author+" "+price;
	}
}