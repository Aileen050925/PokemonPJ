package CharacterP;

import WeaponP.ElectricBolt;
import WeaponP.RubberBalloon;
import WeaponP.ShellSword;
import WeaponP.WaterBalloon;

public class 수댕이 extends Character{

    public 수댕이(){
        super();
    }

    public 수댕이(String 이름, int hp, int power){
        super(이름, hp, power);
        this.attribute="water";
        this.weapons[0]=new ShellSword();
        this.weapons[1]=new WaterBalloon();

    }


}
