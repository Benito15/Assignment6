package ac.za.cput.domains.restaurant;

public class Restaurant {

    private String resID,name;
    private int totEmployees;

    private Restaurant(){}

    private Restaurant(Builder builder)
    {

        this.resID=builder.resID;
        this.name=builder.name;
        this.totEmployees=builder.totEmployees;
    }

    public String getResID() {
        return resID;
    }

    public String getName() {
        return name;
    }

    public int getTotEmployees() {
        return totEmployees;
    }

    public static class Builder
    {

        private String resID,name;
        private int totEmployees;


        public Builder resID(String resID)
        {
            this.resID=resID;
            return this;

        }

        public Builder name(String name)
        {
            this.name=name;
            return this;

        }

        public Builder totEmployees(int totEmployees)
        {
            this.totEmployees=totEmployees;
            return this;

        }

        public Restaurant build()
        {
            return new Restaurant(this);
        }

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "resID='" + resID + '\'' +
                ", name='" + name + '\'' +
                ", totEmployees=" + totEmployees +
                '}';
    }
}
