/**
 * Copyright 2017 Red Hat, Inc, and individual contributors.
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
 */
package org.wildfly.swarm.cdi.jaxws.test;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(serviceName = "GreeterService", portName = "Greeter", name = "Greeter",
        endpointInterface = "org.wildfly.swarm.cdi.jaxws.test.GreeterService",
        targetNamespace = "http://wildfly-swarm.io/Greeter")
public class GreeterServiceImpl implements GreeterService {
    @Inject
    private Greeter greeter;

    @Override
    public String hello() {
        return greeter.hello();
    }
}
