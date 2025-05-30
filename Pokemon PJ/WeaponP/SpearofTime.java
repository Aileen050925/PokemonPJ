//디아루가 시간의 창

package WeaponP;
import CharacterP.Character;

public class SpearofTime extends Weapon {
    public SpearofTime() {
        super("시간의 창", 20);
    }


    @Override
    public void weaponAttack(Character attacker, Character target) {
        System.out.println("상대의 시간의 틈을 강하게 찌른다!");
        target.receiveDamage(this.getPower()+attacker.getPower());

    }

}
