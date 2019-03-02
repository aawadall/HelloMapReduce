package com.aawadall;

import org.apache.hadoop.util.ToolRunner;

public class Main {
    public static void main(String[] args)
    throws Exception{
        int exitCode = ToolRunner.run(new ViewCount(), args);
        System.exit(exitCode);
    }
}
