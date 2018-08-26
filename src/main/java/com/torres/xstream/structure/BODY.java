package com.torres.xstream.structure;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;

/**
 * @author t9
 */
@Data
//@XStreamInclude({BODY_MSG_APPLY.class, BODY_MSG_CHECK.class})
public class BODY {

    @XStreamAsAttribute
    @XStreamAlias("Name")
    String name;
}
