package animal;

public class animalDriver
	{

		public static void main(String[] args)
			{
				Animal[] zoo = new Animal[2];
			zoo[0] = new Bat();
			zoo[0].eat();
			zoo[0].makeNoise();
			zoo[0].bearYoung();

			}

	}
