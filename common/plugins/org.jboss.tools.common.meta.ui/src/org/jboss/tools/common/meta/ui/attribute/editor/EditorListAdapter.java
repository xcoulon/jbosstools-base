/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.common.meta.ui.attribute.editor;

import org.jboss.tools.common.model.ui.attribute.IListContentProvider;
import org.jboss.tools.common.model.ui.attribute.adapter.*;
import org.jboss.tools.common.meta.XAttribute;
import org.jboss.tools.common.model.*;
import org.jboss.tools.common.meta.ui.editor.MappingHelper;

public class EditorListAdapter extends DefaultComboBoxValueAdapter {

	protected IListContentProvider createListContentProvider(XAttribute attribute) {
		EditorListContentProvider p = new EditorListContentProvider();
		p.setModel(model);
		p.setAttribute(attribute);
		return p;	
	}

}

class EditorListContentProvider extends DefaultXAttributeListContentProvider {
	private XModel model;
	
	public void setModel(XModel model) {
		this.model = model;
	}

	protected void loadTags() {
		MappingHelper h = MappingHelper.getMappingHelper(model);
		tags = h.getList("AttributeEditor"); //$NON-NLS-1$
	}

}
