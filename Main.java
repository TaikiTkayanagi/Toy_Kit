import AbstractClass.ToyKit.Vampire;
import AbstractClass.ToyKit.Werewolf;
import Factory.CyberHumanoidToyKitFactory;
import Factory.GenericHumanoidToyKitFactory;
import Interface.Factory.HumanoidToyKitFactory;

public class Main {
  public static void generate(HumanoidToyKitFactory factory){
    Vampire vampire = factory.createVampire();
    Werewolf wereWolf = factory.createWerewolf();

    vampire.info();
    vampire.used();
    wereWolf.info();
    wereWolf.used();
  }

  public static void main(String[] args){
    generate(new GenericHumanoidToyKitFactory());
    generate(new CyberHumanoidToyKitFactory());
  }
}
