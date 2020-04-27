package com.evan.springboot.designStudy;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/26 15:14
 */
public class User {
    public static void main(String[] args) {
        Store store = new AppleStore();
        Phone phone = store.get2018Phone();
        Phone phone1 = store.get2019Phone();
        phone.feature();
        phone1.feature();


        Store oppOStore = new OppOStore();
        Phone oppoPhone = oppOStore.get2018Phone();
        Phone phone2 = oppOStore.get2019Phone();
        oppoPhone.feature();
        phone2.feature();


    }
}
