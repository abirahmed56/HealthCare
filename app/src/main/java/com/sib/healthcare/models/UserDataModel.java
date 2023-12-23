package com.sib.healthcare.models;

import android.os.Parcel;
import android.os.Parcelable;

public class UserDataModel implements Parcelable {
    private String uId,image,name,mbbs,degrees,type,clinicAddress,district,day1,day2,time1,time2,height,weight,age,gender;
    private String division,email,phoneNumber,bloodGroup;
    private boolean isDoctor,isDonor;
    private int appointments,maxAppointmentsPerDay , d1 , d2;
    public UserDataModel() {
    }

    public UserDataModel(String uId, String image, String name, String mbbs, String degrees, String type, String clinicAddress, String district, String day1, String day2, String time1, String time2, String height, String weight, String age, String gender, String division, String email, String phoneNumber, String bloodGroup, boolean isDoctor, boolean isDonor, int appointments, int maxAppointmentsPerDay, int d1, int d2) {
        this.uId = uId;
        this.image = image;
        this.name = name;
        this.mbbs = mbbs;
        this.degrees = degrees;
        this.type = type;
        this.clinicAddress = clinicAddress;
        this.district = district;
        this.day1 = day1;
        this.day2 = day2;
        this.time1 = time1;
        this.time2 = time2;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.division = division;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.isDoctor = isDoctor;
        this.isDonor = isDonor;
        this.appointments = appointments;
        this.maxAppointmentsPerDay = maxAppointmentsPerDay;
        this.d1 = d1;
        this.d2 = d2;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMaxAppointmentsPerDay() {
        return maxAppointmentsPerDay;
    }

    public void setMaxAppointmentsPerDay(int maxAppointmentsPerDay) {
        this.maxAppointmentsPerDay = maxAppointmentsPerDay;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getAppointments() {
        return appointments;
    }

    public void setAppointments(int appointments) {
        this.appointments = appointments;
    }

    public UserDataModel(String uId, String image, String name, String email, boolean isDoctor, boolean isDonor) {
        this.uId = uId;
        this.image = image;
        this.name = name;
        this.email = email;
        this.isDoctor = isDoctor;
        this.isDonor = isDonor;
    }

    protected UserDataModel(Parcel in) {
        uId = in.readString();
        image = in.readString();
        name = in.readString();
        mbbs = in.readString();
        degrees = in.readString();
        type = in.readString();
        clinicAddress = in.readString();
        district = in.readString();
        day1 = in.readString();
        day2 = in.readString();
        time1 = in.readString();
        time2 = in.readString();
        division = in.readString();
        email = in.readString();
        phoneNumber = in.readString();
        bloodGroup = in.readString();
        isDoctor = in.readByte() != 0;
        isDonor = in.readByte() != 0;
        age =in.readString();
        gender=in.readString();
        height=in.readString();
        weight=in.readString();
        d1=in.readInt();
        d2=in.readInt();
        appointments=in.readInt();
        maxAppointmentsPerDay=in.readInt();

    }

    public static final Creator<UserDataModel> CREATOR = new Creator<UserDataModel>() {
        @Override
        public UserDataModel createFromParcel(Parcel in) {
            return new UserDataModel(in);
        }

        @Override
        public UserDataModel[] newArray(int size) {
            return new UserDataModel[size];
        }
    };

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMbbs() {
        return mbbs;
    }

    public void setMbbs(String mbbs) {
        this.mbbs = mbbs;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public boolean isDoctor() {
        return isDoctor;
    }

    public void setDoctor(boolean doctor) {
        isDoctor = doctor;
    }

    public boolean isDonor() {
        return isDonor;
    }

    public void setDonor(boolean donor) {
        isDonor = donor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uId);
        dest.writeString(image);
        dest.writeString(name);
        dest.writeString(mbbs);
        dest.writeString(degrees);
        dest.writeString(type);
        dest.writeString(clinicAddress);
        dest.writeString(district);
        dest.writeString(day1);
        dest.writeString(day2);
        dest.writeString(time1);
        dest.writeString(time2);
        dest.writeString(division);
        dest.writeString(email);
        dest.writeString(phoneNumber);
        dest.writeString(bloodGroup);
        dest.writeByte((byte) (isDoctor ? 1 : 0));
        dest.writeByte((byte) (isDonor ? 1 : 0));
        dest.writeString(age);
        dest.writeString(gender);
        dest.writeString(height);
        dest.writeString(weight);
        dest.writeInt(d1);
        dest.writeInt(d2);
        dest.writeInt(appointments);
        dest.writeInt(maxAppointmentsPerDay);
    }
}
