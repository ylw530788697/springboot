package com.evan.springboot.designModel.single;

public class SingleLanHan {
    private SingleLanHan singleLanHan;
    private SingleLanHan(){
    }
    public SingleLanHan getInstance(){
        if (this.singleLanHan==null) {
            synchronized (this.singleLanHan) {
                if (this.singleLanHan==null){
                    this.singleLanHan=new SingleLanHan();
                }else{
                    return singleLanHan;
                }
            }
        }
        return singleLanHan;
    }
}
