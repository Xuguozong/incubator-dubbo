/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.config.support;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Parameter
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
// Parameter参数注解，用于Dubbo URL的parameters拼接
public @interface Parameter {

    // 键（别名）
    String key() default "";

    // 是否必填
    boolean required() default false;

    // 是否忽略
    boolean excluded() default false;

    // 是否转义
    boolean escaped() default false;

    // 是否为属性
    // 目前用于时间通知 https://dubbo.gitbooks.io/dubbo-user-book/demos/events-notify.html
    boolean attribute() default false;

    // 是否拼接默认属性
    boolean append() default false;

}