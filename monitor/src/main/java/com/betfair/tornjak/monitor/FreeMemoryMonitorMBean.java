/*
 * Copyright 2013, The Sporting Exchange Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.betfair.tornjak.monitor;

import org.springframework.jmx.export.annotation.ManagedAttribute;

/**
 * MBean interface to FreeMemoryMonitor class.
 * This class is necessary only because we want to export the FreeMemoryMonitor to JMX, but Spring's mbean exporter
 * can't handle proxied beans (all lookup application beans are proxied so they can be logged) without an associated
 * MBean interface.
 */
public interface FreeMemoryMonitorMBean extends Monitor {

    /**
     * Answers the amount of free memory in this runtime environment, as a percentage.
     */
    @ManagedAttribute()
    int getFreeMemoryPercentage();
}
