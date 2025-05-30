package CharacterP;

import WeaponP.CreationPlate;
import WeaponP.EarthPower;

public class 아르세우스 extends Character{

    public 아르세우스(){
        super();
    }

    public 아르세우스(String 이름, int hp, int power){
        super(이름, hp, power);
        this.attribute="legend";
        this.weapons[0]=new EarthPower();
        this.weapons[1]=new CreationPlate();


    }


}
