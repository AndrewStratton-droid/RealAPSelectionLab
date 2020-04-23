public class Pokemon extends Generics{
	
	//declaring variables
	public static final String type = "Pokemon";
	public enum KeyType {combination, name, pokedexnum};
	public static KeyType key = KeyType.combination;
	public String name;
	public int pokedexnum;
	
	//public class for creating object
	public Pokemon(String name, int pokedexnum)
	{
		this.setType(type);
		this.name = name; 
		this.pokedexnum = pokedexnum; 
	}

	//Creating the object together. Adding all the characteristics to the object.
	public String toString()
	{
		String output="";
		switch(key) {
		case name:
			output += this.name;
			break;
		case pokedexnum:
			output += this.pokedexnum;
			break;
		case combination:
		default:
			output += type + ": " + this.name  + ", " + this.pokedexnum; 
		}
		return output;
		
	}
}

