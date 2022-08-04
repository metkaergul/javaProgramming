package day39_Recap.AnimalTask2;

public class Lion extends WildAnimal{
    public Lion( String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Lion", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void hunt(){

        System.out.println(getBreed()+" "+getName()+" hunts deer");
    }
}
