package seunghee.project.cat_president.vo;

public class CategoryVO {

    private String TC_PK;
    private String TC_CLASS1;
    private String TC_CLASS2;
    private String TC_CLASS_NAME;

    public String getTC_PK() {
        return TC_PK;
    }

    public void setTC_PK(String TC_PK) {
        this.TC_PK = TC_PK;
    }

    public String getTC_CLASS1() {
        return TC_CLASS1;
    }

    public void setTC_CLASS1(String TC_CLASS1) {
        this.TC_CLASS1 = TC_CLASS1;
    }

    public String getTC_CLASS2() {
        return TC_CLASS2;
    }

    public void setTC_CLASS2(String TC_CLASS2) {
        this.TC_CLASS2 = TC_CLASS2;
    }

    public String getTC_CLASS_NAME() {
        return TC_CLASS_NAME;
    }

    public void setTC_CLASS_NAME(String TC_CLASS_NAME) {
        this.TC_CLASS_NAME = TC_CLASS_NAME;
    }

    public CategoryVO() {
    }

    public CategoryVO(String TC_PK, String TC_CLASS1, String TC_CLASS2, String TC_CLASS_NAME) {
        this.TC_PK = TC_PK;
        this.TC_CLASS1 = TC_CLASS1;
        this.TC_CLASS2 = TC_CLASS2;
        this.TC_CLASS_NAME = TC_CLASS_NAME;
    }
}
