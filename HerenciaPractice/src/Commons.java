import java.sql.Timestamp;

public class Commons {

    private Long id;
    private Timestamp createdAt;
    private Timestamp updateAt;

    public Commons(Long id, Timestamp createdAt, Timestamp updateAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public void showData(){
        System.out.println("Id: "+id);
    }

    public void showInformation(){
        System.out.println("Id: "+id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }
}
