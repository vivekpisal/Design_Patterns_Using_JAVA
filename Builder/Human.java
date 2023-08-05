package Creational.Builder;

public class Human {
    private float height;
    private int weight;
    private String sex;
    private String name;
    private String surname;

    private Human(){}

    public Human(HumanBuilder humanBuilder) {
        this.height = humanBuilder.height;
        this.weight = humanBuilder.weight;
        this.sex = humanBuilder.sex;
        this.name = humanBuilder.name;
        this.surname = humanBuilder.surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    
    public static HumanBuilder builder() {
    	return new HumanBuilder();
    }

    public static class HumanBuilder{
        private float height;
        private int weight;
        private String sex;
        private String name;
        private String surname;

        public HumanBuilder setHeight(float height) {
            this.height = height;
            return this;
        }

        public HumanBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public HumanBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public HumanBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Human build(){
            return new Human(this);
        }
    }
}
