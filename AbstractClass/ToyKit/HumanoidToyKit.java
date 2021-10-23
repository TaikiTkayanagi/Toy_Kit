package AbstractClass.ToyKit;

import Interface.ToyKit.ToyKit;
import AbstractClass.Product.Components;

abstract class HumanoidToyKit implements ToyKit {
  protected Components currentHead;
  protected Components currentBody;
  protected Components currentLeftArm;
  protected Components currentRightArm;
  protected Components currentLeftLeg;
  protected Components currentRightLeg;

  protected abstract String sound();
  protected abstract String walk();
}
