/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.livespark.formmodeler.model.impl.basic.textBox;

import org.livespark.formmodeler.metaModel.FieldDef;
import org.livespark.formmodeler.model.FieldDefinition;
import org.livespark.formmodeler.model.impl.basic.HasMaxLength;
import org.livespark.formmodeler.model.impl.basic.HasPlaceHolder;
import org.livespark.formmodeler.service.impl.fieldProviders.TextBoxFieldProvider;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
public abstract class TextBoxBase extends FieldDefinition implements HasMaxLength, HasPlaceHolder {
    public static final String CODE = "TextBox";

    public TextBoxBase() {
        super( CODE );
    }

    @FieldDef( label = "Placeholder" )
    protected String placeHolder = "";

    @Override
    public String getPlaceHolder() {
        return placeHolder;
    }

    @Override
    public void setPlaceHolder( String placeHolder ) {
        this.placeHolder = placeHolder;
    }

    @Override
    protected void doCopyFrom( FieldDefinition other ) {
        if ( other instanceof HasMaxLength ) {
            setMaxLength( ((HasMaxLength) other).getMaxLength() );
        }
        if ( other instanceof HasPlaceHolder ) {
            setPlaceHolder( ((HasPlaceHolder) other).getPlaceHolder() );
        }
    }
}
