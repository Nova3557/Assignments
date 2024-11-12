package assignment;

public interface Animal {
	
	public void animalSound();
	public void sleep();
	
	
    class Bird implements Animal{

		@Override
		public void animalSound() {
			System.out.println("Chirp chirp chirp");
			
		}

		@Override
		public void sleep() {
			System.out.println("ZZZzzzZZz");
			
		}
		
	}
	
		}
	
