package Transport;

import java.time.LocalDate;

public class Car {

    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    private Key carKey;
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearBox;
    private final String bodyType;
    private String registrationNum;
    private final int numOfSeats;
    private boolean winterTires;

    private final String DEFAULT_VALUE = "default";
    private final double DEFAULT_ENGINE_VOLUME = 1.5;
    private final String DEFAULT_COLOR = "white";
    private final int DEFAULT_YEAR = 2000;
    private final int DEFAULT_SEATS = 5;

    public Key getCarKey() {
        return carKey;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public void setCarKey(Key carKey) {
        this.carKey = carKey;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (Double.compare(this.engineVolume,0)==0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = DEFAULT_COLOR;
        }  else {
            this.color = color;
        }
    }

    public void setGearBox(String gearBox) {
        if (gearBox == null || gearBox.isEmpty()) {
            this.gearBox = DEFAULT_VALUE;
        } else {
            this.gearBox = gearBox;
        }
    }

    public void setRegistrationNum(String registrationNum) {
        if (registrationNum == null || registrationNum.isEmpty()) {
            this.registrationNum = DEFAULT_VALUE;
        } else {
            this.registrationNum = registrationNum;
        }
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String gearBox, String bodyType, String registrationNum, int numOfSeats, boolean winterTires) {
        if (brand == null || brand.isEmpty()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        setEngineVolume(engineVolume);
        setColor(color);

        if (model == null || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        if (productionYear <= 0) {
            this.productionYear = DEFAULT_YEAR;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = DEFAULT_VALUE;
        } else {
            this.productionCountry = productionCountry;
        }
        setGearBox(gearBox);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = DEFAULT_VALUE;
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
    }

    @Override
    public String toString() {
        return "Transport.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNum='" + registrationNum + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", winterTires=" + winterTires +
                '}';
    }
    public void changeTiresOfSeason() {
       int currentMonth = LocalDate.now().getDayOfMonth();
        if (currentMonth >= 4 && currentMonth <= 10) {
            setWinterTires(true);
        } else {
            setWinterTires(false);
        }
    }
}
