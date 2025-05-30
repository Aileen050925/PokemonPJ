//피카츄 고무풍선

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class RubberBalloon extends Weapon {
    public RubberBalloon() {
        super("고무풍선", 8);
    }

    @Override
        public void applyEffect(Character attacker, Character target) {
            System.out.println("날아가서 터지며 감전 효과!");
        }

}
