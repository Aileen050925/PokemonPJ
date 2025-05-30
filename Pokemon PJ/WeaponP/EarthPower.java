//아르세우스 대지의 힘

package WeaponP;
import CharacterP.Character;

public class EarthPower extends Weapon {
    public EarthPower() {
        super("대지의 힘", 75); 
    }

    @Override
    public void weaponAttack(Character attacker, Character target) {
        System.out.println("상대의 발밑에 대지의 힘을 방출한다!");
        target.receiveDamage(this.getPower()+attacker.getPower());

    }

}
