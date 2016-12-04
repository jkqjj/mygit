package com.yulintu.yulintu_ioc.output;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class App {
    public static void main(String[] args) {
        IOutputGenerator output = new CsvOutputgenerator();
        output.generateOutput();
    }
}
