package Factory;

import AbstractClass.ToyKit.Vampire;
import AbstractClass.ToyKit.Werewolf;
import Interface.Factory.HumanoidToyKitFactory;
import ToyKit.GenericVampire;
import ToyKit.GenericWerewolf;

public class GenericHumanoidToyKitFactory implements HumanoidToyKitFactory {
  public Vampire createVampire(){
    return new GenericVampire();
  }

  public Werewolf createWerewolf(){
    return new GenericWerewolf();
  }
}
