package CharacterP;

import WeaponP.SpearofTime;
import WeaponP.FutureRegulator;

public class 디아루가 extends Character{

    public 디아루가(){
        super();
    }

    public 디아루가(String 이름, int hp, int power){
        super(이름, hp, power);
        this.attribute="legend";
        this.weapons[0]=new SpearofTime();
        this.weapons[1]=new FutureRegulator();

    }


}
