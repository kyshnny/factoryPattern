package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        PetRecord petFile = new PetRecord();
        Pet pet;

    while (true){
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number or Exit: ");
        Integer choice = input.nextInt();

        if (choice == 3){
            System.out.println("Exiting...");
            break;
        }
                
        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepperd");
                System.out.println("Dog Breed: " + ((Dog) pet).getBreed());
                break;
                
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
                break;

            default:
                System.out.println("Invalid Choice! Select again [1], [2], or [3]");
                continue;
        }

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());

        }
    }
}
