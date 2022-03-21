import java.io.Serializable;

public class Room implements Serializable {
    private String id;
    private String nameRoom;
    private String numberOfRestrooms;
    private String numberOfBedrooms;
    private String status;
    private int priceRoom;

    public Room(String id, String nameRoom, String numberOfRestrooms, String numberOfBedrooms, String status, int price) {
        this.id = id;
        this.nameRoom = nameRoom;
        this.numberOfRestrooms = numberOfRestrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.status = status;
        this.priceRoom = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nameRoom='" + nameRoom + '\'' +
                ", numberOfRestrooms=" + numberOfRestrooms +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", status='" + status + ", price=" + priceRoom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getNumberOfRestrooms() {
        return numberOfRestrooms;
    }

    public void setNumberOfRestrooms(String numberOfRestrooms) {
        this.numberOfRestrooms = numberOfRestrooms;
    }

    public String getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(String numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return priceRoom;
    }

    public void setPrice(int price) {
        this.priceRoom = price;
    }
}
