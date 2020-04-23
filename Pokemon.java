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
	
	public static Generics[] pokemonData() {
		Generics[] pok = { 
				new Pokemon("Squirtle", 7),
				new Pokemon("Wartortle", 8),
				new Pokemon("Blastoise", 9),
				new Pokemon("Psyduck", 54),
				new Pokemon("Golduck", 55),
				new Pokemon("Poliwag", 60),
				new Pokemon("Poliwhirl", 61),
				new Pokemon("Slowpoke", 79),
				new Pokemon("Slowbro", 80),
				new Pokemon("Seel", 86),
				new Pokemon("Shellder", 90),
				new Pokemon("Krabby", 98),
				new Pokemon("Kingler", 99),
				new Pokemon("Horsea", 116),
				new Pokemon("Seadra", 117),
				new Pokemon("Goldeen", 118),
				new Pokemon("Seaking", 119),
				new Pokemon("Staryu", 120),
				new Pokemon("Magikarp", 129),
				new Pokemon("Vaporeon", 134)			
				
		};
		return pok;
	}
	
	public static void main(String[] args)
	{
		Generics[] pok = pokemonData();
		for(Generics p : pok)
			System.out.println(p);
	}
}

