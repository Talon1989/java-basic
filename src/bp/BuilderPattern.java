package bp;

import java.math.BigInteger;

public class BuilderPattern {

    private BigInteger id;
    private String name;
    private String country;
    private Integer age;

    public static BuilderPattern create(Builder b){
        return new BuilderPattern(b);
    }

    private BuilderPattern(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.country = b.country;
        this.age = b.age;
    }

    public static class Builder{

        BigInteger id = null;
        String name = null;
        String country = null;
        Integer age = null;

        public Builder id(BigInteger id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder country(String country){
            this.country = country;
            return this;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder build(){
            return this;
        }

    }

    // -------------------------------------------

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
