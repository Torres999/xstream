package com.torres.xstream.body_msg;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.torres.xstream.structure.BODY;
import lombok.Data;

/**
 * @author t9
 */
@Data
@XStreamAlias("APPLY")
public class BODY_MSG_APPLY extends BODY {

    String school;

    Integer score;
}
