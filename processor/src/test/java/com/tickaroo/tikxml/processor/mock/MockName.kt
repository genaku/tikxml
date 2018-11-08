/*
 * Copyright (C) 2015 Hannes Dorfmann
 * Copyright (C) 2015 Tickaroo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tickaroo.tikxml.processor.mock

import javax.lang.model.element.Name

/**
 *
 * @author Hannes Dorfmann
 */
class MockName(private val name: String) : Name {

    override val length = name.length

    override fun get(index: Int) = name[index]

    override fun subSequence(startIndex: Int, endIndex: Int) = name.subSequence(startIndex, endIndex)

    override fun contentEquals(cs: CharSequence?) = if (cs == null) false else name.contentEquals(cs)

    override fun toString(): String = name
}