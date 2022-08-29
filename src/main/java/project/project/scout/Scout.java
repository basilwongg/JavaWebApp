package project.project.scout;

public class Scout {
    private Long id;
    private String name;
    private Integer age;
    private String position;
    private String address;
    private String email;

    public Scout() {

    }

    public Scout(Long id,
                 String name,
                 Integer age,
                 String position,
                 String address,
                 String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.address = address;
        this.email = email;
    }

    public Scout(String name,
                 Integer age,
                 String position,
                 String address,
                 String email) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.address = address;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "scout{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
