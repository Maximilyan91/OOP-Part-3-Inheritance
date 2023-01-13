package Transport;

import java.time.LocalDate;

public class Car extends Transport{

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    private Key carKey;
    private double engineVolume;
    private String gearBox;
    private final String bodyType;
    private String registrationNum;
    private final int numOfSeats;
    private boolean winterTires;

    private final double DEFAULT_ENGINE_VOLUME = 1.5;
    private final int DEFAULT_SEATS = 5;


    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry,
               String gearBox, String bodyType, String registrationNum,
               int numOfSeats, boolean winterTires,
               Boolean remoteEngineStart, Boolean keylessAccess) {

        super(brand, model, color, productionYear, productionCountry);

        setEngineVolume(engineVolume);

        setGearBox(gearBox);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = getDEFAULT_VALUE();
        } else {
            this.bodyType = bodyType;
        }

        setRegistrationNum(registrationNum);

        if (numOfSeats <= 0) {
            this.numOfSeats = DEFAULT_SEATS;
        } else {
            this.numOfSeats = numOfSeats;
        }

        setWinterTires(winterTires);
        setCarKey(remoteEngineStart, keylessAccess);
    }




    public double getEngineVolume() {
        return engineVolume;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setCarKey(Boolean remoteEngineStart,Boolean keylessAccess ) {
        if (remoteEngineStart != null || keylessAccess != null){
        this.carKey = new Key(remoteEngineStart, keylessAccess);
        }

    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (Double.compare(this.engineVolume,0)==0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        }
    }

    public void setGearBox(String gearBox) {
        if (gearBox == null || gearBox.isEmpty()) {
            this.gearBox = getDEFAULT_VALUE();
        } else {
            this.gearBox = gearBox;
        }
    }

    public void setRegistrationNum(String registrationNum) {
        if (registrationNum == null || registrationNum.isEmpty()) {
            this.registrationNum = getDEFAULT_VALUE();
        } else {
            this.registrationNum = registrationNum;
        }
    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }



    public void changeTiresOfSeason() {
       int currentMonth = LocalDate.now().getDayOfMonth();
        if (currentMonth >= 4 && currentMonth <= 10) {
            setWinterTires(true);
        } else {
            setWinterTires(false);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carKey=" + carKey +
                ", engineVolume=" + engineVolume +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNum='" + registrationNum + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", winterTires=" + winterTires +
                '}';
    }
}
