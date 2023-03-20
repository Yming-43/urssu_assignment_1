package com.example.urssu_assignment_1;

public class RecyclerItem
{

    private String name;         // 이름
    private String phonenumber;  // 전화번호

    public RecyclerItem(){} // 기본 생성자(안써주면 에러 발생, 생성자 이미 존재하기 때문에 자동생성 안됨)

    public RecyclerItem ( String name, String phonenumber )
    {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setPhonenumber( String phonenumber) {
        this.phonenumber = phonenumber;
    }

}
