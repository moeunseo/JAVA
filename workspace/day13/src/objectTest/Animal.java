package objectTest;

public class Animal {
	private String name;
	private String species;
	private String weight;
	private int age;
	private int number;

	public Animal(int number, String name, int age, String species, String weight) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.species = species;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getNumber() {
	      return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	// 필드 초기화가 잘 되었는지 확인하기 위한 메소드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", weight=" + weight + ", age=" + age + ", number="
				+ number + "]";
	}

//	@Override
//	public String toString() {
//		return "이름: " + name + "\n나이: " + age + "\n종: " + species + "\n몸무게: " + weight;
//	}
	
	//동물의 고유코드가 같다면
	//true가 뜨드록 equals메소드 재정의
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj instanceof Animal) {
			Animal ani = (Animal)obj; //다운캐스팅
			return this.number == ani.number;
		}
		return false;
	}
	
	
}
