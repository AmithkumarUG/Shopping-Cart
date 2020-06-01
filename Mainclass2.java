package ds;

class Shoe{
	String brand;
	String color;
	double price;
	public Shoe(String brand,String color,double price) {
		super();
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		String res=brand+" "+color+" "+price;
		return res;
	}
}

class Book{
	String name;
	String author;
	double price;
	public Book(String name,String author,double price) {
		super();
		this.name=name;
		this.author=author;
		this.price=price;
	}
	@Override
	public String toString() {
		String res=name+" "+author+" "+price;
		return res;
	}
	
}

class cart{
	Object [] crt=new Object[4];
	int idx=0;
	int count=0;
	public void addtocart(Object obj) {
		if(idx<crt.length) {
			crt[idx]=obj;
			idx++;
			count++;
		}
		else
		{
			System.out.println("cart is full");
		}
	}
		
		@Override
		public String toString() // very very importanat
		{
		  String res = "";
		  if(crt[0]!=null) {
		  for (int i = 0; i < count; i++) 
		  {
			res = res +" "+crt[i]+"\n";
		  }
		  return res;
		  }
		  return "cart is empty";
		  
		 
		}
	
}

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoe s1=new Shoe("adidas", "black", 7000);
		Book b1=new Book("noStringAttached","xyz",500);
		cart c1=new cart();
		c1.addtocart(s1);
		c1.addtocart(b1);
		System.out.println(c1);
		
		

	}

}
