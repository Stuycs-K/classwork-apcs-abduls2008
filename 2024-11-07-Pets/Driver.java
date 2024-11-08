class Driver{

  public static void main(String[] args) {

    Animal peanut = new Animal("peanuts", 1, "peanut");
    peanut.speak();

    Bird cat = new Bird("cat", 97, "dog", 40.0, "purple");
    cat.speak();
	
	cat.getName();
	
	Animal a1 = new Animal("hello", 2, "a1");
	Bird b1 = new Bird("noises", 122, "b1", 1.5, "skyblue");
	//Bird b2 = new Animal("baa", 5, "b2"); Animal cant be converted into bird since its the parent class and bird extends from it.
	Animal a2 = new Bird("moo", 12, "a2", 4.0, "pink");
	
	a1.speak();
	a2.speak();
	b1.speak();
  }
}
