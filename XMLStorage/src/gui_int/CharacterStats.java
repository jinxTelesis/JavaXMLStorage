package gui_int;

public class CharacterStats {
	
	private static int CharNumInc;
	private static int defaultStats;
	
	static {
		defaultStats = 10;
	}
	
	private String ChName;
	//private int defaultStats; use static to save memory
	private int strength;
	private int dexterity;
	private int constituion;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	private int strMod;
	private int dexMod;
	private int conMod;
	private int intMod;
	private int wisMod;
	private int chaMod;
	
	private int BAB;
	
	private double weight;
	private int age;
	private boolean male;
	
	private int favWeap;
	private int ranWeap;
	private int spWeap;
	
	private int favAtk;
	private int raAtk;
	private int spAtk;
	
	private int favDam;
	private int raDam;
	private int spDam;
	
	public CharacterStats() {
		++CharNumInc;
		this.ChName = "Unamed Character"; // add a static
		this.strength = defaultStats;
		this.dexterity = defaultStats;
		this.constituion = defaultStats;
		this.intelligence = defaultStats;
		this.wisdom = defaultStats;
		this.charisma = defaultStats;
		this.strMod = (defaultStats - 10) / 2; // should truncate 11 = 0, 12 = 1; 
		this.dexMod = (defaultStats - 10) / 2; // defaults to zero but shouldn't be hardcoded to zero why it is in a constructor
		this.conMod = (defaultStats - 10) / 2;
		this.intMod = (defaultStats - 10) / 2;
		this.wisMod = (defaultStats - 10) / 2;
		this.chaMod = (defaultStats - 10) / 2;
		this.BAB = 0;
		this.weight = 165;
		this.age = 18;
		this.male = true;
		this.favAtk = getFavAtk();
		this.raAtk = getRaAtk();
		this.spAtk = getSpAtk();
		this.favDam = getFavDam();
		this.raDam = getRaDam();
		this.spDam = getSpDam();
		
		
	}

	public static int getDefaultStats() {
		return defaultStats;
	}

	public static void setDefaultStats(int defaultStats) {
		CharacterStats.defaultStats = defaultStats;
	}

	public String getChName() {
		return ChName;
	}

	public void setChName(String chName) {
		ChName = chName;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstituion() {
		return constituion;
	}

	public void setConstituion(int constituion) {
		this.constituion = constituion;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getStrMod() {
		return strMod;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}

	public int getDexMod() {
		return dexMod;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}

	public int getConMod() {
		return conMod;
	}

	public void setConMod(int conMod) {
		this.conMod = conMod;
	}

	public int getIntMod() {
		return intMod;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}

	public int getWisMod() {
		return wisMod;
	}

	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}

	public int getChaMod() {
		return chaMod;
	}

	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}

	public int getBAB() {
		return BAB;
	}

	public void setBAB(int bAB) {
		BAB = bAB;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0)
		{
			this.age = 0;
		}
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public int getFavWeap() {
		return favWeap;
	}

	public void setFavWeap(int favWeap) {
		if(favWeap == 0) {
			favWeap = 4 + strMod;
		}
		this.favWeap = favWeap + strMod;
	}

	public int getRanWeap() {
		return ranWeap;
	}

	public void setRanWeap(int ranWeap) {
		if(ranWeap == 0) {
			this.ranWeap = 3;
		}
		
		this.ranWeap = ranWeap;
	}

	public int getSpWeap() {
		return spWeap;
	}

	public void setSpWeap(int spWeap) {
		if(spWeap == 0)
		{
			this.spWeap = 6;
		}
		this.spWeap = spWeap;
	}

	public int getFavAtk() {
		return favAtk;
	}

	public void setFavAtk(int favAtk) {
		
		this.favAtk = favAtk + strMod;
	}

	public int getRaAtk() {
		return raAtk;
	}

	public void setRaAtk(int raAtk) {
		this.raAtk = raAtk;
	}

	public int getSpAtk() {
		return spAtk;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk;
	}

	public int getFavDam() {
		return favDam;
	}

	public void setFavDam(int favDam) {
		this.favDam = favDam;
	}

	public int getRaDam() {
		return raDam;
	}

	public void setRaDam(int raDam) {
		this.raDam = raDam;
	}

	public int getSpDam() {
		return spDam;
	}

	public void setSpDam(int spDam) {
		this.spDam = spDam;
	}
	
	
	
	
	

}
