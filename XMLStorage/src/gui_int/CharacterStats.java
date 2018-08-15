package gui_int;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="CharacterStats")
public class CharacterStats implements Serializable{
	
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
		// needs to call setters for Favweapon and atk first
		setFavWeap(0); // this.favWeap set 
		setRanWeap(0); // this.ranWeap set
		setSpWeap(0); // this.spWeap set
		setFavAtk(0); // this.favAtk set
		setRaAtk(0); // this.raAtk set
		setSpAtk(0); // this.spAtk set
		//setFavDam(0);// this.favDam set
		//setRaDam(0);// this.raDam set
		//setSpDam(0);// this.spDam set
		
		
		
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

	public void setMaCha(int maCha) {
		if(maCha < -100)
		{
			maCha = 99;
		}
		this.maCha = maCha;
	}
	// maybe hold off on this one???
	@XmlElement
	public static int getDefaultStats() {
		return defaultStats;
	}

	public static void setDefaultStats(int defaultStats) {
		CharacterStats.defaultStats = defaultStats;
	}
	
	@XmlElement
	public String getChName() {
		return ChName;
	}

	public void setChName(String chName) {
		ChName = chName;
	}
	
	@XmlElement
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@XmlElement
	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	@XmlElement
	public int getConstituion() {
		return constituion;
	}

	public void setConstituion(int constituion) {
		this.constituion = constituion;
	}
	
	@XmlElement
	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	@XmlElement
	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	
	@XmlElement
	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	
	@XmlElement
	public int getStrMod() {
		return strMod;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}
	
	@XmlElement
	public int getDexMod() {
		return dexMod;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}
	
	@XmlElement
	public int getConMod() {
		return conMod;
	}

	public void setConMod(int conMod) {
		this.conMod = conMod;
	}
	
	@XmlElement
	public int getIntMod() {
		return intMod;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}
	
	@XmlElement
	public int getWisMod() {
		return wisMod;
	}

	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}
	
	@XmlElement
	public int getChaMod() {
		return chaMod;
	}

	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}
	
	@XmlElement
	public int getBAB() {
		return BAB;
	}

	public void setBAB(int bAB) {
		BAB = bAB;
	}
	
	@XmlElement
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@XmlElement
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
	
	@XmlElement
	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	@XmlElement
	public int getFavWeap() {
		return favWeap;
	}
	
	// special

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

	public void setFavAtk(int favAtk) {
		
		this.favAtk = favAtk + strMod + BAB;
	}
	
	@XmlElement
	public int getRaAtk() {
		return raAtk;
	}

	public void setRaAtk(int raAtk) {
		this.raAtk = raAtk + dexMod + BAB;
	}
	
	@XmlElement
	public int getSpAtk() {
		return spAtk;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk + dexMod + BAB;
	}
	
	@XmlElement
	public int getFavDam() {
		return favDam;
	}

	public void calcFavDam() {
		this.favDam = strMod + favWeap;
	}
	
	@XmlElement
	public int getRaDam() {
		return raDam;
	}

	public void calcRaDam() {
		this.raDam = dexMod + ranWeap;
	}
	
	@XmlElement
	public int getSpDam() {
		return spDam;
	}

	public void calcSpDam() {
		this.spDam = dexMod + spWeap;
	}
	
	@XmlElement
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level > 20)
		{
			this.level = 20;
		}
		this.level = level;
	}
	
	@XmlElement
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

	public void setHitdie(int hitdie) throws InvalidHitDie {
		if(hitdie < 4)
		{
			throw new InvalidHitDie("Hitdie must be 4 or greater");
		}
		
		if(hitdie == 5)
		{
			throw new InvalidHitDie("Hitdie can't be 5");
		}
		
		if(hitdie == 7)
		{
			throw new InvalidHitDie("Hitdie can't be 7");
		}
		
		if(hitdie == 9)
		{
			throw new InvalidHitDie("Hitdie can't be 9");
		}
		
		if(hitdie == 11)
		{
			throw new InvalidHitDie("Hitdie can't be 11");
		}
		
		if(hitdie > 12)
		{
			throw new InvalidHitDie("HitDie can't be greater than 12");
		}
		
		
		this.hitdie = hitdie;
	}
}
