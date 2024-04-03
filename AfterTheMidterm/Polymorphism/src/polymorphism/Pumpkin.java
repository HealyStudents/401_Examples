package polymorphism;

import java.util.ArrayList;
import java.util.Random;

public class Pumpkin implements Comparable<Pumpkin>
{
	public String farmer;
	public double mass;
	
	public Pumpkin(String farmer, double mass)
	{
		this.farmer = farmer;
		this.mass = mass;
	}
	
	public String toString()
	{
		return mass + " lb pumkin, farmed by " + farmer;
	}
	
	@Override
	public int compareTo(Pumpkin other) 
	{
		//If the other pumpkin is bigger
		if(other.mass > this.mass)
			return -1;
		//If this is bigger than the other pumpkin
		if(other.mass < this.mass)
			return 1;
		//If they are equal
		return 0;
	}
	
	public static String getRandomName()
	{
		String[] names = new String[] {"John","William","James","Charles","George","Frank","Joseph","Thomas","Henry","Robert","Edward","Harry","Walter","Arthur","Fred","Albert","Samuel","David","Louis","Joe","Charlie","Clarence","Richard","Andrew","Daniel","Ernest","Will","Jesse","Oscar","Lewis","Peter","Benjamin","Frederick","Willie","Alfred","Sam","Roy","Herbert","Jacob","Tom","Elmer","Carl","Lee","Howard","Martin","Michael","Bert","Herman","Jim","Francis","Harvey","Earl","Eugene","Ralph","Ed","Claude","Edwin","Ben","Charley","Paul","Edgar","Isaac","Otto","Luther","Lawrence","Ira","Patrick","Guy","Oliver","Theodore","Hugh","Clyde","Alexander","August","Floyd","Homer","Jack","Leonard","Horace","Marion","Philip","Allen","Archie","Stephen","Chester","Willis","Raymond","Rufus","Warren","Jessie","Milton","Alex","Leo","Julius","Ray","Sidney","Bernard","Dan","Jerry","Calvin","Perry","Dave","Anthony","Eddie","Amos","Dennis","Clifford","Leroy","Wesley","Alonzo","Garfield","Franklin","Emil","Leon","Nathan","Harold","Matthew","Levi","Moses","Everett","Lester","Winfield","Adam","Lloyd","Mack","Fredrick","Jay","Jess","Melvin","Noah","Aaron","Alvin","Norman","Gilbert","Elijah","Victor","Gus","Nelson","Jasper","Silas","Christopher","Jake","Mike","Percy","Adolph","Maurice","Cornelius","Felix","Reuben","Wallace","Claud","Roscoe","Sylvester","Earnest","Hiram","Otis","Simon","Willard","Irvin","Mark","Jose","Wilbur","Abraham","Virgil","Clinton","Elbert","Leslie","Marshall","Owen","Wiley","Anton","Morris","Manuel","Phillip","Augustus","Emmett","Eli","Nicholas","Wilson","Alva","Harley","Newton","Timothy","Marvin","Ross","Curtis","Edmund","Jeff","Elias","Harrison","Stanley","Columbus","Lon","Ora","Ollie","Russell","Pearl","Solomon","Arch","Asa","Clayton","Enoch","Irving","Mathew","Nathaniel","Scott","Hubert","Lemuel","Andy","Ellis","Emanuel","Joshua","Millard","Vernon","Wade","Cyrus","Miles","Rudolph","Sherman","Austin","Bill","Chas","Lonnie","Monroe","Byron","Edd","Emery","Grant","Jerome","Max","Mose","Steve","Gordon","Abe","Pete","Chris","Clark","Gustave","Orville","Jocelynn","Litzy","Makena","Abagail","Giuliana","Joyce","Libby","Lillianna","Thalia","Tia","Sarahi","Zaniyah","Kristin","Lorelai","Mattie","Taniya","Jaslyn","Gemma","Valery","Lailah","Mckinley","Micah","Deja","Frida","Brynlee","Jewel","Krista","Mira","Yamilet","Adison","Carina","Karli","Magdalena","Stephany","Charlize","Raelynn","Aliana","Cassie","Mina","Karley","Shirley","Marlie","Alani","Taniyah","Cloe","Sanai","Lina","Nola","Anabella","Dalia","Raina","Mariela","Ariella","Bria","Kamari","Monique","Ashleigh","Reina","Alia","Ashanti","Lara","Lilia","Justine","Leia","Maribel","Abigayle","Tiara","Alannah","Princess","Sydnee","Kamora","Paityn","Payten","Naima","Gretchen","Heidy","Nyasia","Livia","Marin","Shaylee","Maryjane","Laci","Nathalia","Azaria","Anabel","Chasity","Emmy","Izabelle","Denisse","Emelia","Mireya","Shea","Amiah","Dixie","Maren","Averi","Esperanza","Micaela","Selina","Alyvia","Chana","Avah","Donna","Kaylah","Ashtyn","Karsyn","Makaila","Shayna","Essence","Leticia","Miya","Rory","Desirae","Kianna","Laurel","Neveah","Amaris","Hadassah","Dania"};
		return names[(int) (Math.random()*names.length)];
	}
	
	public static ArrayList<Pumpkin> generatePumpkinList(int listSize)
	{
		ArrayList<Pumpkin> pumpkins = new ArrayList<Pumpkin>();
		
		for(int i = 0; i < listSize; i++)
		{
			pumpkins.add(new Pumpkin(getRandomName(), Math.random()*12 + 6));
		}
		
		return pumpkins;
	}
	
	public static void main(String[] args)
	{
		//Generating list of pumpkin
		ArrayList<Pumpkin> pumpkins = Pumpkin.generatePumpkinList(100);
		//Printing out the list of pumpkins
		for(Pumpkin p : pumpkins)
			System.out.println("- " + p.toString());
		System.out.println();
		//Sorting our list of pumpkins 
		pumpkins.sort(null);
		//Printing it out again
		for(Pumpkin p : pumpkins)
			System.out.println("- " + p.toString());
		System.out.println();
		
		//Print our best pumpkin
		System.out.println("Top 3 pumpkins:");
		System.out.println("1. " + pumpkins.get(pumpkins.size()-1));
		System.out.println("2. " + pumpkins.get(pumpkins.size()-2));
		System.out.println("3. " + pumpkins.get(pumpkins.size()-3));
		
	}

}
