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
import org.odftoolkit.odfdom.dom.attribute.table.TableBindStylesToContentAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCaseSensitiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePageBreaksOnGroupChangeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:subtotal-rules}.
 *
 */
public class TableSubtotalRulesElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "subtotal-rules");

	/**
	 * Create the instance of <code>TableSubtotalRulesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSubtotalRulesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:subtotal-rules}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableBindStylesToContentAttribute</code> , See {@odf.attribute table:bind-styles-to-content}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableBindStylesToContentAttribute() {
		TableBindStylesToContentAttribute attr = (TableBindStylesToContentAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "bind-styles-to-content");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableBindStylesToContentAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableBindStylesToContentAttribute</code> , See {@odf.attribute table:bind-styles-to-content}
	 *
	 * @param tableBindStylesToContentValue   The type is <code>Boolean</code>
	 */
	public void setTableBindStylesToContentAttribute(Boolean tableBindStylesToContentValue) {
		TableBindStylesToContentAttribute attr = new TableBindStylesToContentAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableBindStylesToContentValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> , See {@odf.attribute table:case-sensitive}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCaseSensitiveAttribute() {
		TableCaseSensitiveAttribute attr = (TableCaseSensitiveAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "case-sensitive");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableCaseSensitiveAttribute.DEFAULT_VALUE_FALSE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> , See {@odf.attribute table:case-sensitive}
	 *
	 * @param tableCaseSensitiveValue   The type is <code>String</code>
	 */
	public void setTableCaseSensitiveAttribute(String tableCaseSensitiveValue) {
		TableCaseSensitiveAttribute attr = new TableCaseSensitiveAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableCaseSensitiveValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePageBreaksOnGroupChangeAttribute</code> , See {@odf.attribute table:page-breaks-on-group-change}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTablePageBreaksOnGroupChangeAttribute() {
		TablePageBreaksOnGroupChangeAttribute attr = (TablePageBreaksOnGroupChangeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "page-breaks-on-group-change");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TablePageBreaksOnGroupChangeAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePageBreaksOnGroupChangeAttribute</code> , See {@odf.attribute table:page-breaks-on-group-change}
	 *
	 * @param tablePageBreaksOnGroupChangeValue   The type is <code>Boolean</code>
	 */
	public void setTablePageBreaksOnGroupChangeAttribute(Boolean tablePageBreaksOnGroupChangeValue) {
		TablePageBreaksOnGroupChangeAttribute attr = new TablePageBreaksOnGroupChangeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tablePageBreaksOnGroupChangeValue.booleanValue());
	}

	/**
	 * Create child element {@odf.element table:sort-groups}.
	 *
	 * @return the element {@odf.element table:sort-groups}
	 */
	public TableSortGroupsElement newTableSortGroupsElement() {
		TableSortGroupsElement tableSortGroups = ((OdfFileDom) this.ownerDocument).newOdfElement(TableSortGroupsElement.class);
		this.appendChild(tableSortGroups);
		return tableSortGroups;
	}

	/**
	 * Create child element {@odf.element table:subtotal-rule}.
	 *
	 * @param tableGroupByFieldNumberValue  the <code>Integer</code> value of <code>TableGroupByFieldNumberAttribute</code>, see {@odf.attribute  table:group-by-field-number} at specification
	 * @return the element {@odf.element table:subtotal-rule}
	 */
	 public TableSubtotalRuleElement newTableSubtotalRuleElement(int tableGroupByFieldNumberValue) {
		TableSubtotalRuleElement tableSubtotalRule = ((OdfFileDom) this.ownerDocument).newOdfElement(TableSubtotalRuleElement.class);
		tableSubtotalRule.setTableGroupByFieldNumberAttribute(tableGroupByFieldNumberValue);
		this.appendChild(tableSubtotalRule);
		return tableSubtotalRule;
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
