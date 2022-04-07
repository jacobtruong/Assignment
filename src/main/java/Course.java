public class Course {
    private String id;
    private String name;
    private int credits;

    public Course() {
        id = "";
        name = "";
        credits = 0;
    }

    public Course(String id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString() {
        return String.format("%s,%s,%s", id, name, credits);
    }
}
