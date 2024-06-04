package television;

public class Television {
    private int program;
    private int volume;
    private String brand;
    private boolean isOn;

  

    public boolean isOn() {
        return isOn;
    }

    public void setOn(){
        isOn = true;
    }
    public void setOff(){
        isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getProgram() {
        return program;
    }

    public void setProgram(int program) {
        this.program = program;
    }

    public void increaseTelevision() {
       if(program < 100){
           program ++;
       }
    }

    public void decreaseTelevision() {
        if(program < 0 ){
            this.program--;
        }
    }
}
