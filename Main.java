public class Main{

	private static Chair chair;

	static{

		chair=new Chair();
		System.out.println(chair);

		chair.setMaterial(Chair.Material.LEATHER);
		chair.setColor("brown");
		System.out.println(chair);

		chair.setMaterial("NYLON");
		System.out.println(chair);

	}
	
	public static void main(String[] args){

		chair=new Chair(Chair.Material.WOOD,"black");
		System.out.println(chair);

		Building building=new Building(Building.Type.RESIDENTIAL,true);
		System.out.println(building);

		building=new Building(true);
		System.out.println(building);

		building.type=Building.Type.COMMERCIAL;
		System.out.println(building);

		building.setAbandoned(0);
		System.out.println(building);

		Sentence sentence=new Sentence("Hello, world!");
		System.out.println(sentence);

		System.out.println(" words count > "+sentence.getWords().length);
		System.out.println(" first word > "+sentence.getWord(0));
		System.out.println(" second word > "+sentence.getWord(1));
		System.out.println(" third word > "+sentence.getWord(2));

	}

}

class Chair{

	enum Material{
		LEATHER,
		FABRIC,
		PLASTIC,
		WOOD,
		NYLON
	}

	private final long timeSerialNumber;
	private Material material;
	private String color;

	{

		timeSerialNumber=System.currentTimeMillis();

	}

	Chair(){



	}

	Chair(Material material, String color){

		this.material=material;
		this.color=color;

	}

	long getTimeSerialNumber(){

		return timeSerialNumber;

	}

	void setMaterial(Material material){

		this.material=material;

	}

	void setMaterial(String material){

		switch(material.toUpperCase()){

			case "LEATHER": setMaterial(Material.LEATHER);
			case "FABRIC": setMaterial(Material.FABRIC);
			case "PLASTIC": setMaterial(Material.PLASTIC);
			case "WOOD": setMaterial(Material.WOOD);
			case "NYLON": setMaterial(Material.NYLON);
			default: material=null;

		}

	}

	Material getMaterial(){

		return material;

	}

	void setColor(String color){

		this.color=color;

	}

	String getColor(){

		return color;

	}

	public String toString(){

		return "Chair:\n timeSerialNumber > "+timeSerialNumber+"\n material > "+material+"\n color > "+color+"\n";

	}

}

class Building{

	enum Type{
		RESIDENTIAL,
		COMMERCIAL,
		INDUSTRIAL,
		INFRASTRUCTURE,
		AGRICULTURAL,
		INSTITUTIONAL
	}

	final long timeSerialNumber;
	Type type;
	boolean abandoned;

	{

		timeSerialNumber=System.currentTimeMillis();

	}

	Building(){

	}

	Building(Type type){

		this.type=type;

	}

	Building(boolean abandoned){

		this.abandoned=abandoned;

	}

	Building(Type type, boolean abandoned){

		this.type=type;
		this.abandoned=abandoned;

	}

	long getTimeSerialNumber(){

		return timeSerialNumber;

	}

	void setType(Type type){

		this.type=type;

	}

	void setAbandoned(boolean abandoned){

		this.abandoned=abandoned;

	}

	void setAbandoned(int abandoned){

		this.abandoned=abandoned==0?false:true;

	}

	Type getType(){

		return type;

	}

	boolean isAbandoned(){

		return abandoned;

	}

	public String toString(){

		return "Building:\n timeSerialNumber > "+timeSerialNumber+"\n type > "+type+"\n abandoned > "+abandoned+"\n";

	}

}

class Sentence{

	String sentence;

	Sentence(String sentence){

		this.sentence=sentence;

	}

	String[] getWords(){

		return sentence.replaceAll("[.,!;:\\-\"']","").split(" ");

	}

	String getWord(int i){

		String[] words=getWords();
		return i<0 || i>=words.length?null:words[i];

	}

	public String toString(){

		return "Sentence: "+sentence;

	}

}
