package CharacterP;

import WeaponP.Weapon;

public class Character extends Attackable {
    public String name;
    private int hp;
    private int power;
    public String attribute;
    public Weapon[] weapons = new Weapon[2];

    //생성자
    public Character(){}
    public Character(String name, int hp, int power){
        this.name=name;
        this.hp=hp;
        this.power=power;

        System.out.println(this.name+"을(를) 생성했다!");
    }

    //Getter,Setter
    public int getHp(){
        return this.hp;
    }
    public void setHp(int h){
        this.hp=h;
    }

    public int getPower(){
        return this.power;
    }
    public void setPower(int p){
        this.power=p;
    }

    public void showInfo(){
        System.out.println(" ");
        System.out.printf("== %s ==\n",this.name);
        System.out.printf("hp: %d   power:%d    \n",this.hp, this.power);
        System.out.println(" ");
    }

    public void attack (Character target, Weapon weapon){
        System.out.printf("%s 이(가) %s 을(를) 공격합니다.\n",this.name, target.name);
        weapon.weaponAttack(this,target); //웨폰의 공격메소드를 호출하여 target 을 어택
        //this.setHp(this.getHp() + target.getPower());  ###일단 주석처리함. 사유:hp 제대로 줄어드는지 잘 안보임. 굳이 필요한지도?
        return;
    }

    public void receiveDamage (int damage){
        System.out.println(" ");
        System.out.println(this.name+"이(가) "+damage+ "만큼의 데미지를 입었다!");
        this.setHp(this.getHp()-damage);
    }

}

