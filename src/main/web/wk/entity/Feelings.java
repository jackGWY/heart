package wk.entity;


import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.stereotype.Component;


public class Feelings {

    private String userName;
    private String sports;
    private String feeling;

    private int bloodPressure;

    private int heartRate;
    private String remark;

    public Feelings() {
    }

    public Feelings(String userName, String sports, String feeling, int bloodPressure, int heartRate, String remark) {
        this.userName = userName;
        this.sports = sports;
        this.feeling = feeling;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Feelings{" +
                "userName='" + userName + '\'' +
                ", sports='" + sports + '\'' +
                ", feeling='" + feeling + '\'' +
                ", bloodPressure=" + bloodPressure +
                ", heartRate=" + heartRate +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    @JSONField(name = "user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    //    @JSONField(name = "user_name")
//    public String getUserName() {
//        return userName;
//    }

//    @JSONField(name = "blood_pressure")
//    public String getBloodPressure() {
//        return bloodPressure;
//    }

//    @JSONField(name = "heart_rate")
//    public String getHeartRate() {
//        return heartRate;
//    }

}
