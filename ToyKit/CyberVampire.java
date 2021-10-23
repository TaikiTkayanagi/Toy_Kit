package ToyKit;

import java.util.HashMap;

import AbstractClass.ToyKit.Vampire;
import Interface.ToyKit.Cyber;
import Product.Head;
import Product.Body;
import Product.LeftArm;
import Product.LeftLeg;
import Product.RightArm;
import Product.RightLeg;

public class CyberVampire extends Vampire implements Cyber {
  private final String defaultComponentsName = "CyberVampire";
  private final HashMap<String, Integer> Head = new HashMap<>(){
    {
      put(defaultComponentsName + "Head", 1000);
      put("BlackCyberVampireHead", 1200);
      put("WhiteCyberVampireHead", 1300);
    }
  };
  private final HashMap<String, Integer> Body = new HashMap<>(){
    {
      put(defaultComponentsName + "Body", 1000);
      put("BlackCyberVampireBody", 1200);
      put("WhiteCyberVampireBody", 1300);
    }
  };
  private final HashMap<String, Integer> LeftArm = new HashMap<>(){
    {
      put(defaultComponentsName + "LeftArm", 1000);
      put("BlackCyberVampireLeftArm", 1200);
      put("WhiteCyberVampireLeftArm", 1300);
    }
  };
  private final HashMap<String, Integer> RightArm = new HashMap<>(){
    {
      put(defaultComponentsName + "RightArm", 1000);
      put("BlackCyberVampireRightArm", 1200);
      put("WhiteCyberVampireRightArm", 1300);
    }
  };
  private final HashMap<String, Integer> LeftLeg = new HashMap<>(){
    {
      put(defaultComponentsName + "LeftLeg", 1000);
      put("BlackCyberVampireLeftLeg", 1200);
      put("WhiteCyberVampireLeftLeg", 1300);
    }
  };
  private final HashMap<String, Integer> RightLeg = new HashMap<>(){
    {
      put(defaultComponentsName + "RightLeg", 1000);
      put("BlackCyberVampireRightLeg", 1200);
      put("WhiteCyberVampireRightLeg", 1300);
    }
  };

  public CyberVampire(){
    setCurrentHead(defaultComponentsName + "Head");
    setCurrentBody(defaultComponentsName + "Body");
    setCurrentLeftArm(defaultComponentsName + "LeftArm");
    setCurrentRightArm(defaultComponentsName + "RightArm");
    setCurrentLeftLeg(defaultComponentsName + "LeftLeg");
    setCurrentRightLeg(defaultComponentsName + "RightLeg");
  }

  public CyberVampire(String HeadKey, String BodyKey, String LeftArmKey, String RightArmKey, String LeftLegKey, String RightLegKey){
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
    return "CyberVampireeeeeeeeeee";
  }

  public String walk(){
    return "mecha mecah";
  }
}
