public class Engine {
private String type;
private String tape;

    public Engine(String type, String tape) {
        this.type = type;
        this.tape = tape;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTape() {
        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", tape='" + tape + '\'' +
                '}';
    }
}
