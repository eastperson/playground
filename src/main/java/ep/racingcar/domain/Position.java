package ep.racingcar.domain;

public class Position {

    private Integer position = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position1 = (Position) o;

        return position.equals(position1.position);
    }

    @Override
    public int hashCode() {
        return position.hashCode();
    }

    public Integer current() {
        return this.position;
    }

    public void moveForward() {
        this.position++;
    }

    public Boolean isBiggerThan(Position position) {
        return this.position > position.position;
    }
}
