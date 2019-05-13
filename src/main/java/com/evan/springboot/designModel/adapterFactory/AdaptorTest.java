package com.evan.springboot.designModel.adapterFactory;

import javax.servlet.http.HttpServlet;

public class AdaptorTest {
    public static void main(String[] args) {
        CN220VInterface cn220VInterface=new CN220VInterfaceImpl();
        PoweAdaptor poweAdaptor=new PoweAdaptor(cn220VInterface);

        ElectricCooker cooker=new ElectricCooker(poweAdaptor);
        cooker.cook();



    }
}
