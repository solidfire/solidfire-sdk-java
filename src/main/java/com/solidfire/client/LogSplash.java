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

package com.solidfire.client;

import com.solidfire.element.api.SolidFireElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class generates a entry at the head of the logs.
 */
final class LogSplash {
    private static final Logger log = LoggerFactory.getLogger(SolidFireElement.class);

    static {

        log.info("");
        log.info("                                               77               ");
        log.info("                                              7777              ");
        log.info("                                               77               ");
        log.info("                                               ==               ");
        log.info("                             77IIIIIIIIIIIIIIIIII777            ");
        log.info("                           =7                       7=          ");
        log.info("                           7                         7          ");
        log.info("                          =7                         7=         ");
        log.info("                          =7                         7=         ");
        log.info("                         =77   7777777777777777777   77=        ");
        log.info("                        7777  777777777777777777777  7777       ");
        log.info("                        7777   7777777777777777777   7777       ");
        log.info("                         =77                         77=        ");
        log.info("                          =7                         7=         ");
        log.info("                           7                         7          ");
        log.info("                           7=                       =7          ");
        log.info("                            77=                   =77           ");
        log.info("                              =7777777777777777777=             ");
        log.info("                                                                ");
        log.info("                               ====IIIIIIIIII=====              ");
        log.info("                         =77777=                 =77777=        ");
        log.info("                     =777=                             =777=    ");
        log.info("                 =777=                                     =777=");
        log.info("                                                                ");
        log.info("                           Fueled by NetApp SolidFire  ");
    }

    public static void logo() {
    }
}