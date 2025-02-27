/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dinky.controller;

import org.dinky.data.model.SystemConfiguration;
import org.dinky.data.result.Result;
import org.dinky.service.LdapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/ldap")
@RequiredArgsConstructor
public class LdapController {

    @Autowired LdapService ldapService;

    /** Gets the LDAP configuration status */
    @GetMapping("/ldapEnableStatus")
    public Result<Boolean> ldapStatus() {
        return Result.succeed(
                SystemConfiguration.getInstances().getLdapEnable().getValue(), "获取成功");
    }

    //    @PostMapping("/listUser")
    //    public ProTableResult<User> listUser(@RequestBody LdapConfig ldapConfig) {
    //        List<User> users = ldapService.listUsers(ldapConfig);
    //        return ProTableResult.<User>builder()
    //                .success(true)
    //                .data(users)
    //                .total((long) users.size())
    ////                .current(1)
    ////                .pageSize(1)
    //                .build();
    //    }

}
