package it.unibo.towermon.model;

public class MonsterImpl implements Monster
{
    String name;
    int HP;
    String type;
    int maxHP;
    int attack;
    int defense;
    //Type type;
    //Set<Moves> moves;

    public MonsterImpl(String name, int HP, String type, int attack, int defense){
        this.name=name;
        this.HP=HP;
        this.maxHP=HP;
        this.type=type;
        this.attack=attack;
        this.defense=defense;
    }


    @Override
    public boolean isFainted() {
       if(this.HP>0){
            return false;
       }
       else return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getactualHP() {
        return this.HP;    
    }

    @Override
    public int getMaxHP() {
        return this.maxHP;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public int getDefense() {
       return this.defense;
    }

    public void increaseAttack(int n){
        this.attack+=n;
    }

    public void increaseDefense(int n){
        this.defense+=n;
    }

    public void increaseMaxHP(int n){
        this.maxHP+=n;
    }

    public void receiveDemage(int n){
        if(this.HP<n){
            this.HP=0;
        }
        else{
            this.HP-=n;
        }
    }

    public void healHP (int n){
        if((this.HP+=n)>maxHP){
            this.HP=this.maxHP;
        }
        else this.HP+=n;
    }
}


/**i type sono enum? non classi? classe element con json con tutti gli elementi.
*enum o una classe tipo con una factory che inizializza i tipi.
 */
