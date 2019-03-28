package com.mycomp.ex.builder;

public class Condiments {

    private String bread;
    private String condiment;
    private String lettuce;
    private String topping;

    public static class Builder {
        private String bread;
        private String condiment;
        private String lettuce;
        private String topping;

        public Builder() {}

        public Builder addBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder addCondiment(String condiment) {
            this.condiment = condiment;
            return this;
        }

        public Builder addLettuce(String lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder addTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Condiments build() {
            return new Condiments(this);
        }
    }

    public Condiments(Builder builder) {
        this.bread = builder.bread;
        this.condiment = builder.condiment;
        this.lettuce = builder.lettuce;
        this.topping = builder.topping;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiment() {
        return condiment;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "Condiments{" +
                "bread='" + bread + '\'' +
                ", condiment='" + condiment + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
