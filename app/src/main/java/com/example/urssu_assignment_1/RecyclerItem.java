package com.example.urssu_assignment_1;

public class RecyclerItem
{

    private String name;
    private String phonenumber;

    public RecyclerItem(){}

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
