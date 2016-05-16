/*
 * Copyright [2015] [name of copyright owner]
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

package com.solidfire.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class generates a entry at the head of the logs.
 */
final class LogSplash {
    private static final Logger log = LoggerFactory.getLogger(LogSplash.class);

    static {
        log.info("                                   ");
        log.info("      ______________            ___");
        log.info("     /__/__\\__\\__\\__\\       ___/__/");
        log.info("    /_ /__/_\\__\\__\\__\\  ___/__/__/ ");
        log.info("   /__/__/__/\\__\\__\\__\\/__/__/__/  ");
        log.info("  /__/__/__/  \\__\\__\\__\\_/__/__/   ");
        log.info(" /__/__/       \\__\\__\\__\\__/__/    ");
        log.info("/__/            \\__\\__\\__\\/__/     ");
        log.info("                                   ");
        log.info("        Fueled By SolidFire        ");
        log.info("                                   ");
    }

    public static void logo() {
    }
}