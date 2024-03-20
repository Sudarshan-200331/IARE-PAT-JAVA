class BookClient{
public static void main (String rags[]) {
	Book b1=new Book(1,"Java Complete Reference","Patrick Nourton",350.00 );
	Book b2=new Book(2,"Thinking in Java","Bruce Eckel",450.00 );
	//b1.author="sudarshan";
	System.out.println(b1.getAuthor());
	b1.setAuthor("suddu");
	System.out.println(b1.getAuthor());
	}
}