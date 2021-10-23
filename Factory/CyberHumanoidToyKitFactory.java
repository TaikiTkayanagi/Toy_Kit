package Factory;

import AbstractClass.ToyKit.Vampire;
import AbstractClass.ToyKit.Werewolf;
import Interface.Factory.HumanoidToyKitFactory;
import ToyKit.CyberVampire;
import ToyKit.CyberWerewolf;

public class CyberHumanoidToyKitFactory implements HumanoidToyKitFactory {
  public Vampire createVampire(){
    return new CyberVampire();
  }
  public Werewolf createWerewolf(){
    return new CyberWerewolf();
  }
}
