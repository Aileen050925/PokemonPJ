//디아루가 미래조율기

package WeaponP;
import CharacterP.Character;

public class FutureRegulator extends Weapon {
    public FutureRegulator() {
        super("미래 조율기", 20);
    }

    @Override
    public void weaponAttack(Character attacker, Character target) {
        target.receiveDamage(this.getPower()+attacker.getPower());
        System.out.println("시간의 흐름으로 침입한다.. 그리고 미래를 뒤바꾼다!");
        System.out.println("디아루가 이(가) 시간의 흐름을 바꿔 공격권을 한번 더 얻었습니다.");
        target.receiveDamage(this.getPower()+attacker.getPower());

    }

}
