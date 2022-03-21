import java.io.Serializable;
import java.time.LocalDate;

public class Receipt implements Serializable {
    private String id;
    private String nameRoom;
    private String nameRoomer;
    private String nameTenants;
    private LocalDate startTime;
    private LocalDate endTime;
    private int price;

    public Receipt(String id, String nameRoom, String nameRoomer, String nameTenants, LocalDate startTime, LocalDate endTime, int price) {
        this.id = id;
        this.nameRoom = nameRoom;
        this.nameRoomer = nameRoomer;
        this.nameTenants = nameTenants;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nameRoom='" + nameRoom + '\'' +
                ", nameRoomer='" + nameRoomer + '\'' +
                ", nameTenants='" + nameTenants + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price=" + price ;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getNameRoomer() {
        return nameRoomer;
    }

    public void setNameRoomer(String nameRoomer) {
        this.nameRoomer = nameRoomer;
    }

    public String getNameTenants() {
        return nameTenants;
    }

    public void setNameTenants(String nameTenants) {
        this.nameTenants = nameTenants;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
