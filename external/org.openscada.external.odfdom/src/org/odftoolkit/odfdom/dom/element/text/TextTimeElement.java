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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextFixedAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextTimeAdjustAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextTimeValueAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:time}.
 *
 */
public class TextTimeElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "time");

	/**
	 * Create the instance of <code>TextTimeElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextTimeElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:time}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDataStyleNameAttribute() {
		StyleDataStyleNameAttribute attr = (StyleDataStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "data-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @param styleDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleDataStyleNameAttribute(String styleDataStyleNameValue) {
		StyleDataStyleNameAttribute attr = new StyleDataStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleDataStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextFixedAttribute() {
		TextFixedAttribute attr = (TextFixedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "fixed");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @param textFixedValue   The type is <code>Boolean</code>
	 */
	public void setTextFixedAttribute(Boolean textFixedValue) {
		TextFixedAttribute attr = new TextFixedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textFixedValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextTimeAdjustAttribute</code> , See {@odf.attribute text:time-adjust}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextTimeAdjustAttribute() {
		TextTimeAdjustAttribute attr = (TextTimeAdjustAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "time-adjust");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextTimeAdjustAttribute</code> , See {@odf.attribute text:time-adjust}
	 *
	 * @param textTimeAdjustValue   The type is <code>String</code>
	 */
	public void setTextTimeAdjustAttribute(String textTimeAdjustValue) {
		TextTimeAdjustAttribute attr = new TextTimeAdjustAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textTimeAdjustValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextTimeValueAttribute</code> , See {@odf.attribute text:time-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextTimeValueAttribute() {
		TextTimeValueAttribute attr = (TextTimeValueAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "time-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextTimeValueAttribute</code> , See {@odf.attribute text:time-value}
	 *
	 * @param textTimeValueValue   The type is <code>String</code>
	 */
	public void setTextTimeValueAttribute(String textTimeValueValue) {
		TextTimeValueAttribute attr = new TextTimeValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textTimeValueValue);
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
	/**
	 * Add text content. Only elements which are allowed to have text content offer this method.
	 */
	public void newTextNode(String content) {
		if (content != null && !content.equals("")) {
			this.appendChild(this.getOwnerDocument().createTextNode(content));
		}
	}
}
