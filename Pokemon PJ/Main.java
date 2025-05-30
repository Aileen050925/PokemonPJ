import java.util.Scanner;

import CharacterP.Character;
import CharacterP.파이리;
import CharacterP.피카츄;
import CharacterP.수댕이;
import CharacterP.아르세우스;
import CharacterP.디아루가;

import WeaponP.Weapon;
import WeaponP.ElectricBolt; //피카츄 전기볼트
import WeaponP.RubberBalloon; //피카츄 고무풍선

import WeaponP.FireSword; //파이리 화염검
import WeaponP.LighterBomb; //파이리 라이터폭탄

import WeaponP.ShellSword; //수댕이 조개검
import WeaponP.WaterBalloon; //수댕이 물풍선

import WeaponP.EarthPower; //아르세우스 대지의 힘
import WeaponP.CreationPlate; //창조의 판

import WeaponP.SpearofTime; //디아루가 시간의창
import WeaponP.FutureRegulator; //디아루가 미래 조율기

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character player; //player 객체
        Character target; //target 객체
        int playerWeapon; //어택할 웨폰의 종류 변수

        //게임 시작
        gameStart();

        //플레이어 캐릭터 선택 + 캐릭터 객체 생성
        do {
            System.out.println("1. 자신의 캐릭터를 생성합니다.");
            player = makePokemon();
        if (player == null) {
            System.out.println("캐릭터 생성에 실패했습니다. 다시 입력해주세요.");
        }
        } while (player == null);

        do {
            System.out.println("2. 대결할 상대의 캐릭터를 생성합니다.");
            target = makePokemon();
        if (player == null) {
            System.out.println("캐릭터 생성에 실패했습니다. 다시 입력해주세요.");
        }
        } while (player == null);

        //어느 한쪽이 죽을 때까지 무기를 선택해가며 대결
        int i=1;
        System.out.println("==============Game Start==============");
        while (true){
            if (player.getHp() <= 0) {
                System.out.println(player.name+"이(가) 죽었습니다. "); 
                break;}
            if (target.getHp() <= 0) {
                System.out.println(player.name+"이(가) 죽었습니다. ");
                break;}

            System.out.println("   >>> Round " + i + "<<<");
            do{
                System.out.printf("무기를 선택하세요 ・・・ 0.%s 1.%s  :",player.weapons[0].getName(),player.weapons[1].getName());
                playerWeapon = input.nextInt();
                input.nextLine();
                System.out.println("  ");

                if (playerWeapon>1 || playerWeapon<0 ) {
                System.out.println("무기는 0이나 1을 입력해주세요");
                }
                }while(playerWeapon>1 || playerWeapon<0);
            

            System.out.println(player.name+"이(가) 공격할 차례입니다. ");
            attack(player,target,playerWeapon);           
            
            System.out.println("  ");
            System.out.println(target.name+"이(가) 공격할 차례입니다. ");
            int targetWeapon = (int)(Math.random() * 2);
            attack(player,target,targetWeapon);

            player.showInfo();
            target.showInfo();
            System.out.println("====================================");

            

            
            
            i++;}
        System.out.println("게임이 종료되었습니다.");	 

    }

    public static Character makePokemon(){
        System.out.printf("원하는 캐릭터의 숫자를 입력하세요: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Character c;
        
        switch (num) {
            case 1:
                c=new 피카츄("피카츄",100,15);
                c.showInfo();
                return c;
            case 2:
                c=new 파이리("파이리",110,18);
                c.showInfo();
                return c;
            case 3:
                c=new 수댕이("수댕이",120,16);
                c.showInfo();
                return c;
            case 4:
            c=new 아르세우스("아르세우스",200,25);
                c.showInfo();
                return c;
    
            case 5:
                c=new 디아루가("디아루가",180,22);
                c.showInfo();
                return c;
                 
            default:
                System.out.println("1~5 사이의 숫자를 입력해주세요.");
                System.out.println(" ");
                return null;    
        }
    }

    public static void gameStart(){
        System.out.println("포켓몬 게임을 시작합니다!");
        System.out.println("본인의 캐릭터, 싸울 캐릭터를 선정할 수 있습니다.");
        System.out.println("  ");
        System.out.println("캐릭터는 총 5종입니다 ・・・ 1.피카츄 2.파이리 3.수댕이 4.아르세우스 5.디아루가");
    }

    public static void attack(Character attacker,Character target,int selectedWeapon){
        try{target.attack(attacker,target.weapons[selectedWeapon]);
            }catch(NullPointerException e) {
                System.out.println("아니.. 왜 작동이 안하지..? 이 무기는 더이상 못쓰나봐!");
            }
    }

}
