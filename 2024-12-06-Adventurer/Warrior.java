import java.util.*;
private int rage;
public class Warrior extends Adventurer{

  public Warrior(String name){
    this(name, 20);
    this.rage = 2;

  }
  public String getSpecialName();{

  }

  public int getSpecial();{
    return rage;

  }
  public void setSpecial(int n);{
  rage=n;
}


}
