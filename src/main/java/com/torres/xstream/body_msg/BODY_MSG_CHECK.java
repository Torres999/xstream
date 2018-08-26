package com.torres.xstream.body_msg;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.torres.xstream.structure.BODY;
import lombok.Data;

/**
 * @author t9
 */
@Data
@XStreamAlias("CHECK")
public class BODY_MSG_CHECK extends BODY {

    private String school;

    private Integer age;
}
