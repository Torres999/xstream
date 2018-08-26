package com.torres.xstream.structure;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.List;

/**
 * @author t9
 */
@Data
public class BODY_OUTTER {

    @XStreamAsAttribute
    @XStreamAlias("version")
    String version;

    // 忽略list层级，list内容以自己的alias命名
    @XStreamImplicit
    private List<BODY> body;
}