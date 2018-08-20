package gui_int;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="CharacterStats")
public class CharacterStats implements Serializable{

	private String ChName;
	//private int defaultStats; use static to save memory
	private int strength;
	private int dexterity;
	private int constitution;
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
	
	private int maStr;
	private int maDex;
	private int maCon;
	private int maInt;
	private int maWis;
	private int maCha;
	private int level;
	private int hitdie;
	private int hitdice[];
	
	
	public CharacterStats() { // need to set getters before used
		//++CharNumInc;
		this.ChName = "Unamed Character"; // add a static
		this.strength = 10;
		this.dexterity = 10;
		this.constitution = 10;
		this.intelligence = 10;
		this.wisdom = 10;
		this.charisma = 10;
		this.strMod = 0; // should truncate 11 = 0, 12 = 1; 
		this.dexMod = 0; // defaults to zero but shouldn't be hardcoded to zero why it is in a constructor
		this.conMod = 0;
		this.intMod = 0;
		this.wisMod = 0;
		this.chaMod = 0;
		this.BAB = 0;
		this.weight = 165;
		this.age = 18;
		this.male = true;
		// needs to call setters for Favweapon and atk first
		setFavWeap(0); // this.favWeap set 
		setRanWeap(0); // this.ranWeap set
		setSpWeap(0); // this.spWeap set
		setFavAtk(0); // this.favAtk set
		setRaAtk(0); // this.raAtk set
		setSpAtk(0); // this.spAtk set
	}
	
	public CharacterStats(CharacterStats obj) { // test this first
		this();
		this.ChName = obj.ChName;
		this.strength = obj.strength;
		this.dexterity = obj.dexterity;
		this.constitution = obj.constitution;
		this.intelligence = obj.intelligence;
		this.wisdom = obj.wisdom;
		this.charisma = obj.charisma;
		this.BAB = obj.BAB;
		this.weight = obj.weight;
		this.age = obj.age;
		this.male = obj.male;
		this.maStr = obj.maStr;
		this.maDex = obj.maDex;
		this.maCon = obj.maCon;
		this.maInt = obj.maInt;
		this.maWis = obj.maWis;
		this.favAtk = obj.favAtk;
		this.spAtk = obj.spAtk;
		this.raAtk = obj.raAtk;
		this.favWeap = obj.favWeap;
		this.ranWeap = obj.ranWeap;
		this.spWeap = obj.spWeap;
		this.level = obj.level;
		this.hitdie = obj.hitdie;
		this.hitdice = obj.hitdice;
		this.strMod = Math.floorDiv(((this.strength + this.maStr)-10), 2); //char1.setStrMod(Math.floorDiv(((char1.getStrength() + char1.getMaStr())-10), 2));
		this.dexMod = Math.floorDiv(((this.dexterity + this.maDex)-10), 2);
		this.conMod = Math.floorDiv(((this.constitution + this.maCon)-10), 2);
		this.intMod = Math.floorDiv(((this.intelligence + this.maInt)-10), 2);
		this.wisMod = Math.floorDiv(((this.wisdom + this.maWis)-10), 2);
		this.chaMod = Math.floorDiv(((this.charisma + this.maCha)-10), 2);
//		this.dexMod = obj.dexMod;
//		this.conMod = obj.conMod;
//		this.intMod = obj.intMod;
//		this.wisMod = obj.wisMod;
//		this.chaMod = obj.chaMod;
		this.calcFavDam();
		this.calcRaDam();
		this.calcSpDam();
	}
	
	public int[] createHitDie(int size) { // put this in the action listener not the class i think
		if(size > 100)
		{
			size = 99;
		}
		int hitDie[] = new int[size];
		return hitDie;
	}
	
	@XmlElement
	public int getMaStr() {
		return maStr;
	}
	
	public String getMaStr(String Dummy)
	{
		String s = "MaStr";
		return s;
	}

	public void setMaStr(int maStr) {
		if(maStr < -100)
		{
			maStr = -99;
		}
		this.maStr = maStr;
	}
	
	@XmlElement
	public int getMaDex() {
		return maDex;
	}
	
	public String getMaDex(String Dummy) {
		String s = "MaDex";
		return s;
	}

	public void setMaDex(int maDex) {
		if(maDex < -100)
		{
			maDex = -99;
		}
		this.maDex = maDex;
	}
	
	@XmlElement
	public int getMaCon() {
		return maCon;
	}
	
	public String getMaCon(String Dummy) {
		String s = "MaCon";
		return s;
	}

	public void setMaCon(int maCon) {
		if(maCon < -100)
		{
			maCon = -99;
		}
		this.maCon = maCon;
	}
	
	@XmlElement
	public int getMaInt() {
		return maInt;
	}
	
	public String getMaInt(String Dummy)
	{
		String s = "MaInt";
		return s;
	}

	public void setMaInt(int maInt) {
		if(maInt < -100)
		{
			maInt = -99;
		}
		this.maInt = maInt;
	}
	
	@XmlElement
	public int getMaWis() {
		return maWis;
	}
	
	public String getMaWis(String Dummy) {
		String s = "MaWis";
		return s;
	}

	public void setMaWis(int maWis) {
		if(maWis < -100)
		{
			maWis = -99;
		}
		
		this.maWis = maWis;
	}
	
	@XmlElement
	public int getMaCha() {
		return maCha;
	}
	
	public String getMaCha(String Dummy) {
		String s = "MaCha";
		return s;
	}
			
	public void setMaCha(int maCha) {
		if(maCha < -100)
		{
			maCha = 99;
		}
		this.maCha = maCha;
	}
		
	@XmlElement
	public String getChName() {
		return ChName;
	}
	
	public String getChName(String dummy) {
		String s = "ChName";
		return s;
	}

	public void setChName(String chName) {
		ChName = chName;
	}
	
	@XmlElement
	public int getStrength() {
		return strength;
	}
	
	public String getStrength(String Dummy)
	{
		String s = "Strength";
		return s;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@XmlElement
	public int getDexterity() {
		return dexterity;
	}
	
	public String getDexterity(String Dummy) {
		String s = "Dexterity";
		return s;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	@XmlElement
	public int getConstitution() {
		return constitution;
	}
	
	public String getConstitution(String Dummy) {
		String s = "Constitution";
		return s;
	}
	
	public void setConstituion(int constituion) {
		this.constitution = constituion;
	}
	
	@XmlElement
	public int getIntelligence() {
		return intelligence;
	}
	
	public String getIntelligence(String Dummy) {
		String s = "Intelligence";
		return s;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	@XmlElement
	public int getWisdom() {
		return this.wisdom;
	}
	
	public String getWisdom(String Dummy) {
		String s = "Wisdom";
		return s;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	
	@XmlElement
	public int getCharisma() {
		return this.charisma;
	}
	
	public String getCharisma(String Dummy) {
		String s = "Charisma";
		return s;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	
	@XmlElement
	public int getStrMod() {
		return strMod;
	}
	
	public String getStrMod(String Dummy) {
		String s = "StrMod";
		return s;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}
	
	@XmlElement
	public int getDexMod() {
		return dexMod;
	}
	
	public String getDexMod(String Dummy) {
		String s = "DexMod";
		return s;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}
	
	@XmlElement
	public int getConMod() {
		return conMod;
	}
	
	public String getConMod(String Dummy) {
		String s = "ConMod";
		return s;
	}

	public void setConMod(int conMod) {
		this.conMod = conMod;
	}
	
	@XmlElement
	public int getIntMod() {
		return intMod;
	}
	
	public String getIntMod(String Dummy) {
		String s = "IntMod";
		return s;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}
	
	@XmlElement
	public int getWisMod() {
		return wisMod;
	}
	
	public String getWisMod(String Dummy) {
		String s = "WisMod";
		return s;
	}

	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}
	
	@XmlElement
	public int getChaMod() {
		return chaMod;
	}
	
	public String getChaMod(String Dummy) {
		String s = "ChaMod";
		return s;
	}

	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}
	
	@XmlElement
	public int getBAB() {
		return BAB;
	}
	
	public String getBab(String Dummy) {
		String s ="BAB";
		return s;
	}

	public void setBAB(int bAB) {
		BAB = bAB;
	}
	
	@XmlElement
	public double getWeight() {
		return weight;
	}
	
	public String getWeight(String Dummy)
	{
		String s = "Weight";
		return s;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@XmlElement
	public int getAge() {
		return age;
	}
	
	public String getAge(String Dummy) {
		String s = "Age";
		return s;
	}

	public void setAge(int age) {
		if(age < 0)
		{
			this.age = 0;
		}
		this.age = age;
	}
	
	@XmlElement
	public boolean isMale() {
		return male;
	}
	
	public String isMale(String Dummy) {
		String s = "Male";
		return s;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	@XmlElement
	public int getFavWeap() {
		return favWeap;
	}
	
	public String getFavWeap(String Dummy) {
		String s = "FavWeap";
		return s;
	}

	public void setFavWeap(int favWeap) {
		if(favWeap == 0) {
			favWeap = 4;
		}
		this.favWeap = favWeap;
	}
	
	@XmlElement
	public int getRanWeap() {
		return ranWeap;
	}
	
	public String getRanWeap(String Dummy) {
		String s = "RanWeap";
		return s;
	}
	
	// special

	public void setRanWeap(int ranWeap) {
		if(ranWeap == 0) {
			this.ranWeap = 3;
		}
		
		this.ranWeap = ranWeap;
	}
	
	@XmlElement
	public int getSpWeap() {
		return spWeap;
	}
	
	public String getSpWeap(String Dummy) {
		String s = "SpWeap";
		return s;
	}
	
	// special

	public void setSpWeap(int spWeap) {
		if(spWeap == 0)
		{
			this.spWeap = 6;
		}
		this.spWeap = spWeap;
	}
	
	@XmlElement
	public int getFavAtk() {
		return favAtk;
	}
	
	public String getFavAtk(String Dummy) {
		String s ="FavAtk";
		return s;
	}

	public void setFavAtk(int favAtk) {
		this.favAtk = favAtk + strMod + BAB;
	}
	
	@XmlElement
	public int getRaAtk() {
		return raAtk;
	}
	
	public String getRaAtk(String Dummy)
	{
		String s ="RaAtk";
		return s;
	}

	public void setRaAtk(int raAtk) {
		this.raAtk = raAtk + dexMod + BAB;
	}
	
	@XmlElement
	public int getSpAtk() {
		return spAtk;
	}
	
	public String getSpAtk(String Dummy) {
		String s = "SpAtk";
		return s;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk + dexMod + BAB;
	}
	
	@XmlElement
	public int getFavDam() {
		return favDam;
	}
	
	public String getFavDam(String Dummy) {
		String s = "FavDam";
		return s;
	}

	public void calcFavDam() {
		this.favDam = strMod + favWeap;
	}
	
	@XmlElement
	public int getRaDam() {
		return raDam;
	}
	
	public String getRaDam(String Dummy) {
		String s = "RaDam";
		return s;
	}

	public void calcRaDam() {
		this.raDam = dexMod + ranWeap;
	}
	
	@XmlElement
	public int getSpDam() {
		return spDam;
	}
	
	public String getSpDam(String Dummy) {
		String s = "SpDam";
		return s;
	}

	public void calcSpDam() {
		this.spDam = dexMod + spWeap;
	}
	
	@XmlElement
	public int getLevel() {
		return level;
	}
	
	public String getLevel(String Dummy) {
		String s= "Level";
		return s;
	}

	public void setLevel(int level) {
		if(level > 20)
		{
			this.level = 20;
		}
		this.level = level;
	}
	
	//@XmlElement
	public int[] getHitdice() {
		return hitdice;
	}

	public void setHitdice(int hitdice[]) {
		this.hitdice = hitdice;
	}
	
	@XmlElement
	public int getHitdie() {
		return hitdie;
	}
	
	public String getHitdie(String Dummy) {
		String s = "Hitdie";
		return s;
	}

	public void setHitdie(int hitdie) {// can't marshall with an exception
		if(hitdie < 4)
		{
			hitdie = 4;
			System.out.println("Hitdie must be at least 4");
		}
		
		if(hitdie == 5)
		{
			hitdie = 6;
			System.out.println("Hitdie must not be an odd number /n check your character sheet");
			//throw new InvalidHitDie("Hitdie can't be 5");
		}
		
		if(hitdie == 7)
		{
			hitdie = 8;
			System.out.println("Hitdie must not be an odd number /n check your character sheet");
		}
		
		if(hitdie == 9)
		{
			hitdie = 10;
			System.out.println("Hitdie must not be an odd number /n check your character sheet");
		}
		
		if(hitdie == 11)
		{
			hitdie = 12;
			System.out.println("Hitdie must not be an odd number /n check your character sheet");
		}
		
		if(hitdie > 12)
		{
			hitdie = 12;
			System.out.println("Hitdie can't be greater than 12!");
		}
		
		
		this.hitdie = hitdie;
	}
}
