package com.evan.springboot.study.designModel;

public class SingletEnumDemo {
    private SingletEnumDemo(){}

    public static SingletEnumDemo getInstance(){
        return SingeEnum.INSTANCE.getSingletEnumDemo();
    }

    static enum SingeEnum{
        INSTANCE;

        private  SingletEnumDemo singletEnumDemo;
        private SingeEnum(){
            singletEnumDemo=new SingletEnumDemo();
        }

        public SingletEnumDemo getSingletEnumDemo(){
            return  this.singletEnumDemo;
        }
    }

    public static void main(String[] args) {
        SingletEnumDemo singletEnumDemo = new SingletEnumDemo();
        SingletEnumDemo singletEnumDemo1 = new SingletEnumDemo();
        System.out.println(singletEnumDemo.equals(singletEnumDemo1));
    }
}
