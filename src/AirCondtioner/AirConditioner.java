package AirCondtioner;

public class AirConditioner {
        private boolean isOn;
        private boolean isOff;

        private int temperature = 16;

        public int getTemperature() {
            return temperature;
        }

        public boolean isOn(){
            if (isOn == true){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean turnOn(){
             isOn = true;
             return isOn;
        }
        public boolean turnOff(){
            isOff = false;
            return isOff;
        }
        public void increaseAc() {
            if(temperature < 30) {
                temperature++;
            }
        }

        public void decreaseAc() {
            if (temperature > 16) {
                temperature--;
            }
        }
    }


