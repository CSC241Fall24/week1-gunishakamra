public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        // TODO: Initialize id and level with appropriate values
        this.level = 1;
        this.id = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur
        this.level = lv; 

        if(lv<16){
            this.id = 1;
            System.out.println("you have unlocked new level" + lv);
            }
            else if(lv>=16 && lv<32){
            this.id = 2; 
            System.out.println("you have unlocked new level" + lv);
            }
            else{
            this.id = 3;
            System.out.println("you have unlocked new level" + lv);
            }
    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return this.level; // Placeholder return value
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        // Return the name based on the current id
        if (this.id == 1) {
            return "Bulbasaur";
            }
            else if(this.id == 2){
            return "Ivysaur";
            }
            else return "Venusaur";
    }

    // getID method
    public int getID() {
        // TODO: Implement this methodreturn ("id : " + this.id + " level = " + this.level);
        return this.id;  // Placeholder return value
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method
        // Return a string representation of the Bulbasaur object
        return ("Level: " + this.level + " ID: " + this.id);  // Placeholder return value
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this method
        // Compare this Bulbasaur object with another object
        if(obj instanceof Bulbasaur){
          Bulbasaur obj2 = (Bulbasaur) obj;
            return this.level == obj2.level && this.id == obj2.id; 
        }
        return false;
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur newBulbasaur = new Bulbasaur();
        newBulbasaur.id = this.id;
        newBulbasaur.level = this.level;
        return newBulbasaur; // Placeholder return value
    }

    // main method 
    public static void main(String[] args) {
        Bulbasaur bulba = new Bulbasaur();
        System.out.println(bulba.getName()); // Bulbasaur
        bulba.setLevel(33);
        System.out.println(bulba.getName()); // Ivysaur
        bulba.setLevel(25);
        System.out.println(bulba.getName()); // Venusaur
        System.out.println(bulba.toString()); // Bulbasaur{id=3, level=35}

        Bulbasaur copyBulba = bulba.copy();
        System.out.println(copyBulba.toString()); // Bulbasaur{id=3, level=35}
        System.out.println(bulba.equals(copyBulba)); // true
    }
}