package com.example.administrator.urlstyh;

import java.util.List;

public class Results {
    private List<data> data;

    public List<data> getData() {
        return data;
    }

    public void setData(List<data> data) {
        this.data = data;
    }
    @Override
    public String toString()
    {
        return "Results[data=" + data +"]";
    }
}
