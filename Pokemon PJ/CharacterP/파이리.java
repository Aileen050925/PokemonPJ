package CharacterP;

import WeaponP.ElectricBolt;
import WeaponP.FireSword;
import WeaponP.LighterBomb;
import WeaponP.RubberBalloon;

public class 파이리 extends Character{

    public 파이리(){
        super();
    }

    public 파이리(String 이름, int hp, int power){
        super(이름, hp, power);
        this.attribute="fire";
        this.weapons[0]=new FireSword();
        this.weapons[1]=new LighterBomb();

    }


}
