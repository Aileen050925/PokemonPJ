//파이리 화염검

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class FireSword extends Weapon {
    public FireSword() {
        super("화염검", 10);
    }

    @Override
        public void applyEffect(Character attacker, Character target) {
            System.out.println("불로 달군 검으로 찌르기!");
        }

}
