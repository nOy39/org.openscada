/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.table.TableDataTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOrderAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:sort-groups}.
 *
 */
public class TableSortGroupsElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "sort-groups");

	/**
	 * Create the instance of <code>TableSortGroupsElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSortGroupsElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:sort-groups}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDataTypeAttribute</code> , See {@odf.attribute table:data-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableDataTypeAttribute() {
		TableDataTypeAttribute attr = (TableDataTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "data-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableDataTypeAttribute.DEFAULT_VALUE_AUTOMATIC;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDataTypeAttribute</code> , See {@odf.attribute table:data-type}
	 *
	 * @param tableDataTypeValue   The type is <code>String</code>
	 */
	public void setTableDataTypeAttribute(String tableDataTypeValue) {
		TableDataTypeAttribute attr = new TableDataTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableDataTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableOrderAttribute</code> , See {@odf.attribute table:order}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableOrderAttribute() {
		TableOrderAttribute attr = (TableOrderAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "order");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableOrderAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableOrderAttribute</code> , See {@odf.attribute table:order}
	 *
	 * @param tableOrderValue   The type is <code>String</code>
	 */
	public void setTableOrderAttribute(String tableOrderValue) {
		TableOrderAttribute attr = new TableOrderAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableOrderValue);
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
