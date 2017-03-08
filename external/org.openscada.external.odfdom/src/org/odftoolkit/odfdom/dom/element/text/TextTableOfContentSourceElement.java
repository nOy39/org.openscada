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
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexScopeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRelativeTabStopPositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseIndexMarksAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseIndexSourceStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseOutlineLevelAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:table-of-content-source}.
 *
 */
public class TextTableOfContentSourceElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "table-of-content-source");

	/**
	 * Create the instance of <code>TextTableOfContentSourceElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextTableOfContentSourceElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:table-of-content-source}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIndexScopeAttribute() {
		TextIndexScopeAttribute attr = (TextIndexScopeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "index-scope");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @param textIndexScopeValue   The type is <code>String</code>
	 */
	public void setTextIndexScopeAttribute(String textIndexScopeValue) {
		TextIndexScopeAttribute attr = new TextIndexScopeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIndexScopeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextOutlineLevelAttribute() {
		TextOutlineLevelAttribute attr = (TextOutlineLevelAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "outline-level");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @param textOutlineLevelValue   The type is <code>Integer</code>
	 */
	public void setTextOutlineLevelAttribute(Integer textOutlineLevelValue) {
		TextOutlineLevelAttribute attr = new TextOutlineLevelAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textOutlineLevelValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextRelativeTabStopPositionAttribute() {
		TextRelativeTabStopPositionAttribute attr = (TextRelativeTabStopPositionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "relative-tab-stop-position");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @param textRelativeTabStopPositionValue   The type is <code>Boolean</code>
	 */
	public void setTextRelativeTabStopPositionAttribute(Boolean textRelativeTabStopPositionValue) {
		TextRelativeTabStopPositionAttribute attr = new TextRelativeTabStopPositionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textRelativeTabStopPositionValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseIndexMarksAttribute</code> , See {@odf.attribute text:use-index-marks}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseIndexMarksAttribute() {
		TextUseIndexMarksAttribute attr = (TextUseIndexMarksAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "use-index-marks");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseIndexMarksAttribute</code> , See {@odf.attribute text:use-index-marks}
	 *
	 * @param textUseIndexMarksValue   The type is <code>Boolean</code>
	 */
	public void setTextUseIndexMarksAttribute(Boolean textUseIndexMarksValue) {
		TextUseIndexMarksAttribute attr = new TextUseIndexMarksAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textUseIndexMarksValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseIndexSourceStylesAttribute</code> , See {@odf.attribute text:use-index-source-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseIndexSourceStylesAttribute() {
		TextUseIndexSourceStylesAttribute attr = (TextUseIndexSourceStylesAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "use-index-source-styles");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseIndexSourceStylesAttribute</code> , See {@odf.attribute text:use-index-source-styles}
	 *
	 * @param textUseIndexSourceStylesValue   The type is <code>Boolean</code>
	 */
	public void setTextUseIndexSourceStylesAttribute(Boolean textUseIndexSourceStylesValue) {
		TextUseIndexSourceStylesAttribute attr = new TextUseIndexSourceStylesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textUseIndexSourceStylesValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseOutlineLevelAttribute</code> , See {@odf.attribute text:use-outline-level}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseOutlineLevelAttribute() {
		TextUseOutlineLevelAttribute attr = (TextUseOutlineLevelAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "use-outline-level");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TextUseOutlineLevelAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseOutlineLevelAttribute</code> , See {@odf.attribute text:use-outline-level}
	 *
	 * @param textUseOutlineLevelValue   The type is <code>Boolean</code>
	 */
	public void setTextUseOutlineLevelAttribute(Boolean textUseOutlineLevelValue) {
		TextUseOutlineLevelAttribute attr = new TextUseOutlineLevelAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textUseOutlineLevelValue.booleanValue());
	}

	/**
	 * Create child element {@odf.element text:index-source-styles}.
	 *
	 * @param textOutlineLevelValue  the <code>Integer</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @return the element {@odf.element text:index-source-styles}
	 */
	 public TextIndexSourceStylesElement newTextIndexSourceStylesElement(int textOutlineLevelValue) {
		TextIndexSourceStylesElement textIndexSourceStyles = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexSourceStylesElement.class);
		textIndexSourceStyles.setTextOutlineLevelAttribute(textOutlineLevelValue);
		this.appendChild(textIndexSourceStyles);
		return textIndexSourceStyles;
	}

	/**
	 * Create child element {@odf.element text:index-title-template}.
	 *
	 * @return the element {@odf.element text:index-title-template}
	 */
	public TextIndexTitleTemplateElement newTextIndexTitleTemplateElement() {
		TextIndexTitleTemplateElement textIndexTitleTemplate = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexTitleTemplateElement.class);
		this.appendChild(textIndexTitleTemplate);
		return textIndexTitleTemplate;
	}

	/**
	 * Create child element {@odf.element text:table-of-content-entry-template}.
	 *
	 * @param textOutlineLevelValue  the <code>Integer</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @param textStyleNameValue  the <code>String</code> value of <code>TextStyleNameAttribute</code>, see {@odf.attribute  text:style-name} at specification
	 * @return the element {@odf.element text:table-of-content-entry-template}
	 */
	 public TextTableOfContentEntryTemplateElement newTextTableOfContentEntryTemplateElement(int textOutlineLevelValue, String textStyleNameValue) {
		TextTableOfContentEntryTemplateElement textTableOfContentEntryTemplate = ((OdfFileDom) this.ownerDocument).newOdfElement(TextTableOfContentEntryTemplateElement.class);
		textTableOfContentEntryTemplate.setTextOutlineLevelAttribute(textOutlineLevelValue);
		textTableOfContentEntryTemplate.setTextStyleNameAttribute(textStyleNameValue);
		this.appendChild(textTableOfContentEntryTemplate);
		return textTableOfContentEntryTemplate;
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
