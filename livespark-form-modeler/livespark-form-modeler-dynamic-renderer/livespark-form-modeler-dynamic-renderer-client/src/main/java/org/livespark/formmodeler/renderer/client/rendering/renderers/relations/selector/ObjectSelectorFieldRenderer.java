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

package org.livespark.formmodeler.renderer.client.rendering.renderers.relations.selector;

import java.io.IOException;
import javax.enterprise.context.Dependent;

import com.google.gwt.text.shared.Renderer;
import com.google.gwt.user.client.ui.IsWidget;
import org.gwtbootstrap3.client.ui.ValueListBox;
import org.livespark.formmodeler.model.impl.relations.ObjectSelectorFieldDefinition;
import org.livespark.formmodeler.renderer.client.rendering.FieldRenderer;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
@Dependent
public class ObjectSelectorFieldRenderer extends FieldRenderer<ObjectSelectorFieldDefinition> {

    protected Renderer listBoxRenderer = new Renderer() {
        @Override
        public String render( Object o ) {
            return "";
        }

        @Override
        public void render( Object o, Appendable appendable ) throws IOException {
            appendable.append( render( o ) );
        }
    };

    protected ValueListBox<Object> valueListBox = new ValueListBox<Object>( listBoxRenderer );

    @Override
    public String getName() {
        return ObjectSelectorFieldDefinition.CODE;
    }

    @Override
    public void initInputWidget() {

    }

    @Override
    public IsWidget getInputWidget() {
        return valueListBox;
    }

    @Override
    public String getSupportedCode() {
        return ObjectSelectorFieldDefinition.CODE;
    }
}
