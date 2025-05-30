

package CharacterP;

import WeaponP.ElectricBolt;
import WeaponP.RubberBalloon;

public class 피카츄 extends Character{

    public 피카츄(){
        super();
    }

    public 피카츄(String 이름, int hp, int power){
        super(이름, hp, power);
        this.attribute="Electricity";
        this.weapons[0]=new ElectricBolt();
        this.weapons[1]=new RubberBalloon();
        
    }


}
