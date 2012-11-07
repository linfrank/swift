/*
 * Copyright (C) 2012 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.service.puma.swift;

import com.facebook.swift.codec.ThriftConstructor;
import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

@ThriftStruct
public class ReadSemanticException extends Exception
{
    private static final long serialVersionUID = 1L;

    @ThriftConstructor
    public ReadSemanticException(String message)
    {
        super(message);
    }

    @ThriftField(1)
    public String getMessage()
    {
        return super.getMessage();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ReadSemanticException that = (ReadSemanticException) o;

        if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return getMessage() != null ? getMessage().hashCode() : 0;
    }
}
