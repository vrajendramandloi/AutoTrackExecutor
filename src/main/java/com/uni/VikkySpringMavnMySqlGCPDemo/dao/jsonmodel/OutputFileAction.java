package com.uni.VikkySpringMavnMySqlGCPDemo.dao.jsonmodel;

import lombok.Data;

@Data
public class OutputFileAction {
    private String outputFilePath;
    private String fileExt;
    private String outputFileName;
}
