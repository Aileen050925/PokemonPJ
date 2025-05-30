//수댕이 물풍선

package WeaponP;
import CharacterP.Character;

public class WaterBalloon extends Weapon {
    public WaterBalloon() {
        super("물풍선", 15);
    }

    @Override
        public void weaponAttack(Character attacker, Character target) {
            System.out.println("물이 가득찬 풍선을 강하게 던지기!");
            if (target.attribute.equals("fire")){
                System.out.println("물은 불보다 강하지! ・・・ power가 세졌다");
                target.receiveDamage(2*(this.getPower()+attacker.getPower()));
            }
        }

}
