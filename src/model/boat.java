package model;

/*Made by Derek Gibson
*Last edited Sept. 2 2021
*/

public class boat {
    private String model;
    private int year;
    private int personCapacity;
    private int cargoCapacity;
        
    public boat() {
      super();
            
    }
        
    public boat(String model, int year, int personCapacity, int cargoCapacity ) {
        super();
        this.model = model;
        this.year = year;
        this.personCapacity = personCapacity;
        this.cargoCapacity = cargoCapacity;
        }
    
        public String getModel() {
            return model;
        }
    
        public void setModel(String model) {
            this.model = model;
        }
    
        public int getYear() {
            return year;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    
        public int getPersonCapacity() {
            return personCapacity;
        }
    
        public void setPersonCapacity(int personCapacity) {
            this.personCapacity = personCapacity;
        }
    
        public int getCargoCapacity() {
            return cargoCapacity;
        }
    
        public void setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
        }
    
        @Override
        public String toString() {
            return "Boat [model=" + model + ", year=" + year + ", personCapacity=" + personCapacity + ", cargoCapacity=" + cargoCapacity + "]";
        }
        
        public String makeNoise() {
            return "BRRRRRRRRRRRRRRRRrrrrrrrrrrrrrrrrrrrrrrRRRRRRRRRRRrrrrrrrrrrrrrrrrrrrrrrrrr!";
        }
    }


