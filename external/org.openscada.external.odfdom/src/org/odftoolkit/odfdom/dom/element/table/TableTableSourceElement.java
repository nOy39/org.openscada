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
import org.odftoolkit.odfdom.dom.attribute.table.TableFilterNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFilterOptionsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableRefreshDelayAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table-source}.
 *
 */
public class TableTableSourceElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "table-source");

	/**
	 * Create the instance of <code>TableTableSourceElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableSourceElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table-source}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFilterNameAttribute</code> , See {@odf.attribute table:filter-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFilterNameAttribute() {
		TableFilterNameAttribute attr = (TableFilterNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "filter-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFilterNameAttribute</code> , See {@odf.attribute table:filter-name}
	 *
	 * @param tableFilterNameValue   The type is <code>String</code>
	 */
	public void setTableFilterNameAttribute(String tableFilterNameValue) {
		TableFilterNameAttribute attr = new TableFilterNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFilterNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFilterOptionsAttribute</code> , See {@odf.attribute table:filter-options}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFilterOptionsAttribute() {
		TableFilterOptionsAttribute attr = (TableFilterOptionsAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "filter-options");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFilterOptionsAttribute</code> , See {@odf.attribute table:filter-options}
	 *
	 * @param tableFilterOptionsValue   The type is <code>String</code>
	 */
	public void setTableFilterOptionsAttribute(String tableFilterOptionsValue) {
		TableFilterOptionsAttribute attr = new TableFilterOptionsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFilterOptionsValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableModeAttribute</code> , See {@odf.attribute table:mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableModeAttribute() {
		TableModeAttribute attr = (TableModeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "mode");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableModeAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableModeAttribute</code> , See {@odf.attribute table:mode}
	 *
	 * @param tableModeValue   The type is <code>String</code>
	 */
	public void setTableModeAttribute(String tableModeValue) {
		TableModeAttribute attr = new TableModeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableModeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableRefreshDelayAttribute</code> , See {@odf.attribute table:refresh-delay}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableRefreshDelayAttribute() {
		TableRefreshDelayAttribute attr = (TableRefreshDelayAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "refresh-delay");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableRefreshDelayAttribute</code> , See {@odf.attribute table:refresh-delay}
	 *
	 * @param tableRefreshDelayValue   The type is <code>String</code>
	 */
	public void setTableRefreshDelayAttribute(String tableRefreshDelayValue) {
		TableRefreshDelayAttribute attr = new TableRefreshDelayAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableRefreshDelayValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTableNameAttribute</code> , See {@odf.attribute table:table-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTableNameAttribute() {
		TableTableNameAttribute attr = (TableTableNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "table-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTableNameAttribute</code> , See {@odf.attribute table:table-name}
	 *
	 * @param tableTableNameValue   The type is <code>String</code>
	 */
	public void setTableTableNameAttribute(String tableTableNameValue) {
		TableTableNameAttribute attr = new TableTableNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableTableNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute() {
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "actuate");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkActuateAttribute.DEFAULT_VALUE_ONREQUEST;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute(String xlinkActuateValue) {
		XlinkActuateAttribute attr = new XlinkActuateAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkActuateValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute() {
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute(String xlinkHrefValue) {
		XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkHrefValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute() {
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkTypeAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute(String xlinkTypeValue) {
		XlinkTypeAttribute attr = new XlinkTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkTypeValue);
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
