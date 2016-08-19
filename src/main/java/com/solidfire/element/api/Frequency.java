/*
 * Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.
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
package com.solidfire.element.api;

import java.io.Serializable;

/**
 * This is the base interface for DaysOfMonthFrequency, DaysOfWeekFrequency, and TimeIntervalFrequency.
 *
 * @see com.solidfire.element.api.DaysOfMonthFrequency#DaysOfMonthFrequency(Long, Long, Long[])
 * @see com.solidfire.element.api.DaysOfWeekFrequency#DaysOfWeekFrequency(Long, Long, Weekday[])
 * @see com.solidfire.element.api.TimeIntervalFrequency#TimeIntervalFrequency(Long, Long, Long)
 */
public interface Frequency extends Serializable {
}
