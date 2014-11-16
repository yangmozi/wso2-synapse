/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.synapse.transport.passthru.core;

import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.apache.synapse.transport.http.conn.ServerConnFactory;
import org.apache.synapse.transport.passthru.config.SourceConfiguration;

import java.util.concurrent.ThreadFactory;

public class PassThroughIOReactorConfig {

    private IOReactorConfig ioReactorConfig;

    private ThreadFactory threadFactory;

    private ServerConnFactory serverConnFactory;

    private String namePrefix;

    private SourceConfiguration  sourceConfiguration;

    public PassThroughIOReactorConfig
            (IOReactorConfig ioReactorConfig, ThreadFactory threadFactory,
             String namePrefix, ServerConnFactory serverConnFactory, SourceConfiguration sourceConfiguration) {
        this.ioReactorConfig = ioReactorConfig;
        this.threadFactory = threadFactory;
        this.namePrefix = namePrefix;
        this.serverConnFactory = serverConnFactory;
        this.sourceConfiguration = sourceConfiguration;
    }


    public IOReactorConfig getIoReactorConfig() {
        return ioReactorConfig;
    }

    public ThreadFactory getThreadFactory() {
        return threadFactory;
    }

    public ServerConnFactory getServerConnFactory() {
        return serverConnFactory;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public SourceConfiguration getSourceConfiguration() {
        return sourceConfiguration;
    }


}
