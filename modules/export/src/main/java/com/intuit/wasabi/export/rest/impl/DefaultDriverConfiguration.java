/*******************************************************************************
 * Copyright 2016 Intuit
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.wasabi.export.rest.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.intuit.wasabi.export.rest.Driver;


public class DefaultDriverConfiguration implements Driver.Configuration {

    private Integer connectionTimeout;
    private Integer socketTimeout;

    @Inject
    public DefaultDriverConfiguration(final @Named("export.rest.client.connectionTimeout") Integer connectionTimeout,
                                      final @Named("export.rest.client.socketTimeout") Integer socketTimeout) {
        super();

        this.connectionTimeout = connectionTimeout;
        this.socketTimeout = socketTimeout;
    }

    @Override
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    @Override
    public int getSocketTimeout() {
        return socketTimeout;
    }
}
