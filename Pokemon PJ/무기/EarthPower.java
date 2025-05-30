//아르세우스 무기

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class EarthPower extends Weapon {
    public EarthPower() {
        super("대지의 힘", 75); //천상의 빛->대지의 힘으로 변경(천상의 빛은 없는 기술이었다고 한다.)
    }

    @Override
    public void applyEffect(Character attacker, Character target) {
        System.out.println("상대의 발밑에 대지의 힘을 방출한다!");
    }

}
