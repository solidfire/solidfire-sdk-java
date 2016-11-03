package com.solidfire.core.client;

import com.solidfire.core.javautil.Optional;
import com.solidfire.element.api.SolidFireElement;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class ConnectionTypeUtilsTest {
    @Test
    public void isValidConnectionType() throws Exception {

        SolidFireElement solidFireElement = new SolidFireElement(new HttpsRequestDispatcher(new URL("https://someipaddress.com/json-rpc/9.0"), "username", "password"));
        boolean isval = ConnectionTypeUtils.isValidConnectionType(solidFireElement, "GetAPI", false);

    }

}