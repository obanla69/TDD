

public class Bike {
private int automaticSpeed;
private int  automaticGear;
private  boolean isOn;
public Bike(){
    automaticSpeed =0;
    automaticGear = 1;

}

    public void turnOn() {
        this.isOn = true;
    }

    public boolean isOn() {
    return isOn;
    }

    public void turnOff() {
    this.isOn = false;
    }

    public void accelerate() {
        switch (automaticGear){
            case 1:
                automaticSpeed+=1;
                break;
            case 2:
                automaticSpeed +=2;
                break;
            case 3:
                automaticSpeed +=3;
                break;
            case 4:
                automaticSpeed+=4;
                break;
        }

        checkGearChange();
    }
    public void decelerate() {
        switch (automaticGear){
            case 1:
                automaticSpeed-=1;
                break;
            case 2:
                automaticSpeed -=2;
                break;
            case 3:
                automaticSpeed -=3;
                break;
            case 4:
                automaticSpeed-=4;
                break;
        }

        checkGearChange();
    }

    private void checkGearChange() {
    if(automaticSpeed < 0){
        automaticSpeed =0;
    } else if (automaticSpeed >= 41) {
        automaticGear =4;
    }else if(automaticSpeed >= 30){
        automaticGear =3;
    }else if(automaticSpeed>=20){
        automaticGear =2;
    }else {
        automaticGear=1;
    }
}

    public int getAutomaticSpeed() {
            return automaticSpeed;
    }
    public int getAutomaticGear() {
    return automaticGear;
    }
}