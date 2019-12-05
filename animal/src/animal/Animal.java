package animal;

public abstract class Animal
	{
		protected String name, food;
		public abstract void bearYoung();
		public abstract void makeNoise();
		public void eat() {
			System.out.println(name + " says: gimme some " + food);
		}
		
	}
