package ToyKit;

import java.util.HashMap;

import AbstractClass.ToyKit.Werewolf;
import Product.Head;
import Product.LeftArm;
import Product.LeftLeg;
import Product.RightArm;
import Product.RightLeg;
import Product.Body;

public class GenericWerewolf extends Werewolf {
  private final String defaultComponentsName = "NormalWerewolf";
  private final HashMap<String, Integer> Head = new HashMap<>(){
    {
      put(defaultComponentsName + "Head", 500);
      put("HalloweenWerewolfHead", 700);
      put("WhiteAndBlackWerewolfHead", 700);
    }
  };

  private final HashMap<String, Integer> Body = new HashMap<>(){
    {
      put(defaultComponentsName + "Body", 500);
      put("HalloweenWerewolfBody", 700);
      put("WhiteAndBlackWerewolfBody", 700);
    }
  };

  private final HashMap<String, Integer> LeftArm = new HashMap<>(){
    {
      put(defaultComponentsName + "LeftArm", 500);
      put("HalloweenWerewolfLeftArm", 700);
      put("WhiteAndBlackWerewolfLeftArm", 700);
    }
  };

  private final HashMap<String, Integer> RightArm = new HashMap<>(){
    {
      put(defaultComponentsName + "RightArm", 500);
      put("HalloweenWerewolfRightArm", 700);
      put("WhiteAndBlackWerewolfRightArm", 700);
    }
  };

  private final HashMap<String, Integer> LeftLeg  = new HashMap<>(){
    {
      put(defaultComponentsName + "LeftLeg", 500);
      put("HalloweenWerewolfLeftLeg", 700);
      put("WhiteAndBlackWerewolfLeftLeg", 700);
    }
  };

  private final HashMap<String, Integer> RightLeg = new HashMap<>(){
    {
      put(defaultComponentsName + "RightLeg", 500);
      put("HalloweenWerewolfRightLeg", 700);
      put("WhiteAndBlackWerewolfRightLeg", 700);
    }
  };

  public GenericWerewolf(){
    setCurrentHead(defaultComponentsName + "Head");
    setCurrentBody(defaultComponentsName + "Body");
    setCurrentLeftArm(defaultComponentsName + "LeftArm");
    setCurrentRightArm(defaultComponentsName + "RightArm");
    setCurrentLeftLeg(defaultComponentsName + "LeftLeg");
    setCurrentRightLeg(defaultComponentsName + "RightLeg");
  }

  public GenericWerewolf(String HeadKey, String BodyKey, String LeftArmKey, String RightArmKey, String LeftLegKey, String RightLegKey){
    setCurrentHead(HeadKey);
    setCurrentBody(BodyKey);
    setCurrentLeftArm(LeftArmKey);
    setCurrentRightArm(RightArmKey);
    setCurrentLeftLeg(LeftLegKey);
    setCurrentRightLeg(RightLegKey);
  }

  public void setCurrentHead(String HeadKey){
    if(this.Head.get(HeadKey) == null){this.currentHead = new Head(this.defaultComponentsName + "Head", this.Head.get(this.defaultComponentsName + "Head"));}
    else {this.currentHead = new Head(HeadKey, this.Head.get(HeadKey));}
  }

  public void setCurrentBody(String BodyKey){
    if(this.Body.get(BodyKey) == null){this.currentBody = new Body(this.defaultComponentsName + "Body", this.Body.get(this.defaultComponentsName + "Body"));}
    else {this.currentBody = new Body(BodyKey, this.Body.get(BodyKey));}
  }

  public void setCurrentLeftArm(String LeftArmKey){
    if(this.LeftArm.get(LeftArmKey) == null){this.currentLeftArm = new LeftArm(this.defaultComponentsName + "LeftArm", this.LeftArm.get(this.defaultComponentsName + "LeftArm"));}
    else {this.currentLeftArm = new LeftArm(LeftArmKey, this.LeftArm.get(LeftArmKey));}
  }

  public void setCurrentRightArm(String RightArmKey){
    if(this.RightArm.get(RightArmKey) == null){this.currentRightArm = new RightArm(this.defaultComponentsName + "RightArm", this.RightArm.get(this.defaultComponentsName + "RightArm"));}
    else {this.currentRightArm = new RightArm(RightArmKey, this.RightArm.get(RightArmKey));}
  }

  public void setCurrentLeftLeg(String LeftLegKey){
    if(this.LeftLeg.get(LeftLegKey) == null){this.currentLeftLeg = new LeftLeg(this.defaultComponentsName + "LeftLeg", this.LeftLeg.get(this.defaultComponentsName + "LeftLeg"));}
    else {this.currentLeftLeg = new LeftLeg(LeftLegKey, this.LeftLeg.get(LeftLegKey));}
  }

  public void setCurrentRightLeg(String RightLegKey){
    if(this.RightLeg.get(RightLegKey) == null){this.currentRightLeg = new RightLeg(this.defaultComponentsName + "RightLeg", this.RightLeg.get(this.defaultComponentsName + "RightLeg"));}
    else {this.currentRightLeg = new RightLeg(RightLegKey, this.RightLeg.get(RightLegKey));}
  }

  public String sound(){
    return "Werewolfffffffff";
  }

  public String walk(){
    return "dash dash dahs";
  }
}
