package AbstractClass.ToyKit;

public abstract class Werewolf extends HumanoidToyKit {
  public Werewolf(){}

  public abstract String sound();
  public abstract String walk();
  public void used(){
    System.out.println(this.sound());
    System.out.println(this.walk());
  }

  public void info(){
    System.out.println("WerewolfHead is" + this.currentHead.getName());
    System.out.println("cost is" + this.currentHead.getCosts());
    System.out.println("WerewolfBody is" + this.currentBody.getName());
    System.out.println("cost is" + this.currentBody.getCosts());
    System.out.println("WerewolfLeftArm is" + this.currentLeftArm.getName());
    System.out.println("cost is" + this.currentLeftArm.getCosts());
    System.out.println("WerewolfRightArm is" + this.currentRightArm.getName());
    System.out.println("cost is" + this.currentRightArm.getCosts());
    System.out.println("WerewolfLeftLeg is" + this.currentLeftLeg.getName());
    System.out.println("cost is" + this.currentLeftLeg.getCosts());
    System.out.println("WerewolfRightLeg is" + this.currentRightLeg.getName());
    System.out.println("cost is" + this.currentRightLeg.getCosts());
  }
}
