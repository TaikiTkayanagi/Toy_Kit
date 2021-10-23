# Toy_Kit
study AbustractPattern

クラス図
``` plantuml
interface HumanoidToyKitFactory{
public Vampire createVampire()
public Werewolf createWereWolf()
}

class GenericHumanoidToyKitFactory implements HumanoidToyKitFactory{
  public Vampire createVampire()
  public Werewolf createWereWolf()
}

class CyberHumanoidToyKitFactory implements HumanoidToyKitFactory{
  public Vampire createVampire()
  public Werewolf createWereWolf()
}

interface ToyKit{

}

interface Products{
  public int getCosts()
}

abstract class Components extends Products {
  private String name
  private int money
  public Components(name:String, money:int)
  public Components()
  public String getName()
  public void setName(String name)
  public int getCosts()
  public void setCosts(int money)
}

class Head extends Components{
  public Head(name:String, money:int)
}

class Body extends Components{
  public Body(name:String, money:int)
}

class LeftArm extends Components{
  public LeftArm(name:String, money:int)
}

class RightArm extends Components{
  public RightArm(name:String, money:int)
}

class LeftLeg extends Components{
  public LeftLeg(name:String, money:int)
}

class RightLeg extends Components{
  public RightLeg(name:String, money:int)
}

abstract class HumanoidToyKit implements ToyKit{
  protected Components currentHead;
  protected Components currentBody;
  protected Components currentRightArm;
  protected Components currentLeftArm;
  protected Components currentRightLeg
  protected Components currentLeftLeg;

  public abstract String sound()
  public abstract String Walk()
}

interface Cyber{

}

abstract class Vampire implements HumanoidToyKit {
  public Vampire()
  public abstract String sound()
  public abstract String walk()
  public void used()
  public void info()
}

abstract class Werewolf implements HumanoidToyKit {
  public Werewolf()
  public abstract String sound()
  public abstract String walk()
  public void used()
  public void info()
}

class GenericVampire extends Vampire{
  private final HashMap<String, Integer> Head
  private final HashMap<String, Integer> Body
  private final HashMap<String, Integer> LeftArm
  private final HashMap<String, Integer> RightArm
  private final HashMap<String, Integer> LeftLeg
  private final HashMap<String, Integer> RightLeg
  public GenericVampire()
  public GenericVampire(HeadKey:String, BodyKey:String, LeftArmKey:String, RightArmKey:String, LeftLegKey:String, RightLegKey:String)
  public void setCurrentHead(HeadKey:String)
  public void setCurrentBody(BodyKey:String)
  public void setCurrentLeftArm(LeftArmKey:String)
  public void setCurrentRightArmKey(RightArmKey:String)
  public void setCurrentLeftLeg(LeftLegKey:String)
  public void setCurrentRightLeg(RightLegKey:String)
  public String sound()
  public String walk()
}

class GenericWerewolf extends Werewolf{
  private final HashMap<String, Integer> Head
  private final HashMap<String, Integer> Body
  private final HashMap<String, Integer> LeftArm
  private final HashMap<String, Integer> RightArm
  private final HashMap<String, Integer> LeftLeg
  private final HashMap<String, Integer> RightLeg
  public GenericWerewolf()
  public GenericWerewolf(HeadKey:String, BodyKey:String, LeftArmKey:String, RightArmKey:String, LeftLegKey:String, RightLegKey:String)
  public void setCurrentHead(HeadKey:String)
  public void setCurrentBody(BodyKey:String)
  public void setCurrentLeftArm(LeftArmKey:String)
  public void setCurrentRightArmKey(RightArmKey:String)
  public void setCurrentLeftLeg(LeftLegKey:String)
  public void setCurrentRightLeg(RightLegKey:String)
  public String sound()
  public String walk()
}

class CyberVampire extends Vampire implements Cyber{
    private final HashMap<String, Integer> Head
  private final HashMap<String, Integer> Body
  private final HashMap<String, Integer> LeftArm
  private final HashMap<String, Integer> RightArm
  private final HashMap<String, Integer> LeftLeg
  private final HashMap<String, Integer> RightLeg
  public CyberVampire()
  public CyberVampire(HeadKey:String, BodyKey:String, LeftArmKey:String, RightArmKey:String, LeftLegKey:String, RightLegKey:String)
  public void setCurrentHead(HeadKey:String)
  public void setCurrentBody(BodyKey:String)
  public void setCurrentLeftArm(LeftArmKey:String)
  public void setCurrentRightArmKey(RightArmKey:String)
  public void setCurrentLeftLeg(LeftLegKey:String)
  public void setCurrentRightLeg(RightLegKey:String)
  public String sound()
  public String walk()
}

class CyberWerewolf extends Werewolf implements Cyber{
  private final HashMap<String, Integer> Head
  private final HashMap<String, Integer> Body
  private final HashMap<String, Integer> LeftArm
  private final HashMap<String, Integer> RightArm
  private final HashMap<String, Integer> LeftLeg
  private final HashMap<String, Integer> RightLeg
  public CyberWerewolf()
  public CyberWerewolf(HeadKey:String, BodyKey:String, LeftArmKey:String, RightArmKey:String, LeftLegKey:String, RightLegKey:String)
  public void setCurrentHead(HeadKey:String)
  public void setCurrentBody(BodyKey:String)
  public void setCurrentLeftArm(LeftArmKey:String)
  public void setCurrentRightArmKey(RightArmKey:String)
  public void setCurrentLeftLeg(LeftLegKey:String)
  public void setCurrentRightLeg(RightLegKey:String)
  public String sound()
  public String walk()
}
```
