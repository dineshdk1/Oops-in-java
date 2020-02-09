//abstract class

abstract class Animala
{
	abstract void move();
	abstract void eat();
	void label()
	{
		System.out.println("Animal's data:");
	}
}
class Birda extends Animala
{
	void move()
	{
		System.out.println("Moves by flying.");
	}
	void eat()
	{
		System.out.println("Eats birdfood.");
	}
}

//interface class

interface Animali
{
	public void eat();
	public void sound();
}
interface Birdi
{
	int numberOfLegs = 2;
	String outerCovering = "feather";
	public void fly();
}
class Eagle implements Animali, Birdi
{
	public void eat()
	{
		System.out.println("Eats reptiles and amphibians.");
	}
	public void sound()
	{
		System.out.println("Has a high-pitched whistling sound.");
	}
	public void fly()
	{
		System.out.println("Flies up to 10,000 feet.");
	}
}

//encapsulation
class Animale
{
	private String name;
	private double averageWeight;
	private int numberOfLegs;
	public String getName()
	{
		return name;
	}
	public double getAverageWeight()
	{
		return averageWeight;
	}
	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAverageWeight(double averageWeight)
	{
		this.averageWeight = averageWeight;
	}
	public void setNumberOfLegs(int numberOfLegs)
	{
		this.numberOfLegs = numberOfLegs;
	}
}

//inheritance
class Birdin
{
	public String reproduction = "egg";
	public String outerCovering = "feather";
	public void flyUp()
	{
		System.out.println("Flying up...");
	}
	public void flyDown()
	{
		System.out.println("Flying down...");
	}
}
class Eaglein extends Birdin
{
	public String name = "eagle";
	public int lifespan = 15;
}

//polymorphism
class Birdp
{
	public void fly()
	{
		System.out.println("The bird is flying.");
	}
	public void fly(int height)
	{
		System.out.println("The bird is flying " + height + " feet high.");
	}
	public void fly(String name, int height)
	{
		System.out.println("The " + name + " is flying " + height + " feet high.");
	}
}

//dynamic polymorphism
class Animaldp
{
	public void eat()
	{
		System.out.println("This animal eats insects.");
	}
}
class Birddp extends Animaldp
{
	public void eat()
	{
		System.out.println("This bird eats seeds.");
	}

}
class Oops
{
	public static void main(String[] args)
	{
		System.out.println("abstract class");
		Animala myBird = new Birda();
		myBird.label();
		myBird.move();
		myBird.eat();
		System.out.println();

		System.out.println("interface class");
		Eagle myEagle = new Eagle();
		myEagle.eat();
		myEagle.sound();
		myEagle.fly();
		System.out.println("Number of legs: " + Birdi.numberOfLegs);
		System.out.println("Outer covering: " + Birdi.outerCovering);
		System.out.println();

		System.out.println("encapsulation");
		Animale myAnimal = new Animale();
		myAnimal.setName("Eagle");
		myAnimal.setAverageWeight(1.5);
		myAnimal.setNumberOfLegs(2);
		System.out.println("Name: " + myAnimal.getName());
		System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
		System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
		System.out.println();

		System.out.println("inheritance");
		Eaglein myEaglein = new Eaglein();
		System.out.println("Name: " + myEaglein.name);
		System.out.println("Reproduction: " + myEaglein.reproduction);
		System.out.println("Outer covering: " + myEaglein.outerCovering);
		System.out.println("Lifespan: " + myEaglein.lifespan);
		myEaglein.flyUp();
		myEaglein.flyDown();
		System.out.println();

		System.out.println("polymorphism");
		Birdp myBirdp = new Birdp();
		myBirdp.fly();
		myBirdp.fly(10000);
		myBirdp.fly("eagle", 10000);
		System.out.println();

		System.out.println("dynamic polymorphism");
		Animaldp myAnimaldp = new Animaldp();
		myAnimaldp.eat();
		Birddp myBirddp = new Birddp();
		myBirddp.eat();
	}
}