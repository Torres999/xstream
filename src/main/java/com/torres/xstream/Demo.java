package com.torres.xstream;

import com.thoughtworks.xstream.XStream;
import com.torres.xstream.body_msg.BODY_MSG_APPLY;
import com.torres.xstream.body_msg.BODY_MSG_CHECK;
import com.torres.xstream.body_msg.BODY_MSG_QUERY_BILL;
import com.torres.xstream.structure.BODY;
import com.torres.xstream.structure.BODY_OUTTER;
import com.torres.xstream.structure.ROOT;

import java.util.ArrayList;
import java.util.List;

/**
 * @author t9
 */
public class Demo {

    public static void main(String[] args) {
        XStream xs = new XStream();
        xs.autodetectAnnotations(true);
         xs.aliasField("category", String.class, "CATEGORIES");
        // <com.hmkcode.vo.Body> --> <Body>
        //xs.alias("article", BODY.class);
        // <url> --> <address>
        // xs.aliasField("address", BODY.class, "url");

        // OBJECT --> XML
        String xml = xs.toXML(createRoot());

        System.out.println("OBJECT --> XML");
        System.out.println(xml);
        System.out.println("\n--------------------------------\n");

        // XML --> OBJECT
        ROOT article = (ROOT) xs.fromXML(xml);

        System.out.println("XML --> OBJECT");
        System.out.println(article);
    }

    public static ROOT createRoot() {

        List<String> categories = new ArrayList<>();
        categories.add("categories1");
        categories.add("categories2");

        List<String> tags = new ArrayList<>();
        tags.add("Tag1");
        tags.add("Tag2");

        BODY_MSG_APPLY body_apply1 = new BODY_MSG_APPLY();
        body_apply1.setSchool("小学");
        body_apply1.setScore(89);
        body_apply1.setName("Jack");

        BODY_MSG_CHECK body_check = new BODY_MSG_CHECK();
        body_check.setSchool("高中");
        body_check.setAge(11);
        body_check.setName("Tom");

        BODY_MSG_QUERY_BILL body_query_bill = new BODY_MSG_QUERY_BILL();
        body_query_bill.setName("Lucy");

        List<BODY> bodys = new ArrayList<>();
        bodys.add(body_apply1);
        bodys.add(body_query_bill);
        bodys.add(body_check);

        BODY_OUTTER bodyOutter = new BODY_OUTTER();
        bodyOutter.setBody(bodys);
        bodyOutter.setVersion("1.11.11");

        ROOT root = new ROOT();
        root.setAddress("Shanghaishi Pudongxinqu");
        root.setId(1);
        root.setSex(false);
        root.setTags(tags);
        root.setCategories(categories);
        root.setBody(bodyOutter);


        return root;
    }
}
