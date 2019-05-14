package com.evan.springboot.designModel.adapterFactory;

import javax.servlet.http.HttpServlet;

public class PoweAdaptor implements  JP110VInterface {
    private  CN220VInterface cn220VInterface;
    public PoweAdaptor(CN220VInterface cn220VInterface){
        this.cn220VInterface=cn220VInterface;
    }

    @Override
    public void connect() {
        cn220VInterface.connect();
    }

}
