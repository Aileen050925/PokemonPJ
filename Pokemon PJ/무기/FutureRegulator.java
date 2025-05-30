//디아루가 미래조율기

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class FutureRegulator extends Weapon {
    public FutureRegulator() {
        super("미래 조율기", 20);
    }

    @Override
    public void applyEffect(Character attacker, Character target) {
        System.out.println("시간의 흐름으로 침입한다.. 그리고 미래를 뒤바꾼다!");
        //자기 턴 2번 공격

        // 첫 번째 타격
        //System.out.printf("[1타] %s의 공격! %d 데미지를 입혔다!\n", attacker.getName(), totalDamage);
        //target.receiveDamage(totalDamage);

        // 두 번째 타격
        //System.out.printf("[2타] %s의 공격! %d 데미지를 입혔다!\n", attacker.getName(), totalDamage);
        //target.receiveDamage(totalDamage);
    }

}
