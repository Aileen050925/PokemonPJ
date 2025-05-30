public class Realremote implements Remotcontrol{
    Remotcontrol rc =null;
    Realremote(TV tv){
        this.rc=tv;
    }
    Realremote(Audio audio){
        this.rc=audio;
    }

    public void changemode(TV tv){
        System.out.println("TV 모드로 전환");
        this.rc=tv;
    }

    public void changemode(Audio audio){
        System.out.println("오디오 모드로 전환");
        this.rc=audio;
    }


    public void turnon(){
        this.rc.turnon();
    }
    public void turnoff(){
        this.rc.turnoff();
    }   
}