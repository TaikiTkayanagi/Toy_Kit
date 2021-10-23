package AbstractClass.ToyKit;

public abstract class Vampire extends HumanoidToyKit {
  public Vampire(){}

  public abstract String sound();
  public abstract String walk();
  public void used(){
    System.out.println(this.sound());
    System.out.println(this.walk());
  }

  public void info(){
    System.out.println("VampireHead is" + this.currentHead.getName());
    System.out.println("cost is" + this.currentHead.getCosts());
    System.out.println("VampireBody is" + this.currentBody.getName());
    System.out.println("cost is" + this.currentBody.getCosts());
    System.out.println("VampireLeftArm is" + this.currentLeftArm.getName());
    System.out.println("cost is" + this.currentLeftArm.getCosts());
    System.out.println("VampireRightArm is" + this.currentRightArm.getName());
    System.out.println("cost is" + this.currentRightArm.getCosts());
    System.out.println("VampireLeftLeg is" + this.currentLeftLeg.getName());
    System.out.println("cost is" + this.currentLeftLeg.getCosts());
    System.out.println("VampireRightLeg is" + this.currentRightLeg.getName());
    System.out.println("cost is" + this.currentRightLeg.getCosts());
  }
}
