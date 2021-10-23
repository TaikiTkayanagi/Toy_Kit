package AbstractClass.Product;

import Interface.Product.Products;

public abstract class Components implements Products {
  private String name;
  private int money;

  public Components(String name, int money){
    this.name = name;
    this.money = money;
  }

  public Components(){}

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getCosts(){
    return this.money;
  }

  public void setCosts(int money){
    this.money = money;
  }
}
