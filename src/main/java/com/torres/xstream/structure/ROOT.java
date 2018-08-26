package com.torres.xstream.structure;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import lombok.Data;

import java.util.List;

/**
 * @author t9
 */
@Data
@XStreamAlias("ROOT")
public class ROOT {

    @XStreamAsAttribute
    @XStreamAlias("ID")
    private int id;

    @XStreamConverter(value = BooleanConverter.class, booleans = {true}, strings = {"yes", "no"})
    private boolean sex;

    @XStreamAlias("BODY")
    private BODY_OUTTER body;

    private String address;

    //    @XStreamOmitField
    @XStreamAlias("CATEGORIES")
    private List<String> categories;

    // 忽略list层级，list内容以tags命名
    @XStreamImplicit(itemFieldName = "tags")
    private List<String> tags;
}
