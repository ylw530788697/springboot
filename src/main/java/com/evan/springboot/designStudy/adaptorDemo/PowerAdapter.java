package com.evan.springboot.designStudy.adaptorDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/30 下午 3:12
 */
public class PowerAdapter implements Power110V {
    private Power220V power220V;
    public PowerAdapter(Power220V power220V){
        this.power220V=power220V;
    }
    @Override
    public void connect() {
        power220V.connect();
    }
}
