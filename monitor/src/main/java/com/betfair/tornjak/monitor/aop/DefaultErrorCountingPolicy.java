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

/**
 * 
 */
package com.betfair.tornjak.monitor.aop;

import com.betfair.tornjak.monitor.ErrorCountingPolicy;


/**
 * All errors count by default, all non Throwable values do not count as errors.
 * 
 * @author sorokod
 * 
 */
public class DefaultErrorCountingPolicy implements ErrorCountingPolicy {
    
    public boolean countsAsError(Throwable t) {
        return true;
    }

    public boolean countsAsError(Object o) {
        return false;
    }

}