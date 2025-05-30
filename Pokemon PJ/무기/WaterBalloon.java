//수댕이 물풍선

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class WaterBalloon extends Weapon {
    public WaterBalloon() {
        super("물풍선", 15);
    }

    @Override
        public void applyEffect(Character attacker, Character target) {
            System.out.println("물이 가득찬 풍선을 강하게 던지기!");
        }

}
