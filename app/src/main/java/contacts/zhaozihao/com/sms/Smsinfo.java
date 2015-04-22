package contacts.zhaozihao.com.sms;

/**
 * Created by zhaozihao on 2015/4/22 0022.
 */
public class Smsinfo {
    private  int id;

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    private  String address;
    private  int type;
    private  String body;

    @Override
    public String toString() {
        return "Smsinfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", body='" + body + '\'' +
                ", date=" + date +
                '}';
    }

    private  long date;



    public Smsinfo() {
        super();
    }


    public String getBody() {
        return body;
    }

    public Smsinfo(int id, String address, int type, String body, long date) {
        this.id = id;
        this.address = address;
        this.type = type;
        this.body = body;
        this.date = date;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
