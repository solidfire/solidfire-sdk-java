package com.solidfire.client;

import com.solidfire.jsvcgen.client.RequestDispatcher;
import com.solidfire.jsvcgen.client.ServiceBase;

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

}
