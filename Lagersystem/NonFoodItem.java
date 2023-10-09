class NonFoodItem extends Item 
{
	private String[] materials;

	NonFoodItem (String name, double price, String[] materials)
	{
		super(name, price);
		this.materials = materials;
	}

	public String[] getMaterials ()
	{
		return materials;
	}

	@Override
	public String toString () 
	{
		String result = "NonFoodItem name='" + getName() 
			+ "' price='" + getPrice() 
			+ "' materials='";

		for (String m: getMaterials())
		{
			result += m + " ";
		}

		result += "'";
		return result;
	}

	//Delopgave 3
	public static void main(String[] args) 
	{
		NonFoodItem[] items = new NonFoodItem[10];

		for (int i=0 ; i<items.length ; i++)
		{
			String[] m = new String[2];

			for (int j=0 ; j<m.length ; j++) 
			{
				m[j] = ("material "+j);
			}

			items[i] = new NonFoodItem("Item "+i, 12.3*i, m);
									
		}

		for (NonFoodItem item: items)
		{
			System.out.println(item);
		}
	}
}