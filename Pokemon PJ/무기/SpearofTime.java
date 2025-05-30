//디아루가 시간의 창

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class SpearofTime extends Weapon {
    public SpearofTime() {
        super("시간의 창", 20);
    }


    @Override
    public void applyEffect(Character attacker, Character target) {
        System.out.println("상대의 시간의 틈을 강하게 찌른다!");
    }

}
