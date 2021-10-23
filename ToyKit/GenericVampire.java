package ToyKit;

import AbstractClass.ToyKit.Vampire;
import Product.Head;
import Product.LeftArm;
import Product.LeftLeg;
import Product.RightArm;
import Product.RightLeg;
import Product.Body;

import java.util.HashMap;

public class GenericVampire extends Vampire {
  private final String defaultComponentsName = "NormalVampire";

  private final HashMap<String, Integer> Head = new HashMap<>(){
    {
      put("NormalVampireHead", 500);
      put("HalloweenVampireHead", 700);
      put("WhiteAndBlackVampireHead", 700);
    }
  };
  private final HashMap<String, Integer> Body = new HashMap<>(){
    {
      put("NormalVampireBody", 500);
      put("HalloweenVampireBody", 700);
      put("WhiteAndBlackVampireBody", 700);
    }
  };
  private final HashMap<String, Integer> LeftArm = new HashMap<>(){
    {
      put("NormalVampireLeftArm", 500);
      put("HalloweenVampireLeftArm", 700);
      put("WhiteAndBlackVampireLeftArm", 700);
    }
  };
  private final HashMap<String, Integer> RightArm = new HashMap<>(){
    {
      put("NormalVampireRightArm", 500);
      put("HalloweenVampireRightArm", 700);
      put("WhiteAndBlackVampireRight", 700);
    }
  };
  private final HashMap<String, Integer> LeftLeg = new HashMap<>(){
    {
      put("NormalVampireLeftLeg", 500);
      put("HalloweenVampireLeftLeg", 700);
      put("WhiteAndBlackVampireLeftLeg", 700);
    }
  };
  private final HashMap<String, Integer> RightLeg = new HashMap<>(){
    {
      put("NormalVampireRightLeg", 500);
      put("HalloweenVampireRightLeg", 700);
      put("WhiteAndBlackVampireRightLeg", 700);
    }
  };

  public GenericVampire(){
    setCurrentHead(defaultComponentsName + "Head");
    setCurrentBody(defaultComponentsName + "Body");
    setCurrentLeftArm(defaultComponentsName + "LeftArm");
    setCurrentRightArm(defaultComponentsName + "RightArm");
    setCurrentLeftLeg(defaultComponentsName + "LeftLeg");
    setCurrentRightLeg(defaultComponentsName + "RightLeg");
  }

  public GenericVampire(String HeadKey, String BodyKey, String LeftArmKey, String RightArmKey, String LeftLegKey, String RightLegKey){
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
    else {this.currentRightLeg = new Head(RightLegKey, this.RightLeg.get(RightLegKey));}
  }

  public String sound(){
    return "Vammmmmmpaireeeeeeeee";
  }

  public String walk(){
    return "I Can`t walk";
  }
}
