import java.util.Date;

class FoodItem extends Item 
{
	private Date Expires;

	FoodItem (String name, double price, Date expires)
	{
		super(name, price);
		this.Expires = expires;
	}

	public Date getExpires ()
	{
		return Expires;
	}

	@Override
	public String toString () 
	{
		return "FoodItem name='" + getName() 
			+ "' price='" + getPrice() 
			+ "' expires='" + getExpires() + "'";
	}

	//Delopgave 2
	public static void main(String[] args) 
	{
		FoodItem[] items = new FoodItem[10];

		for (int i=0 ; i<items.length ; i++)
		{
			items[i] = new FoodItem("Item "+i, 12.3*i,
									new Date(i*1000*60*60*24));
		}

		for (FoodItem item: items)
		{
			System.out.println(item);
		}
	}
}