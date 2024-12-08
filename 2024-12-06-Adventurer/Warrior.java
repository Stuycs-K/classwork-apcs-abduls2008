import java.util.*;
private int rage;
private int maxrage;
public class Warrior extends Adventurer{

  public Warrior(String name){
    this(name, 20);
    this.rage = 2;
  }
	
public Warrior(String name, int hp) {
      super(name, hp);
      this.rage = 0; 
      this.maxRage = 50;
    }

  @Override
  public String getSpecialName(){
	  return "Rage";

  }
@Override
  public int getSpecial(){
    return rage;

  }
 
@Override
    public void setSpecial(int n) {
        rage = Math.min(n, maxRage); 
    }

    @Override
    public int getSpecialMax() {
        return maxRage;
    }

    @Override
    public String attack(Adventurer other) {
        int damage = 5;
        other.applyDamage(damage);
        return this.getName() + " slashes " + other.getName() + " for " + damage + " damage!";
    }
	
    @Override
    public String support(Adventurer other) {
        int heal = 5; 
        other.setHP(Math.min(other.getHP() + heal, other.getmaxHP()));
        return this.getName() + other.getName() + " healed for  " + heal + " HP!";
    }

    @Override
    public String support() {
        int heal = 5; 
        this.setHP(Math.min(this.getHP() + heal, this.getmaxHP()));
       
    }


    @Override
    public String specialAttack(Adventurer other) {
        if (rage < 3) {
            return this.getName() + " not enough rage";
        }
        int damage = 35; 
        other.applyDamage(damage);
        rage -= 3;
        return this.getName() + "  slashes" + other.getName() + ", dealing " + damage + " damage!";
    }
}



