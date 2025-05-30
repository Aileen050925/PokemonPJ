//수댕이 조개검

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class ShellSword extends Weapon {
    public ShellSword() {
        super("조개검", 13);
    }

    @Override
        public void applyEffect(Character attacker, Character target) {
            System.out.println("날카로운 조개검으로 찌르기!");
        }

}
