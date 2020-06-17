package com.csxn.comapi.pnyb.dto;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

/**
 * @author wangchengshou
 * @version 1.0
 * @date 2020/6/15 16:45
 */
@Data
public class User implements Serializable {
    private String name;
    private String age;
}
