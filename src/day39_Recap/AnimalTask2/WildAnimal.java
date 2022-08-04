package day39_Recap.AnimalTask2;

public class WildAnimal extends Animal{

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void hunt(){

        System.out.println(getBreed()+" hunts");
    }

    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" +getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()*/