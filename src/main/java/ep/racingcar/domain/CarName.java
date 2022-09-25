package ep.racingcar.domain;

public class CarName {

    private String name;

    public CarName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarName carName = (CarName) o;

        return name.equals(carName.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
