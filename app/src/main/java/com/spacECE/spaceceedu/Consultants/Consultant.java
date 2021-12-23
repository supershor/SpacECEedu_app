package com.spacECE.spaceceedu.Consultants;

public class Consultant {
    private String name,consultant_id,profilePic_src,categories,address,language,timing_start,timing_end,fee,daysTo,daysFrom,qualification;
    private String price;

    public Consultant(String name, String consultant_id, String profilePic_src, String categories
            , String address, String language, String timing_start, String timing_end,
                      String qualification, String price) {
        this.name = name;
        this.consultant_id = consultant_id;
        this.profilePic_src = profilePic_src;
        this.categories = categories;
        this.address = address;
        this.language = language;
        this.timing_start = timing_start;
        this.timing_end = timing_end;
        this.qualification = qualification;
        this.price = price;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDaysTo() {
        return daysTo;
    }

    public String getDaysFrom() {
        return daysFrom;
    }

    public String getName() {
        return name;
    }

    public String getConsultant_id() {
        return consultant_id;
    }

    public String getProfilePic_src() {
        return profilePic_src;
    }

    public String getCategories() {
        return categories;
    }

    public String getAddress() {
        return address;
    }

    public String getLanguage() {
        return language;
    }

    public String getTiming_start() {
        return timing_start;
    }

    public String getTiming_end() {
        return timing_end;
    }

    public String getPrice() {
        return price;
    }
}
