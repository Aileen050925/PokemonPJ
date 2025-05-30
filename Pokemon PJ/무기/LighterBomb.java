//파이리 라이터폭탄

package WeaponP;
import java.util.Random;

import CharacterP.Character;
import CharacterP.Weapon;

public class LighterBomb extends Weapon {
    public LighterBomb() {
        super("라이터폭탄", 15);
    }

    @Override
        public void applyEffect(Character attacker, Character target) {
            System.out.println("라이터폭탄을 던진다!");

            // 일정 확률(30%)로 자기 자신도 데미지(5)를 입음
            Random rand = new Random();
            if (rand.nextInt(100) < 30){
                System.out.println("라이터폭탄의 불꽃이 튀어 파이리가 스스로 데미지를 입었다!");
                attacker.receiveDamage(5); //캐릭터 클래스에 'ㅇㅇ캐릭터가 ㅇㅇ데미지를 입었습니다! 남은 HP:' 메서드 추가 필요
            }

        }

}
