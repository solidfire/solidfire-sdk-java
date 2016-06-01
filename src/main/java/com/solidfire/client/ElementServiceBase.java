package com.solidfire.client;

import com.solidfire.element.api.ModifyAccountRequest;
import com.solidfire.jsvcgen.client.RequestDispatcher;
import com.solidfire.jsvcgen.client.ServiceBase;
import static com.solidfire.jsvcgen.javautil.Optional.*;

/**
 * Created by Jason Ryan Womack on 5/17/16.
 */
public class ElementServiceBase extends ServiceBase {

    static {
        LogSplash.logo();
    }

    /**
     * Create a service with the given connection.
     *
     * @param requestDispatcher is the mechanism for sending requests to some location.
     */
    protected ElementServiceBase(RequestDispatcher requestDispatcher) {
        super(requestDispatcher);
    }


    protected <TRequest> String encodeRequest(String method,
                                              TRequest requestParams,
                                              Class<TRequest> requestParamsClass) {
        final String request = super.encodeRequest(method,requestParams,requestParamsClass);
        if("ModifyAccount".equalsIgnoreCase(method) && ModifyAccountRequest.class.equals(requestParamsClass)) {
            return request.replace("\"initiatorSecret\":\"\"","\"initiatorSecret\":null")
                          .replace("\"targetSecret\":\"\"","\"targetSecret\":null");
         }

        return request;
    }
}
