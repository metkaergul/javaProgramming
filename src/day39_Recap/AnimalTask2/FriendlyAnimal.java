package day39_Recap.AnimalTask2;

public class FriendlyAnimal extends Animal {

    private boolean isWild;

    private boolean isFriendly;

    private boolean isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild,boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly =isFriendly;
        this.isPlayable = isPlayable;
    }

    public void play(){
        System.out.println(getBreed()+" "+getName()+" is playing");
    }
    public void pet(){
        System.out.println(getBreed()+" can be pet");
    }

    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
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
/*
	2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()*/