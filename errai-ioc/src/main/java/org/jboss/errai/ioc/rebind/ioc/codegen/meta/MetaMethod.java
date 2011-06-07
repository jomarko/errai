/*
 * Copyright 2011 JBoss, a divison Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.ioc.rebind.ioc.codegen.meta;

public abstract class MetaMethod implements MetaClassMember, MetaGenericDeclaration {
    public abstract String getName();

    public abstract MetaClass getReturnType();

    public abstract MetaType getGenericReturnType();

    public abstract MetaType[] getGenericParameterTypes();

    public abstract MetaParameter[] getParameters();
}
