package com.yulintu.yulintu_ioc.output;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    //public OutputHelper(){
    //    outputGenerator = new CsvOutputgenerator();
    //}

    public void generateOutout(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
