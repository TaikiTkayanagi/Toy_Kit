package Interface.Factory;

import AbstractClass.ToyKit.Vampire;
import AbstractClass.ToyKit.Werewolf;


public interface HumanoidToyKitFactory{
  public Vampire createVampire();
  public Werewolf createWerewolf();
}
